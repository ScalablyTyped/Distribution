package typings.awsSdk.clientsS3outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEndpointResult extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the endpoint.
    */
  var EndpointArn: js.UndefOr[typings.awsSdk.clientsS3outpostsMod.EndpointArn] = js.undefined
}
object CreateEndpointResult {
  
  inline def apply(): CreateEndpointResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateEndpointResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateEndpointResult] (val x: Self) extends AnyVal {
    
    inline def setEndpointArn(value: EndpointArn): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
    
    inline def setEndpointArnUndefined: Self = StObject.set(x, "EndpointArn", js.undefined)
  }
}
