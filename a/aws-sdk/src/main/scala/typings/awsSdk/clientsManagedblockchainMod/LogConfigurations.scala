package typings.awsSdk.clientsManagedblockchainMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogConfigurations extends StObject {
  
  /**
    * Parameters for publishing logs to Amazon CloudWatch Logs.
    */
  var Cloudwatch: js.UndefOr[LogConfiguration] = js.undefined
}
object LogConfigurations {
  
  inline def apply(): LogConfigurations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LogConfigurations]
  }
  
  extension [Self <: LogConfigurations](x: Self) {
    
    inline def setCloudwatch(value: LogConfiguration): Self = StObject.set(x, "Cloudwatch", value.asInstanceOf[js.Any])
    
    inline def setCloudwatchUndefined: Self = StObject.set(x, "Cloudwatch", js.undefined)
  }
}
