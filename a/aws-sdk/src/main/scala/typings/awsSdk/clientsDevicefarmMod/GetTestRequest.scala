package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetTestRequest extends StObject {
  
  /**
    * The test's ARN.
    */
  var arn: AmazonResourceName
}
object GetTestRequest {
  
  inline def apply(arn: AmazonResourceName): GetTestRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetTestRequest]
  }
  
  extension [Self <: GetTestRequest](x: Self) {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
