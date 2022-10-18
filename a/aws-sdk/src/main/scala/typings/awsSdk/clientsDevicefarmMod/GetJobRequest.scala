package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetJobRequest extends StObject {
  
  /**
    * The job's ARN.
    */
  var arn: AmazonResourceName
}
object GetJobRequest {
  
  inline def apply(arn: AmazonResourceName): GetJobRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetJobRequest]
  }
  
  extension [Self <: GetJobRequest](x: Self) {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
