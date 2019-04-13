package typings
package awsDashSdkLib.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UntagOutput extends js.Object {
  /**
    * The ARN of the resource from which tags have been removed.
    */
  var Arn: js.UndefOr[GroupArn] = js.undefined
  /**
    * The keys of tags that have been removed.
    */
  var Keys: js.UndefOr[TagKeyList] = js.undefined
}

object UntagOutput {
  @scala.inline
  def apply(Arn: GroupArn = null, Keys: TagKeyList = null): UntagOutput = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Keys != null) __obj.updateDynamic("Keys")(Keys)
    __obj.asInstanceOf[UntagOutput]
  }
}

