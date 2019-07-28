package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Patch extends js.Object {
  /**
    * The classification of the patch (for example, SecurityUpdates, Updates, CriticalUpdates).
    */
  var Classification: js.UndefOr[PatchClassification] = js.undefined
  /**
    * The URL where more information can be obtained about the patch.
    */
  var ContentUrl: js.UndefOr[PatchContentUrl] = js.undefined
  /**
    * The description of the patch.
    */
  var Description: js.UndefOr[PatchDescription] = js.undefined
  /**
    * The ID of the patch (this is different than the Microsoft Knowledge Base ID).
    */
  var Id: js.UndefOr[PatchId] = js.undefined
  /**
    * The Microsoft Knowledge Base ID of the patch.
    */
  var KbNumber: js.UndefOr[PatchKbNumber] = js.undefined
  /**
    * The language of the patch if it's language-specific.
    */
  var Language: js.UndefOr[PatchLanguage] = js.undefined
  /**
    * The ID of the MSRC bulletin the patch is related to.
    */
  var MsrcNumber: js.UndefOr[PatchMsrcNumber] = js.undefined
  /**
    * The severity of the patch (for example Critical, Important, Moderate).
    */
  var MsrcSeverity: js.UndefOr[PatchMsrcSeverity] = js.undefined
  /**
    * The specific product the patch is applicable for (for example, WindowsServer2016).
    */
  var Product: js.UndefOr[PatchProduct] = js.undefined
  /**
    * The product family the patch is applicable for (for example, Windows).
    */
  var ProductFamily: js.UndefOr[PatchProductFamily] = js.undefined
  /**
    * The date the patch was released.
    */
  var ReleaseDate: js.UndefOr[DateTime] = js.undefined
  /**
    * The title of the patch.
    */
  var Title: js.UndefOr[PatchTitle] = js.undefined
  /**
    * The name of the vendor providing the patch.
    */
  var Vendor: js.UndefOr[PatchVendor] = js.undefined
}

object Patch {
  @scala.inline
  def apply(
    Classification: PatchClassification = null,
    ContentUrl: PatchContentUrl = null,
    Description: PatchDescription = null,
    Id: PatchId = null,
    KbNumber: PatchKbNumber = null,
    Language: PatchLanguage = null,
    MsrcNumber: PatchMsrcNumber = null,
    MsrcSeverity: PatchMsrcSeverity = null,
    Product: PatchProduct = null,
    ProductFamily: PatchProductFamily = null,
    ReleaseDate: DateTime = null,
    Title: PatchTitle = null,
    Vendor: PatchVendor = null
  ): Patch = {
    val __obj = js.Dynamic.literal()
    if (Classification != null) __obj.updateDynamic("Classification")(Classification)
    if (ContentUrl != null) __obj.updateDynamic("ContentUrl")(ContentUrl)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (KbNumber != null) __obj.updateDynamic("KbNumber")(KbNumber)
    if (Language != null) __obj.updateDynamic("Language")(Language)
    if (MsrcNumber != null) __obj.updateDynamic("MsrcNumber")(MsrcNumber)
    if (MsrcSeverity != null) __obj.updateDynamic("MsrcSeverity")(MsrcSeverity)
    if (Product != null) __obj.updateDynamic("Product")(Product)
    if (ProductFamily != null) __obj.updateDynamic("ProductFamily")(ProductFamily)
    if (ReleaseDate != null) __obj.updateDynamic("ReleaseDate")(ReleaseDate)
    if (Title != null) __obj.updateDynamic("Title")(Title)
    if (Vendor != null) __obj.updateDynamic("Vendor")(Vendor)
    __obj.asInstanceOf[Patch]
  }
}

