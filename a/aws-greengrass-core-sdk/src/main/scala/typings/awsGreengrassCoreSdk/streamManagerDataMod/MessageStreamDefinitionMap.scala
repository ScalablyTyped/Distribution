package typings.awsGreengrassCoreSdk.streamManagerDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageStreamDefinitionMap extends StObject {
  
  var exportDefinition: js.UndefOr[ExportDefinitionMap | Null] = js.undefined
  
  var flushOnWrite: js.UndefOr[Boolean | Null] = js.undefined
  
  var maxSize: js.UndefOr[Double | Null] = js.undefined
  
  var name: js.UndefOr[String | Null] = js.undefined
  
  var persistence: js.UndefOr[PersistenceMap | Null] = js.undefined
  
  var strategyOnFull: js.UndefOr[StrategyOnFullMap | Null] = js.undefined
  
  var streamSegmentSize: js.UndefOr[Double | Null] = js.undefined
  
  var timeToLiveMillis: js.UndefOr[Double | Null] = js.undefined
}
object MessageStreamDefinitionMap {
  
  inline def apply(): MessageStreamDefinitionMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageStreamDefinitionMap]
  }
  
  extension [Self <: MessageStreamDefinitionMap](x: Self) {
    
    inline def setExportDefinition(value: ExportDefinitionMap): Self = StObject.set(x, "exportDefinition", value.asInstanceOf[js.Any])
    
    inline def setExportDefinitionNull: Self = StObject.set(x, "exportDefinition", null)
    
    inline def setExportDefinitionUndefined: Self = StObject.set(x, "exportDefinition", js.undefined)
    
    inline def setFlushOnWrite(value: Boolean): Self = StObject.set(x, "flushOnWrite", value.asInstanceOf[js.Any])
    
    inline def setFlushOnWriteNull: Self = StObject.set(x, "flushOnWrite", null)
    
    inline def setFlushOnWriteUndefined: Self = StObject.set(x, "flushOnWrite", js.undefined)
    
    inline def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
    
    inline def setMaxSizeNull: Self = StObject.set(x, "maxSize", null)
    
    inline def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameNull: Self = StObject.set(x, "name", null)
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPersistence(value: PersistenceMap): Self = StObject.set(x, "persistence", value.asInstanceOf[js.Any])
    
    inline def setPersistenceNull: Self = StObject.set(x, "persistence", null)
    
    inline def setPersistenceUndefined: Self = StObject.set(x, "persistence", js.undefined)
    
    inline def setStrategyOnFull(value: StrategyOnFullMap): Self = StObject.set(x, "strategyOnFull", value.asInstanceOf[js.Any])
    
    inline def setStrategyOnFullNull: Self = StObject.set(x, "strategyOnFull", null)
    
    inline def setStrategyOnFullUndefined: Self = StObject.set(x, "strategyOnFull", js.undefined)
    
    inline def setStreamSegmentSize(value: Double): Self = StObject.set(x, "streamSegmentSize", value.asInstanceOf[js.Any])
    
    inline def setStreamSegmentSizeNull: Self = StObject.set(x, "streamSegmentSize", null)
    
    inline def setStreamSegmentSizeUndefined: Self = StObject.set(x, "streamSegmentSize", js.undefined)
    
    inline def setTimeToLiveMillis(value: Double): Self = StObject.set(x, "timeToLiveMillis", value.asInstanceOf[js.Any])
    
    inline def setTimeToLiveMillisNull: Self = StObject.set(x, "timeToLiveMillis", null)
    
    inline def setTimeToLiveMillisUndefined: Self = StObject.set(x, "timeToLiveMillis", js.undefined)
  }
}
