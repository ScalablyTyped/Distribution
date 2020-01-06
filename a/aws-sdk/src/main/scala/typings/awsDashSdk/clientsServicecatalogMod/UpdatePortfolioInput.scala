package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdatePortfolioInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.AcceptLanguage] = js.native
  /**
    * The tags to add.
    */
  var AddTags: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.AddTags] = js.native
  /**
    * The updated description of the portfolio.
    */
  var Description: js.UndefOr[PortfolioDescription] = js.native
  /**
    * The name to use for display purposes.
    */
  var DisplayName: js.UndefOr[PortfolioDisplayName] = js.native
  /**
    * The portfolio identifier.
    */
  var Id: typings.awsDashSdk.clientsServicecatalogMod.Id = js.native
  /**
    * The updated name of the portfolio provider.
    */
  var ProviderName: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.ProviderName] = js.native
  /**
    * The tags to remove.
    */
  var RemoveTags: js.UndefOr[TagKeys] = js.native
}

object UpdatePortfolioInput {
  @scala.inline
  def apply(
    Id: Id,
    AcceptLanguage: AcceptLanguage = null,
    AddTags: AddTags = null,
    Description: PortfolioDescription = null,
    DisplayName: PortfolioDisplayName = null,
    ProviderName: ProviderName = null,
    RemoveTags: TagKeys = null
  ): UpdatePortfolioInput = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage.asInstanceOf[js.Any])
    if (AddTags != null) __obj.updateDynamic("AddTags")(AddTags.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName.asInstanceOf[js.Any])
    if (ProviderName != null) __obj.updateDynamic("ProviderName")(ProviderName.asInstanceOf[js.Any])
    if (RemoveTags != null) __obj.updateDynamic("RemoveTags")(RemoveTags.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdatePortfolioInput]
  }
}

