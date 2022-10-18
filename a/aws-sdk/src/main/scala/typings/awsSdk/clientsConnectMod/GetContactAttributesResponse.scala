package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContactAttributesResponse extends StObject {
  
  /**
    * Information about the attributes.
    */
  var Attributes: js.UndefOr[typings.awsSdk.clientsConnectMod.Attributes] = js.undefined
}
object GetContactAttributesResponse {
  
  inline def apply(): GetContactAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContactAttributesResponse]
  }
  
  extension [Self <: GetContactAttributesResponse](x: Self) {
    
    inline def setAttributes(value: Attributes): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
  }
}
