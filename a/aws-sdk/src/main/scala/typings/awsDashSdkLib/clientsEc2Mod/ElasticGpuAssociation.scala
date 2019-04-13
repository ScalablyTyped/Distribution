package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElasticGpuAssociation extends js.Object {
  /**
    * The ID of the association.
    */
  var ElasticGpuAssociationId: js.UndefOr[String] = js.undefined
  /**
    * The state of the association between the instance and the Elastic Graphics accelerator.
    */
  var ElasticGpuAssociationState: js.UndefOr[String] = js.undefined
  /**
    * The time the Elastic Graphics accelerator was associated with the instance.
    */
  var ElasticGpuAssociationTime: js.UndefOr[String] = js.undefined
  /**
    * The ID of the Elastic Graphics accelerator.
    */
  var ElasticGpuId: js.UndefOr[String] = js.undefined
}

object ElasticGpuAssociation {
  @scala.inline
  def apply(
    ElasticGpuAssociationId: String = null,
    ElasticGpuAssociationState: String = null,
    ElasticGpuAssociationTime: String = null,
    ElasticGpuId: String = null
  ): ElasticGpuAssociation = {
    val __obj = js.Dynamic.literal()
    if (ElasticGpuAssociationId != null) __obj.updateDynamic("ElasticGpuAssociationId")(ElasticGpuAssociationId)
    if (ElasticGpuAssociationState != null) __obj.updateDynamic("ElasticGpuAssociationState")(ElasticGpuAssociationState)
    if (ElasticGpuAssociationTime != null) __obj.updateDynamic("ElasticGpuAssociationTime")(ElasticGpuAssociationTime)
    if (ElasticGpuId != null) __obj.updateDynamic("ElasticGpuId")(ElasticGpuId)
    __obj.asInstanceOf[ElasticGpuAssociation]
  }
}

