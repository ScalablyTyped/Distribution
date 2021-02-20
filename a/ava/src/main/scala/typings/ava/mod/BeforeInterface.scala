package typings.ava.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BeforeInterface[Context] extends StObject {
  
  /** Declare a hook that is run once, before all tests. */
  def apply(implementation: Implementation[Context]): Unit = js.native
  /** Declare a hook that is run once, before all tests. */
  def apply(title: String, implementation: Implementation[Context]): Unit = js.native
  /** Declare a hook that is run once, before all tests. */
  def apply[T /* <: js.Array[_] */](
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /** Declare a hook that is run once, before all tests. Additional arguments are passed to the macro. */
  def apply[T /* <: js.Array[_] */](
    title: String,
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  
  /** Declare a hook that must call `t.end()` when it's done. */
  /** Declare a hook that must call `t.end()` when it's done. */
  def cb(implementation: CbImplementation[Context]): Unit = js.native
  /** Declare a hook that must call `t.end()` when it's done. */
  /** Declare a hook that must call `t.end()` when it's done. */
  def cb(title: String, implementation: CbImplementation[Context]): Unit = js.native
  /**
  	 * Declare a hook that uses one or more macros. The macros must call `t.end()` when they're done.
  	 */
  /** Declare a hook that must call `t.end()` when it's done. */
  def cb[T /* <: js.Array[_] */](
    macros: OneOrMoreCbMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /**
  	 * Declare a hook that uses one or more macros. The macros must call `t.end()` when they're done.
  	 * Additional arguments are passed to the macro.
  	 */
  /** Declare a hook that must call `t.end()` when it's done. */
  def cb[T /* <: js.Array[_] */](
    title: String,
    macros: OneOrMoreCbMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /** Declare a hook that must call `t.end()` when it's done. */
  @JSName("cb")
  var cb_Original: HookCbInterface[Context] = js.native
  
  /** Skip this hook. */
  def skip(implementation: Implementation[Context]): Unit = js.native
  /** Skip this hook. */
  def skip(title: String, implementation: Implementation[Context]): Unit = js.native
  /** Skip this hook. */
  def skip[T /* <: js.Array[_] */](
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /** Skip this hook. */
  def skip[T /* <: js.Array[_] */](
    title: String,
    macros: OneOrMoreMacros[T, Context],
    /* import warning: parser.TsParser#functionParam Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  @JSName("skip")
  var skip_Original: HookSkipInterface[Context] = js.native
}
