package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeEndpointInput extends StObject {
  
  /**
    * The name of the endpoint.
    */
  var EndpointName: typings.awsSdk.clientsSagemakerMod.EndpointName
}
object DescribeEndpointInput {
  
  inline def apply(EndpointName: EndpointName): DescribeEndpointInput = {
    val __obj = js.Dynamic.literal(EndpointName = EndpointName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEndpointInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeEndpointInput] (val x: Self) extends AnyVal {
    
    inline def setEndpointName(value: EndpointName): Self = StObject.set(x, "EndpointName", value.asInstanceOf[js.Any])
  }
}
