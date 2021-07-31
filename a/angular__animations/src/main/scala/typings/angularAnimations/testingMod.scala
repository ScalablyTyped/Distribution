package typings.angularAnimations

import org.scalablytyped.runtime.StringDictionary
import typings.angularAnimations.mod.AnimationPlayer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testingMod {
  
  @JSImport("@angular/animations/browser/testing", "MockAnimationDriver")
  @js.native
  class MockAnimationDriver ()
    extends typings.angularAnimations.testingTestingMod.MockAnimationDriver
  /* static members */
  object MockAnimationDriver {
    
    @JSImport("@angular/animations/browser/testing", "MockAnimationDriver")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/animations/browser/testing", "MockAnimationDriver.log")
    @js.native
    def log: js.Array[AnimationPlayer] = js.native
    @scala.inline
    def log_=(x: js.Array[AnimationPlayer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("log")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular/animations/browser/testing", "MockAnimationPlayer")
  @js.native
  class MockAnimationPlayer protected ()
    extends typings.angularAnimations.testingTestingMod.MockAnimationPlayer {
    def this(
      element: js.Any,
      keyframes: js.Array[StringDictionary[String | Double]],
      duration: Double,
      delay: Double,
      easing: String,
      previousPlayers: js.Array[js.Any]
    ) = this()
  }
}
