package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * The function's Amazon Resource Name (ARN).
    */
  var Resource: FunctionArn
  /**
    * A list of tags to apply to the function.
    */
  var Tags: awsDashSdkLib.clientsLambdaMod.Tags
}

object TagResourceRequest {
  @scala.inline
  def apply(Resource: FunctionArn, Tags: Tags): TagResourceRequest = {
    val __obj = js.Dynamic.literal(Resource = Resource, Tags = Tags)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

