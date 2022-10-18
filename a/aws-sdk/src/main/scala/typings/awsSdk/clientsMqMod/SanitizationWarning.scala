package typings.awsSdk.clientsMqMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SanitizationWarning extends StObject {
  
  /**
    * The name of the XML attribute that has been sanitized.
    */
  var AttributeName: js.UndefOr[string] = js.undefined
  
  /**
    * The name of the XML element that has been sanitized.
    */
  var ElementName: js.UndefOr[string] = js.undefined
  
  /**
    * Required. The reason for which the XML elements or attributes were sanitized.
    */
  var Reason: SanitizationWarningReason
}
object SanitizationWarning {
  
  inline def apply(Reason: SanitizationWarningReason): SanitizationWarning = {
    val __obj = js.Dynamic.literal(Reason = Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[SanitizationWarning]
  }
  
  extension [Self <: SanitizationWarning](x: Self) {
    
    inline def setAttributeName(value: string): Self = StObject.set(x, "AttributeName", value.asInstanceOf[js.Any])
    
    inline def setAttributeNameUndefined: Self = StObject.set(x, "AttributeName", js.undefined)
    
    inline def setElementName(value: string): Self = StObject.set(x, "ElementName", value.asInstanceOf[js.Any])
    
    inline def setElementNameUndefined: Self = StObject.set(x, "ElementName", js.undefined)
    
    inline def setReason(value: SanitizationWarningReason): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
  }
}
