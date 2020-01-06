package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticInferenceAcceleratorAssociation extends js.Object {
  /**
    *  The Amazon Resource Name (ARN) of the elastic inference accelerator. 
    */
  var ElasticInferenceAcceleratorArn: js.UndefOr[String] = js.native
  /**
    *  The ID of the association. 
    */
  var ElasticInferenceAcceleratorAssociationId: js.UndefOr[String] = js.native
  /**
    *  The state of the elastic inference accelerator. 
    */
  var ElasticInferenceAcceleratorAssociationState: js.UndefOr[String] = js.native
  /**
    *  The time at which the elastic inference accelerator is associated with an instance. 
    */
  var ElasticInferenceAcceleratorAssociationTime: js.UndefOr[DateTime] = js.native
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
    if (ElasticInferenceAcceleratorArn != null) __obj.updateDynamic("ElasticInferenceAcceleratorArn")(ElasticInferenceAcceleratorArn.asInstanceOf[js.Any])
    if (ElasticInferenceAcceleratorAssociationId != null) __obj.updateDynamic("ElasticInferenceAcceleratorAssociationId")(ElasticInferenceAcceleratorAssociationId.asInstanceOf[js.Any])
    if (ElasticInferenceAcceleratorAssociationState != null) __obj.updateDynamic("ElasticInferenceAcceleratorAssociationState")(ElasticInferenceAcceleratorAssociationState.asInstanceOf[js.Any])
    if (ElasticInferenceAcceleratorAssociationTime != null) __obj.updateDynamic("ElasticInferenceAcceleratorAssociationTime")(ElasticInferenceAcceleratorAssociationTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticInferenceAcceleratorAssociation]
  }
}

