package typings.awsSdk.clientsElbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ConfigureHealthCheckOutput extends StObject {
  
  /**
    * The updated health check.
    */
  var HealthCheck: js.UndefOr[typings.awsSdk.clientsElbMod.HealthCheck] = js.undefined
}
object ConfigureHealthCheckOutput {
  
  inline def apply(): ConfigureHealthCheckOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConfigureHealthCheckOutput]
  }
  
  extension [Self <: ConfigureHealthCheckOutput](x: Self) {
    
    inline def setHealthCheck(value: HealthCheck): Self = StObject.set(x, "HealthCheck", value.asInstanceOf[js.Any])
    
    inline def setHealthCheckUndefined: Self = StObject.set(x, "HealthCheck", js.undefined)
  }
}
