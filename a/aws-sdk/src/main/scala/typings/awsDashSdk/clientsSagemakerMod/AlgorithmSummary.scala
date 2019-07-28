package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlgorithmSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the algorithm.
    */
  var AlgorithmArn: typings.awsDashSdk.clientsSagemakerMod.AlgorithmArn
  /**
    * A brief description of the algorithm.
    */
  var AlgorithmDescription: js.UndefOr[EntityDescription] = js.undefined
  /**
    * The name of the algorithm that is described by the summary.
    */
  var AlgorithmName: EntityName
  /**
    * The overall status of the algorithm.
    */
  var AlgorithmStatus: typings.awsDashSdk.clientsSagemakerMod.AlgorithmStatus
  /**
    * A timestamp that shows when the algorithm was created.
    */
  var CreationTime: typings.awsDashSdk.clientsSagemakerMod.CreationTime
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
    val __obj = js.Dynamic.literal(AlgorithmArn = AlgorithmArn, AlgorithmName = AlgorithmName, AlgorithmStatus = AlgorithmStatus.asInstanceOf[js.Any], CreationTime = CreationTime)
    if (AlgorithmDescription != null) __obj.updateDynamic("AlgorithmDescription")(AlgorithmDescription)
    __obj.asInstanceOf[AlgorithmSummary]
  }
}

