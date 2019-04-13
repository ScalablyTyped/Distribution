package typings
package avaLib.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CbFailingInterface[Context] extends js.Object {
  @JSName("only")
  var only_Original: CbOnlyInterface[Context] = js.native
  @JSName("skip")
  var skip_Original: CbSkipInterface[Context] = js.native
  /**
  	 * Declare a test that uses one or more macros. The macros must call `t.end()` when they're done.
  	 * The test is expected to fail.
  	 */
  def apply(`macro`: OneOrMoreCbMacros[js.Array[js.Any], Context]): scala.Unit = js.native
  /** Declare a test that must call `t.end()` when it's done. The test is expected to fail. */
  def apply(title: java.lang.String, implementation: CbImplementation[Context]): scala.Unit = js.native
  /**
  	 * Declare a test that uses one or more macros. The macros must call `t.end()` when they're done.
  	 * Additional arguments are passed to the macro. The test is expected to fail.
  	 */
  def apply[ToM /* <: TitleOrCbMacro[Context] */, MoA /* <: CbMacroOrFirstArg[ToM, Context] */](
    titleOrMacro: ToM,
    macroOrArg: MoA,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type RestArgs<ToM, MoA, Context> is not an array type */ rest: RestArgs[ToM, MoA, Context]
  ): scala.Unit = js.native
  /**
  	 * Declare a test that uses one or more macros. The macros must call `t.end()` when they're done.
  	 * Additional arguments are passed to the macro. Only this test and others declared with `.only()` are run.
  	 */
  def only(`macro`: OneOrMoreCbMacros[js.Array[js.Any], Context]): scala.Unit = js.native
  /**
  	 * Declare a test that must call `t.end()` when it's done. Only this test and others declared with `.only()` are run.
  	 */
  def only(title: java.lang.String, implementation: CbImplementation[Context]): scala.Unit = js.native
  /**
  	 * Declare a test that uses one or more macros. The macros must call `t.end()` when they're done.
  	 * Additional arguments are passed to the macro. Only this test and others declared with `.only()` are run.
  	 */
  def only[ToM /* <: TitleOrCbMacro[Context] */, MoA /* <: CbMacroOrFirstArg[ToM, Context] */](
    titleOrMacro: ToM,
    macroOrArg: MoA,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type RestArgs<ToM, MoA, Context> is not an array type */ rest: RestArgs[ToM, MoA, Context]
  ): scala.Unit = js.native
  /** Skip this test. */
  def skip(`macro`: OneOrMoreCbMacros[js.Array[js.Any], Context]): scala.Unit = js.native
  /** Skip this test. */
  def skip(title: java.lang.String, implementation: CbImplementation[Context]): scala.Unit = js.native
  /** Skip this test. */
  def skip[ToM /* <: TitleOrCbMacro[Context] */, MoA /* <: CbMacroOrFirstArg[ToM, Context] */](
    titleOrMacro: ToM,
    macroOrArg: MoA,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type RestArgs<ToM, MoA, Context> is not an array type */ rest: RestArgs[ToM, MoA, Context]
  ): scala.Unit = js.native
}

