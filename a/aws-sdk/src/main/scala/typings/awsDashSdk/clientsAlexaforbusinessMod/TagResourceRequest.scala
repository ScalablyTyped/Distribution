package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceRequest extends js.Object {
  /**
    * The ARN of the resource to which to add metadata tags. Required. 
    */
  var Arn: typings.awsDashSdk.clientsAlexaforbusinessMod.Arn = js.native
  /**
    * The tags to be added to the specified resource. Do not provide system tags. Required. 
    */
  var Tags: TagList = js.native
}

object TagResourceRequest {
  @scala.inline
  def apply(Arn: Arn, Tags: TagList): TagResourceRequest = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TagResourceRequest]
  }
}

