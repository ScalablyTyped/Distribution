package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEndpointAttributesInput extends StObject {
  
  /**
    * EndpointArn for GetEndpointAttributes input.
    */
  var EndpointArn: String
}
object GetEndpointAttributesInput {
  
  inline def apply(EndpointArn: String): GetEndpointAttributesInput = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEndpointAttributesInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetEndpointAttributesInput] (val x: Self) extends AnyVal {
    
    inline def setEndpointArn(value: String): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
  }
}
