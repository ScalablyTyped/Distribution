package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedServiceActionAssociation extends js.Object {
  /**
    * The error code. Valid values are listed below.
    */
  var ErrorCode: js.UndefOr[ServiceActionAssociationErrorCode] = js.undefined
  /**
    * A text description of the error.
    */
  var ErrorMessage: js.UndefOr[ServiceActionAssociationErrorMessage] = js.undefined
  /**
    * The product identifier. For example, prod-abcdzk7xy33qa.
    */
  var ProductId: js.UndefOr[Id] = js.undefined
  /**
    * The identifier of the provisioning artifact. For example, pa-4abcdjnxjj6ne.
    */
  var ProvisioningArtifactId: js.UndefOr[Id] = js.undefined
  /**
    * The self-service action identifier. For example, act-fs7abcd89wxyz.
    */
  var ServiceActionId: js.UndefOr[Id] = js.undefined
}

object FailedServiceActionAssociation {
  @scala.inline
  def apply(
    ErrorCode: ServiceActionAssociationErrorCode = null,
    ErrorMessage: ServiceActionAssociationErrorMessage = null,
    ProductId: Id = null,
    ProvisioningArtifactId: Id = null,
    ServiceActionId: Id = null
  ): FailedServiceActionAssociation = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage)
    if (ProductId != null) __obj.updateDynamic("ProductId")(ProductId)
    if (ProvisioningArtifactId != null) __obj.updateDynamic("ProvisioningArtifactId")(ProvisioningArtifactId)
    if (ServiceActionId != null) __obj.updateDynamic("ServiceActionId")(ServiceActionId)
    __obj.asInstanceOf[FailedServiceActionAssociation]
  }
}

