package typings.angularAnimations.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/animations", "\u0275AnimationGroupPlayer")
@js.native
class ɵAnimationGroupPlayer protected () extends AnimationPlayer {
  def this(_players: js.Array[AnimationPlayer]) = this()
  
  var _destroyed: js.Any = js.native
  
  var _finished: js.Any = js.native
  
  var _onDestroy: js.Any = js.native
  
  var _onDestroyFns: js.Any = js.native
  
  var _onDoneFns: js.Any = js.native
  
  var _onFinish: js.Any = js.native
  
  var _onStart: js.Any = js.native
  
  var _onStartFns: js.Any = js.native
  
  var _started: js.Any = js.native
  
  @JSName("beforeDestroy")
  def beforeDestroy_MɵAnimationGroupPlayer(): Unit = js.native
  
  val players: js.Array[AnimationPlayer] = js.native
  
  def setPosition(p: Double): Unit = js.native
}
