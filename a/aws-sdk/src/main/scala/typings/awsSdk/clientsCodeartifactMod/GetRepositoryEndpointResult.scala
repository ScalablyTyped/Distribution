package typings.awsSdk.clientsCodeartifactMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetRepositoryEndpointResult extends StObject {
  
  /**
    *  A string that specifies the URL of the returned endpoint. 
    */
  var repositoryEndpoint: js.UndefOr[String] = js.undefined
}
object GetRepositoryEndpointResult {
  
  inline def apply(): GetRepositoryEndpointResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetRepositoryEndpointResult]
  }
  
  extension [Self <: GetRepositoryEndpointResult](x: Self) {
    
    inline def setRepositoryEndpoint(value: String): Self = StObject.set(x, "repositoryEndpoint", value.asInstanceOf[js.Any])
    
    inline def setRepositoryEndpointUndefined: Self = StObject.set(x, "repositoryEndpoint", js.undefined)
  }
}
