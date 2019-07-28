package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModifyTargetGroupAttributesOutput extends js.Object {
  /**
    * Information about the attributes.
    */
  var Attributes: js.UndefOr[TargetGroupAttributes] = js.undefined
}

object ModifyTargetGroupAttributesOutput {
  @scala.inline
  def apply(Attributes: TargetGroupAttributes = null): ModifyTargetGroupAttributesOutput = {
    val __obj = js.Dynamic.literal()
    if (Attributes != null) __obj.updateDynamic("Attributes")(Attributes)
    __obj.asInstanceOf[ModifyTargetGroupAttributesOutput]
  }
}

