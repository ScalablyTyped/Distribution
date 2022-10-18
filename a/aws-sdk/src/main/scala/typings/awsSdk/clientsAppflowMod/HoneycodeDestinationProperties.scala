package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HoneycodeDestinationProperties extends StObject {
  
  var errorHandlingConfig: js.UndefOr[ErrorHandlingConfig] = js.undefined
  
  /**
    *  The object specified in the Amazon Honeycode flow destination. 
    */
  var `object`: Object
}
object HoneycodeDestinationProperties {
  
  inline def apply(`object`: Object): HoneycodeDestinationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoneycodeDestinationProperties]
  }
  
  extension [Self <: HoneycodeDestinationProperties](x: Self) {
    
    inline def setErrorHandlingConfig(value: ErrorHandlingConfig): Self = StObject.set(x, "errorHandlingConfig", value.asInstanceOf[js.Any])
    
    inline def setErrorHandlingConfigUndefined: Self = StObject.set(x, "errorHandlingConfig", js.undefined)
    
    inline def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
