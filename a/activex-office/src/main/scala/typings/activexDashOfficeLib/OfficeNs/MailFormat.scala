package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MailFormat extends js.Object

@JSGlobal("Office.MailFormat")
@js.native
object MailFormat extends js.Object {
  @js.native
  sealed trait mfHTML
    extends activexDashOfficeLib.OfficeNs.MailFormat
  
  @js.native
  sealed trait mfPlainText
    extends activexDashOfficeLib.OfficeNs.MailFormat
  
  @js.native
  sealed trait mfRTF
    extends activexDashOfficeLib.OfficeNs.MailFormat
  
  /* 2 */ val mfHTML: mfHTML with scala.Double = js.native
  /* 1 */ val mfPlainText: mfPlainText with scala.Double = js.native
  /* 3 */ val mfRTF: mfRTF with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MailFormat with scala.Double] = js.native
}

