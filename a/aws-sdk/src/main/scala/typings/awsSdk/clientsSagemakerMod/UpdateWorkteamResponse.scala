package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateWorkteamResponse extends StObject {
  
  /**
    * A Workteam object that describes the updated work team.
    */
  var Workteam: typings.awsSdk.clientsSagemakerMod.Workteam
}
object UpdateWorkteamResponse {
  
  inline def apply(Workteam: Workteam): UpdateWorkteamResponse = {
    val __obj = js.Dynamic.literal(Workteam = Workteam.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateWorkteamResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateWorkteamResponse] (val x: Self) extends AnyVal {
    
    inline def setWorkteam(value: Workteam): Self = StObject.set(x, "Workteam", value.asInstanceOf[js.Any])
  }
}
