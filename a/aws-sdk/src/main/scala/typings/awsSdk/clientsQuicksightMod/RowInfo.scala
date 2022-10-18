package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RowInfo extends StObject {
  
  /**
    * The number of rows that were not ingested.
    */
  var RowsDropped: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of rows that were ingested.
    */
  var RowsIngested: js.UndefOr[Long] = js.undefined
  
  /**
    * The total number of rows in the dataset.
    */
  var TotalRowsInDataset: js.UndefOr[Long] = js.undefined
}
object RowInfo {
  
  inline def apply(): RowInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RowInfo]
  }
  
  extension [Self <: RowInfo](x: Self) {
    
    inline def setRowsDropped(value: Long): Self = StObject.set(x, "RowsDropped", value.asInstanceOf[js.Any])
    
    inline def setRowsDroppedUndefined: Self = StObject.set(x, "RowsDropped", js.undefined)
    
    inline def setRowsIngested(value: Long): Self = StObject.set(x, "RowsIngested", value.asInstanceOf[js.Any])
    
    inline def setRowsIngestedUndefined: Self = StObject.set(x, "RowsIngested", js.undefined)
    
    inline def setTotalRowsInDataset(value: Long): Self = StObject.set(x, "TotalRowsInDataset", value.asInstanceOf[js.Any])
    
    inline def setTotalRowsInDatasetUndefined: Self = StObject.set(x, "TotalRowsInDataset", js.undefined)
  }
}
