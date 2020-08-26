package typings.awsLambda.anon

import typings.awsLambda.lexMod.LexSlotResolution
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OriginalValue extends js.Object {
  var originalValue: String = js.native
  // The following line only works in TypeScript Version: 3.0, The array should have at least 1 and no more than 5 items
  // resolutions: [LexSlotResolution, LexSlotResolution?, LexSlotResolution?, LexSlotResolution?, LexSlotResolution?];
  var resolutions: js.Array[LexSlotResolution] = js.native
}

object OriginalValue {
  @scala.inline
  def apply(originalValue: String, resolutions: js.Array[LexSlotResolution]): OriginalValue = {
    val __obj = js.Dynamic.literal(originalValue = originalValue.asInstanceOf[js.Any], resolutions = resolutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[OriginalValue]
  }
  @scala.inline
  implicit class OriginalValueOps[Self <: OriginalValue] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setOriginalValue(value: String): Self = this.set("originalValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolutionsVarargs(value: LexSlotResolution*): Self = this.set("resolutions", js.Array(value :_*))
    @scala.inline
    def setResolutions(value: js.Array[LexSlotResolution]): Self = this.set("resolutions", value.asInstanceOf[js.Any])
  }
  
}

