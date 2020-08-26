package typings.androiduix.global.android.view.animation

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.view.animation.Animation")
@js.native
abstract class Animation ()
  extends typings.androiduix.android.view.animation.Animation

/* static members */
@JSGlobal("android.view.animation.Animation")
@js.native
object Animation extends js.Object {
  @js.native
  class Description ()
    extends typings.androiduix.android.view.animation.Animation.Description
  
  var ABSOLUTE: Double = js.native
  var INFINITE: Double = js.native
  var RELATIVE_TO_PARENT: Double = js.native
  var RELATIVE_TO_SELF: Double = js.native
  var RESTART: Double = js.native
  var REVERSE: Double = js.native
  var START_ON_FIRST_FRAME: Double = js.native
  var USE_CLOSEGUARD: js.Any = js.native
  var ZORDER_BOTTOM: Double = js.native
  var ZORDER_NORMAL: Double = js.native
  var ZORDER_TOP: Double = js.native
  /* static members */
  @js.native
  object Description extends js.Object {
    def parseValue(value: String): typings.androiduix.android.view.animation.Animation.Description = js.native
  }
  
}

