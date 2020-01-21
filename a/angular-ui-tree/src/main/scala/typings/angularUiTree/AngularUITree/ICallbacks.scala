package typings.angularUiTree.AngularUITree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICallbacks extends js.Object {
  @JSName("accept")
  var accept_Original: IAcceptCallback = js.native
  @JSName("dragStart")
  var dragStart_Original: IDroppedCallback = js.native
  @JSName("dropped")
  var dropped_Original: IDroppedCallback = js.native
  def accept(source: ITreeNodeScope, destination: ITreeNodeScope, destinationIndex: Double): Boolean = js.native
  def dragStart(eventInfo: IEventInfo): Unit = js.native
  def dropped(eventInfo: IEventInfo): Unit = js.native
}

