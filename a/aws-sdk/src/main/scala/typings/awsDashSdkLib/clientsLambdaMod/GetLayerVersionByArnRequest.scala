package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetLayerVersionByArnRequest extends js.Object {
  /**
    * The ARN of the layer version.
    */
  var Arn: LayerVersionArn
}

object GetLayerVersionByArnRequest {
  @scala.inline
  def apply(Arn: LayerVersionArn): GetLayerVersionByArnRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn)
  
    __obj.asInstanceOf[GetLayerVersionByArnRequest]
  }
}

