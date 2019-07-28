package typings.awsDashSdk.clientsAutoscalingplansMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagFilter extends js.Object {
  /**
    * The tag key.
    */
  var Key: js.UndefOr[XmlStringMaxLen128] = js.undefined
  /**
    * The tag values (0 to 20).
    */
  var Values: js.UndefOr[TagValues] = js.undefined
}

object TagFilter {
  @scala.inline
  def apply(Key: XmlStringMaxLen128 = null, Values: TagValues = null): TagFilter = {
    val __obj = js.Dynamic.literal()
    if (Key != null) __obj.updateDynamic("Key")(Key)
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[TagFilter]
  }
}

