package typings.awsSdk.clientsIvsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetStreamKeyRequest extends StObject {
  
  /**
    * ARN for the stream key to be retrieved.
    */
  var arn: StreamKeyArn
}
object GetStreamKeyRequest {
  
  inline def apply(arn: StreamKeyArn): GetStreamKeyRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStreamKeyRequest]
  }
  
  extension [Self <: GetStreamKeyRequest](x: Self) {
    
    inline def setArn(value: StreamKeyArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
