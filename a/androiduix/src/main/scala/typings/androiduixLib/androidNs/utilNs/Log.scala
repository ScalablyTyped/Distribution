package typings
package androiduixLib.androidNs.utilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.util.Log")
@js.native
class Log () extends js.Object

@JSGlobal("android.util.Log")
@js.native
object Log extends js.Object {
  var ASSERT: scala.Double = js.native
  var DBG_DrawableContainer: scala.Boolean = js.native
  var DBG_StateListDrawable: scala.Boolean = js.native
  var DEBUG: scala.Double = js.native
  var ERROR: scala.Double = js.native
  var INFO: scala.Double = js.native
  var PriorityString: js.Array[java.lang.String] = js.native
  var VERBOSE: scala.Double = js.native
  var VelocityTracker_DBG: scala.Boolean = js.native
  var View_DBG: scala.Boolean = js.native
  var WARN: scala.Double = js.native
  def d(tag: java.lang.String, msg: java.lang.String): scala.Unit = js.native
  def e(tag: java.lang.String, msg: java.lang.String): scala.Unit = js.native
  def e(tag: java.lang.String, msg: java.lang.String, tr: stdLib.Error): scala.Unit = js.native
  /* private */ def getLogMsg(priority: js.Any, tag: js.Any, msg: js.Any): js.Any = js.native
  def getPriorityString(priority: scala.Double): java.lang.String = js.native
  def i(tag: java.lang.String, msg: java.lang.String): scala.Unit = js.native
  def i(tag: java.lang.String, msg: java.lang.String, tr: stdLib.Error): scala.Unit = js.native
  def v(tag: java.lang.String, msg: java.lang.String): scala.Unit = js.native
  def v(tag: java.lang.String, msg: java.lang.String, tr: stdLib.Error): scala.Unit = js.native
  def w(tag: java.lang.String, msg: java.lang.String): scala.Unit = js.native
  def w(tag: java.lang.String, msg: java.lang.String, tr: stdLib.Error): scala.Unit = js.native
}

