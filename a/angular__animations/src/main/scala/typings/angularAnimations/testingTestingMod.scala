package typings.angularAnimations

import org.scalablytyped.runtime.StringDictionary
import typings.angularAnimations.browserMod.ɵAnimationDriver
import typings.angularAnimations.mod.AnimationPlayer
import typings.angularAnimations.mod.NoopAnimationPlayer
import typings.angularAnimations.mod.ɵStyleData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/animations/browser/testing/testing", JSImport.Namespace)
@js.native
object testingTestingMod extends js.Object {
  @js.native
  class MockAnimationDriver () extends ɵAnimationDriver
  
  @js.native
  class MockAnimationPlayer protected () extends NoopAnimationPlayer {
    def this(
      element: js.Any,
      keyframes: js.Array[StringDictionary[String | Double]],
      duration: Double,
      delay: Double,
      easing: String,
      previousPlayers: js.Array[_]
    ) = this()
    var __finished: js.Any = js.native
    var __started: js.Any = js.native
    var _onInitFns: js.Any = js.native
    var currentSnapshot: ɵStyleData = js.native
    var delay: Double = js.native
    var duration: Double = js.native
    var easing: String = js.native
    var element: js.Any = js.native
    var keyframes: js.Array[StringDictionary[String | Double]] = js.native
    var previousPlayers: js.Array[_] = js.native
    var previousStyles: StringDictionary[String | Double] = js.native
    @JSName("beforeDestroy")
    def beforeDestroy_MMockAnimationPlayer(): Unit = js.native
  }
  
  /* static members */
  @js.native
  object MockAnimationDriver extends js.Object {
    var log: js.Array[AnimationPlayer] = js.native
  }
  
}

