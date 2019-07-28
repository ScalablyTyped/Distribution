package typings.awsDashSdk.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceInput extends js.Object {
  /**
    * Requests that one or more tags are added to the resource (such as a workgroup) for the specified ARN.
    */
  var ResourceARN: AmazonResourceName
  /**
    * One or more tags, separated by commas, to be added to the resource, such as a workgroup.
    */
  var Tags: TagList
}

object TagResourceInput {
  @scala.inline
  def apply(ResourceARN: AmazonResourceName, Tags: TagList): TagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceARN = ResourceARN, Tags = Tags)
  
    __obj.asInstanceOf[TagResourceInput]
  }
}

