package typings.awsSdk.clientsLightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStaticIpResult extends StObject {
  
  /**
    * An array of key-value pairs containing information about the requested static IP.
    */
  var staticIp: js.UndefOr[StaticIp] = js.undefined
}
object GetStaticIpResult {
  
  inline def apply(): GetStaticIpResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetStaticIpResult]
  }
  
  extension [Self <: GetStaticIpResult](x: Self) {
    
    inline def setStaticIp(value: StaticIp): Self = StObject.set(x, "staticIp", value.asInstanceOf[js.Any])
    
    inline def setStaticIpUndefined: Self = StObject.set(x, "staticIp", js.undefined)
  }
}
