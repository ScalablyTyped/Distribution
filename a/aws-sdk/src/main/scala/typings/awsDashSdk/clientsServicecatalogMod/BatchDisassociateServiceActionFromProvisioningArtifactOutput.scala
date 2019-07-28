package typings.awsDashSdk.clientsServicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDisassociateServiceActionFromProvisioningArtifactOutput extends js.Object {
  /**
    * An object that contains a list of errors, along with information to help you identify the self-service action.
    */
  var FailedServiceActionAssociations: js.UndefOr[typings.awsDashSdk.clientsServicecatalogMod.FailedServiceActionAssociations] = js.undefined
}

object BatchDisassociateServiceActionFromProvisioningArtifactOutput {
  @scala.inline
  def apply(FailedServiceActionAssociations: FailedServiceActionAssociations = null): BatchDisassociateServiceActionFromProvisioningArtifactOutput = {
    val __obj = js.Dynamic.literal()
    if (FailedServiceActionAssociations != null) __obj.updateDynamic("FailedServiceActionAssociations")(FailedServiceActionAssociations)
    __obj.asInstanceOf[BatchDisassociateServiceActionFromProvisioningArtifactOutput]
  }
}

