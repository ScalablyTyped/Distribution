package typings
package awsDashSdkLib.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceInput extends js.Object {
  /**
    * The ARN of the CloudWatch resource that you're adding tags to. For more information on ARN format, see Example ARNs in the Amazon Web Services General Reference.
    */
  var ResourceARN: AmazonResourceName
  /**
    * The list of key-value pairs to associate with the resource.
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

