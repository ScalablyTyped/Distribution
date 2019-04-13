package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdatePortfolioInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
  /**
    * The tags to add.
    */
  var AddTags: js.UndefOr[AddTags] = js.undefined
  /**
    * The updated description of the portfolio.
    */
  var Description: js.UndefOr[PortfolioDescription] = js.undefined
  /**
    * The name to use for display purposes.
    */
  var DisplayName: js.UndefOr[PortfolioDisplayName] = js.undefined
  /**
    * The portfolio identifier.
    */
  var Id: awsDashSdkLib.clientsServicecatalogMod.Id
  /**
    * The updated name of the portfolio provider.
    */
  var ProviderName: js.UndefOr[ProviderName] = js.undefined
  /**
    * The tags to remove.
    */
  var RemoveTags: js.UndefOr[TagKeys] = js.undefined
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
    val __obj = js.Dynamic.literal(Id = Id)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    if (AddTags != null) __obj.updateDynamic("AddTags")(AddTags)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (DisplayName != null) __obj.updateDynamic("DisplayName")(DisplayName)
    if (ProviderName != null) __obj.updateDynamic("ProviderName")(ProviderName)
    if (RemoveTags != null) __obj.updateDynamic("RemoveTags")(RemoveTags)
    __obj.asInstanceOf[UpdatePortfolioInput]
  }
}

