package typings.arangodb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExecutionTime extends StObject {
  
  var executionTime: Double
  
  var filtered: Double
  
  var fullCount: Double
  
  var httpRequests: Double
  
  var scannedFull: Double
  
  var scannedIndex: Double
  
  var writesExecuted: Double
  
  var writesIgnored: Double
}
object ExecutionTime {
  
  inline def apply(
    executionTime: Double,
    filtered: Double,
    fullCount: Double,
    httpRequests: Double,
    scannedFull: Double,
    scannedIndex: Double,
    writesExecuted: Double,
    writesIgnored: Double
  ): ExecutionTime = {
    val __obj = js.Dynamic.literal(executionTime = executionTime.asInstanceOf[js.Any], filtered = filtered.asInstanceOf[js.Any], fullCount = fullCount.asInstanceOf[js.Any], httpRequests = httpRequests.asInstanceOf[js.Any], scannedFull = scannedFull.asInstanceOf[js.Any], scannedIndex = scannedIndex.asInstanceOf[js.Any], writesExecuted = writesExecuted.asInstanceOf[js.Any], writesIgnored = writesIgnored.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionTime]
  }
  
  extension [Self <: ExecutionTime](x: Self) {
    
    inline def setExecutionTime(value: Double): Self = StObject.set(x, "executionTime", value.asInstanceOf[js.Any])
    
    inline def setFiltered(value: Double): Self = StObject.set(x, "filtered", value.asInstanceOf[js.Any])
    
    inline def setFullCount(value: Double): Self = StObject.set(x, "fullCount", value.asInstanceOf[js.Any])
    
    inline def setHttpRequests(value: Double): Self = StObject.set(x, "httpRequests", value.asInstanceOf[js.Any])
    
    inline def setScannedFull(value: Double): Self = StObject.set(x, "scannedFull", value.asInstanceOf[js.Any])
    
    inline def setScannedIndex(value: Double): Self = StObject.set(x, "scannedIndex", value.asInstanceOf[js.Any])
    
    inline def setWritesExecuted(value: Double): Self = StObject.set(x, "writesExecuted", value.asInstanceOf[js.Any])
    
    inline def setWritesIgnored(value: Double): Self = StObject.set(x, "writesIgnored", value.asInstanceOf[js.Any])
  }
}
