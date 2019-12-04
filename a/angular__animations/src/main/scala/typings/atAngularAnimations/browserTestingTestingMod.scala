package typings.atAngularAnimations

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularAnimations.atAngularAnimationsMod.AnimationPlayer
import typings.atAngularAnimations.atAngularAnimationsMod.NoopAnimationPlayer
import typings.atAngularAnimations.atAngularAnimationsMod.ɵStyleData
import typings.atAngularAnimations.browserMod.ɵAnimationDriver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/animations/browser/testing/testing", JSImport.Namespace)
@js.native
object browserTestingTestingMod extends js.Object {
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

