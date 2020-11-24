package typings.angularGridster.mod.angularAugmentingMod.gridster

import typings.angularGridster.anon.Drag
import typings.angularGridster.anon.Enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridsterConfig extends js.Object {
  
  // width of grid columns. "auto" will divide the width of the grid evenly among the columns
  var colWidth: js.UndefOr[String] = js.native
  
  // number of columns in the grid
  var columns: js.UndefOr[Double] = js.native
  
  // default width of an item in columns
  var defaultSizeX: js.UndefOr[Double] = js.native
  
  // default height of an item in rows
  var defaultSizeY: js.UndefOr[Double] = js.native
  
  // options to pass to draggable handler
  var draggable: js.UndefOr[Drag] = js.native
  
  // whether to automatically float items up so they stack
  var floating: js.UndefOr[Boolean] = js.native
  
  // toggle mobile view
  var isMobile: js.UndefOr[Boolean] = js.native
  
  // margins in between grid items
  var margins: js.UndefOr[js.Array[Double]] = js.native
  
  // maximum amount of rows in the grid
  var maxRows: js.UndefOr[Double] = js.native
  
  // maximum column width of an item
  var maxSizeX: js.UndefOr[Double] = js.native
  
  // maximum row height of an item
  var maxSizeY: js.UndefOr[Double] = js.native
  
  // minimum amount of columns the grid can scale down to
  var minColumns: js.UndefOr[Double] = js.native
  
  // minimum amount of rows to show if the grid is empty
  var minRows: js.UndefOr[Double] = js.native
  
  // minimum column width of an item
  var minSizeX: js.UndefOr[Double] = js.native
  
  // minumum row height of an item
  var minSizeY: js.UndefOr[Double] = js.native
  
  // width threshold to toggle mobile mode
  var mobileBreakPoint: js.UndefOr[Double] = js.native
  
  // whether or not to toggle mobile mode when screen width is less than mobileBreakPoint
  var mobileModeEnabled: js.UndefOr[Boolean] = js.native
  
  // whether to set the outer margin
  var outerMargin: js.UndefOr[Boolean] = js.native
  
  // whether to push other items out of the way
  // whether to push other items out of the way
  var pushing: js.UndefOr[Boolean] = js.native
  
  // grid item height in mobile display. true- to use the calculated height by sizeY given
  // options to pass to resizable handler
  var resizable: js.UndefOr[Enabled] = js.native
  
  // height of grid rows. 'match' will make it the same as the column width, a numeric value will be interpreted as pixels,
  // '/2' is half the column width, '*5' is five times the column width, etc.
  var rowHeight: js.UndefOr[String] = js.native
  
  var saveGridItemCalculatedHeightInMobile: js.UndefOr[Boolean] = js.native
  
  // whether or not to have items switch places instead of push down if they are the same size
  var swapping: js.UndefOr[Boolean] = js.native
  
  // width of the grid. "auto" will expand the grid to its parent container
  var width: js.UndefOr[String] = js.native
}
object GridsterConfig {
  
  @scala.inline
  def apply(): GridsterConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridsterConfig]
  }
  
  @scala.inline
  implicit class GridsterConfigOps[Self <: GridsterConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setColWidth(value: String): Self = this.set("colWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColWidth: Self = this.set("colWidth", js.undefined)
    
    @scala.inline
    def setColumns(value: Double): Self = this.set("columns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColumns: Self = this.set("columns", js.undefined)
    
    @scala.inline
    def setDefaultSizeX(value: Double): Self = this.set("defaultSizeX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSizeX: Self = this.set("defaultSizeX", js.undefined)
    
    @scala.inline
    def setDefaultSizeY(value: Double): Self = this.set("defaultSizeY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultSizeY: Self = this.set("defaultSizeY", js.undefined)
    
    @scala.inline
    def setDraggable(value: Drag): Self = this.set("draggable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDraggable: Self = this.set("draggable", js.undefined)
    
    @scala.inline
    def setFloating(value: Boolean): Self = this.set("floating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFloating: Self = this.set("floating", js.undefined)
    
    @scala.inline
    def setIsMobile(value: Boolean): Self = this.set("isMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsMobile: Self = this.set("isMobile", js.undefined)
    
    @scala.inline
    def setMarginsVarargs(value: Double*): Self = this.set("margins", js.Array(value :_*))
    
    @scala.inline
    def setMargins(value: js.Array[Double]): Self = this.set("margins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMargins: Self = this.set("margins", js.undefined)
    
    @scala.inline
    def setMaxRows(value: Double): Self = this.set("maxRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRows: Self = this.set("maxRows", js.undefined)
    
    @scala.inline
    def setMaxSizeX(value: Double): Self = this.set("maxSizeX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSizeX: Self = this.set("maxSizeX", js.undefined)
    
    @scala.inline
    def setMaxSizeY(value: Double): Self = this.set("maxSizeY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxSizeY: Self = this.set("maxSizeY", js.undefined)
    
    @scala.inline
    def setMinColumns(value: Double): Self = this.set("minColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinColumns: Self = this.set("minColumns", js.undefined)
    
    @scala.inline
    def setMinRows(value: Double): Self = this.set("minRows", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinRows: Self = this.set("minRows", js.undefined)
    
    @scala.inline
    def setMinSizeX(value: Double): Self = this.set("minSizeX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSizeX: Self = this.set("minSizeX", js.undefined)
    
    @scala.inline
    def setMinSizeY(value: Double): Self = this.set("minSizeY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinSizeY: Self = this.set("minSizeY", js.undefined)
    
    @scala.inline
    def setMobileBreakPoint(value: Double): Self = this.set("mobileBreakPoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileBreakPoint: Self = this.set("mobileBreakPoint", js.undefined)
    
    @scala.inline
    def setMobileModeEnabled(value: Boolean): Self = this.set("mobileModeEnabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMobileModeEnabled: Self = this.set("mobileModeEnabled", js.undefined)
    
    @scala.inline
    def setOuterMargin(value: Boolean): Self = this.set("outerMargin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOuterMargin: Self = this.set("outerMargin", js.undefined)
    
    @scala.inline
    def setPushing(value: Boolean): Self = this.set("pushing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePushing: Self = this.set("pushing", js.undefined)
    
    @scala.inline
    def setResizable(value: Enabled): Self = this.set("resizable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResizable: Self = this.set("resizable", js.undefined)
    
    @scala.inline
    def setRowHeight(value: String): Self = this.set("rowHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowHeight: Self = this.set("rowHeight", js.undefined)
    
    @scala.inline
    def setSaveGridItemCalculatedHeightInMobile(value: Boolean): Self = this.set("saveGridItemCalculatedHeightInMobile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSaveGridItemCalculatedHeightInMobile: Self = this.set("saveGridItemCalculatedHeightInMobile", js.undefined)
    
    @scala.inline
    def setSwapping(value: Boolean): Self = this.set("swapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwapping: Self = this.set("swapping", js.undefined)
    
    @scala.inline
    def setWidth(value: String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
