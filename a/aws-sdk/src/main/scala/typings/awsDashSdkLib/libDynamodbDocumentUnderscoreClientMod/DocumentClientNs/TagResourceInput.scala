package typings
package awsDashSdkLib.libDynamodbDocumentUnderscoreClientMod.DocumentClientNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceInput extends js.Object {
  /**
    * Identifies the Amazon DynamoDB resource to which tags should be added. This value is an Amazon Resource Name (ARN).
    */
  var ResourceArn: ResourceArnString
  /**
    * The tags to be assigned to the Amazon DynamoDB resource.
    */
  var Tags: TagList
}

object TagResourceInput {
  @scala.inline
  def apply(ResourceArn: ResourceArnString, Tags: TagList): TagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, Tags = Tags)
  
    __obj.asInstanceOf[TagResourceInput]
  }
}

