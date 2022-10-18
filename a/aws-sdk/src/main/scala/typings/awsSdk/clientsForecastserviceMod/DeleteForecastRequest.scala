package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteForecastRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the forecast to delete.
    */
  var ForecastArn: Arn
}
object DeleteForecastRequest {
  
  inline def apply(ForecastArn: Arn): DeleteForecastRequest = {
    val __obj = js.Dynamic.literal(ForecastArn = ForecastArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteForecastRequest]
  }
  
  extension [Self <: DeleteForecastRequest](x: Self) {
    
    inline def setForecastArn(value: Arn): Self = StObject.set(x, "ForecastArn", value.asInstanceOf[js.Any])
  }
}
