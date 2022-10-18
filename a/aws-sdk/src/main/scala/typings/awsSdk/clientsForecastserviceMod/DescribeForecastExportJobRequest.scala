package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeForecastExportJobRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the forecast export job.
    */
  var ForecastExportJobArn: Arn
}
object DescribeForecastExportJobRequest {
  
  inline def apply(ForecastExportJobArn: Arn): DescribeForecastExportJobRequest = {
    val __obj = js.Dynamic.literal(ForecastExportJobArn = ForecastExportJobArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeForecastExportJobRequest]
  }
  
  extension [Self <: DescribeForecastExportJobRequest](x: Self) {
    
    inline def setForecastExportJobArn(value: Arn): Self = StObject.set(x, "ForecastExportJobArn", value.asInstanceOf[js.Any])
  }
}
