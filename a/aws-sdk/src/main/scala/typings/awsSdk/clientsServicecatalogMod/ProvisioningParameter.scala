package typings.awsSdk.clientsServicecatalogMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisioningParameter extends StObject {
  
  /**
    * The parameter key.
    */
  var Key: js.UndefOr[ParameterKey] = js.undefined
  
  /**
    * The parameter value.
    */
  var Value: js.UndefOr[ParameterValue] = js.undefined
}
object ProvisioningParameter {
  
  inline def apply(): ProvisioningParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningParameter]
  }
  
  extension [Self <: ProvisioningParameter](x: Self) {
    
    inline def setKey(value: ParameterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValue(value: ParameterValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
