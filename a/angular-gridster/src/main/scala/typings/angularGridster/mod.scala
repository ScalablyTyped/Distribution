package typings.angularGridster

import org.scalablytyped.runtime.Shortcut
import typings.angularGridster.angularGridsterStrings.gridster
import typings.angularGridster.anon.Drag
import typings.angularGridster.anon.Enabled
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("angular-gridster", JSImport.Default)
  @js.native
  val default: gridster = js.native
  
  type _To = gridster
  
  /* This means you don't have to write `default`, but can instead just say `mod.foo` */
  override def _to: gridster = default
  
  /* augmented module */
  object angularAugmentingMod {
    
    object gridster {
      
      trait GridsterConfig extends StObject {
        
        // width of grid columns. "auto" will divide the width of the grid evenly among the columns
        var colWidth: js.UndefOr[String] = js.undefined
        
        // number of columns in the grid
        var columns: js.UndefOr[Double] = js.undefined
        
        // default width of an item in columns
        var defaultSizeX: js.UndefOr[Double] = js.undefined
        
        // default height of an item in rows
        var defaultSizeY: js.UndefOr[Double] = js.undefined
        
        // options to pass to draggable handler
        var draggable: js.UndefOr[Drag] = js.undefined
        
        // whether to automatically float items up so they stack
        var floating: js.UndefOr[Boolean] = js.undefined
        
        // toggle mobile view
        var isMobile: js.UndefOr[Boolean] = js.undefined
        
        // margins in between grid items
        var margins: js.UndefOr[js.Array[Double]] = js.undefined
        
        // maximum amount of rows in the grid
        var maxRows: js.UndefOr[Double] = js.undefined
        
        // maximum column width of an item
        var maxSizeX: js.UndefOr[Double] = js.undefined
        
        // maximum row height of an item
        var maxSizeY: js.UndefOr[Double] = js.undefined
        
        // minimum amount of columns the grid can scale down to
        var minColumns: js.UndefOr[Double] = js.undefined
        
        // minimum amount of rows to show if the grid is empty
        var minRows: js.UndefOr[Double] = js.undefined
        
        // minimum column width of an item
        var minSizeX: js.UndefOr[Double] = js.undefined
        
        // minumum row height of an item
        var minSizeY: js.UndefOr[Double] = js.undefined
        
        // width threshold to toggle mobile mode
        var mobileBreakPoint: js.UndefOr[Double] = js.undefined
        
        // whether or not to toggle mobile mode when screen width is less than mobileBreakPoint
        var mobileModeEnabled: js.UndefOr[Boolean] = js.undefined
        
        // whether to set the outer margin
        var outerMargin: js.UndefOr[Boolean] = js.undefined
        
        // whether to push other items out of the way
        // whether to push other items out of the way
        var pushing: js.UndefOr[Boolean] = js.undefined
        
        // grid item height in mobile display. true- to use the calculated height by sizeY given
        // options to pass to resizable handler
        var resizable: js.UndefOr[Enabled] = js.undefined
        
        // height of grid rows. 'match' will make it the same as the column width, a numeric value will be interpreted as pixels,
        // '/2' is half the column width, '*5' is five times the column width, etc.
        var rowHeight: js.UndefOr[String] = js.undefined
        
        var saveGridItemCalculatedHeightInMobile: js.UndefOr[Boolean] = js.undefined
        
        // whether or not to have items switch places instead of push down if they are the same size
        var swapping: js.UndefOr[Boolean] = js.undefined
        
        // width of the grid. "auto" will expand the grid to its parent container
        var width: js.UndefOr[String] = js.undefined
      }
      object GridsterConfig {
        
        @scala.inline
        def apply(): GridsterConfig = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[GridsterConfig]
        }
        
        @scala.inline
        implicit class GridsterConfigMutableBuilder[Self <: GridsterConfig] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setColWidth(value: String): Self = StObject.set(x, "colWidth", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setColWidthUndefined: Self = StObject.set(x, "colWidth", js.undefined)
          
          @scala.inline
          def setColumns(value: Double): Self = StObject.set(x, "columns", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setColumnsUndefined: Self = StObject.set(x, "columns", js.undefined)
          
          @scala.inline
          def setDefaultSizeX(value: Double): Self = StObject.set(x, "defaultSizeX", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDefaultSizeXUndefined: Self = StObject.set(x, "defaultSizeX", js.undefined)
          
          @scala.inline
          def setDefaultSizeY(value: Double): Self = StObject.set(x, "defaultSizeY", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDefaultSizeYUndefined: Self = StObject.set(x, "defaultSizeY", js.undefined)
          
          @scala.inline
          def setDraggable(value: Drag): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
          
          @scala.inline
          def setFloating(value: Boolean): Self = StObject.set(x, "floating", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFloatingUndefined: Self = StObject.set(x, "floating", js.undefined)
          
          @scala.inline
          def setIsMobile(value: Boolean): Self = StObject.set(x, "isMobile", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setIsMobileUndefined: Self = StObject.set(x, "isMobile", js.undefined)
          
          @scala.inline
          def setMargins(value: js.Array[Double]): Self = StObject.set(x, "margins", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMarginsUndefined: Self = StObject.set(x, "margins", js.undefined)
          
          @scala.inline
          def setMarginsVarargs(value: Double*): Self = StObject.set(x, "margins", js.Array(value :_*))
          
          @scala.inline
          def setMaxRows(value: Double): Self = StObject.set(x, "maxRows", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMaxRowsUndefined: Self = StObject.set(x, "maxRows", js.undefined)
          
          @scala.inline
          def setMaxSizeX(value: Double): Self = StObject.set(x, "maxSizeX", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMaxSizeXUndefined: Self = StObject.set(x, "maxSizeX", js.undefined)
          
          @scala.inline
          def setMaxSizeY(value: Double): Self = StObject.set(x, "maxSizeY", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMaxSizeYUndefined: Self = StObject.set(x, "maxSizeY", js.undefined)
          
          @scala.inline
          def setMinColumns(value: Double): Self = StObject.set(x, "minColumns", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMinColumnsUndefined: Self = StObject.set(x, "minColumns", js.undefined)
          
          @scala.inline
          def setMinRows(value: Double): Self = StObject.set(x, "minRows", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMinRowsUndefined: Self = StObject.set(x, "minRows", js.undefined)
          
          @scala.inline
          def setMinSizeX(value: Double): Self = StObject.set(x, "minSizeX", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMinSizeXUndefined: Self = StObject.set(x, "minSizeX", js.undefined)
          
          @scala.inline
          def setMinSizeY(value: Double): Self = StObject.set(x, "minSizeY", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMinSizeYUndefined: Self = StObject.set(x, "minSizeY", js.undefined)
          
          @scala.inline
          def setMobileBreakPoint(value: Double): Self = StObject.set(x, "mobileBreakPoint", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMobileBreakPointUndefined: Self = StObject.set(x, "mobileBreakPoint", js.undefined)
          
          @scala.inline
          def setMobileModeEnabled(value: Boolean): Self = StObject.set(x, "mobileModeEnabled", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setMobileModeEnabledUndefined: Self = StObject.set(x, "mobileModeEnabled", js.undefined)
          
          @scala.inline
          def setOuterMargin(value: Boolean): Self = StObject.set(x, "outerMargin", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setOuterMarginUndefined: Self = StObject.set(x, "outerMargin", js.undefined)
          
          @scala.inline
          def setPushing(value: Boolean): Self = StObject.set(x, "pushing", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setPushingUndefined: Self = StObject.set(x, "pushing", js.undefined)
          
          @scala.inline
          def setResizable(value: Enabled): Self = StObject.set(x, "resizable", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setResizableUndefined: Self = StObject.set(x, "resizable", js.undefined)
          
          @scala.inline
          def setRowHeight(value: String): Self = StObject.set(x, "rowHeight", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRowHeightUndefined: Self = StObject.set(x, "rowHeight", js.undefined)
          
          @scala.inline
          def setSaveGridItemCalculatedHeightInMobile(value: Boolean): Self = StObject.set(x, "saveGridItemCalculatedHeightInMobile", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSaveGridItemCalculatedHeightInMobileUndefined: Self = StObject.set(x, "saveGridItemCalculatedHeightInMobile", js.undefined)
          
          @scala.inline
          def setSwapping(value: Boolean): Self = StObject.set(x, "swapping", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSwappingUndefined: Self = StObject.set(x, "swapping", js.undefined)
          
          @scala.inline
          def setWidth(value: String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
        }
      }
      
      trait StandardGridsterItem extends StObject {
        
        // starting column where the item will be placed
        var col: Double
        
        // starting row where the item will be placed
        var row: Double
        
        // width of the item expressed in terms of number of columns it will occupy
        var sizeX: Double
        
        // height of the item expressed in terms of number of rows it will occupy
        var sizeY: Double
      }
      object StandardGridsterItem {
        
        @scala.inline
        def apply(col: Double, row: Double, sizeX: Double, sizeY: Double): StandardGridsterItem = {
          val __obj = js.Dynamic.literal(col = col.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], sizeX = sizeX.asInstanceOf[js.Any], sizeY = sizeY.asInstanceOf[js.Any])
          __obj.asInstanceOf[StandardGridsterItem]
        }
        
        @scala.inline
        implicit class StandardGridsterItemMutableBuilder[Self <: StandardGridsterItem] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setCol(value: Double): Self = StObject.set(x, "col", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRow(value: Double): Self = StObject.set(x, "row", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSizeX(value: Double): Self = StObject.set(x, "sizeX", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setSizeY(value: Double): Self = StObject.set(x, "sizeY", value.asInstanceOf[js.Any])
        }
      }
    }
  }
}
