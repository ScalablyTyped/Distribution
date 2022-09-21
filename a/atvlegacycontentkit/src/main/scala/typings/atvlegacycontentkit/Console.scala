package typings.atvlegacycontentkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Provides access to the browser's debugging console.
  *
  * Source: https://developer.mozilla.org/en-US/docs/Web/API/console
  */
// tslint:disable-next-line:strict-export-declare-modifiers
@js.native
trait Console extends StObject {
  
  /**
    * `console.assert()` writes a message if `value` is [falsy](https://developer.mozilla.org/en-US/docs/Glossary/Falsy) or omitted. It only
    * writes a message and does not otherwise affect execution. The output always
    * starts with `"Assertion failed"`. If provided, `message` is formatted using `util.format()`.
    *
    * If `value` is [truthy](https://developer.mozilla.org/en-US/docs/Glossary/Truthy), nothing happens.
    *
    * ```js
    * console.assert(true, 'does nothing');
    *
    * console.assert(false, 'Whoops %s work', 'didn\'t');
    * // Assertion failed: Whoops didn't work
    *
    * console.assert();
    * // Assertion failed
    * ```
    * @since v0.1.101
    * @param value The value tested for being truthy.
    * @param message All arguments besides `value` are used as error message.
    */
  def assert(value: Any, message: String, optionalParams: Any*): Unit = js.native
  def assert(value: Any, message: Unit, optionalParams: Any*): Unit = js.native
  
  /**
    * When `stdout` is a TTY, calling `console.clear()` will attempt to clear the
    * TTY. When `stdout` is not a TTY, this method does nothing.
    *
    * The specific operation of `console.clear()` can vary across operating systems
    * and terminal types. For most Linux operating systems, `console.clear()`operates similarly to the `clear` shell command. On Windows, `console.clear()`will clear only the output in the
    * current terminal viewport for the Node.js
    * binary.
    * @since v8.3.0
    */
  def clear(): Unit = js.native
  
  /**
    * Maintains an internal counter specific to `label` and outputs to `stdout` the
    * number of times `console.count()` has been called with the given `label`.
    *
    * ```js
    * > console.count()
    * default: 1
    * undefined
    * > console.count('default')
    * default: 2
    * undefined
    * > console.count('abc')
    * abc: 1
    * undefined
    * > console.count('xyz')
    * xyz: 1
    * undefined
    * > console.count('abc')
    * abc: 2
    * undefined
    * > console.count()
    * default: 3
    * undefined
    * >
    * ```
    * @since v8.3.0
    * @param label The display label for the counter.
    */
  def count(): Unit = js.native
  def count(label: String): Unit = js.native
  
  /**
    * The `console.debug()` function is an alias for {@link log}.
    * @since v8.0.0
    */
  def debug(message: Any, optionalParams: Any*): Unit = js.native
  def debug(message: Unit, optionalParams: Any*): Unit = js.native
  
  /**
    * Uses `util.inspect()` on `obj` and prints the resulting string to `stdout`.
    * This function bypasses any custom `inspect()` function defined on `obj`.
    * @since v0.1.101
    */
  def dir(obj: Any): Unit = js.native
  
  /**
    * This method calls `console.log()` passing it the arguments received.
    * This method does not produce any XML formatting.
    * @since v8.0.0
    */
  def dirxml(data: Any*): Unit = js.native
  
  /**
    * Prints to `stderr` with newline. Multiple arguments can be passed, with the
    * first used as the primary message and all additional used as substitution
    * values similar to [`printf(3)`](http://man7.org/linux/man-pages/man3/printf.3.html) (the arguments are all passed to `util.format()`).
    *
    * ```js
    * const code = 5;
    * console.error('error #%d', code);
    * // Prints: error #5, to stderr
    * console.error('error', code);
    * // Prints: error 5, to stderr
    * ```
    *
    * If formatting elements (e.g. `%d`) are not found in the first string then `util.inspect()` is called on each argument and the resulting string
    * values are concatenated. See `util.format()` for more information.
    * @since v0.1.100
    */
  def error(message: Any, optionalParams: Any*): Unit = js.native
  def error(message: Unit, optionalParams: Any*): Unit = js.native
  
  /**
    * Increases indentation of subsequent lines by spaces for `groupIndentation`length.
    *
    * If one or more `label`s are provided, those are printed first without the
    * additional indentation.
    * @since v8.5.0
    */
  def group(label: Any*): Unit = js.native
  
  /**
    * An alias for {@link group}.
    * @since v8.5.0
    */
  def groupCollapsed(label: Any*): Unit = js.native
  
  /**
    * Decreases indentation of subsequent lines by spaces for `groupIndentation`length.
    * @since v8.5.0
    */
  def groupEnd(): Unit = js.native
  
  /**
    * The `console.info()` function is an alias for {@link log}.
    * @since v0.1.100
    */
  def info(message: Any, optionalParams: Any*): Unit = js.native
  def info(message: Unit, optionalParams: Any*): Unit = js.native
  
  /**
    * Prints to `stdout` with newline. Multiple arguments can be passed, with the
    * first used as the primary message and all additional used as substitution
    * values similar to [`printf(3)`](http://man7.org/linux/man-pages/man3/printf.3.html) (the arguments are all passed to `util.format()`).
    *
    * ```js
    * const count = 5;
    * console.log('count: %d', count);
    * // Prints: count: 5, to stdout
    * console.log('count:', count);
    * // Prints: count: 5, to stdout
    * ```
    *
    * See `util.format()` for more information.
    * @since v0.1.100
    */
  def log(message: Any, optionalParams: Any*): Unit = js.native
  def log(message: Unit, optionalParams: Any*): Unit = js.native
  
  /**
    * Try to construct a table with the columns of the properties of `tabularData`(or use `properties`) and rows of `tabularData` and log it. Falls back to just
    * logging the argument if it can’t be parsed as tabular.
    *
    * ```js
    * // These can't be parsed as tabular data
    * console.table(Symbol());
    * // Symbol()
    *
    * console.table(undefined);
    * // undefined
    *
    * console.table([{ a: 1, b: 'Y' }, { a: 'Z', b: 2 }]);
    * // ┌─────────┬─────┬─────┐
    * // │ (index) │  a  │  b  │
    * // ├─────────┼─────┼─────┤
    * // │    0    │  1  │ 'Y' │
    * // │    1    │ 'Z' │  2  │
    * // └─────────┴─────┴─────┘
    *
    * console.table([{ a: 1, b: 'Y' }, { a: 'Z', b: 2 }], ['a']);
    * // ┌─────────┬─────┐
    * // │ (index) │  a  │
    * // ├─────────┼─────┤
    * // │    0    │  1  │
    * // │    1    │ 'Z' │
    * // └─────────┴─────┘
    * ```
    * @since v10.0.0
    * @param properties Alternate properties for constructing the table.
    */
  def table(tabularData: Any): Unit = js.native
  def table(tabularData: Any, properties: js.Array[String]): Unit = js.native
  
  /**
    * Starts a timer that can be used to compute the duration of an operation. Timers
    * are identified by a unique `label`. Use the same `label` when calling {@link timeEnd} to stop the timer and output the elapsed time in
    * suitable time units to `stdout`. For example, if the elapsed
    * time is 3869ms, `console.timeEnd()` displays "3.869s".
    * @since v0.1.104
    */
  def time(): Unit = js.native
  def time(label: String): Unit = js.native
  
  /**
    * Stops a timer that was previously started by calling {@link time} and
    * prints the result to `stdout`:
    *
    * ```js
    * console.time('100-elements');
    * for (let i = 0; i < 100; i++) {}
    * console.timeEnd('100-elements');
    * // prints 100-elements: 225.438ms
    * ```
    * @since v0.1.104
    */
  def timeEnd(): Unit = js.native
  def timeEnd(label: String): Unit = js.native
  
  /**
    * Prints to `stderr` the string `'Trace: '`, followed by the `util.format()` formatted message and stack trace to the current position in the code.
    *
    * ```js
    * console.trace('Show me');
    * // Prints: (stack trace will vary based on where trace is called)
    * //  Trace: Show me
    * //    at repl:2:9
    * //    at REPLServer.defaultEval (repl.js:248:27)
    * //    at bound (domain.js:287:14)
    * //    at REPLServer.runBound [as eval] (domain.js:300:12)
    * //    at REPLServer.<anonymous> (repl.js:412:12)
    * //    at emitOne (events.js:82:20)
    * //    at REPLServer.emit (events.js:169:7)
    * //    at REPLServer.Interface._onLine (readline.js:210:10)
    * //    at REPLServer.Interface._line (readline.js:549:8)
    * //    at REPLServer.Interface._ttyWrite (readline.js:826:14)
    * ```
    * @since v0.1.104
    */
  def trace(message: Any, optionalParams: Any*): Unit = js.native
  def trace(message: Unit, optionalParams: Any*): Unit = js.native
  
  /**
    * The `console.warn()` function is an alias for {@link error}.
    * @since v0.1.100
    */
  def warn(message: Any, optionalParams: Any*): Unit = js.native
  def warn(message: Unit, optionalParams: Any*): Unit = js.native
}
