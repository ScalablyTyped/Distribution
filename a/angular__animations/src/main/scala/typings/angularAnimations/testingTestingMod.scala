package typings.angularAnimations

import org.scalablytyped.runtime.StringDictionary
import typings.angularAnimations.browserMod.AnimationDriver
import typings.angularAnimations.mod.AnimationPlayer
import typings.angularAnimations.mod.NoopAnimationPlayer
import typings.angularAnimations.mod.ɵStyleData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingTestingMod {
  
  @JSImport("@angular/animations/browser/testing/testing", "MockAnimationDriver")
  @js.native
  class MockAnimationDriver () extends AnimationDriver
  /* static members */
  object MockAnimationDriver {
    
    @JSImport("@angular/animations/browser/testing/testing", "MockAnimationDriver")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/animations/browser/testing/testing", "MockAnimationDriver.log")
    @js.native
    def log: js.Array[AnimationPlayer] = js.native
    @scala.inline
    def log_=(x: js.Array[AnimationPlayer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("log")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular/animations/browser/testing/testing", "MockAnimationPlayer")
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
    
    @JSName("beforeDestroy")
    def beforeDestroy_MMockAnimationPlayer(): Unit = js.native
    
    var currentSnapshot: ɵStyleData = js.native
    
    var delay: Double = js.native
    
    var duration: Double = js.native
    
    var easing: String = js.native
    
    var element: js.Any = js.native
    
    var keyframes: js.Array[StringDictionary[String | Double]] = js.native
    
    var previousPlayers: js.Array[_] = js.native
    
    var previousStyles: StringDictionary[String | Double] = js.native
  }
}
