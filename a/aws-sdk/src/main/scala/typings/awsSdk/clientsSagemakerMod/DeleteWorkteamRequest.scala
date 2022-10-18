package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteWorkteamRequest extends StObject {
  
  /**
    * The name of the work team to delete.
    */
  var WorkteamName: typings.awsSdk.clientsSagemakerMod.WorkteamName
}
object DeleteWorkteamRequest {
  
  inline def apply(WorkteamName: WorkteamName): DeleteWorkteamRequest = {
    val __obj = js.Dynamic.literal(WorkteamName = WorkteamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkteamRequest]
  }
  
  extension [Self <: DeleteWorkteamRequest](x: Self) {
    
    inline def setWorkteamName(value: WorkteamName): Self = StObject.set(x, "WorkteamName", value.asInstanceOf[js.Any])
  }
}
