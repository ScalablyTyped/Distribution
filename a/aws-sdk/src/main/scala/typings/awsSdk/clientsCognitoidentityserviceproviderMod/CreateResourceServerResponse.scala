package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateResourceServerResponse extends StObject {
  
  /**
    * The newly created resource server.
    */
  var ResourceServer: ResourceServerType
}
object CreateResourceServerResponse {
  
  inline def apply(ResourceServer: ResourceServerType): CreateResourceServerResponse = {
    val __obj = js.Dynamic.literal(ResourceServer = ResourceServer.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResourceServerResponse]
  }
  
  extension [Self <: CreateResourceServerResponse](x: Self) {
    
    inline def setResourceServer(value: ResourceServerType): Self = StObject.set(x, "ResourceServer", value.asInstanceOf[js.Any])
  }
}
