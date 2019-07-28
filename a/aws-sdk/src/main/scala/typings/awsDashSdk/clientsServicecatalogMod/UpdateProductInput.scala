package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateProductInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  /**
    * The tags to add to the product.
    */
  var AddTags: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.AddTags] = js.undefined
  /**
    * The updated description of the product.
    */
  var Description: js.UndefOr[ProductViewShortDescription] = js.undefined
  /**
    * The updated distributor of the product.
    */
  var Distributor: js.UndefOr[ProductViewOwner] = js.undefined
  /**
    * The product identifier.
    */
  var Id: typings.awsDashSdk.clientsServicecatalogMod.Id
  /**
    * The updated product name.
    */
  var Name: js.UndefOr[ProductViewName] = js.undefined
  /**
    * The updated owner of the product.
    */
  var Owner: js.UndefOr[ProductViewOwner] = js.undefined
  /**
    * The tags to remove from the product.
    */
  var RemoveTags: js.UndefOr[TagKeys] = js.undefined
  /**
    * The updated support description for the product.
    */
  var SupportDescription: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.SupportDescription] = js.undefined
  /**
    * The updated support email for the product.
    */
  var SupportEmail: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.SupportEmail] = js.undefined
  /**
    * The updated support URL for the product.
    */
  var SupportUrl: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.SupportUrl] = js.undefined
}

object UpdateProductInput {
  @scala.inline
  def apply(
    Id: Id,
    AcceptLanguage: AcceptLanguage = null,
    AddTags: AddTags = null,
    Description: ProductViewShortDescription = null,
    Distributor: ProductViewOwner = null,
    Name: ProductViewName = null,
    Owner: ProductViewOwner = null,
    RemoveTags: TagKeys = null,
    SupportDescription: SupportDescription = null,
    SupportEmail: SupportEmail = null,
    SupportUrl: SupportUrl = null
  ): UpdateProductInput = {
    val __obj = js.Dynamic.literal(Id = Id)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    if (AddTags != null) __obj.updateDynamic("AddTags")(AddTags)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Distributor != null) __obj.updateDynamic("Distributor")(Distributor)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (Owner != null) __obj.updateDynamic("Owner")(Owner)
    if (RemoveTags != null) __obj.updateDynamic("RemoveTags")(RemoveTags)
    if (SupportDescription != null) __obj.updateDynamic("SupportDescription")(SupportDescription)
    if (SupportEmail != null) __obj.updateDynamic("SupportEmail")(SupportEmail)
    if (SupportUrl != null) __obj.updateDynamic("SupportUrl")(SupportUrl)
    __obj.asInstanceOf[UpdateProductInput]
  }
}

