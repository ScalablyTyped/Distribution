package typings.awsDashSdk.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagResourceInput extends js.Object {
  /**
    * An ARN that uniquely identifies a resource. The format of the ARN depends on the type of the tagged resource.
    */
  var ResourceArn: ARN
  /**
    * Key-value pairs that are used to help organize your resources. You can assign your own metadata to the resources you create. 
    */
  var Tags: typings.awsDashSdk.clientsBackupMod.Tags
}

object TagResourceInput {
  @scala.inline
  def apply(ResourceArn: ARN, Tags: Tags): TagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, Tags = Tags)
  
    __obj.asInstanceOf[TagResourceInput]
  }
}

