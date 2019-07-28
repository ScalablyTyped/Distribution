package typings.androiduix.androidNs.widgetNs.TextViewNs

import typings.androiduix.androidNs.osNs.Handler
import typings.androiduix.androidNs.widgetNs.TextView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.widget.TextView.Marquee")
@js.native
class Marquee protected () extends Handler {
  def this(v: TextView) = this()
  var mFadeStop: js.Any = js.native
  var mGhostOffset: js.Any = js.native
  var mGhostStart: js.Any = js.native
  var mMaxFadeScroll: js.Any = js.native
  var mMaxScroll: js.Any = js.native
  var mRepeatLimit: js.Any = js.native
  var mScroll: js.Any = js.native
  var mScrollUnit: js.Any = js.native
  var mStatus: js.Any = js.native
  var mView: js.Any = js.native
  def getGhostOffset(): Double = js.native
  def getMaxFadeScroll(): Double = js.native
  def getScroll(): Double = js.native
  def isRunning(): Boolean = js.native
  def isStopped(): Boolean = js.native
  /* private */ def resetScroll(): js.Any = js.native
  def shouldDrawGhost(): Boolean = js.native
  def shouldDrawLeftFade(): Boolean = js.native
  def start(repeatLimit: Double): Unit = js.native
  def stop(): Unit = js.native
  def tick(): Unit = js.native
}

/* static members */
@JSGlobal("android.widget.TextView.Marquee")
@js.native
object Marquee extends js.Object {
  var MARQUEE_DELAY: js.Any = js.native
  var MARQUEE_DELTA_MAX: js.Any = js.native
  var MARQUEE_PIXELS_PER_SECOND: js.Any = js.native
  var MARQUEE_RESOLUTION: js.Any = js.native
  var MARQUEE_RESTART_DELAY: js.Any = js.native
  var MARQUEE_RUNNING: js.Any = js.native
  var MARQUEE_STARTING: js.Any = js.native
  var MARQUEE_STOPPED: js.Any = js.native
  var MESSAGE_RESTART: js.Any = js.native
  var MESSAGE_START: js.Any = js.native
  var MESSAGE_TICK: js.Any = js.native
}

