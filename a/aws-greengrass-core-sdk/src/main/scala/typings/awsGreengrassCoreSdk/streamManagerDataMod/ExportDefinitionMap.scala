package typings.awsGreengrassCoreSdk.streamManagerDataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExportDefinitionMap extends StObject {
  
  var IotSitewise: js.UndefOr[js.Array[IoTSiteWiseConfigMap] | Null] = js.undefined
  
  var http: js.UndefOr[js.Array[HTTPConfigMap] | Null] = js.undefined
  
  var iotAnalytics: js.UndefOr[js.Array[IoTAnalyticsConfigMap] | Null] = js.undefined
  
  var kinesis: js.UndefOr[js.Array[KinesisConfigMap] | Null] = js.undefined
  
  var s3TaskExecutor: js.UndefOr[js.Array[S3ExportTaskExecutorConfigMap] | Null] = js.undefined
}
object ExportDefinitionMap {
  
  inline def apply(): ExportDefinitionMap = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExportDefinitionMap]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExportDefinitionMap] (val x: Self) extends AnyVal {
    
    inline def setHttp(value: js.Array[HTTPConfigMap]): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setHttpNull: Self = StObject.set(x, "http", null)
    
    inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    
    inline def setHttpVarargs(value: HTTPConfigMap*): Self = StObject.set(x, "http", js.Array(value*))
    
    inline def setIotAnalytics(value: js.Array[IoTAnalyticsConfigMap]): Self = StObject.set(x, "iotAnalytics", value.asInstanceOf[js.Any])
    
    inline def setIotAnalyticsNull: Self = StObject.set(x, "iotAnalytics", null)
    
    inline def setIotAnalyticsUndefined: Self = StObject.set(x, "iotAnalytics", js.undefined)
    
    inline def setIotAnalyticsVarargs(value: IoTAnalyticsConfigMap*): Self = StObject.set(x, "iotAnalytics", js.Array(value*))
    
    inline def setIotSitewise(value: js.Array[IoTSiteWiseConfigMap]): Self = StObject.set(x, "IotSitewise", value.asInstanceOf[js.Any])
    
    inline def setIotSitewiseNull: Self = StObject.set(x, "IotSitewise", null)
    
    inline def setIotSitewiseUndefined: Self = StObject.set(x, "IotSitewise", js.undefined)
    
    inline def setIotSitewiseVarargs(value: IoTSiteWiseConfigMap*): Self = StObject.set(x, "IotSitewise", js.Array(value*))
    
    inline def setKinesis(value: js.Array[KinesisConfigMap]): Self = StObject.set(x, "kinesis", value.asInstanceOf[js.Any])
    
    inline def setKinesisNull: Self = StObject.set(x, "kinesis", null)
    
    inline def setKinesisUndefined: Self = StObject.set(x, "kinesis", js.undefined)
    
    inline def setKinesisVarargs(value: KinesisConfigMap*): Self = StObject.set(x, "kinesis", js.Array(value*))
    
    inline def setS3TaskExecutor(value: js.Array[S3ExportTaskExecutorConfigMap]): Self = StObject.set(x, "s3TaskExecutor", value.asInstanceOf[js.Any])
    
    inline def setS3TaskExecutorNull: Self = StObject.set(x, "s3TaskExecutor", null)
    
    inline def setS3TaskExecutorUndefined: Self = StObject.set(x, "s3TaskExecutor", js.undefined)
    
    inline def setS3TaskExecutorVarargs(value: S3ExportTaskExecutorConfigMap*): Self = StObject.set(x, "s3TaskExecutor", js.Array(value*))
  }
}
