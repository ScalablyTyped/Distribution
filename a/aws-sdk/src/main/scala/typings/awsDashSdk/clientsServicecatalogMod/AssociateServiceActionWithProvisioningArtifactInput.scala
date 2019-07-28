package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AssociateServiceActionWithProvisioningArtifactInput extends js.Object {
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.AcceptLanguage] = js.undefined
  /**
    * The product identifier. For example, prod-abcdzk7xy33qa.
    */
  var ProductId: Id
  /**
    * The identifier of the provisioning artifact. For example, pa-4abcdjnxjj6ne.
    */
  var ProvisioningArtifactId: Id
  /**
    * The self-service action identifier. For example, act-fs7abcd89wxyz.
    */
  var ServiceActionId: Id
}

object AssociateServiceActionWithProvisioningArtifactInput {
  @scala.inline
  def apply(
    ProductId: Id,
    ProvisioningArtifactId: Id,
    ServiceActionId: Id,
    AcceptLanguage: AcceptLanguage = null
  ): AssociateServiceActionWithProvisioningArtifactInput = {
    val __obj = js.Dynamic.literal(ProductId = ProductId, ProvisioningArtifactId = ProvisioningArtifactId, ServiceActionId = ServiceActionId)
    if (AcceptLanguage != null) __obj.updateDynamic("AcceptLanguage")(AcceptLanguage)
    __obj.asInstanceOf[AssociateServiceActionWithProvisioningArtifactInput]
  }
}

