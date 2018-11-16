package typings
package activexDashOutlookLib.OutlookNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait OlBusinessCardType extends js.Object

@JSGlobal("Outlook.OlBusinessCardType")
@js.native
object OlBusinessCardType extends js.Object {
  @js.native
  sealed trait olBusinessCardTypeInterConnect
    extends activexDashOutlookLib.OutlookNs.OlBusinessCardType
  
  @js.native
  sealed trait olBusinessCardTypeOutlook
    extends activexDashOutlookLib.OutlookNs.OlBusinessCardType
  
  /* 1 */ val olBusinessCardTypeInterConnect: olBusinessCardTypeInterConnect with scala.Double = js.native
  /* 0 */ val olBusinessCardTypeOutlook: olBusinessCardTypeOutlook with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[activexDashOutlookLib.OutlookNs.OlBusinessCardType with scala.Double] = js.native
}

