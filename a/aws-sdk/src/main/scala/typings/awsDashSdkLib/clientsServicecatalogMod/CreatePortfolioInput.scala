package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePortfolioInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[AcceptLanguage] = js.undefined
  /**
    * The description of the portfolio.
    */
  var Description: js.UndefOr[PortfolioDescription] = js.undefined
  /**
    * The name to use for display purposes.
    */
  var DisplayName: PortfolioDisplayName
  /**
    * A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request.
    */
  var IdempotencyToken: awsDashSdkLib.clientsServicecatalogMod.IdempotencyToken
  /**
    * The name of the portfolio provider.
    */
  var ProviderName: awsDashSdkLib.clientsServicecatalogMod.ProviderName
  /**
    * One or more tags.
    */
  var Tags: js.UndefOr[AddTags] = js.undefined
}

object CreatePortfolioInput {
  @scala.inline
  def apply(
    DisplayName: PortfolioDisplayName,
    IdempotencyToken: IdempotencyToken,
    ProviderName: ProviderName,
    AcceptLanguage: AcceptLanguage = null,
    Description: PortfolioDescription = null,
    Tags: AddTags = null
  ): CreatePortfolioInput = {
    val __obj = js.Dynamic.literal(DisplayName = DisplayName, IdempotencyToken = IdempotencyToken, ProviderName = ProviderName)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreatePortfolioInput]
  }
}

