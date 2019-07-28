package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PortfolioDetail extends js.Object {
  /**
    * The ARN assigned to the portfolio.
    */
  var ARN: js.UndefOr[ResourceARN] = js.undefined
  /**
    * The UTC time stamp of the creation time.
    */
  var CreatedTime: js.UndefOr[CreationTime] = js.undefined
  /**
    * The description of the portfolio.
    */
  var Description: js.UndefOr[PortfolioDescription] = js.undefined
  /**
    * The name to use for display purposes.
    */
  var DisplayName: js.UndefOr[PortfolioDisplayName] = js.undefined
  /**
    * The portfolio identifier.
    */
  var Id: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.Id] = js.undefined
  /**
    * The name of the portfolio provider.
    */
  var ProviderName: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ProviderName] = js.undefined
}

object PortfolioDetail {
  @scala.inline
  def apply(
    ARN: ResourceARN = null,
    CreatedTime: CreationTime = null,
    Description: PortfolioDescription = null,
    DisplayName: PortfolioDisplayName = null,
    Id: Id = null,
    ProviderName: ProviderName = null
  ): PortfolioDetail = {
    val __obj = js.Dynamic.literal()
    if (ARN != null) __obj.updateDynamic("ARN")(ARN)
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (ProviderName != null) __obj.updateDynamic("ProviderName")(ProviderName)
    __obj.asInstanceOf[PortfolioDetail]
  }
}

