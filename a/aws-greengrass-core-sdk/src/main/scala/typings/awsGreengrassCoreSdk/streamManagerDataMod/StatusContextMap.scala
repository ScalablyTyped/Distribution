package typings.awsGreengrassCoreSdk.streamManagerDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StatusContextMap extends StObject {
  
  var exportIdentifier: js.UndefOr[String] = js.undefined
  
  var s3ExportTaskDefinition: js.UndefOr[S3ExportTaskDefinitionMap] = js.undefined
  
  var sequenceNumber: js.UndefOr[Double] = js.undefined
  
  var streamName: js.UndefOr[String] = js.undefined
}
object StatusContextMap {
  
  inline def apply(): StatusContextMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusContextMap]
  }
  
  extension [Self <: StatusContextMap](x: Self) {
    
    inline def setExportIdentifier(value: String): Self = StObject.set(x, "exportIdentifier", value.asInstanceOf[js.Any])
    
    inline def setExportIdentifierUndefined: Self = StObject.set(x, "exportIdentifier", js.undefined)
    
    inline def setS3ExportTaskDefinition(value: S3ExportTaskDefinitionMap): Self = StObject.set(x, "s3ExportTaskDefinition", value.asInstanceOf[js.Any])
    
    inline def setS3ExportTaskDefinitionUndefined: Self = StObject.set(x, "s3ExportTaskDefinition", js.undefined)
    
    inline def setSequenceNumber(value: Double): Self = StObject.set(x, "sequenceNumber", value.asInstanceOf[js.Any])
    
    inline def setSequenceNumberUndefined: Self = StObject.set(x, "sequenceNumber", js.undefined)
    
    inline def setStreamName(value: String): Self = StObject.set(x, "streamName", value.asInstanceOf[js.Any])
    
    inline def setStreamNameUndefined: Self = StObject.set(x, "streamName", js.undefined)
  }
}
