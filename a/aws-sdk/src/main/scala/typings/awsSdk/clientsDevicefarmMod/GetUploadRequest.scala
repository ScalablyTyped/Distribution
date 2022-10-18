package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUploadRequest extends StObject {
  
  /**
    * The upload's ARN.
    */
  var arn: AmazonResourceName
}
object GetUploadRequest {
  
  inline def apply(arn: AmazonResourceName): GetUploadRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUploadRequest]
  }
  
  extension [Self <: GetUploadRequest](x: Self) {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
