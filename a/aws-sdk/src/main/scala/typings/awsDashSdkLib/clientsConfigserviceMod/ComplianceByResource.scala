package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComplianceByResource extends js.Object {
  /**
    * Indicates whether the AWS resource complies with all of the AWS Config rules that evaluated it.
    */
  var Compliance: js.UndefOr[Compliance] = js.undefined
  /**
    * The ID of the AWS resource that was evaluated.
    */
  var ResourceId: js.UndefOr[BaseResourceId] = js.undefined
  /**
    * The type of the AWS resource that was evaluated.
    */
  var ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined
}

object ComplianceByResource {
  @scala.inline
  def apply(
    Compliance: Compliance = null,
    ResourceId: BaseResourceId = null,
    ResourceType: StringWithCharLimit256 = null
  ): ComplianceByResource = {
    val __obj = js.Dynamic.literal()
    if (Compliance != null) __obj.updateDynamic("Compliance")(Compliance)
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType)
    __obj.asInstanceOf[ComplianceByResource]
  }
}

