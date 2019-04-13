package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribedWorkteam extends js.Object {
  /**
    * 
    */
  var ListingId: js.UndefOr[String] = js.undefined
  /**
    * The description of the vendor from the Amazon Marketplace.
    */
  var MarketplaceDescription: js.UndefOr[String200] = js.undefined
  /**
    * The title of the service provided by the vendor in the Amazon Marketplace.
    */
  var MarketplaceTitle: js.UndefOr[String200] = js.undefined
  /**
    * The name of the vendor in the Amazon Marketplace.
    */
  var SellerName: js.UndefOr[String] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the vendor that you have subscribed.
    */
  var WorkteamArn: awsDashSdkLib.clientsSagemakerMod.WorkteamArn
}

object SubscribedWorkteam {
  @scala.inline
  def apply(
    WorkteamArn: WorkteamArn,
    ListingId: String = null,
    MarketplaceDescription: String200 = null,
    MarketplaceTitle: String200 = null,
    SellerName: String = null
  ): SubscribedWorkteam = {
    val __obj = js.Dynamic.literal(WorkteamArn = WorkteamArn)
    if (ListingId != null) __obj.updateDynamic("ListingId")(ListingId)
    if (MarketplaceDescription != null) __obj.updateDynamic("MarketplaceDescription")(MarketplaceDescription)
    if (MarketplaceTitle != null) __obj.updateDynamic("MarketplaceTitle")(MarketplaceTitle)
    if (SellerName != null) __obj.updateDynamic("SellerName")(SellerName)
    __obj.asInstanceOf[SubscribedWorkteam]
  }
}

