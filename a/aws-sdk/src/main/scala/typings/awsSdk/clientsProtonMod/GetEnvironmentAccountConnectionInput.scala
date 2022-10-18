package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEnvironmentAccountConnectionInput extends StObject {
  
  /**
    * The ID of the environment account connection that you want to get the detailed data for.
    */
  var id: EnvironmentAccountConnectionId
}
object GetEnvironmentAccountConnectionInput {
  
  inline def apply(id: EnvironmentAccountConnectionId): GetEnvironmentAccountConnectionInput = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEnvironmentAccountConnectionInput]
  }
  
  extension [Self <: GetEnvironmentAccountConnectionInput](x: Self) {
    
    inline def setId(value: EnvironmentAccountConnectionId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
