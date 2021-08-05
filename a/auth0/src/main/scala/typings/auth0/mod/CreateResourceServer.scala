package typings.auth0.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateResourceServer
  extends StObject
     with ResourceServer {
  
  /**
    * The identifier of the client.
    */
  @JSName("identifier")
  var identifier_CreateResourceServer: String
}
object CreateResourceServer {
  
  inline def apply(identifier: String): CreateResourceServer = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResourceServer]
  }
  
  extension [Self <: CreateResourceServer](x: Self) {
    
    inline def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
  }
}
