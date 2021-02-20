package typings.androiduix.global.android.view

import typings.androiduix.android.view.GestureDetector.OnGestureListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("android.view.GestureDetector")
@js.native
class GestureDetector protected ()
  extends typings.androiduix.android.view.GestureDetector {
  def this(listener: OnGestureListener) = this()
  def this(listener: OnGestureListener, handler: js.Any) = this()
}
object GestureDetector {
  
  @JSGlobal("android.view.GestureDetector")
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  @JSGlobal("android.view.GestureDetector.DOUBLE_TAP_MIN_TIME")
  @js.native
  def DOUBLE_TAP_MIN_TIME: js.Any = js.native
  @scala.inline
  def DOUBLE_TAP_MIN_TIME_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOUBLE_TAP_MIN_TIME")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.GestureDetector.DOUBLE_TAP_TIMEOUT")
  @js.native
  def DOUBLE_TAP_TIMEOUT: js.Any = js.native
  @scala.inline
  def DOUBLE_TAP_TIMEOUT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DOUBLE_TAP_TIMEOUT")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.view.GestureDetector.GestureHandler")
  @js.native
  class GestureHandler protected ()
    extends typings.androiduix.android.view.GestureDetector.GestureHandler {
    def this(arg: typings.androiduix.android.view.GestureDetector) = this()
  }
  
  /* static member */
  @JSGlobal("android.view.GestureDetector.LONGPRESS_TIMEOUT")
  @js.native
  def LONGPRESS_TIMEOUT: js.Any = js.native
  @scala.inline
  def LONGPRESS_TIMEOUT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LONGPRESS_TIMEOUT")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.GestureDetector.LONG_PRESS")
  @js.native
  def LONG_PRESS: js.Any = js.native
  @scala.inline
  def LONG_PRESS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("LONG_PRESS")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.GestureDetector.SHOW_PRESS")
  @js.native
  def SHOW_PRESS: js.Any = js.native
  @scala.inline
  def SHOW_PRESS_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("SHOW_PRESS")(x.asInstanceOf[js.Any])
  
  @JSGlobal("android.view.GestureDetector.SimpleOnGestureListener")
  @js.native
  class SimpleOnGestureListener ()
    extends typings.androiduix.android.view.GestureDetector.SimpleOnGestureListener
  
  /* static member */
  @JSGlobal("android.view.GestureDetector.TAP")
  @js.native
  def TAP: js.Any = js.native
  @scala.inline
  def TAP_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAP")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("android.view.GestureDetector.TAP_TIMEOUT")
  @js.native
  def TAP_TIMEOUT: js.Any = js.native
  @scala.inline
  def TAP_TIMEOUT_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("TAP_TIMEOUT")(x.asInstanceOf[js.Any])
}
