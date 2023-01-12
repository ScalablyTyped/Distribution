package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryStatistics extends StObject {
  
  /**
    * The total number of bytes in the log events scanned during the query.
    */
  var bytesScanned: js.UndefOr[StatsValue] = js.undefined
  
  /**
    * The number of log events that matched the query string.
    */
  var recordsMatched: js.UndefOr[StatsValue] = js.undefined
  
  /**
    * The total number of log events scanned during the query.
    */
  var recordsScanned: js.UndefOr[StatsValue] = js.undefined
}
object QueryStatistics {
  
  inline def apply(): QueryStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryStatistics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryStatistics] (val x: Self) extends AnyVal {
    
    inline def setBytesScanned(value: StatsValue): Self = StObject.set(x, "bytesScanned", value.asInstanceOf[js.Any])
    
    inline def setBytesScannedUndefined: Self = StObject.set(x, "bytesScanned", js.undefined)
    
    inline def setRecordsMatched(value: StatsValue): Self = StObject.set(x, "recordsMatched", value.asInstanceOf[js.Any])
    
    inline def setRecordsMatchedUndefined: Self = StObject.set(x, "recordsMatched", js.undefined)
    
    inline def setRecordsScanned(value: StatsValue): Self = StObject.set(x, "recordsScanned", value.asInstanceOf[js.Any])
    
    inline def setRecordsScannedUndefined: Self = StObject.set(x, "recordsScanned", js.undefined)
  }
}
