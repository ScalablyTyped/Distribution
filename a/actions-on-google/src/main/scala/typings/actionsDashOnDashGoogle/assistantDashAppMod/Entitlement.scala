package typings.actionsDashOnDashGoogle.assistantDashAppMod

import typings.actionsDashOnDashGoogle.Anon_InAppDataSignature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entitlement extends js.Object {
  /** For in app purchases/subscriptions, relevant details. */
  var inAppDetails: Anon_InAppDataSignature
  /** Product SKU. Matches getSku() in Google Play InApp Billing API. */
  var sku: String
  /** The type of SKU. One of EntitlementSkuType. */
  var skuType: String
}

object Entitlement {
  @scala.inline
  def apply(inAppDetails: Anon_InAppDataSignature, sku: String, skuType: String): Entitlement = {
    val __obj = js.Dynamic.literal(inAppDetails = inAppDetails, sku = sku, skuType = skuType)
  
    __obj.asInstanceOf[Entitlement]
  }
}

