package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceTags extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the resource.
    */
  var Arn: js.UndefOr[__string] = js.native
  /**
    * The tags for the resource.
    */
  var Tags: js.UndefOr[__mapOf__string] = js.native
}

object ResourceTags {
  @scala.inline
  def apply(Arn: __string = null, Tags: __mapOf__string = null): ResourceTags = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceTags]
  }
}

