package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HibernationOptionsRequest extends StObject {
  
  /**
    * If you set this parameter to true, your instance is enabled for hibernation. Default: false 
    */
  var Configured: js.UndefOr[Boolean] = js.undefined
}
object HibernationOptionsRequest {
  
  inline def apply(): HibernationOptionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HibernationOptionsRequest]
  }
  
  extension [Self <: HibernationOptionsRequest](x: Self) {
    
    inline def setConfigured(value: Boolean): Self = StObject.set(x, "Configured", value.asInstanceOf[js.Any])
    
    inline def setConfiguredUndefined: Self = StObject.set(x, "Configured", js.undefined)
  }
}
