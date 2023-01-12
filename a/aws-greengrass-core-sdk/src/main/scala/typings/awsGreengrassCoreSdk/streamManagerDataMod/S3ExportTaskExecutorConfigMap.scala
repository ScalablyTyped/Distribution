package typings.awsGreengrassCoreSdk.streamManagerDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait S3ExportTaskExecutorConfigMap extends StObject {
  
  var disabled: js.UndefOr[Boolean | Null] = js.undefined
  
  var identifier: js.UndefOr[String | Null] = js.undefined
  
  var priority: js.UndefOr[Double | Null] = js.undefined
  
  var sizeThresholdForMultipartUploadBytes: js.UndefOr[Double | Null] = js.undefined
  
  var statusConfig: js.UndefOr[StatusConfig | Null] = js.undefined
}
object S3ExportTaskExecutorConfigMap {
  
  inline def apply(): S3ExportTaskExecutorConfigMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[S3ExportTaskExecutorConfigMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: S3ExportTaskExecutorConfigMap] (val x: Self) extends AnyVal {
    
    inline def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
    
    inline def setDisabledNull: Self = StObject.set(x, "disabled", null)
    
    inline def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
    
    inline def setIdentifierNull: Self = StObject.set(x, "identifier", null)
    
    inline def setIdentifierUndefined: Self = StObject.set(x, "identifier", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setPriorityNull: Self = StObject.set(x, "priority", null)
    
    inline def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    inline def setSizeThresholdForMultipartUploadBytes(value: Double): Self = StObject.set(x, "sizeThresholdForMultipartUploadBytes", value.asInstanceOf[js.Any])
    
    inline def setSizeThresholdForMultipartUploadBytesNull: Self = StObject.set(x, "sizeThresholdForMultipartUploadBytes", null)
    
    inline def setSizeThresholdForMultipartUploadBytesUndefined: Self = StObject.set(x, "sizeThresholdForMultipartUploadBytes", js.undefined)
    
    inline def setStatusConfig(value: StatusConfig): Self = StObject.set(x, "statusConfig", value.asInstanceOf[js.Any])
    
    inline def setStatusConfigNull: Self = StObject.set(x, "statusConfig", null)
    
    inline def setStatusConfigUndefined: Self = StObject.set(x, "statusConfig", js.undefined)
  }
}
