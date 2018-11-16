package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MsoClipboardFormat extends js.Object

@JSGlobal("Office.MsoClipboardFormat")
@js.native
object MsoClipboardFormat extends js.Object {
  @js.native
  sealed trait msoClipboardFormatHTML
    extends activexDashOfficeLib.OfficeNs.MsoClipboardFormat
  
  @js.native
  sealed trait msoClipboardFormatMixed
    extends activexDashOfficeLib.OfficeNs.MsoClipboardFormat
  
  @js.native
  sealed trait msoClipboardFormatNative
    extends activexDashOfficeLib.OfficeNs.MsoClipboardFormat
  
  @js.native
  sealed trait msoClipboardFormatPlainText
    extends activexDashOfficeLib.OfficeNs.MsoClipboardFormat
  
  @js.native
  sealed trait msoClipboardFormatRTF
    extends activexDashOfficeLib.OfficeNs.MsoClipboardFormat
  
  /* 2 */ val msoClipboardFormatHTML: msoClipboardFormatHTML with scala.Double = js.native
  /* -2 */ val msoClipboardFormatMixed: msoClipboardFormatMixed with scala.Double = js.native
  /* 1 */ val msoClipboardFormatNative: msoClipboardFormatNative with scala.Double = js.native
  /* 4 */ val msoClipboardFormatPlainText: msoClipboardFormatPlainText with scala.Double = js.native
  /* 3 */ val msoClipboardFormatRTF: msoClipboardFormatRTF with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOfficeLib.OfficeNs.MsoClipboardFormat with scala.Double] = js.native
}

