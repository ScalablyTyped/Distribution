package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlAttachmentType extends js.Object

@JSGlobal("Outlook.OlAttachmentType")
@js.native
object OlAttachmentType extends js.Object {
  @js.native
  sealed trait olByReference
    extends activexDashOutlookLib.OutlookNs.OlAttachmentType
  
  @js.native
  sealed trait olByValue
    extends activexDashOutlookLib.OutlookNs.OlAttachmentType
  
  @js.native
  sealed trait olEmbeddeditem
    extends activexDashOutlookLib.OutlookNs.OlAttachmentType
  
  @js.native
  sealed trait olOLE
    extends activexDashOutlookLib.OutlookNs.OlAttachmentType
  
  /* 4 */ val olByReference: olByReference with scala.Double = js.native
  /* 1 */ val olByValue: olByValue with scala.Double = js.native
  /* 5 */ val olEmbeddeditem: olEmbeddeditem with scala.Double = js.native
  /* 6 */ val olOLE: olOLE with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlAttachmentType with scala.Double] = js.native
}

