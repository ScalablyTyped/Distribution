package typings
package avaLib.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BeforeInterface[Context] extends js.Object {
  /** Declare a hook that must call `t.end()` when it's done. */
  @JSName("cb")
  var cb_Original: HookCbInterface[Context] = js.native
  @JSName("skip")
  var skip_Original: HookSkipInterface[Context] = js.native
  /** Declare a hook that is run once, before all tests. */
  def apply(implementation: Implementation[Context]): scala.Unit = js.native
  /** Declare a hook that is run once, before all tests. */
  def apply(`macro`: OneOrMoreMacros[js.Array[js.Any], Context]): scala.Unit = js.native
  /** Declare a hook that is run once, before all tests. */
  def apply(title: java.lang.String, implementation: Implementation[Context]): scala.Unit = js.native
  /** Declare a hook that is run once, before all tests. Additional arguments are passed to the macro. */
  def apply[ToM /* <: TitleOrMacro[Context] */, MoA /* <: MacroOrFirstArg[ToM, Context] */](
    titleOrMacro: ToM,
    macroOrArg: MoA,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type RestArgs<ToM, MoA, Context> is not an array type */ rest: RestArgs[ToM, MoA, Context]
  ): scala.Unit = js.native
  /** Declare a hook that must call `t.end()` when it's done. */
  /** Declare a hook that must call `t.end()` when it's done. */
  def cb(implementation: CbImplementation[Context]): scala.Unit = js.native
  /**
  	 * Declare a hook that uses one or more macros. The macros must call `t.end()` when they're done.
  	 */
  /** Declare a hook that must call `t.end()` when it's done. */
  def cb(`macro`: OneOrMoreCbMacros[js.Array[js.Any], Context]): scala.Unit = js.native
  /** Declare a hook that must call `t.end()` when it's done. */
  /** Declare a hook that must call `t.end()` when it's done. */
  def cb(title: java.lang.String, implementation: CbImplementation[Context]): scala.Unit = js.native
  /**
  	 * Declare a hook that uses one or more macros. The macros must call `t.end()` when they're done.
  	 * Additional arguments are passed to the macro.
  	 */
  /** Declare a hook that must call `t.end()` when it's done. */
  def cb[ToM /* <: TitleOrCbMacro[Context] */, MoA /* <: CbMacroOrFirstArg[ToM, Context] */](
    titleOrMacro: ToM,
    macroOrArg: MoA,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type RestArgs<ToM, MoA, Context> is not an array type */ rest: RestArgs[ToM, MoA, Context]
  ): scala.Unit = js.native
  /** Skip this hook. */
  def skip(implementation: Implementation[Context]): scala.Unit = js.native
  /** Skip this hook. */
  def skip(`macro`: OneOrMoreMacros[js.Array[js.Any], Context]): scala.Unit = js.native
  /** Skip this hook. */
  def skip(title: java.lang.String, implementation: Implementation[Context]): scala.Unit = js.native
  /** Skip this hook. */
  def skip[ToM /* <: TitleOrMacro[Context] */, MoA /* <: MacroOrFirstArg[ToM, Context] */](
    titleOrMacro: ToM,
    macroOrArg: MoA,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type RestArgs<ToM, MoA, Context> is not an array type */ rest: RestArgs[ToM, MoA, Context]
  ): scala.Unit = js.native
}

