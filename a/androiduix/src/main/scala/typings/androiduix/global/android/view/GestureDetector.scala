package typings.androiduix.global.android.view

import typings.androiduix.android.view.GestureDetector.OnGestureListener
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
/* static members */
@JSGlobal("android.view.GestureDetector")
@js.native
object GestureDetector extends js.Object {
  
  var DOUBLE_TAP_MIN_TIME: js.Any = js.native
  
  var DOUBLE_TAP_TIMEOUT: js.Any = js.native
  
  var LONGPRESS_TIMEOUT: js.Any = js.native
  
  var LONG_PRESS: js.Any = js.native
  
  var SHOW_PRESS: js.Any = js.native
  
  var TAP: js.Any = js.native
  
  var TAP_TIMEOUT: js.Any = js.native
  
  @js.native
  class GestureHandler protected ()
    extends typings.androiduix.android.view.GestureDetector.GestureHandler {
    def this(arg: typings.androiduix.android.view.GestureDetector) = this()
  }
  
  @js.native
  class SimpleOnGestureListener ()
    extends typings.androiduix.android.view.GestureDetector.SimpleOnGestureListener
}
