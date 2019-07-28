package typings.awsDashSdk.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetTagsInput extends js.Object {
  /**
    * The ARN of the resource group for which you want a list of tags. The resource must exist within the account you are using.
    */
  var Arn: GroupArn
}

object GetTagsInput {
  @scala.inline
  def apply(Arn: GroupArn): GetTagsInput = {
    val __obj = js.Dynamic.literal(Arn = Arn)
  
    __obj.asInstanceOf[GetTagsInput]
  }
}

