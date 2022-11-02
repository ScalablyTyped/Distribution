package typings.afterAllResults

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Runs multiple async functions in parallel and collects all their results in an array.
    *
    * **Note:** It is important that all `next()` calls are done on the same
    * tick as the initial call to `afterAll()`!
    *
    * @example
    * import afterAll = require('after-all-results');
    *
    * const next = afterAll((err, results: [string, number]) => {
    *   // all done!
    *   console.log(results);
    * });
    *
    * someAsyncFunctionProducingString(next());
    * anotherAsyncFunctionProducingNumber(next());
    *
    * @example
    * import afterAll = require('after-all-results');
    *
    * const next = afterAll((err, results: [string, boolean]) => {
    *   // results will be an array of `arg1` from below
    *   console.log('Done with everything!');
    * });
    *
    * // some exemplary async functions
    * declare function async1(cb: (err: Error | null, arg1: string, arg2: number) => void): void;
    * declare function async2(cb: (err: Error | null, arg1: boolean, arg2: string) => void): void;
    *
    * async1(
    *   next((err, ...args) => {
    *     const [arg1, arg2] = args as [string, number];
    *     console.log('Done with first call to async');
    *   }),
    * );
    *
    * async2(
    *   next((err, ...args) => {
    *     const [arg1, arg2] = args as [boolean, string];
    *     console.log('Done with second call to async');
    *   }),
    * );
    */
  inline def apply[TResults /* <: js.Array[Any] */](done: js.Function2[/* err */ js.Error | Null, /* results */ TResults, Unit]): js.Function1[
    /* callback */ js.UndefOr[js.Function2[/* err */ js.Error | Null, /* repeated */ Any, Unit]], 
    js.Function2[/* err */ js.Error | Null, /* result */ ArrayElementType[TResults], Unit]
  ] = ^.asInstanceOf[js.Dynamic].apply(done.asInstanceOf[js.Any]).asInstanceOf[js.Function1[
    /* callback */ js.UndefOr[js.Function2[/* err */ js.Error | Null, /* repeated */ Any, Unit]], 
    js.Function2[/* err */ js.Error | Null, /* result */ ArrayElementType[TResults], Unit]
  ]]
  
  @JSImport("after-all-results", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    TArr extends std.ReadonlyArray<infer T> ? T : never
    }}}
    */
  @js.native
  trait ArrayElementType[TArr /* <: js.Array[Any] */] extends StObject
}
