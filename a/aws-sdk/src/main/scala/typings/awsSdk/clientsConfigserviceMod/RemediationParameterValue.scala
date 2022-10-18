package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemediationParameterValue extends StObject {
  
  /**
    * The value is dynamic and changes at run-time.
    */
  var ResourceValue: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.ResourceValue] = js.undefined
  
  /**
    * The value is static and does not change at run-time.
    */
  var StaticValue: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.StaticValue] = js.undefined
}
object RemediationParameterValue {
  
  inline def apply(): RemediationParameterValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemediationParameterValue]
  }
  
  extension [Self <: RemediationParameterValue](x: Self) {
    
    inline def setResourceValue(value: ResourceValue): Self = StObject.set(x, "ResourceValue", value.asInstanceOf[js.Any])
    
    inline def setResourceValueUndefined: Self = StObject.set(x, "ResourceValue", js.undefined)
    
    inline def setStaticValue(value: StaticValue): Self = StObject.set(x, "StaticValue", value.asInstanceOf[js.Any])
    
    inline def setStaticValueUndefined: Self = StObject.set(x, "StaticValue", js.undefined)
  }
}
