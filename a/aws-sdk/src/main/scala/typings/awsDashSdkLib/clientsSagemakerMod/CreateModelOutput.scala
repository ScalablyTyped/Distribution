package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateModelOutput extends js.Object {
  /**
    * The ARN of the model created in Amazon SageMaker.
    */
  var ModelArn: awsDashSdkLib.clientsSagemakerMod.ModelArn
}

object CreateModelOutput {
  @scala.inline
  def apply(ModelArn: ModelArn): CreateModelOutput = {
    val __obj = js.Dynamic.literal(ModelArn = ModelArn)
  
    __obj.asInstanceOf[CreateModelOutput]
  }
}

