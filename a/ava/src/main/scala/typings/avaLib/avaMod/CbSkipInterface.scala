package typings
package avaLib.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CbSkipInterface[Context] extends js.Object {
  /** Skip this test. */
  def apply(`macro`: OneOrMoreCbMacros[js.Array[js.Any], Context]): scala.Unit = js.native
  /** Skip this test. */
  def apply(title: java.lang.String, implementation: CbImplementation[Context]): scala.Unit = js.native
  /** Skip this test. */
  def apply[ToM /* <: TitleOrCbMacro[Context] */, MoA /* <: CbMacroOrFirstArg[ToM, Context] */](
    titleOrMacro: ToM,
    macroOrArg: MoA,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type RestArgs<ToM, MoA, Context> is not an array type */ rest: RestArgs[ToM, MoA, Context]
  ): scala.Unit = js.native
}

