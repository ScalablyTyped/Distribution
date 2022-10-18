package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMonitorResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the monitor resource.
    */
  var MonitorArn: js.UndefOr[Arn] = js.undefined
}
object CreateMonitorResponse {
  
  inline def apply(): CreateMonitorResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMonitorResponse]
  }
  
  extension [Self <: CreateMonitorResponse](x: Self) {
    
    inline def setMonitorArn(value: Arn): Self = StObject.set(x, "MonitorArn", value.asInstanceOf[js.Any])
    
    inline def setMonitorArnUndefined: Self = StObject.set(x, "MonitorArn", js.undefined)
  }
}
