package typings.awsSdk.clientsDatabrewMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartProjectSessionResponse extends StObject {
  
  /**
    * A system-generated identifier for the session.
    */
  var ClientSessionId: js.UndefOr[typings.awsSdk.clientsDatabrewMod.ClientSessionId] = js.undefined
  
  /**
    * The name of the project to be acted upon.
    */
  var Name: ProjectName
}
object StartProjectSessionResponse {
  
  inline def apply(Name: ProjectName): StartProjectSessionResponse = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartProjectSessionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StartProjectSessionResponse] (val x: Self) extends AnyVal {
    
    inline def setClientSessionId(value: ClientSessionId): Self = StObject.set(x, "ClientSessionId", value.asInstanceOf[js.Any])
    
    inline def setClientSessionIdUndefined: Self = StObject.set(x, "ClientSessionId", js.undefined)
    
    inline def setName(value: ProjectName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
