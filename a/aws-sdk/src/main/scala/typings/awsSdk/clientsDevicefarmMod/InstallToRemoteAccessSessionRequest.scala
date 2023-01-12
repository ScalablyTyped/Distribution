package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstallToRemoteAccessSessionRequest extends StObject {
  
  /**
    * The ARN of the app about which you are requesting information.
    */
  var appArn: AmazonResourceName
  
  /**
    * The Amazon Resource Name (ARN) of the remote access session about which you are requesting information.
    */
  var remoteAccessSessionArn: AmazonResourceName
}
object InstallToRemoteAccessSessionRequest {
  
  inline def apply(appArn: AmazonResourceName, remoteAccessSessionArn: AmazonResourceName): InstallToRemoteAccessSessionRequest = {
    val __obj = js.Dynamic.literal(appArn = appArn.asInstanceOf[js.Any], remoteAccessSessionArn = remoteAccessSessionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstallToRemoteAccessSessionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InstallToRemoteAccessSessionRequest] (val x: Self) extends AnyVal {
    
    inline def setAppArn(value: AmazonResourceName): Self = StObject.set(x, "appArn", value.asInstanceOf[js.Any])
    
    inline def setRemoteAccessSessionArn(value: AmazonResourceName): Self = StObject.set(x, "remoteAccessSessionArn", value.asInstanceOf[js.Any])
  }
}
