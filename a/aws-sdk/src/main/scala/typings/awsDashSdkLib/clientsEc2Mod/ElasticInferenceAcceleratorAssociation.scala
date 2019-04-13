package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElasticInferenceAcceleratorAssociation extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the elastic inference accelerator. 
    */
  var ElasticInferenceAcceleratorArn: js.UndefOr[String] = js.undefined
  /**
    *  The ID of the association. 
    */
  var ElasticInferenceAcceleratorAssociationId: js.UndefOr[String] = js.undefined
  /**
    *  The state of the elastic inference accelerator. 
    */
  var ElasticInferenceAcceleratorAssociationState: js.UndefOr[String] = js.undefined
  /**
    *  The time at which the elastic inference accelerator is associated with an instance. 
    */
  var ElasticInferenceAcceleratorAssociationTime: js.UndefOr[DateTime] = js.undefined
}

object ElasticInferenceAcceleratorAssociation {
  @scala.inline
  def apply(
    ElasticInferenceAcceleratorArn: String = null,
    ElasticInferenceAcceleratorAssociationId: String = null,
    ElasticInferenceAcceleratorAssociationState: String = null,
    ElasticInferenceAcceleratorAssociationTime: DateTime = null
  ): ElasticInferenceAcceleratorAssociation = {
    val __obj = js.Dynamic.literal()
    if (ElasticInferenceAcceleratorArn != null) __obj.updateDynamic("ElasticInferenceAcceleratorArn")(ElasticInferenceAcceleratorArn)
    if (ElasticInferenceAcceleratorAssociationId != null) __obj.updateDynamic("ElasticInferenceAcceleratorAssociationId")(ElasticInferenceAcceleratorAssociationId)
    if (ElasticInferenceAcceleratorAssociationState != null) __obj.updateDynamic("ElasticInferenceAcceleratorAssociationState")(ElasticInferenceAcceleratorAssociationState)
    if (ElasticInferenceAcceleratorAssociationTime != null) __obj.updateDynamic("ElasticInferenceAcceleratorAssociationTime")(ElasticInferenceAcceleratorAssociationTime)
    __obj.asInstanceOf[ElasticInferenceAcceleratorAssociation]
  }
}

