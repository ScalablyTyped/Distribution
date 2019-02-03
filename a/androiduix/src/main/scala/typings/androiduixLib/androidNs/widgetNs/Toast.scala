package typings
package androiduixLib.androidNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.Toast")
@js.native
class Toast protected () extends js.Object {
  def this(context: androiduixLib.androidNs.contentNs.Context) = this()
  var mContext: androiduixLib.androidNs.contentNs.Context = js.native
  var mDelayHide: js.Any = js.native
  var mDuration: scala.Double = js.native
  var mHandler: js.Any = js.native
  var mNextView: androiduixLib.androidNs.viewNs.View = js.native
  var mTN: androiduixLib.androidNs.widgetNs.ToastNs.TN = js.native
  def cancel(): scala.Unit = js.native
  def getDuration(): scala.Double = js.native
  def getGravity(): scala.Double = js.native
  def getView(): androiduixLib.androidNs.viewNs.View = js.native
  def getXOffset(): scala.Double = js.native
  def getYOffset(): scala.Double = js.native
  def setDuration(duration: scala.Double): scala.Unit = js.native
  def setGravity(gravity: scala.Double, xOffset: scala.Double, yOffset: scala.Double): scala.Unit = js.native
  def setText(s: java.lang.String): scala.Unit = js.native
  def setView(view: androiduixLib.androidNs.viewNs.View): scala.Unit = js.native
  def show(): scala.Unit = js.native
}

/* static members */
@JSGlobal("android.widget.Toast")
@js.native
object Toast extends js.Object {
  var LENGTH_LONG: scala.Double = js.native
  var LENGTH_SHORT: scala.Double = js.native
  var TAG: java.lang.String = js.native
  var localLOGV: scala.Boolean = js.native
  def makeText(context: androiduixLib.androidNs.contentNs.Context, text: java.lang.String, duration: scala.Double): androiduixLib.androidNs.widgetNs.Toast = js.native
}

