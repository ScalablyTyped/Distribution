package typings.androiduix.global.android.widget

import typings.androiduix.android.content.Context
import typings.androiduix.android.widget.SpinnerAdapter
import typings.std.HTMLElement
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.Spinner")
@js.native
class Spinner protected ()
  extends typings.androiduix.android.widget.Spinner {
  def this(context: Context) = this()
  def this(context: Context, bindElement: HTMLElement) = this()
  def this(context: Context, bindElement: js.UndefOr[scala.Nothing], defStyle: Map[String, String]) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String]) = this()
  def this(
    context: Context,
    bindElement: js.UndefOr[scala.Nothing],
    defStyle: js.UndefOr[scala.Nothing],
    mode: Double
  ) = this()
  def this(
    context: Context,
    bindElement: js.UndefOr[scala.Nothing],
    defStyle: Map[String, String],
    mode: Double
  ) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: js.UndefOr[scala.Nothing], mode: Double) = this()
  def this(context: Context, bindElement: HTMLElement, defStyle: Map[String, String], mode: Double) = this()
}

/* static members */
@JSGlobal("android.widget.Spinner")
@js.native
object Spinner extends js.Object {
  @js.native
  class DialogPopup protected ()
    extends typings.androiduix.android.widget.Spinner.DialogPopup {
    def this(arg: typings.androiduix.android.widget.Spinner) = this()
  }
  
  @js.native
  class DropDownAdapter protected ()
    extends typings.androiduix.android.widget.Spinner.DropDownAdapter {
    def this(adapter: SpinnerAdapter) = this()
  }
  
  @js.native
  class DropdownPopup protected ()
    extends typings.androiduix.android.widget.Spinner.DropdownPopup {
    def this(context: Context, defStyleRes: Map[String, String], arg: typings.androiduix.android.widget.Spinner) = this()
  }
  
  var MAX_ITEMS_MEASURED: js.Any = js.native
  var MODE_DIALOG: Double = js.native
  var MODE_DROPDOWN: Double = js.native
  var MODE_THEME: js.Any = js.native
  var TAG: String = js.native
}

