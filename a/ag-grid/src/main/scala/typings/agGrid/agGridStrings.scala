package typings.agGrid

import typings.agGrid.eventsMod.ColumnEventType
import typings.agGrid.gridPanelMod.RowContainerComponentNames
import typings.agGrid.iExcelCreatorMod.ExcelDataType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object agGridStrings {
  @js.native
  sealed trait Boolean extends ExcelDataType
  
  @js.native
  sealed trait DateTime extends ExcelDataType
  
  @js.native
  sealed trait Error extends ExcelDataType
  
  @js.native
  sealed trait Number extends ExcelDataType
  
  @js.native
  sealed trait RowContainerComponents extends js.Object
  
  @js.native
  sealed trait String extends ExcelDataType
  
  @js.native
  sealed trait alignedGridChanged extends ColumnEventType
  
  @js.native
  sealed trait api extends ColumnEventType
  
  @js.native
  sealed trait autosizeColumns extends ColumnEventType
  
  @js.native
  sealed trait body extends RowContainerComponentNames
  
  @js.native
  sealed trait columnMenu extends ColumnEventType
  
  @js.native
  sealed trait contextMenu extends ColumnEventType
  
  @js.native
  sealed trait filterChanged extends ColumnEventType
  
  @js.native
  sealed trait filterDestroyed extends ColumnEventType
  
  @js.native
  sealed trait floatingBottom extends RowContainerComponentNames
  
  @js.native
  sealed trait floatingBottomFullWith extends RowContainerComponentNames
  
  @js.native
  sealed trait floatingBottomPinnedLeft extends RowContainerComponentNames
  
  @js.native
  sealed trait floatingBottomPinnedRight extends RowContainerComponentNames
  
  @js.native
  sealed trait floatingTop extends RowContainerComponentNames
  
  @js.native
  sealed trait floatingTopFullWidth extends RowContainerComponentNames
  
  @js.native
  sealed trait floatingTopPinnedLeft extends RowContainerComponentNames
  
  @js.native
  sealed trait floatingTopPinnedRight extends RowContainerComponentNames
  
  @js.native
  sealed trait fullWidth extends RowContainerComponentNames
  
  @js.native
  sealed trait gridInitializing extends ColumnEventType
  
  @js.native
  sealed trait gridOptionsChanged extends ColumnEventType
  
  @js.native
  sealed trait left extends js.Object
  
  @js.native
  sealed trait pinnedLeft extends RowContainerComponentNames
  
  @js.native
  sealed trait pinnedRight extends RowContainerComponentNames
  
  @js.native
  sealed trait right extends js.Object
  
  @js.native
  sealed trait rowModelUpdated extends ColumnEventType
  
  @js.native
  sealed trait sizeColumnsToFit extends ColumnEventType
  
  @js.native
  sealed trait toolPanelDragAndDrop extends ColumnEventType
  
  @js.native
  sealed trait toolPanelUi extends ColumnEventType
  
  @js.native
  sealed trait uiColumnDragged extends ColumnEventType
  
  @js.native
  sealed trait uiColumnExpanded extends ColumnEventType
  
  @js.native
  sealed trait uiColumnMoved extends ColumnEventType
  
  @js.native
  sealed trait uiColumnResized extends ColumnEventType
  
  @js.native
  sealed trait uiColumnSorted extends ColumnEventType
  
  @scala.inline
  def Boolean: Boolean = "Boolean".asInstanceOf[Boolean]
  @scala.inline
  def DateTime: DateTime = "DateTime".asInstanceOf[DateTime]
  @scala.inline
  def Error: Error = "Error".asInstanceOf[Error]
  @scala.inline
  def Number: Number = "Number".asInstanceOf[Number]
  @scala.inline
  def RowContainerComponents: RowContainerComponents = "RowContainerComponents".asInstanceOf[RowContainerComponents]
  @scala.inline
  def String: String = "String".asInstanceOf[String]
  @scala.inline
  def alignedGridChanged: alignedGridChanged = "alignedGridChanged".asInstanceOf[alignedGridChanged]
  @scala.inline
  def api: api = "api".asInstanceOf[api]
  @scala.inline
  def autosizeColumns: autosizeColumns = "autosizeColumns".asInstanceOf[autosizeColumns]
  @scala.inline
  def body: body = "body".asInstanceOf[body]
  @scala.inline
  def columnMenu: columnMenu = "columnMenu".asInstanceOf[columnMenu]
  @scala.inline
  def contextMenu: contextMenu = "contextMenu".asInstanceOf[contextMenu]
  @scala.inline
  def filterChanged: filterChanged = "filterChanged".asInstanceOf[filterChanged]
  @scala.inline
  def filterDestroyed: filterDestroyed = "filterDestroyed".asInstanceOf[filterDestroyed]
  @scala.inline
  def floatingBottom: floatingBottom = "floatingBottom".asInstanceOf[floatingBottom]
  @scala.inline
  def floatingBottomFullWith: floatingBottomFullWith = "floatingBottomFullWith".asInstanceOf[floatingBottomFullWith]
  @scala.inline
  def floatingBottomPinnedLeft: floatingBottomPinnedLeft = "floatingBottomPinnedLeft".asInstanceOf[floatingBottomPinnedLeft]
  @scala.inline
  def floatingBottomPinnedRight: floatingBottomPinnedRight = "floatingBottomPinnedRight".asInstanceOf[floatingBottomPinnedRight]
  @scala.inline
  def floatingTop: floatingTop = "floatingTop".asInstanceOf[floatingTop]
  @scala.inline
  def floatingTopFullWidth: floatingTopFullWidth = "floatingTopFullWidth".asInstanceOf[floatingTopFullWidth]
  @scala.inline
  def floatingTopPinnedLeft: floatingTopPinnedLeft = "floatingTopPinnedLeft".asInstanceOf[floatingTopPinnedLeft]
  @scala.inline
  def floatingTopPinnedRight: floatingTopPinnedRight = "floatingTopPinnedRight".asInstanceOf[floatingTopPinnedRight]
  @scala.inline
  def fullWidth: fullWidth = "fullWidth".asInstanceOf[fullWidth]
  @scala.inline
  def gridInitializing: gridInitializing = "gridInitializing".asInstanceOf[gridInitializing]
  @scala.inline
  def gridOptionsChanged: gridOptionsChanged = "gridOptionsChanged".asInstanceOf[gridOptionsChanged]
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  @scala.inline
  def pinnedLeft: pinnedLeft = "pinnedLeft".asInstanceOf[pinnedLeft]
  @scala.inline
  def pinnedRight: pinnedRight = "pinnedRight".asInstanceOf[pinnedRight]
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  @scala.inline
  def rowModelUpdated: rowModelUpdated = "rowModelUpdated".asInstanceOf[rowModelUpdated]
  @scala.inline
  def sizeColumnsToFit: sizeColumnsToFit = "sizeColumnsToFit".asInstanceOf[sizeColumnsToFit]
  @scala.inline
  def toolPanelDragAndDrop: toolPanelDragAndDrop = "toolPanelDragAndDrop".asInstanceOf[toolPanelDragAndDrop]
  @scala.inline
  def toolPanelUi: toolPanelUi = "toolPanelUi".asInstanceOf[toolPanelUi]
  @scala.inline
  def uiColumnDragged: uiColumnDragged = "uiColumnDragged".asInstanceOf[uiColumnDragged]
  @scala.inline
  def uiColumnExpanded: uiColumnExpanded = "uiColumnExpanded".asInstanceOf[uiColumnExpanded]
  @scala.inline
  def uiColumnMoved: uiColumnMoved = "uiColumnMoved".asInstanceOf[uiColumnMoved]
  @scala.inline
  def uiColumnResized: uiColumnResized = "uiColumnResized".asInstanceOf[uiColumnResized]
  @scala.inline
  def uiColumnSorted: uiColumnSorted = "uiColumnSorted".asInstanceOf[uiColumnSorted]
}

