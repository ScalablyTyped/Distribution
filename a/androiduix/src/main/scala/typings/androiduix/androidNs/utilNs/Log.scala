package typings.androiduix.androidNs.utilNs

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.util.Log")
@js.native
class Log () extends js.Object

/* static members */
@JSGlobal("android.util.Log")
@js.native
object Log extends js.Object {
  var ASSERT: Double = js.native
  var DBG_DrawableContainer: Boolean = js.native
  var DBG_StateListDrawable: Boolean = js.native
  var DEBUG: Double = js.native
  var ERROR: Double = js.native
  var INFO: Double = js.native
  var PriorityString: js.Array[String] = js.native
  var VERBOSE: Double = js.native
  var VelocityTracker_DBG: Boolean = js.native
  var View_DBG: Boolean = js.native
  var WARN: Double = js.native
  def d(tag: String, msg: String): Unit = js.native
  def e(tag: String, msg: String): Unit = js.native
  def e(tag: String, msg: String, tr: Error): Unit = js.native
  /* private */ def getLogMsg(priority: js.Any, tag: js.Any, msg: js.Any): js.Any = js.native
  def getPriorityString(priority: Double): String = js.native
  def i(tag: String, msg: String): Unit = js.native
  def i(tag: String, msg: String, tr: Error): Unit = js.native
  def v(tag: String, msg: String): Unit = js.native
  def v(tag: String, msg: String, tr: Error): Unit = js.native
  def w(tag: String, msg: String): Unit = js.native
  def w(tag: String, msg: String, tr: Error): Unit = js.native
}

