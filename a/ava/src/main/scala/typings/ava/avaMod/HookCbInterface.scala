package typings.ava.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HookCbInterface[Context] extends js.Object {
  @JSName("skip")
  var skip_Original: HookCbSkipInterface[Context] = js.native
  /** Declare a hook that must call `t.end()` when it's done. */
  def apply(implementation: CbImplementation[Context]): Unit = js.native
  /** Declare a hook that must call `t.end()` when it's done. */
  def apply(title: String, implementation: CbImplementation[Context]): Unit = js.native
  /**
  	 * Declare a hook that uses one or more macros. The macros must call `t.end()` when they're done.
  	 */
  def apply[T /* <: js.Array[_] */](
    macros: OneOrMoreCbMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /**
  	 * Declare a hook that uses one or more macros. The macros must call `t.end()` when they're done.
  	 * Additional arguments are passed to the macro.
  	 */
  def apply[T /* <: js.Array[_] */](
    title: String,
    macros: OneOrMoreCbMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /** Skip this hook. */
  def skip(implementation: CbImplementation[Context]): Unit = js.native
  /** Skip this hook. */
  def skip(title: String, implementation: CbImplementation[Context]): Unit = js.native
  /** Skip this hook. */
  def skip[T /* <: js.Array[_] */](
    macros: OneOrMoreCbMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
  /** Skip this hook. */
  def skip[T /* <: js.Array[_] */](
    title: String,
    macros: OneOrMoreCbMacros[T, Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type T is not an array type */ rest: T
  ): Unit = js.native
}

