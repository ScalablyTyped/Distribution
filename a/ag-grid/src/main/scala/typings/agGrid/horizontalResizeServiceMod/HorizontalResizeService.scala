package typings.agGrid.horizontalResizeServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/headerRendering/horizontalResizeService", "HorizontalResizeService")
@js.native
class HorizontalResizeService () extends js.Object {
  
  def addResizeBar(params: HorizontalResizeParams): js.Function0[Unit] = js.native
  
  var dragService: js.Any = js.native
  
  var dragStartX: js.Any = js.native
  
  var draggingStarted: js.Any = js.native
  
  var eGridDiv: js.Any = js.native
  
  var gridOptionsWrapper: js.Any = js.native
  
  var oldBodyCursor: js.Any = js.native
  
  var oldMsUserSelect: js.Any = js.native
  
  var oldWebkitUserSelect: js.Any = js.native
  
  /* private */ def onDragStart(params: js.Any, mouseEvent: js.Any): js.Any = js.native
  
  /* private */ def onDragStop(params: js.Any, mouseEvent: js.Any): js.Any = js.native
  
  /* private */ def onDragging(params: js.Any, mouseEvent: js.Any): js.Any = js.native
  
  /* private */ def resetIcons(): js.Any = js.native
  
  var resizeAmount: js.Any = js.native
  
  /* private */ def setResizeIcons(): js.Any = js.native
}
