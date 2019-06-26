
# Scala.js typings for async-done

Typings are for version 1.3.2

## Library description:
Allows libraries to handle various caller provided asynchronous functions uniformly. Maps promises, observables, child processes and streams, and callbacks to callback style.

|                    |                 |
| ------------------ | :-------------: |
| Full name          | async-done |
| Keywords           | promises, callbacks, observables, streams, end, completion, complete, finish, done, async, error handling |
| # releases         | 5 |
| # dependents       | 33 |
| # downloads        | 13665804 |
| # stars            | 3 |

## Links
- [Homepage](https://github.com/gulpjs/async-done#readme)
- [Bugs](https://github.com/gulpjs/async-done/issues)
- [Repository](https://github.com/gulpjs/async-done)
- [Npm](https://www.npmjs.com/package/async-done)
    


## Note
This library has been generated from typescript code from first party type definitions.

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
/**
 * Notes about these type definitions:
 *
 * - Callbacks returning multiple completion values using multiple arguments are not supported by these types.
 *   Prefer to use Node's style by grouping your values in a single object or array.
 *   Support for this kind of callback is blocked by Microsoft/TypeScript#5453
 *
 * - For ease of use, `asyncDone` lets you pass callback functions with a result type `T` instead of `T | undefined`.
 *   This matches Node's types but can lead to unsound code being typechecked.
 *
 *   The following code typechecks but fails at runtime:
 *   ```typescript
 *   async function getString(): Promise<string> {
 *     return "Hello, World!";
 *   }
 *
 *   async function evilGetString(): Promise<string> {
 *     throw new Error("Hello, World!");
 *   }
 *
 *   function cb(err: Error | null, result: string): void {
 *     // This is unsound because `result` is `undefined` when `err` is not `null`.
 *     console.log(result.toLowerCase());
 *   }
 *
 *   asyncDone(getString, cb); // Prints `hello, world!`
 *   asyncDone(evilGetString, cb); // Runtime error: `TypeError: Cannot read property 'toLowerCase' of undefined`
 *   ```
 *
 *   Enforcing stricter callbacks would require developers to use `result?: string` and assert the existence
 *   of the result either by checking it directly or using the `!` assertion operator after testing for errors.
 *   ```typescript
 *   function stricterCb1(err: Error | null, result?: string): void {
 *     if (err !== null) {
 *       console.error(err);
 *       return;
 *     }
 *     console.log(result!.toLowerCase());
 *   }
 *
 *   function stricterCb2(err: Error | null, result?: string): void {
 *     if (result === undefined) {
 *       console.error("Undefined result. Error:);
 *       console.error(err);
 *       return;
 *     }
 *     console.log(result.toLowerCase());
 *   }
 *   ```
 */

```

