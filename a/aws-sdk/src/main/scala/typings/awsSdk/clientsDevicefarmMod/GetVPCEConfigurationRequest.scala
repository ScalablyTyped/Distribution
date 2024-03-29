package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetVPCEConfigurationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the VPC endpoint configuration you want to describe.
    */
  var arn: AmazonResourceName
}
object GetVPCEConfigurationRequest {
  
  inline def apply(arn: AmazonResourceName): GetVPCEConfigurationRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetVPCEConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetVPCEConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
