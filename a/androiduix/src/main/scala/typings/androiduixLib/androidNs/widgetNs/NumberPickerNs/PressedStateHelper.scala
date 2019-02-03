package typings
package androiduixLib.androidNs.widgetNs.NumberPickerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.NumberPicker.PressedStateHelper")
@js.native
class PressedStateHelper protected ()
  extends androiduixLib.javaNs.langNs.Runnable {
  def this(arg: androiduixLib.androidNs.widgetNs.NumberPicker) = this()
  var MODE_PRESS: js.Any = js.native
  var MODE_TAPPED: js.Any = js.native
  var _NumberPicker_this: androiduixLib.androidNs.widgetNs.NumberPicker = js.native
  var mManagedButton: js.Any = js.native
  var mMode: js.Any = js.native
  def buttonPressDelayed(button: scala.Double): scala.Unit = js.native
  def buttonTapped(button: scala.Double): scala.Unit = js.native
  def cancel(): scala.Unit = js.native
  /* CompleteClass */
  override def run(): js.Any = js.native
}

/* static members */
@JSGlobal("android.widget.NumberPicker.PressedStateHelper")
@js.native
object PressedStateHelper extends js.Object {
  var BUTTON_DECREMENT: scala.Double = js.native
  var BUTTON_INCREMENT: scala.Double = js.native
}

