package typings
package androiduixLib.androidNs.appNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.app.AlertDialog")
@js.native
class AlertDialog protected () extends Dialog {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, cancelable: scala.Boolean) = this()
  def this(context: androiduixLib.androidNs.contentNs.Context, cancelable: scala.Boolean, cancelListener: androiduixLib.androidNs.contentNs.DialogInterfaceNs.OnCancelListener) = this()
  var mAlert: js.Any = js.native
  def getButton(whichButton: scala.Double): androiduixLib.androidNs.widgetNs.Button = js.native
  def getListView(): androiduixLib.androidNs.widgetNs.ListView = js.native
  def setButton(
    whichButton: scala.Double,
    text: java.lang.String,
    listener: androiduixLib.androidNs.contentNs.DialogInterfaceNs.OnClickListener
  ): scala.Unit = js.native
  def setCustomTitle(customTitleView: androiduixLib.androidNs.viewNs.View): scala.Unit = js.native
  def setIcon(icon: androiduixLib.androidNs.graphicsNs.drawableNs.Drawable): scala.Unit = js.native
  def setMessage(message: java.lang.String): scala.Unit = js.native
  def setView(view: androiduixLib.androidNs.viewNs.View): scala.Unit = js.native
  def setView(view: androiduixLib.androidNs.viewNs.View, viewSpacingLeft: scala.Double): scala.Unit = js.native
  def setView(
    view: androiduixLib.androidNs.viewNs.View,
    viewSpacingLeft: scala.Double,
    viewSpacingTop: scala.Double
  ): scala.Unit = js.native
  def setView(
    view: androiduixLib.androidNs.viewNs.View,
    viewSpacingLeft: scala.Double,
    viewSpacingTop: scala.Double,
    viewSpacingRight: scala.Double
  ): scala.Unit = js.native
  def setView(
    view: androiduixLib.androidNs.viewNs.View,
    viewSpacingLeft: scala.Double,
    viewSpacingTop: scala.Double,
    viewSpacingRight: scala.Double,
    viewSpacingBottom: scala.Double
  ): scala.Unit = js.native
}

@JSGlobal("android.app.AlertDialog")
@js.native
object AlertDialog extends js.Object {
  var THEME_DEVICE_DEFAULT_DARK: scala.Double = js.native
  var THEME_DEVICE_DEFAULT_LIGHT: scala.Double = js.native
  var THEME_HOLO_DARK: scala.Double = js.native
  var THEME_HOLO_LIGHT: scala.Double = js.native
  var THEME_TRADITIONAL: scala.Double = js.native
}

