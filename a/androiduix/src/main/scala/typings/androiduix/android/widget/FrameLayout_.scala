package typings.androiduix.android.widget

import typings.androiduix.android.graphics.drawable.Drawable
import typings.androiduix.android.view.ViewGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FrameLayout_ extends ViewGroup {
  
  def getForeground(): Drawable = js.native
  
  def getForegroundGravity(): Double = js.native
  
  def getMeasureAllChildren(): Boolean = js.native
  
  def getPaddingBottomWithForeground(): Double = js.native
  
  def getPaddingLeftWithForeground(): Double = js.native
  
  def getPaddingRightWithForeground(): Double = js.native
  
  def getPaddingTopWithForeground(): Double = js.native
  
  def layoutChildren(left: Double, top: Double, right: Double, bottom: Double, forceLeftGravity: Boolean): Unit = js.native
  
  var mForeground: Drawable = js.native
  
  var mForegroundBoundsChanged: Boolean = js.native
  
  var mForegroundGravity: js.Any = js.native
  
  var mForegroundInPadding: Boolean = js.native
  
  var mForegroundPaddingBottom: js.Any = js.native
  
  var mForegroundPaddingLeft: js.Any = js.native
  
  var mForegroundPaddingRight: js.Any = js.native
  
  var mForegroundPaddingTop: js.Any = js.native
  
  var mMatchParentChildren: js.Any = js.native
  
  var mMeasureAllChildren: Boolean = js.native
  
  var mOverlayBounds: js.Any = js.native
  
  var mSelfBounds: js.Any = js.native
  
  def setForeground(drawable: Drawable): Unit = js.native
  
  def setForegroundGravity(foregroundGravity: Double): Unit = js.native
  
  def setMeasureAllChildren(measureAll: Boolean): Unit = js.native
}
