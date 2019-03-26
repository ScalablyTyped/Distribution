package typings
package agDashGridLib.distLibHeaderRenderingBodyDropTargetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/headerRendering/bodyDropTarget", "BodyDropTarget")
@js.native
class BodyDropTarget protected ()
  extends agDashGridLib.distLibDragAndDropDragAndDropServiceMod.DropTarget {
  def this(pinned: java.lang.String, eContainer: stdLib.HTMLElement) = this()
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
  override def getContainer(): stdLib.HTMLElement = js.native
  /* private */ def getDropType(draggingEvent: js.Any): js.Any = js.native
  @JSName("getIconName")
  def getIconName_MBodyDropTarget(): java.lang.String = js.native
  @JSName("getSecondaryContainers")
  def getSecondaryContainers_MBodyDropTarget(): js.Array[stdLib.HTMLElement] = js.native
  /* private */ def init(): js.Any = js.native
  /* CompleteClass */
  override def isInterestedIn(`type`: agDashGridLib.distLibDragAndDropDragAndDropServiceMod.DragSourceType): scala.Boolean = js.native
  @JSName("onDragEnter")
  def onDragEnter_MBodyDropTarget(draggingEvent: agDashGridLib.distLibDragAndDropDragAndDropServiceMod.DraggingEvent): scala.Unit = js.native
  @JSName("onDragLeave")
  def onDragLeave_MBodyDropTarget(params: agDashGridLib.distLibDragAndDropDragAndDropServiceMod.DraggingEvent): scala.Unit = js.native
  @JSName("onDragStop")
  def onDragStop_MBodyDropTarget(params: agDashGridLib.distLibDragAndDropDragAndDropServiceMod.DraggingEvent): scala.Unit = js.native
  @JSName("onDragging")
  def onDragging_MBodyDropTarget(params: agDashGridLib.distLibDragAndDropDragAndDropServiceMod.DraggingEvent): scala.Unit = js.native
  def registerGridComp(gridPanel: agDashGridLib.distLibGridPanelGridPanelMod.GridPanel): scala.Unit = js.native
}

