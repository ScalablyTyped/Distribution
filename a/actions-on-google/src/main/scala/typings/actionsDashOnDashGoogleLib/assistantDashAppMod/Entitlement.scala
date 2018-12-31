package typings
package actionsDashOnDashGoogleLib.assistantDashAppMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Entitlement extends js.Object {
  /** For in app purchases/subscriptions, relevant details. */
  var inAppDetails: actionsDashOnDashGoogleLib.Anon_InAppPurchaseData
  /** Product SKU. Matches getSku() in Google Play InApp Billing API. */
  var sku: java.lang.String
  /** The type of SKU. One of EntitlementSkuType. */
  var skuType: java.lang.String
}

