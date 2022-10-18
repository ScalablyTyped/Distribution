package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeForecastRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the forecast.
    */
  var ForecastArn: Arn
}
object DescribeForecastRequest {
  
  inline def apply(ForecastArn: Arn): DescribeForecastRequest = {
    val __obj = js.Dynamic.literal(ForecastArn = ForecastArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeForecastRequest]
  }
  
  extension [Self <: DescribeForecastRequest](x: Self) {
    
    inline def setForecastArn(value: Arn): Self = StObject.set(x, "ForecastArn", value.asInstanceOf[js.Any])
  }
}
