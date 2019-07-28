package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceInput extends js.Object {
  /**
    *  The ARN of a resource, such as a CodeDeploy application or deployment group. 
    */
  var ResourceArn: Arn
  /**
    *  A list of tags that TagResource associates with a resource. The resource is identified by the ResourceArn input parameter. 
    */
  var Tags: TagList
}

object TagResourceInput {
  @scala.inline
  def apply(ResourceArn: Arn, Tags: TagList): TagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, Tags = Tags)
  
    __obj.asInstanceOf[TagResourceInput]
  }
}

