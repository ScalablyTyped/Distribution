package typings.antdDashMobileDashRn.libSegmentedDashControlStyleIndexDotNativeMod

import typings.reactDashNative.reactDashNativeMod.TextStyle
import typings.reactDashNative.reactDashNativeMod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISegmentControlStyle extends js.Object {
  var item: ViewStyle
  var itemLeftRadius: ViewStyle
  var itemRightRadius: ViewStyle
  var itemText: TextStyle
  var segment: ViewStyle
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
}

