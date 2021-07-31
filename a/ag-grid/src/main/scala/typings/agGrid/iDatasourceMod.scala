package typings.agGrid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iDatasourceMod {
  
  trait IDatasource extends StObject {
    
    var destroy: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    /** Callback the grid calls that you implement to fetch rows from the server. See below for params.*/
    def getRows(params: IGetRowsParams): Unit
    
    /** If you know up front how many rows are in the dataset, set it here. Otherwise leave blank.*/
    var rowCount: js.UndefOr[Double] = js.undefined
  }
  object IDatasource {
    
    @scala.inline
    def apply(getRows: IGetRowsParams => Unit): IDatasource = {
      val __obj = js.Dynamic.literal(getRows = js.Any.fromFunction1(getRows))
      __obj.asInstanceOf[IDatasource]
    }
    
    @scala.inline
    implicit class IDatasourceMutableBuilder[Self <: IDatasource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDestroyUndefined: Self = StObject.set(x, "destroy", js.undefined)
      
      @scala.inline
      def setGetRows(value: IGetRowsParams => Unit): Self = StObject.set(x, "getRows", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowCountUndefined: Self = StObject.set(x, "rowCount", js.undefined)
    }
  }
  
  @js.native
  trait IGetRowsParams extends StObject {
    
    /** The grid context object */
    var context: js.Any = js.native
    
    /** The first row index to NOT get. */
    var endRow: Double = js.native
    
    /** Callback to call when the request fails. */
    def failCallback(): Unit = js.native
    
    /** If doing server side filtering, contains the filter model */
    var filterModel: js.Any = js.native
    
    /** If doing server side sorting, contains the sort model */
    var sortModel: js.Any = js.native
    
    /** The first row index to get. */
    var startRow: Double = js.native
    
    /** Callback to call for the result when successful. */
    def successCallback(rowsThisBlock: js.Array[js.Any]): Unit = js.native
    def successCallback(rowsThisBlock: js.Array[js.Any], lastRow: Double): Unit = js.native
  }
}
