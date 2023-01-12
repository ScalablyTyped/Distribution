package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MonitorDataSource extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the dataset import job used to import the data that initiated the monitor evaluation.
    */
  var DatasetImportJobArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the forecast the monitor used during the evaluation.
    */
  var ForecastArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the predictor resource you are monitoring.
    */
  var PredictorArn: js.UndefOr[Arn] = js.undefined
}
object MonitorDataSource {
  
  inline def apply(): MonitorDataSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MonitorDataSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MonitorDataSource] (val x: Self) extends AnyVal {
    
    inline def setDatasetImportJobArn(value: Arn): Self = StObject.set(x, "DatasetImportJobArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetImportJobArnUndefined: Self = StObject.set(x, "DatasetImportJobArn", js.undefined)
    
    inline def setForecastArn(value: Arn): Self = StObject.set(x, "ForecastArn", value.asInstanceOf[js.Any])
    
    inline def setForecastArnUndefined: Self = StObject.set(x, "ForecastArn", js.undefined)
    
    inline def setPredictorArn(value: Arn): Self = StObject.set(x, "PredictorArn", value.asInstanceOf[js.Any])
    
    inline def setPredictorArnUndefined: Self = StObject.set(x, "PredictorArn", js.undefined)
  }
}
