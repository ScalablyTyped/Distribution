package typings.awsSdk.clientsRobomakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Environment extends StObject {
  
  /**
    * The Docker image URI for either your robot or simulation applications.
    */
  var uri: js.UndefOr[RepositoryUrl] = js.undefined
}
object Environment {
  
  inline def apply(): Environment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Environment]
  }
  
  extension [Self <: Environment](x: Self) {
    
    inline def setUri(value: RepositoryUrl): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    
    inline def setUriUndefined: Self = StObject.set(x, "uri", js.undefined)
  }
}
