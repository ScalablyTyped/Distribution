package typings.angularAnimations.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@angular/animations", "NoopAnimationPlayer")
@js.native
class NoopAnimationPlayer () extends AnimationPlayer {
  def this(duration: Double) = this()
  def this(duration: js.UndefOr[scala.Nothing], delay: Double) = this()
  def this(duration: Double, delay: Double) = this()
  var _destroyed: js.Any = js.native
  var _finished: js.Any = js.native
  var _onDestroyFns: js.Any = js.native
  var _onDoneFns: js.Any = js.native
  var _onFinish: js.Any = js.native
  var _onStart: js.Any = js.native
  var _onStartFns: js.Any = js.native
  var _started: js.Any = js.native
  def setPosition(position: Double): Unit = js.native
}

