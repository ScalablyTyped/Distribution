package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EvaluationResultQualifier extends js.Object {
  /**
    * The name of the AWS Config rule that was used in the evaluation.
    */
  var ConfigRuleName: js.UndefOr[StringWithCharLimit64] = js.undefined
  /**
    * The ID of the evaluated AWS resource.
    */
  var ResourceId: js.UndefOr[BaseResourceId] = js.undefined
  /**
    * The type of AWS resource that was evaluated.
    */
  var ResourceType: js.UndefOr[StringWithCharLimit256] = js.undefined
}

object EvaluationResultQualifier {
  @scala.inline
  def apply(
    ConfigRuleName: StringWithCharLimit64 = null,
    ResourceId: BaseResourceId = null,
    ResourceType: StringWithCharLimit256 = null
  ): EvaluationResultQualifier = {
    val __obj = js.Dynamic.literal()
    if (ConfigRuleName != null) __obj.updateDynamic("ConfigRuleName")(ConfigRuleName)
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType)
    __obj.asInstanceOf[EvaluationResultQualifier]
  }
}

