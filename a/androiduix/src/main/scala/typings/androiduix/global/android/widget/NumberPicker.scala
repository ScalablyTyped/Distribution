package typings.androiduix.global.android.widget

import typings.androiduix.android.content.Context
import typings.androiduix.android.widget.NumberPicker.Formatter
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.NumberPicker")
@js.native
class NumberPicker protected ()
  extends typings.androiduix.android.widget.NumberPicker {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
}

/* static members */
@JSGlobal("android.widget.NumberPicker")
@js.native
object NumberPicker extends js.Object {
  @js.native
  class BeginSoftInputOnLongPressCommand protected ()
    extends typings.androiduix.android.widget.NumberPicker.BeginSoftInputOnLongPressCommand {
    def this(arg: typings.androiduix.android.widget.NumberPicker) = this()
  }
  
  @js.native
  class ChangeCurrentByOneFromLongPressCommand protected ()
    extends typings.androiduix.android.widget.NumberPicker.ChangeCurrentByOneFromLongPressCommand {
    def this(arg: typings.androiduix.android.widget.NumberPicker) = this()
  }
  
  @js.native
  class PressedStateHelper protected ()
    extends typings.androiduix.android.widget.NumberPicker.PressedStateHelper {
    def this(arg: typings.androiduix.android.widget.NumberPicker) = this()
  }
  
  @js.native
  class SetSelectionCommand protected ()
    extends typings.androiduix.android.widget.NumberPicker.SetSelectionCommand {
    def this(arg: typings.androiduix.android.widget.NumberPicker) = this()
  }
  
  @js.native
  class TwoDigitFormatter ()
    extends typings.androiduix.android.widget.NumberPicker.TwoDigitFormatter
  
  var DEFAULT_LONG_PRESS_UPDATE_INTERVAL: js.Any = js.native
  var SELECTOR_ADJUSTMENT_DURATION_MILLIS: js.Any = js.native
  var SELECTOR_MAX_FLING_VELOCITY_ADJUSTMENT: js.Any = js.native
  var SIZE_UNSPECIFIED: js.Any = js.native
  var SNAP_SCROLL_DURATION: js.Any = js.native
  var TOP_AND_BOTTOM_FADING_EDGE_STRENGTH: js.Any = js.native
  var UNSCALED_DEFAULT_SELECTION_DIVIDERS_DISTANCE: js.Any = js.native
  var UNSCALED_DEFAULT_SELECTION_DIVIDER_HEIGHT: js.Any = js.native
  var sTwoDigitFormatter: js.Any = js.native
  /* private */ def formatNumberWithLocale(value: js.Any): js.Any = js.native
  def getTwoDigitFormatter(): Formatter = js.native
  @js.native
  object OnScrollListener extends js.Object {
    var SCROLL_STATE_FLING: Double = js.native
    var SCROLL_STATE_IDLE: Double = js.native
    var SCROLL_STATE_TOUCH_SCROLL: Double = js.native
  }
  
  /* static members */
  @js.native
  object PressedStateHelper extends js.Object {
    var BUTTON_DECREMENT: Double = js.native
    var BUTTON_INCREMENT: Double = js.native
  }
  
}

