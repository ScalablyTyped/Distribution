package typings.angularAnimations.browserBrowserMod

import org.scalablytyped.runtime.StringDictionary
import typings.angularAnimations.mod.AnimationPlayer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/animations/browser/browser", "\u0275WebAnimationsPlayer")
@js.native
class ɵWebAnimationsPlayer protected () extends AnimationPlayer {
  def this(
    element: js.Any,
    keyframes: js.Array[StringDictionary[String | Double]],
    options: StringDictionary[String | Double]
  ) = this()
  def this(
    element: js.Any,
    keyframes: js.Array[StringDictionary[String | Double]],
    options: StringDictionary[String | Double],
    _specialStyles: ɵangularPackagesAnimationsBrowserBrowserA
  ) = this()
  var _buildPlayer: js.Any = js.native
  var _delay: js.Any = js.native
  var _destroyed: js.Any = js.native
  var _duration: js.Any = js.native
  var _finalKeyframe: js.Any = js.native
  var _finished: js.Any = js.native
  var _initialized: js.Any = js.native
  var _onDestroyFns: js.Any = js.native
  var _onDoneFns: js.Any = js.native
  var _onFinish: js.Any = js.native
  var _onStartFns: js.Any = js.native
  var _preparePlayerBeforeStart: js.Any = js.native
  var _resetDomPlayerState: js.Any = js.native
  var _specialStyles: js.Any = js.native
  var _started: js.Any = js.native
  var currentSnapshot: StringDictionary[String | Double] = js.native
  val domPlayer: DOMAnimation = js.native
  var element: js.Any = js.native
  var keyframes: js.Array[StringDictionary[String | Double]] = js.native
  var options: StringDictionary[String | Double] = js.native
  var time: Double = js.native
  @JSName("beforeDestroy")
  def beforeDestroy_MɵWebAnimationsPlayer(): Unit = js.native
  def setPosition(p: Double): Unit = js.native
  @JSName("totalTime")
  def totalTime_MɵWebAnimationsPlayer: Double = js.native
}

