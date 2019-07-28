package typings.actionsDashOnDashGoogle

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_InAppDataSignature extends js.Object {
  /** Matches IN_APP_DATA_SIGNATURE from getPurchases() method in Play InApp Billing API. */
  var inAppDataSignature: js.Object
  /** JSON data of the in app purchase. */
  var inAppPurchaseData: js.Object
}

object Anon_InAppDataSignature {
  @scala.inline
  def apply(inAppDataSignature: js.Object, inAppPurchaseData: js.Object): Anon_InAppDataSignature = {
    val __obj = js.Dynamic.literal(inAppDataSignature = inAppDataSignature, inAppPurchaseData = inAppPurchaseData)
  
    __obj.asInstanceOf[Anon_InAppDataSignature]
  }
}

