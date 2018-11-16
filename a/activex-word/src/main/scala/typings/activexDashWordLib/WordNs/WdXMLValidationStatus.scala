package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait WdXMLValidationStatus extends js.Object

@JSGlobal("Word.WdXMLValidationStatus")
@js.native
object WdXMLValidationStatus extends js.Object {
  @js.native
  sealed trait wdXMLValidationStatusCustom
    extends activexDashWordLib.WordNs.WdXMLValidationStatus
  
  @js.native
  sealed trait wdXMLValidationStatusOK
    extends activexDashWordLib.WordNs.WdXMLValidationStatus
  
  /* -1072898048 */ val wdXMLValidationStatusCustom: wdXMLValidationStatusCustom with scala.Double = js.native
  /* 0 */ val wdXMLValidationStatusOK: wdXMLValidationStatusOK with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashWordLib.WordNs.WdXMLValidationStatus with scala.Double] = js.native
}

