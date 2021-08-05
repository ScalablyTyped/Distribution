package typings.agGrid

import org.scalablytyped.runtime.NumberDictionary
import typings.agGrid.rowNodeMod.RowNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iViewportDatasourceMod {
  
  trait IViewportDatasource extends StObject {
    
    /** Gets called once when viewPort is no longer used. If you need to do any cleanup, do it here. */
    var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Gets called exactly once before viewPort is used. Passes methods to be used to tell viewPort of data loads / changes. */
    def init(params: IViewportDatasourceParams): Unit
    
    /** Tell the viewport what the scroll position of the grid is, so it knows what rows it has to get */
    def setViewportRange(firstRow: Double, lastRow: Double): Unit
  }
  object IViewportDatasource {
    
    inline def apply(init: IViewportDatasourceParams => Unit, setViewportRange: (Double, Double) => Unit): IViewportDatasource = {
      val __obj = js.Dynamic.literal(init = js.Any.fromFunction1(init), setViewportRange = js.Any.fromFunction2(setViewportRange))
      __obj.asInstanceOf[IViewportDatasource]
    }
    
    extension [Self <: IViewportDatasource](x: Self) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      inline def setInit(value: IViewportDatasourceParams => Unit): Self = StObject.set(x, "init", js.Any.fromFunction1(value))
      
      inline def setSetViewportRange(value: (Double, Double) => Unit): Self = StObject.set(x, "setViewportRange", js.Any.fromFunction2(value))
    }
  }
  
  trait IViewportDatasourceParams extends StObject {
    
    /** datasource calls this when it wants a row node - typically used when it wants to update the row node */
    def getRow(rowIndex: Double): RowNode
    
    /** datasource calls this method when the total row count changes. This in turn sets the height of the grids vertical scroll. */
    def setRowCount(count: Double): Unit
    
    /** datasource calls this when new data arrives. The grid then updates the provided rows. The rows are mapped [rowIndex]=>rowData].*/
    def setRowData(rowData: NumberDictionary[js.Any]): Unit
  }
  object IViewportDatasourceParams {
    
    inline def apply(
      getRow: Double => RowNode,
      setRowCount: Double => Unit,
      setRowData: NumberDictionary[js.Any] => Unit
    ): IViewportDatasourceParams = {
      val __obj = js.Dynamic.literal(getRow = js.Any.fromFunction1(getRow), setRowCount = js.Any.fromFunction1(setRowCount), setRowData = js.Any.fromFunction1(setRowData))
      __obj.asInstanceOf[IViewportDatasourceParams]
    }
    
    extension [Self <: IViewportDatasourceParams](x: Self) {
      
      inline def setGetRow(value: Double => RowNode): Self = StObject.set(x, "getRow", js.Any.fromFunction1(value))
      
      inline def setSetRowCount(value: Double => Unit): Self = StObject.set(x, "setRowCount", js.Any.fromFunction1(value))
      
      inline def setSetRowData(value: NumberDictionary[js.Any] => Unit): Self = StObject.set(x, "setRowData", js.Any.fromFunction1(value))
    }
  }
}
