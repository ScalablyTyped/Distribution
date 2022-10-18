package typings.awsSdk.clientsDmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRefreshSchemasStatusMessage extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the endpoint.
    */
  var EndpointArn: String
}
object DescribeRefreshSchemasStatusMessage {
  
  inline def apply(EndpointArn: String): DescribeRefreshSchemasStatusMessage = {
    val __obj = js.Dynamic.literal(EndpointArn = EndpointArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRefreshSchemasStatusMessage]
  }
  
  extension [Self <: DescribeRefreshSchemasStatusMessage](x: Self) {
    
    inline def setEndpointArn(value: String): Self = StObject.set(x, "EndpointArn", value.asInstanceOf[js.Any])
  }
}
