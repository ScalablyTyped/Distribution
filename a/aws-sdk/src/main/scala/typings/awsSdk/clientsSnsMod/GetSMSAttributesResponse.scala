package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSMSAttributesResponse extends StObject {
  
  /**
    * The SMS attribute names and their values.
    */
  var attributes: js.UndefOr[MapStringToString] = js.undefined
}
object GetSMSAttributesResponse {
  
  inline def apply(): GetSMSAttributesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSMSAttributesResponse]
  }
  
  extension [Self <: GetSMSAttributesResponse](x: Self) {
    
    inline def setAttributes(value: MapStringToString): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
  }
}
