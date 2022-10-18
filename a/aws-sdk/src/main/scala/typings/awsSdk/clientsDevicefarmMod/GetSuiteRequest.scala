package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSuiteRequest extends StObject {
  
  /**
    * The suite's ARN.
    */
  var arn: AmazonResourceName
}
object GetSuiteRequest {
  
  inline def apply(arn: AmazonResourceName): GetSuiteRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSuiteRequest]
  }
  
  extension [Self <: GetSuiteRequest](x: Self) {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
