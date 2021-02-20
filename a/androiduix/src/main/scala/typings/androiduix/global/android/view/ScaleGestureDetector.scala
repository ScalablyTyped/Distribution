package typings.androiduix.global.android.view

import typings.androiduix.android.view.ScaleGestureDetector.OnScaleGestureListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.view.ScaleGestureDetector")
@js.native
class ScaleGestureDetector protected ()
  extends typings.androiduix.android.view.ScaleGestureDetector {
  def this(listener: OnScaleGestureListener) = this()
  def this(listener: OnScaleGestureListener, handler: js.Any) = this()
}
object ScaleGestureDetector {
  
  @JSGlobal("android.view.ScaleGestureDetector")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("android.view.ScaleGestureDetector.DOUBLE_TAP_MODE_IN_PROGRESS")
  @js.native
  def DOUBLE_TAP_MODE_IN_PROGRESS: js.Any = js.native
  @scala.inline
  def DOUBLE_TAP_MODE_IN_PROGRESS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOUBLE_TAP_MODE_IN_PROGRESS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ScaleGestureDetector.DOUBLE_TAP_MODE_NONE")
  @js.native
  def DOUBLE_TAP_MODE_NONE: js.Any = js.native
  @scala.inline
  def DOUBLE_TAP_MODE_NONE_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOUBLE_TAP_MODE_NONE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ScaleGestureDetector.SCALE_FACTOR")
  @js.native
  def SCALE_FACTOR: js.Any = js.native
  @scala.inline
  def SCALE_FACTOR_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCALE_FACTOR")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.view.ScaleGestureDetector.SimpleOnScaleGestureListener")
  @js.native
  class SimpleOnScaleGestureListener ()
    extends typings.androiduix.android.view.ScaleGestureDetector.SimpleOnScaleGestureListener
  
  /* static member */
  @JSGlobal("android.view.ScaleGestureDetector.TAG")
  @js.native
  def TAG: js.Any = js.native
  @scala.inline
  def TAG_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAG")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.ScaleGestureDetector.TOUCH_STABILIZE_TIME")
  @js.native
  def TOUCH_STABILIZE_TIME: js.Any = js.native
  @scala.inline
  def TOUCH_STABILIZE_TIME_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TOUCH_STABILIZE_TIME")(x.asInstanceOf[js.Any])
}
