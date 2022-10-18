package typings.angularAnimations

import typings.angularAnimations.browserMod.AnimationDriver
import typings.angularAnimations.mod.AnimationPlayer
import typings.angularAnimations.mod.NoopAnimationPlayer
import typings.angularAnimations.mod.ɵStyleDataMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserTestingMod {
  
  @JSImport("@angular/animations/browser/testing", "MockAnimationDriver")
  @js.native
  open class MockAnimationDriver () extends AnimationDriver {
    
    @JSName("validateAnimatableStyleProperty")
    def validateAnimatableStyleProperty_MMockAnimationDriver(prop: String): Boolean = js.native
  }
  /* static members */
  object MockAnimationDriver {
    
    @JSImport("@angular/animations/browser/testing", "MockAnimationDriver")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/animations/browser/testing", "MockAnimationDriver.log")
    @js.native
    def log: js.Array[AnimationPlayer] = js.native
    inline def log_=(x: js.Array[AnimationPlayer]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("log")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular/animations/browser/testing", "MockAnimationPlayer")
  @js.native
  open class MockAnimationPlayer protected () extends NoopAnimationPlayer {
    def this(
      element: Any,
      keyframes: js.Array[ɵStyleDataMap],
      duration: Double,
      delay: Double,
      easing: String,
      previousPlayers: js.Array[Any]
    ) = this()
    
    /* private */ var __finished: Any = js.native
    
    /* private */ var __started: Any = js.native
    
    /* private */ var _keyframes: Any = js.native
    
    /* private */ var _onInitFns: Any = js.native
    
    @JSName("beforeDestroy")
    def beforeDestroy_MMockAnimationPlayer(): Unit = js.native
    
    var currentSnapshot: ɵStyleDataMap = js.native
    
    var delay: Double = js.native
    
    var duration: Double = js.native
    
    var easing: String = js.native
    
    var element: Any = js.native
    
    var keyframes: js.Array[ɵStyleDataMap] = js.native
    
    var previousPlayers: js.Array[Any] = js.native
    
    var previousStyles: ɵStyleDataMap = js.native
  }
}
