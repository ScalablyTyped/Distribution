package typings.awsSdk.autoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TagFilter extends js.Object {
  /**
    * The tag key.
    */
  var Key: js.UndefOr[XmlStringMaxLen128] = js.native
  /**
    * The tag values (0 to 20).
    */
  var Values: js.UndefOr[TagValues] = js.native
}

object TagFilter {
  @scala.inline
  def apply(Key: XmlStringMaxLen128 = null, Values: TagValues = null): TagFilter = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key.asInstanceOf[js.Any])
    if (Values != null) __obj.updateDynamic("Values")(Values.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagFilter]
  }
}

