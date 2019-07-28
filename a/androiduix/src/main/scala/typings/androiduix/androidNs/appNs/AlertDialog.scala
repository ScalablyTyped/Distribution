package typings.androiduix.androidNs.appNs

import typings.androiduix.androidNs.contentNs.Context
import typings.androiduix.androidNs.contentNs.DialogInterfaceNs.OnCancelListener
import typings.androiduix.androidNs.contentNs.DialogInterfaceNs.OnClickListener
import typings.androiduix.androidNs.graphicsNs.drawableNs.Drawable
import typings.androiduix.androidNs.viewNs.View
import typings.androiduix.androidNs.widgetNs.Button
import typings.androiduix.androidNs.widgetNs.ListView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.app.AlertDialog")
@js.native
class AlertDialog protected () extends Dialog {
  def this(context: Context) = this()
  def this(context: Context, cancelable: Boolean) = this()
  def this(context: Context, cancelable: Boolean, cancelListener: OnCancelListener) = this()
  var mAlert: js.Any = js.native
  def getButton(whichButton: Double): Button = js.native
  def getListView(): ListView = js.native
  def setButton(whichButton: Double, text: String, listener: OnClickListener): Unit = js.native
  def setCustomTitle(customTitleView: View): Unit = js.native
  def setIcon(icon: Drawable): Unit = js.native
  def setMessage(message: String): Unit = js.native
  def setView(view: View): Unit = js.native
  def setView(view: View, viewSpacingLeft: Double): Unit = js.native
  def setView(view: View, viewSpacingLeft: Double, viewSpacingTop: Double): Unit = js.native
  def setView(view: View, viewSpacingLeft: Double, viewSpacingTop: Double, viewSpacingRight: Double): Unit = js.native
  def setView(
    view: View,
    viewSpacingLeft: Double,
    viewSpacingTop: Double,
    viewSpacingRight: Double,
    viewSpacingBottom: Double
  ): Unit = js.native
}

/* static members */
@JSGlobal("android.app.AlertDialog")
@js.native
object AlertDialog extends js.Object {
  var THEME_DEVICE_DEFAULT_DARK: Double = js.native
  var THEME_DEVICE_DEFAULT_LIGHT: Double = js.native
  var THEME_HOLO_DARK: Double = js.native
  var THEME_HOLO_LIGHT: Double = js.native
  var THEME_TRADITIONAL: Double = js.native
}

