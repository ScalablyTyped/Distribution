package typings.agGrid.bodyDropTargetMod

import typings.agGrid.dragAndDropServiceMod.DragSourceType
import typings.agGrid.dragAndDropServiceMod.DraggingEvent
import typings.agGrid.dragAndDropServiceMod.DropTarget
import typings.agGrid.gridPanelMod.GridPanel
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/headerRendering/bodyDropTarget", "BodyDropTarget")
@js.native
class BodyDropTarget protected () extends DropTarget {
  def this(pinned: String, eContainer: HTMLElement) = this()
  var columnController: js.Any = js.native
  var context: js.Any = js.native
  var currentDropListener: js.Any = js.native
  var dragAndDropService: js.Any = js.native
  var dropListeners: js.Any = js.native
  var eContainer: js.Any = js.native
  var eSecondaryContainers: js.Any = js.native
  var gridPanel: js.Any = js.native
  var moveColumnController: js.Any = js.native
  var pinned: js.Any = js.native
  /** The main container that will get the drop. */
  /* CompleteClass */
  override def getContainer(): HTMLElement = js.native
  /* private */ def getDropType(draggingEvent: js.Any): js.Any = js.native
  @JSName("getIconName")
  def getIconName_MBodyDropTarget(): String = js.native
  @JSName("getSecondaryContainers")
  def getSecondaryContainers_MBodyDropTarget(): js.Array[HTMLElement] = js.native
  /* private */ def init(): js.Any = js.native
  /* CompleteClass */
  override def isInterestedIn(`type`: DragSourceType): Boolean = js.native
  @JSName("onDragEnter")
  def onDragEnter_MBodyDropTarget(draggingEvent: DraggingEvent): Unit = js.native
  @JSName("onDragLeave")
  def onDragLeave_MBodyDropTarget(params: DraggingEvent): Unit = js.native
  @JSName("onDragStop")
  def onDragStop_MBodyDropTarget(params: DraggingEvent): Unit = js.native
  @JSName("onDragging")
  def onDragging_MBodyDropTarget(params: DraggingEvent): Unit = js.native
  def registerGridComp(gridPanel: GridPanel): Unit = js.native
}

