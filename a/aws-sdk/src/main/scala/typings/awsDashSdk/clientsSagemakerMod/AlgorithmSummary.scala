package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AlgorithmSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the algorithm.
    */
  var AlgorithmArn: typings.awsDashSdk.clientsSagemakerMod.AlgorithmArn = js.native
  /**
    * A brief description of the algorithm.
    */
  var AlgorithmDescription: js.UndefOr[EntityDescription] = js.native
  /**
    * The name of the algorithm that is described by the summary.
    */
  var AlgorithmName: EntityName = js.native
  /**
    * The overall status of the algorithm.
    */
  var AlgorithmStatus: typings.awsDashSdk.clientsSagemakerMod.AlgorithmStatus = js.native
  /**
    * A timestamp that shows when the algorithm was created.
    */
  var CreationTime: typings.awsDashSdk.clientsSagemakerMod.CreationTime = js.native
}

object AlgorithmSummary {
  @scala.inline
  def apply(
    AlgorithmArn: AlgorithmArn,
    AlgorithmName: EntityName,
    AlgorithmStatus: AlgorithmStatus,
    CreationTime: CreationTime,
    AlgorithmDescription: EntityDescription = null
  ): AlgorithmSummary = {
    val __obj = js.Dynamic.literal(AlgorithmArn = AlgorithmArn.asInstanceOf[js.Any], AlgorithmName = AlgorithmName.asInstanceOf[js.Any], AlgorithmStatus = AlgorithmStatus.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any])
    if (AlgorithmDescription != null) __obj.updateDynamic("AlgorithmDescription")(AlgorithmDescription.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlgorithmSummary]
  }
}

