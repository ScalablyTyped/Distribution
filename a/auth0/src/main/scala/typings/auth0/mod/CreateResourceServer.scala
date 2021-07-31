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
  
  @scala.inline
  def apply(identifier: String): CreateResourceServer = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateResourceServer]
  }
  
  @scala.inline
  implicit class CreateResourceServerMutableBuilder[Self <: CreateResourceServer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIdentifier(value: String): Self = StObject.set(x, "identifier", value.asInstanceOf[js.Any])
  }
}
