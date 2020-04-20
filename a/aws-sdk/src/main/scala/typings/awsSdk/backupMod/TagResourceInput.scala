package typings.awsSdk.backupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagResourceInput extends js.Object {
  /**
    * An ARN that uniquely identifies a resource. The format of the ARN depends on the type of the tagged resource.
    */
  var ResourceArn: ARN = js.native
  /**
    * Key-value pairs that are used to help organize your resources. You can assign your own metadata to the resources you create. 
    */
  var Tags: typings.awsSdk.backupMod.Tags = js.native
}

object TagResourceInput {
  @scala.inline
  def apply(ResourceArn: ARN, Tags: Tags): TagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any], Tags = Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagResourceInput]
  }
}

