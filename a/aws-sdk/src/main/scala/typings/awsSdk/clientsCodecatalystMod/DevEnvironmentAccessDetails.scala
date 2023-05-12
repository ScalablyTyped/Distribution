package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DevEnvironmentAccessDetails extends StObject {
  
  /**
    * The URL used to send commands to and from the Dev Environment.
    */
  var streamUrl: SensitiveString
  
  /**
    * An encrypted token value that contains session and caller information used to authenticate the connection.
    */
  var tokenValue: SensitiveString
}
object DevEnvironmentAccessDetails {
  
  inline def apply(streamUrl: SensitiveString, tokenValue: SensitiveString): DevEnvironmentAccessDetails = {
    val __obj = js.Dynamic.literal(streamUrl = streamUrl.asInstanceOf[js.Any], tokenValue = tokenValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[DevEnvironmentAccessDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DevEnvironmentAccessDetails] (val x: Self) extends AnyVal {
    
    inline def setStreamUrl(value: SensitiveString): Self = StObject.set(x, "streamUrl", value.asInstanceOf[js.Any])
    
    inline def setTokenValue(value: SensitiveString): Self = StObject.set(x, "tokenValue", value.asInstanceOf[js.Any])
  }
}
