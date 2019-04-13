package typings
package avaLib.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HookCbInterface[Context] extends js.Object {
  @JSName("skip")
  var skip_Original: HookCbSkipInterface[Context] = js.native
  /** Declare a hook that must call `t.end()` when it's done. */
  def apply(implementation: CbImplementation[Context]): scala.Unit = js.native
  /**
  	 * Declare a hook that uses one or more macros. The macros must call `t.end()` when they're done.
  	 */
  def apply(`macro`: OneOrMoreCbMacros[js.Array[js.Any], Context]): scala.Unit = js.native
  /** Declare a hook that must call `t.end()` when it's done. */
  def apply(title: java.lang.String, implementation: CbImplementation[Context]): scala.Unit = js.native
  /**
  	 * Declare a hook that uses one or more macros. The macros must call `t.end()` when they're done.
  	 * Additional arguments are passed to the macro.
  	 */
  def apply[ToM /* <: TitleOrCbMacro[Context] */, MoA /* <: CbMacroOrFirstArg[ToM, Context] */](
    titleOrMacro: ToM,
    macroOrArg: MoA,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type RestArgs<ToM, MoA, Context> is not an array type */ rest: RestArgs[ToM, MoA, Context]
  ): scala.Unit = js.native
  /** Skip this hook. */
  def skip(implementation: CbImplementation[Context]): scala.Unit = js.native
  /** Skip this hook. */
  def skip(`macro`: OneOrMoreCbMacros[js.Array[js.Any], Context]): scala.Unit = js.native
  /** Skip this hook. */
  def skip(title: java.lang.String, implementation: CbImplementation[Context]): scala.Unit = js.native
  /** Skip this hook. */
  def skip[ToM /* <: TitleOrCbMacro[Context] */, MoA /* <: CbMacroOrFirstArg[ToM, Context] */](
    titleOrMacro: ToM,
    macroOrArg: MoA,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type RestArgs<ToM, MoA, Context> is not an array type */ rest: RestArgs[ToM, MoA, Context]
  ): scala.Unit = js.native
}

