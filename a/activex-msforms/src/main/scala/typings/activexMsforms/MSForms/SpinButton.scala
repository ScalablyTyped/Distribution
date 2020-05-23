package typings.activexMsforms.MSForms

import typings.activexStdole.stdole.StdPicture
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpinButton extends js.Object {
  var BackColor: Double
  var Delay: Double
  var Enabled: Boolean
  var ForeColor: Double
  @JSName("MSForms.SpinButton_typekey")
  var MSFormsDotSpinButton_typekey: SpinButton
  var Max: Double
  var Min: Double
  var MouseIcon: StdPicture
  var MousePointer: fmMousePointer
  var Orientation: fmOrientation
  var SmallChange: Double
  var Value: Double
}

object SpinButton {
  @scala.inline
  def apply(
    BackColor: Double,
    Delay: Double,
    Enabled: Boolean,
    ForeColor: Double,
    MSFormsDotSpinButton_typekey: SpinButton,
    Max: Double,
    Min: Double,
    MouseIcon: StdPicture,
    MousePointer: fmMousePointer,
    Orientation: fmOrientation,
    SmallChange: Double,
    Value: Double
  ): SpinButton = {
    val __obj = js.Dynamic.literal(BackColor = BackColor.asInstanceOf[js.Any], Delay = Delay.asInstanceOf[js.Any], Enabled = Enabled.asInstanceOf[js.Any], ForeColor = ForeColor.asInstanceOf[js.Any], Max = Max.asInstanceOf[js.Any], Min = Min.asInstanceOf[js.Any], MouseIcon = MouseIcon.asInstanceOf[js.Any], MousePointer = MousePointer.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], SmallChange = SmallChange.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.updateDynamic("MSForms.SpinButton_typekey")(MSFormsDotSpinButton_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpinButton]
  }
}

