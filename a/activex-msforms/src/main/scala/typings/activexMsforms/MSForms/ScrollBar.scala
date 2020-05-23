package typings.activexMsforms.MSForms

import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollBar extends js.Object {
  var BackColor: Double
  var Delay: Double
  var Enabled: Boolean
  var ForeColor: Double
  var LargeChange: Double
  @JSName("MSForms.ScrollBar_typekey")
  var MSFormsDotScrollBar_typekey: ScrollBar
  var Max: Double
  var Min: Double
  var MouseIcon: StdPicture
  var MousePointer: fmMousePointer
  var Orientation: fmOrientation
  var ProportionalThumb: Boolean
  var SmallChange: Double
  var Value: Double
}

object ScrollBar {
  @scala.inline
  def apply(
    BackColor: Double,
    Delay: Double,
    Enabled: Boolean,
    ForeColor: Double,
    LargeChange: Double,
    MSFormsDotScrollBar_typekey: ScrollBar,
    Max: Double,
    Min: Double,
    MouseIcon: StdPicture,
    MousePointer: fmMousePointer,
    Orientation: fmOrientation,
    ProportionalThumb: Boolean,
    SmallChange: Double,
    Value: Double
  ): ScrollBar = {
    val __obj = js.Dynamic.literal(BackColor = BackColor.asInstanceOf[js.Any], Delay = Delay.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], LargeChange = LargeChange.asInstanceOf[js.Any], Max = Max.asInstanceOf[js.Any], Min = Min.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], ProportionalThumb = ProportionalThumb.asInstanceOf[js.Any], SmallChange = SmallChange.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.ScrollBar_typekey")(MSFormsDotScrollBar_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScrollBar]
  }
}

