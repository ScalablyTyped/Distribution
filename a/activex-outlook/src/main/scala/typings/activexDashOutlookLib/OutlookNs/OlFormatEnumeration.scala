package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlFormatEnumeration extends js.Object

@JSGlobal("Outlook.OlFormatEnumeration")
@js.native
object OlFormatEnumeration extends js.Object {
  @js.native
  sealed trait olFormatEnumBitmap
    extends activexDashOutlookLib.OutlookNs.OlFormatEnumeration
  
  @js.native
  sealed trait olFormatEnumText
    extends activexDashOutlookLib.OutlookNs.OlFormatEnumeration
  
  /* 1 */ val olFormatEnumBitmap: olFormatEnumBitmap with scala.Double = js.native
  /* 2 */ val olFormatEnumText: olFormatEnumText with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlFormatEnumeration with scala.Double] = js.native
}

