package typings.awsDashSdk.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagInput extends js.Object {
  /**
    * The ARN of the resource from which to remove tags.
    */
  var Arn: GroupArn
  /**
    * The keys of the tags to be removed.
    */
  var Keys: TagKeyList
}

object UntagInput {
  @scala.inline
  def apply(Arn: GroupArn, Keys: TagKeyList): UntagInput = {
    val __obj = js.Dynamic.literal(Arn = Arn, Keys = Keys)
  
    __obj.asInstanceOf[UntagInput]
  }
}

