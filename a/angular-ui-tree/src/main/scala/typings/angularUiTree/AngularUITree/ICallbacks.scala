package typings.angularUiTree.AngularUITree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICallbacks extends js.Object {
  
  def accept(source: ITreeNodeScope, destination: ITreeNodeScope, destinationIndex: Double): Boolean = js.native
  @JSName("accept")
  var accept_Original: IAcceptCallback = js.native
  
  def dragStart(eventInfo: IEventInfo): Unit = js.native
  @JSName("dragStart")
  var dragStart_Original: IDroppedCallback = js.native
  
  def dropped(eventInfo: IEventInfo): Unit = js.native
  @JSName("dropped")
  var dropped_Original: IDroppedCallback = js.native
}
