package typings.antdMobileRn.segmentedControlStyleIndexNativeMod

import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISegmentControlStyle extends js.Object {
  var item: ViewStyle = js.native
  var itemLeftRadius: ViewStyle = js.native
  var itemRightRadius: ViewStyle = js.native
  var itemText: TextStyle = js.native
  var segment: ViewStyle = js.native
}

object ISegmentControlStyle {
  @scala.inline
  def apply(
    item: ViewStyle,
    itemLeftRadius: ViewStyle,
    itemRightRadius: ViewStyle,
    itemText: TextStyle,
    segment: ViewStyle
  ): ISegmentControlStyle = {
    val __obj = js.Dynamic.literal(item = item.asInstanceOf[js.Any], itemLeftRadius = itemLeftRadius.asInstanceOf[js.Any], itemRightRadius = itemRightRadius.asInstanceOf[js.Any], itemText = itemText.asInstanceOf[js.Any], segment = segment.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISegmentControlStyle]
  }
  @scala.inline
  implicit class ISegmentControlStyleOps[Self <: ISegmentControlStyle] (val x: Self) extends AnyVal {
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
    def setItem(value: ViewStyle): Self = this.set("item", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemLeftRadius(value: ViewStyle): Self = this.set("itemLeftRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemRightRadius(value: ViewStyle): Self = this.set("itemRightRadius", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemText(value: TextStyle): Self = this.set("itemText", value.asInstanceOf[js.Any])
    @scala.inline
    def setSegment(value: ViewStyle): Self = this.set("segment", value.asInstanceOf[js.Any])
  }
  
}

