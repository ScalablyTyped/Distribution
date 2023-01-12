package typings.awsSdk.clientsAppflowMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MarketoDestinationProperties extends StObject {
  
  var errorHandlingConfig: js.UndefOr[ErrorHandlingConfig] = js.undefined
  
  /**
    * The object specified in the Marketo flow destination.
    */
  var `object`: Object
}
object MarketoDestinationProperties {
  
  inline def apply(`object`: Object): MarketoDestinationProperties = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarketoDestinationProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MarketoDestinationProperties] (val x: Self) extends AnyVal {
    
    inline def setErrorHandlingConfig(value: ErrorHandlingConfig): Self = StObject.set(x, "errorHandlingConfig", value.asInstanceOf[js.Any])
    
    inline def setErrorHandlingConfigUndefined: Self = StObject.set(x, "errorHandlingConfig", js.undefined)
    
    inline def setObject(value: Object): Self = StObject.set(x, "object", value.asInstanceOf[js.Any])
  }
}
