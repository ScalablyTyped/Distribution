package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlSaveAsType extends js.Object

@JSGlobal("Outlook.OlSaveAsType")
@js.native
object OlSaveAsType extends js.Object {
  @js.native
  sealed trait olDoc
    extends activexDashOutlookLib.OutlookNs.OlSaveAsType
  
  @js.native
  sealed trait olHTML
    extends activexDashOutlookLib.OutlookNs.OlSaveAsType
  
  @js.native
  sealed trait olICal
    extends activexDashOutlookLib.OutlookNs.OlSaveAsType
  
  @js.native
  sealed trait olMHTML
    extends activexDashOutlookLib.OutlookNs.OlSaveAsType
  
  @js.native
  sealed trait olMSG
    extends activexDashOutlookLib.OutlookNs.OlSaveAsType
  
  @js.native
  sealed trait olMSGUnicode
    extends activexDashOutlookLib.OutlookNs.OlSaveAsType
  
  @js.native
  sealed trait olRTF
    extends activexDashOutlookLib.OutlookNs.OlSaveAsType
  
  @js.native
  sealed trait olTXT
    extends activexDashOutlookLib.OutlookNs.OlSaveAsType
  
  @js.native
  sealed trait olTemplate
    extends activexDashOutlookLib.OutlookNs.OlSaveAsType
  
  @js.native
  sealed trait olVCal
    extends activexDashOutlookLib.OutlookNs.OlSaveAsType
  
  @js.native
  sealed trait olVCard
    extends activexDashOutlookLib.OutlookNs.OlSaveAsType
  
  /* 4 */ val olDoc: olDoc with scala.Double = js.native
  /* 5 */ val olHTML: olHTML with scala.Double = js.native
  /* 8 */ val olICal: olICal with scala.Double = js.native
  /* 10 */ val olMHTML: olMHTML with scala.Double = js.native
  /* 3 */ val olMSG: olMSG with scala.Double = js.native
  /* 9 */ val olMSGUnicode: olMSGUnicode with scala.Double = js.native
  /* 1 */ val olRTF: olRTF with scala.Double = js.native
  /* 0 */ val olTXT: olTXT with scala.Double = js.native
  /* 2 */ val olTemplate: olTemplate with scala.Double = js.native
  /* 7 */ val olVCal: olVCal with scala.Double = js.native
  /* 6 */ val olVCard: olVCard with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlSaveAsType with scala.Double] = js.native
}

