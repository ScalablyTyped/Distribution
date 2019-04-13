package typings
package avaLib.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SkipInterface[Context] extends js.Object {
  /** Skip this test. */
  def apply(`macro`: OneOrMoreMacros[js.Array[js.Any], Context]): scala.Unit = js.native
  /** Skip this test. */
  def apply(title: java.lang.String, implementation: Implementation[Context]): scala.Unit = js.native
  /** Skip this test. */
  def apply[ToM /* <: TitleOrMacro[Context] */, MoA /* <: MacroOrFirstArg[ToM, Context] */](
    titleOrMacro: ToM,
    macroOrArg: MoA,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param rest because its type RestArgs<ToM, MoA, Context> is not an array type */ rest: RestArgs[ToM, MoA, Context]
  ): scala.Unit = js.native
}

