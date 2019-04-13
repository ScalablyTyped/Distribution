package typings
package awsDashSdkLib.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchAssociateServiceActionWithProvisioningArtifactOutput extends js.Object {
  /**
    * An object that contains a list of errors, along with information to help you identify the self-service action.
    */
  var FailedServiceActionAssociations: js.UndefOr[FailedServiceActionAssociations] = js.undefined
}

object BatchAssociateServiceActionWithProvisioningArtifactOutput {
  @scala.inline
  def apply(FailedServiceActionAssociations: FailedServiceActionAssociations = null): BatchAssociateServiceActionWithProvisioningArtifactOutput = {
    val __obj = js.Dynamic.literal()
    if (FailedServiceActionAssociations != null) __obj.updateDynamic("FailedServiceActionAssociations")(FailedServiceActionAssociations)
    __obj.asInstanceOf[BatchAssociateServiceActionWithProvisioningArtifactOutput]
  }
}

