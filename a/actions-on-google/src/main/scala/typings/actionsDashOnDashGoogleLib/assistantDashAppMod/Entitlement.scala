package typings
package actionsDashOnDashGoogleLib.assistantDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entitlement extends js.Object {
  /** For in app purchases/subscriptions, relevant details. */
  var inAppDetails: actionsDashOnDashGoogleLib.Anon_InAppDataSignature
  /** Product SKU. Matches getSku() in Google Play InApp Billing API. */
  var sku: java.lang.String
  /** The type of SKU. One of EntitlementSkuType. */
  var skuType: java.lang.String
}

object Entitlement {
  @scala.inline
  def apply(
    inAppDetails: actionsDashOnDashGoogleLib.Anon_InAppDataSignature,
    sku: java.lang.String,
    skuType: java.lang.String
  ): Entitlement = {
    val __obj = js.Dynamic.literal(inAppDetails = inAppDetails, sku = sku, skuType = skuType)
  
    __obj.asInstanceOf[Entitlement]
  }
}

