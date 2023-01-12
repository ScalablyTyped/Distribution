package typings.awsSdk.clientsSagemakeredgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Model extends StObject {
  
  /**
    * The timestamp of the last inference that was made.
    */
  var LatestInference: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The timestamp of the last data sample taken.
    */
  var LatestSampleTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Information required for model metrics.
    */
  var ModelMetrics: js.UndefOr[EdgeMetrics] = js.undefined
  
  /**
    * The name of the model.
    */
  var ModelName: js.UndefOr[typings.awsSdk.clientsSagemakeredgeMod.ModelName] = js.undefined
  
  /**
    * The version of the model.
    */
  var ModelVersion: js.UndefOr[Version] = js.undefined
}
object Model {
  
  inline def apply(): Model = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Model]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Model] (val x: Self) extends AnyVal {
    
    inline def setLatestInference(value: js.Date): Self = StObject.set(x, "LatestInference", value.asInstanceOf[js.Any])
    
    inline def setLatestInferenceUndefined: Self = StObject.set(x, "LatestInference", js.undefined)
    
    inline def setLatestSampleTime(value: js.Date): Self = StObject.set(x, "LatestSampleTime", value.asInstanceOf[js.Any])
    
    inline def setLatestSampleTimeUndefined: Self = StObject.set(x, "LatestSampleTime", js.undefined)
    
    inline def setModelMetrics(value: EdgeMetrics): Self = StObject.set(x, "ModelMetrics", value.asInstanceOf[js.Any])
    
    inline def setModelMetricsUndefined: Self = StObject.set(x, "ModelMetrics", js.undefined)
    
    inline def setModelMetricsVarargs(value: EdgeMetric*): Self = StObject.set(x, "ModelMetrics", js.Array(value*))
    
    inline def setModelName(value: ModelName): Self = StObject.set(x, "ModelName", value.asInstanceOf[js.Any])
    
    inline def setModelNameUndefined: Self = StObject.set(x, "ModelName", js.undefined)
    
    inline def setModelVersion(value: Version): Self = StObject.set(x, "ModelVersion", value.asInstanceOf[js.Any])
    
    inline def setModelVersionUndefined: Self = StObject.set(x, "ModelVersion", js.undefined)
  }
}
