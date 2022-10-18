package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcceptEnvironmentAccountConnectionInput extends StObject {
  
  /**
    * The ID of the environment account connection.
    */
  var id: EnvironmentAccountConnectionId
}
object AcceptEnvironmentAccountConnectionInput {
  
  inline def apply(id: EnvironmentAccountConnectionId): AcceptEnvironmentAccountConnectionInput = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcceptEnvironmentAccountConnectionInput]
  }
  
  extension [Self <: AcceptEnvironmentAccountConnectionInput](x: Self) {
    
    inline def setId(value: EnvironmentAccountConnectionId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
