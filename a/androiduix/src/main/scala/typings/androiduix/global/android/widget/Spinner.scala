package typings.androiduix.global.android.widget

import typings.androiduix.android.content.Context
import typings.androiduix.android.widget.SpinnerAdapter
import typings.std.HTMLElement
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
object Spinner {
  
  @JSGlobal("android.widget.Spinner")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("android.widget.Spinner.DialogPopup")
  @js.native
  class DialogPopup protected ()
    extends typings.androiduix.android.widget.Spinner.DialogPopup {
    def this(arg: typings.androiduix.android.widget.Spinner) = this()
  }
  
  @JSGlobal("android.widget.Spinner.DropDownAdapter")
  @js.native
  class DropDownAdapter protected ()
    extends typings.androiduix.android.widget.Spinner.DropDownAdapter {
    def this(adapter: SpinnerAdapter) = this()
  }
  
  @JSGlobal("android.widget.Spinner.DropdownPopup")
  @js.native
  class DropdownPopup protected ()
    extends typings.androiduix.android.widget.Spinner.DropdownPopup {
    def this(context: Context, defStyleRes: Map[String, String], arg: typings.androiduix.android.widget.Spinner) = this()
  }
  
  /* static member */
  @JSGlobal("android.widget.Spinner.MAX_ITEMS_MEASURED")
  @js.native
  def MAX_ITEMS_MEASURED: js.Any = js.native
  @scala.inline
  def MAX_ITEMS_MEASURED_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MAX_ITEMS_MEASURED")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.Spinner.MODE_DIALOG")
  @js.native
  def MODE_DIALOG: Double = js.native
  @scala.inline
  def MODE_DIALOG_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODE_DIALOG")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.Spinner.MODE_DROPDOWN")
  @js.native
  def MODE_DROPDOWN: Double = js.native
  @scala.inline
  def MODE_DROPDOWN_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODE_DROPDOWN")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.Spinner.MODE_THEME")
  @js.native
  def MODE_THEME: js.Any = js.native
  @scala.inline
  def MODE_THEME_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MODE_THEME")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.Spinner.TAG")
  @js.native
  def TAG: String = js.native
  @scala.inline
  def TAG_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAG")(x.asInstanceOf[js.Any])
}
