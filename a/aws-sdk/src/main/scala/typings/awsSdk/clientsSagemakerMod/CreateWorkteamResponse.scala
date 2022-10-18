package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateWorkteamResponse extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the work team. You can use this ARN to identify the work team.
    */
  var WorkteamArn: js.UndefOr[typings.awsSdk.clientsSagemakerMod.WorkteamArn] = js.undefined
}
object CreateWorkteamResponse {
  
  inline def apply(): CreateWorkteamResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWorkteamResponse]
  }
  
  extension [Self <: CreateWorkteamResponse](x: Self) {
    
    inline def setWorkteamArn(value: WorkteamArn): Self = StObject.set(x, "WorkteamArn", value.asInstanceOf[js.Any])
    
    inline def setWorkteamArnUndefined: Self = StObject.set(x, "WorkteamArn", js.undefined)
  }
}
