package typings
package awsDashSdkLib.clientsSqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetQueueAttributesResult extends js.Object {
  /**
    * A map of attributes to their respective values.
    */
  var Attributes: js.UndefOr[QueueAttributeMap] = js.undefined
}

object GetQueueAttributesResult {
  @scala.inline
  def apply(Attributes: QueueAttributeMap = null): GetQueueAttributesResult = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    __obj.asInstanceOf[GetQueueAttributesResult]
  }
}

