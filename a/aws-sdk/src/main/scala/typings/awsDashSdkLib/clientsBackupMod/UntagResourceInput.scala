package typings
package awsDashSdkLib.clientsBackupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagResourceInput extends js.Object {
  /**
    * An ARN that uniquely identifies a resource. The format of the ARN depends on the type of the tagged resource.
    */
  var ResourceArn: ARN
  /**
    * A list of keys to identify which key-value tags to remove from a resource.
    */
  var TagKeyList: awsDashSdkLib.clientsBackupMod.TagKeyList
}

object UntagResourceInput {
  @scala.inline
  def apply(ResourceArn: ARN, TagKeyList: TagKeyList): UntagResourceInput = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn, TagKeyList = TagKeyList)
  
    __obj.asInstanceOf[UntagResourceInput]
  }
}

