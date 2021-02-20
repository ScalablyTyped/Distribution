package typings.androiduix.global.android.widget

import typings.androiduix.android.view.animation.Interpolator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.widget.OverScroller")
@js.native
class OverScroller ()
  extends typings.androiduix.android.widget.OverScroller {
  def this(interpolator: Interpolator) = this()
  def this(interpolator: js.UndefOr[scala.Nothing], flywheel: Boolean) = this()
  def this(interpolator: Interpolator, flywheel: Boolean) = this()
}
object OverScroller {
  
  @JSGlobal("android.widget.OverScroller")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("android.widget.OverScroller.DEFAULT_DURATION")
  @js.native
  def DEFAULT_DURATION: Double = js.native
  @scala.inline
  def DEFAULT_DURATION_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DEFAULT_DURATION")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.OverScroller.FLING_MODE")
  @js.native
  def FLING_MODE: Double = js.native
  @scala.inline
  def FLING_MODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("FLING_MODE")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.widget.OverScroller.SCROLL_MODE")
  @js.native
  def SCROLL_MODE: Double = js.native
  @scala.inline
  def SCROLL_MODE_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SCROLL_MODE")(x.asInstanceOf[js.Any])
}
