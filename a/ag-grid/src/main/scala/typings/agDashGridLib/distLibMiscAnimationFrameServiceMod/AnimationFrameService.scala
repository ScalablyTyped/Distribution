package typings
package agDashGridLib.distLibMiscAnimationFrameServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/misc/animationFrameService", "AnimationFrameService")
@js.native
class AnimationFrameService () extends js.Object {
  var eventService: js.Any = js.native
  var gridOptionsWrapper: js.Any = js.native
  var gridPanel: js.Any = js.native
  var p1Tasks: js.Any = js.native
  var p2Tasks: js.Any = js.native
  var ticking: js.Any = js.native
  var useAnimationFrame: js.Any = js.native
  def addP1Task(task: js.Function0[scala.Unit]): scala.Unit = js.native
  def addP2Task(task: js.Function0[scala.Unit]): scala.Unit = js.native
  /* private */ def executeFrame(millis: js.Any): js.Any = js.native
  def flushAllFrames(): scala.Unit = js.native
  /* private */ def init(): js.Any = js.native
  def isQueueEmpty(): scala.Boolean = js.native
  def registerGridComp(gridPanel: agDashGridLib.distLibGridPanelGridPanelMod.GridPanel): scala.Unit = js.native
  /* private */ def requestFrame(): js.Any = js.native
  def schedule(): scala.Unit = js.native
  /* private */ def stopTicking(): js.Any = js.native
  /* private */ def verifyAnimationFrameOn(methodName: js.Any): js.Any = js.native
}

