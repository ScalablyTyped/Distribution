package typings
package agDashGridLib.distLibDragAndDropDragAndDropServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropTarget extends js.Object {
  /** Icon to show when drag is over*/
  var getIconName: js.UndefOr[js.Function0[java.lang.String]] = js.undefined
  /** If any secondary containers. For example when moving columns in ag-Grid, we listen for drops
    * in the header as well as the body (main rows and pinned rows) of the grid. */
  var getSecondaryContainers: js.UndefOr[js.Function0[js.Array[stdLib.HTMLElement]]] = js.undefined
  /** Callback for when drag enters */
  var onDragEnter: js.UndefOr[js.Function1[/* params */ DraggingEvent, scala.Unit]] = js.undefined
  /** Callback for when drag leaves */
  var onDragLeave: js.UndefOr[js.Function1[/* params */ DraggingEvent, scala.Unit]] = js.undefined
  /** Callback for when drag stops */
  var onDragStop: js.UndefOr[js.Function1[/* params */ DraggingEvent, scala.Unit]] = js.undefined
  /** Callback for when dragging */
  var onDragging: js.UndefOr[js.Function1[/* params */ DraggingEvent, scala.Unit]] = js.undefined
  /** The main container that will get the drop. */
  def getContainer(): stdLib.HTMLElement
  def isInterestedIn(`type`: DragSourceType): scala.Boolean
}

object DropTarget {
  @scala.inline
  def apply(
    getContainer: () => stdLib.HTMLElement,
    isInterestedIn: DragSourceType => scala.Boolean,
    getIconName: () => java.lang.String = null,
    getSecondaryContainers: () => js.Array[stdLib.HTMLElement] = null,
    onDragEnter: /* params */ DraggingEvent => scala.Unit = null,
    onDragLeave: /* params */ DraggingEvent => scala.Unit = null,
    onDragStop: /* params */ DraggingEvent => scala.Unit = null,
    onDragging: /* params */ DraggingEvent => scala.Unit = null
  ): DropTarget = {
    val __obj = js.Dynamic.literal(getContainer = js.Any.fromFunction0(getContainer), isInterestedIn = js.Any.fromFunction1(isInterestedIn))
    if (getIconName != null) __obj.updateDynamic("getIconName")(js.Any.fromFunction0(getIconName))
    if (getSecondaryContainers != null) __obj.updateDynamic("getSecondaryContainers")(js.Any.fromFunction0(getSecondaryContainers))
    if (onDragEnter != null) __obj.updateDynamic("onDragEnter")(js.Any.fromFunction1(onDragEnter))
    if (onDragLeave != null) __obj.updateDynamic("onDragLeave")(js.Any.fromFunction1(onDragLeave))
    if (onDragStop != null) __obj.updateDynamic("onDragStop")(js.Any.fromFunction1(onDragStop))
    if (onDragging != null) __obj.updateDynamic("onDragging")(js.Any.fromFunction1(onDragging))
    __obj.asInstanceOf[DropTarget]
  }
}

