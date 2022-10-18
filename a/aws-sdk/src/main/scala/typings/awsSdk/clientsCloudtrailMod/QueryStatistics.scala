package typings.awsSdk.clientsCloudtrailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryStatistics extends StObject {
  
  /**
    * The total bytes that the query scanned in the event data store. This value matches the number of bytes for which your account is billed for the query, unless the query is still running.
    */
  var BytesScanned: js.UndefOr[Long] = js.undefined
  
  /**
    * The number of results returned.
    */
  var ResultsCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The total number of results returned by a query.
    */
  var TotalResultsCount: js.UndefOr[Integer] = js.undefined
}
object QueryStatistics {
  
  inline def apply(): QueryStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryStatistics]
  }
  
  extension [Self <: QueryStatistics](x: Self) {
    
    inline def setBytesScanned(value: Long): Self = StObject.set(x, "BytesScanned", value.asInstanceOf[js.Any])
    
    inline def setBytesScannedUndefined: Self = StObject.set(x, "BytesScanned", js.undefined)
    
    inline def setResultsCount(value: Integer): Self = StObject.set(x, "ResultsCount", value.asInstanceOf[js.Any])
    
    inline def setResultsCountUndefined: Self = StObject.set(x, "ResultsCount", js.undefined)
    
    inline def setTotalResultsCount(value: Integer): Self = StObject.set(x, "TotalResultsCount", value.asInstanceOf[js.Any])
    
    inline def setTotalResultsCountUndefined: Self = StObject.set(x, "TotalResultsCount", js.undefined)
  }
}
