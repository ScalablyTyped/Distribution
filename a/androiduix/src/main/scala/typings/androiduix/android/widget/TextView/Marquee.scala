package typings.androiduix.android.widget.TextView

import typings.androiduix.android.os.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Marquee extends Handler {
  
  def getGhostOffset(): Double = js.native
  
  def getMaxFadeScroll(): Double = js.native
  
  def getScroll(): Double = js.native
  
  def isRunning(): Boolean = js.native
  
  def isStopped(): Boolean = js.native
  
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
  
  /* private */ def resetScroll(): js.Any = js.native
  
  def shouldDrawGhost(): Boolean = js.native
  
  def shouldDrawLeftFade(): Boolean = js.native
  
  def start(repeatLimit: Double): Unit = js.native
  
  def stop(): Unit = js.native
  
  def tick(): Unit = js.native
}
