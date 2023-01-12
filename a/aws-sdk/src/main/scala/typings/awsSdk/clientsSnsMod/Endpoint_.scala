package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Endpoint_ extends StObject {
  
  /**
    * Attributes for endpoint.
    */
  var Attributes: js.UndefOr[MapStringToString] = js.undefined
  
  /**
    * The EndpointArn for mobile app and device.
    */
  var EndpointArn: js.UndefOr[String] = js.undefined
}
object Endpoint_ {
  
  inline def apply(): Endpoint_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Endpoint_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Endpoint_] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: MapStringToString): Self = StObject.set(x, "Attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "Attributes", js.undefined)
    
    inline def setEndpointArn(value: String): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
    
    inline def setEndpointArnUndefined: Self = StObject.set(x, "EndpointArn", js.undefined)
  }
}
