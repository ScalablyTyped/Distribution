package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceRequest extends js.Object {
  /**
    * The ARN of the resource to which to add metadata tags. Required. 
    */
  var Arn: awsDashSdkLib.clientsAlexaforbusinessMod.Arn
  /**
    * The tags to be added to the specified resource. Do not provide system tags. Required. 
    */
  var Tags: TagList
}

object TagResourceRequest {
  @scala.inline
  def apply(Arn: Arn, Tags: TagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn, Tags = Tags)
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

