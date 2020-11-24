package typings.angularAnimations.browserBrowserMod

import org.scalablytyped.runtime.StringDictionary
import typings.angularAnimations.mod.AnimationPlayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/animations/browser/browser", "\u0275CssKeyframesPlayer")
@js.native
class ɵCssKeyframesPlayer protected () extends AnimationPlayer {
  def this(
    element: js.Any,
    keyframes: js.Array[StringDictionary[String | Double]],
    animationName: String,
    _duration: Double,
    _delay: Double,
    easing: String,
    _finalStyles: StringDictionary[js.Any]
  ) = this()
  def this(
    element: js.Any,
    keyframes: js.Array[StringDictionary[String | Double]],
    animationName: String,
    _duration: Double,
    _delay: Double,
    easing: String,
    _finalStyles: StringDictionary[js.Any],
    _specialStyles: ɵangularPackagesAnimationsBrowserBrowserA
  ) = this()
  
  var _buildStyler: js.Any = js.native
  
  val _delay: js.Any = js.native
  
  val _duration: js.Any = js.native
  
  val _finalStyles: js.Any = js.native
  
  var _flushDoneFns: js.Any = js.native
  
  var _flushStartFns: js.Any = js.native
  
  var _onDestroyFns: js.Any = js.native
  
  var _onDoneFns: js.Any = js.native
  
  var _onStartFns: js.Any = js.native
  
  val _specialStyles: js.Any = js.native
  
  var _started: js.Any = js.native
  
  var _state: js.Any = js.native
  
  var _styler: js.Any = js.native
  
  val animationName: String = js.native
  
  @JSName("beforeDestroy")
  def beforeDestroy_MɵCssKeyframesPlayer(): Unit = js.native
  
  var currentSnapshot: StringDictionary[String] = js.native
  
  val easing: String = js.native
  
  val element: js.Any = js.native
  
  val keyframes: js.Array[StringDictionary[String | Double]] = js.native
  
  @JSName("parentPlayer")
  var parentPlayer_ɵCssKeyframesPlayer: AnimationPlayer = js.native
  
  def setPosition(value: Double): Unit = js.native
}
