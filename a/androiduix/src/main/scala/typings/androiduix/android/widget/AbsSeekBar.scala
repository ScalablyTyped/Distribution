package typings.androiduix.android.widget

import typings.androiduix.android.graphics.drawable.Drawable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AbsSeekBar extends ProgressBar {
  
  /* private */ def attemptClaimDrag(): js.Any = js.native
  
  def getKeyProgressIncrement(): Double = js.native
  
  def getThumb(): Drawable = js.native
  
  def getThumbOffset(): Double = js.native
  
  var mDisabledAlpha: js.Any = js.native
  
  var mIsDragging: js.Any = js.native
  
  var mIsUserSeekable: Boolean = js.native
  
  var mKeyProgressIncrement: js.Any = js.native
  
  var mThumb: js.Any = js.native
  
  var mThumbOffset: js.Any = js.native
  
  var mTouchDownX: js.Any = js.native
  
  var mTouchProgressOffset: Double = js.native
  
  def onKeyChange(): Unit = js.native
  
  def onStartTrackingTouch(): Unit = js.native
  
  def onStopTrackingTouch(): Unit = js.native
  
  def setKeyProgressIncrement(increment: Double): Unit = js.native
  
  def setThumb(thumb: Drawable): Unit = js.native
  
  def setThumbOffset(thumbOffset: Double): Unit = js.native
  
  /* private */ def setThumbPos(w: js.Any, thumb: js.Any, scale: js.Any, gap: js.Any): js.Any = js.native
  
  /* private */ def trackTouchEvent(event: js.Any): js.Any = js.native
  
  /* private */ def updateThumbPos(w: js.Any, h: js.Any): js.Any = js.native
}
