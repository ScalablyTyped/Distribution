package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRemoteAccessSessionRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the remote access session about which you want to get session information.
    */
  var arn: AmazonResourceName
}
object GetRemoteAccessSessionRequest {
  
  inline def apply(arn: AmazonResourceName): GetRemoteAccessSessionRequest = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRemoteAccessSessionRequest]
  }
  
  extension [Self <: GetRemoteAccessSessionRequest](x: Self) {
    
    inline def setArn(value: AmazonResourceName): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
  }
}
