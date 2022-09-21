package typings.awsGreengrassCoreSdk.dataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamConfigBaseMap extends StObject {
  
  var batchIntervalMillis: js.UndefOr[Double | Null] = js.undefined
  
  var batchSize: js.UndefOr[Double | Null] = js.undefined
  
  var disabled: js.UndefOr[Boolean | Null] = js.undefined
  
  var identifier: js.UndefOr[String | Null] = js.undefined
  
  var priority: js.UndefOr[Double | Null] = js.undefined
  
  var startSequenceNumber: js.UndefOr[Double | Null] = js.undefined
}
object StreamConfigBaseMap {
  
  inline def apply(): StreamConfigBaseMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamConfigBaseMap]
  }
  
  extension [Self <: StreamConfigBaseMap](x: Self) {
    
    inline def setBatchIntervalMillis(value: Double): Self = StObject.set(x, "batchIntervalMillis", value.asInstanceOf[js.Any])
    
    inline def setBatchIntervalMillisNull: Self = StObject.set(x, "batchIntervalMillis", null)
    
    inline def setBatchIntervalMillisUndefined: Self = StObject.set(x, "batchIntervalMillis", js.undefined)
    
    inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
    
    inline def setBatchSizeNull: Self = StObject.set(x, "batchSize", null)
    
    inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledNull: Self = StObject.set(x, "disabled", null)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierNull: Self = StObject.set(x, "identifier", null)
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setStartSequenceNumber(value: Double): Self = StObject.set(x, "startSequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setStartSequenceNumberNull: Self = StObject.set(x, "startSequenceNumber", null)
    
    inline def setStartSequenceNumberUndefined: Self = StObject.set(x, "startSequenceNumber", js.undefined)
  }
}
