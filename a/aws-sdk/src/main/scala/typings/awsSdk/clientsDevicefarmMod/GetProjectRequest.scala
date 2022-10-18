package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetProjectRequest extends StObject {
  
  /**
    * The project's ARN.
    */
  var arn: AmazonResourceName
}
object GetProjectRequest {
  
  inline def apply(arn: AmazonResourceName): GetProjectRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetProjectRequest]
  }
  
  extension [Self <: GetProjectRequest](x: Self) {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
