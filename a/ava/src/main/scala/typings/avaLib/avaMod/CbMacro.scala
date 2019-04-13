package typings
package avaLib.avaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CbMacro[Args /* <: js.Array[_] */, Context] extends js.Object {
  var title: js.UndefOr[
    js.Function2[/* providedTitle */ js.UndefOr[java.lang.String], /* args */ Args, java.lang.String]
  ] = js.native
  def apply(
    t: CbExecutionContext[Context],
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type Args is not an array type */ args: Args
  ): ImplementationResult = js.native
}

