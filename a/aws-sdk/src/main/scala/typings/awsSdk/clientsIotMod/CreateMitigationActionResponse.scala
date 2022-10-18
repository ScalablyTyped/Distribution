package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMitigationActionResponse extends StObject {
  
  /**
    * The ARN for the new mitigation action.
    */
  var actionArn: js.UndefOr[MitigationActionArn] = js.undefined
  
  /**
    * A unique identifier for the new mitigation action.
    */
  var actionId: js.UndefOr[MitigationActionId] = js.undefined
}
object CreateMitigationActionResponse {
  
  inline def apply(): CreateMitigationActionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateMitigationActionResponse]
  }
  
  extension [Self <: CreateMitigationActionResponse](x: Self) {
    
    inline def setActionArn(value: MitigationActionArn): Self = StObject.set(x, "actionArn", value.asInstanceOf[js.Any])
    
    inline def setActionArnUndefined: Self = StObject.set(x, "actionArn", js.undefined)
    
    inline def setActionId(value: MitigationActionId): Self = StObject.set(x, "actionId", value.asInstanceOf[js.Any])
    
    inline def setActionIdUndefined: Self = StObject.set(x, "actionId", js.undefined)
  }
}
