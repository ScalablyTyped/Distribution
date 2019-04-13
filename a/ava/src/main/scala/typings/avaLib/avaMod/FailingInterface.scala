package typings
package avaLib.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailingInterface[Context] extends js.Object {
  @JSName("only")
  var only_Original: OnlyInterface[Context] = js.native
  @JSName("skip")
  var skip_Original: SkipInterface[Context] = js.native
  /**
  	 * Declare a concurrent test that uses one or more macros. The macro is responsible for generating a unique test title.
  	 * The test is expected to fail.
  	 */
  def apply(`macro`: OneOrMoreMacros[js.Array[js.Any], Context]): scala.Unit = js.native
  /** Declare a concurrent test. The test is expected to fail. */
  def apply(title: java.lang.String, implementation: Implementation[Context]): scala.Unit = js.native
  /**
  	 * Declare a concurrent test that uses one or more macros. Additional arguments are passed to the macro.
  	 * The test is expected to fail.
  	 */
  def apply[ToM /* <: TitleOrMacro[Context] */, MoA /* <: MacroOrFirstArg[ToM, Context] */](
    titleOrMacro: ToM,
    macroOrArg: MoA,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type RestArgs<ToM, MoA, Context> is not an array type */ rest: RestArgs[ToM, MoA, Context]
  ): scala.Unit = js.native
  /**
  	 * Declare a test that uses one or more macros. The macro is responsible for generating a unique test title.
  	 * Only this test and others declared with `.only()` are run.
  	 */
  def only(`macro`: OneOrMoreMacros[js.Array[js.Any], Context]): scala.Unit = js.native
  /** Declare a test. Only this test and others declared with `.only()` are run. */
  def only(title: java.lang.String, implementation: Implementation[Context]): scala.Unit = js.native
  /**
  	 * Declare a test that uses one or more macros. Additional arguments are passed to the macro.
  	 * Only this test and others declared with `.only()` are run.
  	 */
  def only[ToM /* <: TitleOrMacro[Context] */, MoA /* <: MacroOrFirstArg[ToM, Context] */](
    titleOrMacro: ToM,
    macroOrArg: MoA,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type RestArgs<ToM, MoA, Context> is not an array type */ rest: RestArgs[ToM, MoA, Context]
  ): scala.Unit = js.native
  /** Skip this test. */
  def skip(`macro`: OneOrMoreMacros[js.Array[js.Any], Context]): scala.Unit = js.native
  /** Skip this test. */
  def skip(title: java.lang.String, implementation: Implementation[Context]): scala.Unit = js.native
  /** Skip this test. */
  def skip[ToM /* <: TitleOrMacro[Context] */, MoA /* <: MacroOrFirstArg[ToM, Context] */](
    titleOrMacro: ToM,
    macroOrArg: MoA,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type RestArgs<ToM, MoA, Context> is not an array type */ rest: RestArgs[ToM, MoA, Context]
  ): scala.Unit = js.native
}

