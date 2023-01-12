package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProvisioningParameter extends StObject {
  
  /**
    * The key that identifies a provisioning parameter.
    */
  var Key: js.UndefOr[ProvisioningParameterKey] = js.undefined
  
  /**
    * The value of the provisioning parameter.
    */
  var Value: js.UndefOr[ProvisioningParameterValue] = js.undefined
}
object ProvisioningParameter {
  
  inline def apply(): ProvisioningParameter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProvisioningParameter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ProvisioningParameter] (val x: Self) extends AnyVal {
    
    inline def setKey(value: ProvisioningParameterKey): Self = StObject.set(x, "Key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "Key", js.undefined)
    
    inline def setValue(value: ProvisioningParameterValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
