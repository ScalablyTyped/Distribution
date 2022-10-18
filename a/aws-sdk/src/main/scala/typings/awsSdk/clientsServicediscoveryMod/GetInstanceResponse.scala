package typings.awsSdk.clientsServicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetInstanceResponse extends StObject {
  
  /**
    * A complex type that contains information about a specified instance.
    */
  var Instance: js.UndefOr[typings.awsSdk.clientsServicediscoveryMod.Instance] = js.undefined
}
object GetInstanceResponse {
  
  inline def apply(): GetInstanceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetInstanceResponse]
  }
  
  extension [Self <: GetInstanceResponse](x: Self) {
    
    inline def setInstance(value: Instance): Self = StObject.set(x, "Instance", value.asInstanceOf[js.Any])
    
    inline def setInstanceUndefined: Self = StObject.set(x, "Instance", js.undefined)
  }
}
