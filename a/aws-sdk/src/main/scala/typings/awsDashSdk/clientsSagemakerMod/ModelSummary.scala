package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModelSummary extends js.Object {
  /**
    * A timestamp that indicates when the model was created.
    */
  var CreationTime: Timestamp
  /**
    * The Amazon Resource Name (ARN) of the model.
    */
  var ModelArn: typings.awsDashSdk.clientsSagemakerMod.ModelArn
  /**
    * The name of the model that you want a summary for.
    */
  var ModelName: typings.awsDashSdk.clientsSagemakerMod.ModelName
}

object ModelSummary {
  @scala.inline
  def apply(CreationTime: Timestamp, ModelArn: ModelArn, ModelName: ModelName): ModelSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime, ModelArn = ModelArn, ModelName = ModelName)
  
    __obj.asInstanceOf[ModelSummary]
  }
}

