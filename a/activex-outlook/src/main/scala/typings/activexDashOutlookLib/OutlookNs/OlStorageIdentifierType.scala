package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlStorageIdentifierType extends js.Object

@JSGlobal("Outlook.OlStorageIdentifierType")
@js.native
object OlStorageIdentifierType extends js.Object {
  @js.native
  sealed trait olIdentifyByEntryID
    extends activexDashOutlookLib.OutlookNs.OlStorageIdentifierType
  
  @js.native
  sealed trait olIdentifyByMessageClass
    extends activexDashOutlookLib.OutlookNs.OlStorageIdentifierType
  
  @js.native
  sealed trait olIdentifyBySubject
    extends activexDashOutlookLib.OutlookNs.OlStorageIdentifierType
  
  /* 1 */ val olIdentifyByEntryID: olIdentifyByEntryID with scala.Double = js.native
  /* 2 */ val olIdentifyByMessageClass: olIdentifyByMessageClass with scala.Double = js.native
  /* 0 */ val olIdentifyBySubject: olIdentifyBySubject with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlStorageIdentifierType with scala.Double] = js.native
}

