package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteProvisioningArtifactInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  /**
    * The product identifier.
    */
  var ProductId: Id
  /**
    * The identifier of the provisioning artifact.
    */
  var ProvisioningArtifactId: Id
}

object DeleteProvisioningArtifactInput {
  @scala.inline
  def apply(ProductId: Id, ProvisioningArtifactId: Id, AcceptLanguage: AcceptLanguage = null): DeleteProvisioningArtifactInput = {
    val __obj = js.Dynamic.literal(ProductId = ProductId, ProvisioningArtifactId = ProvisioningArtifactId)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    __obj.asInstanceOf[DeleteProvisioningArtifactInput]
  }
}

