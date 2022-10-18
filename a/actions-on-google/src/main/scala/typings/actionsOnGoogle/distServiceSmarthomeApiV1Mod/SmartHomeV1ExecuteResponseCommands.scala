package typings.actionsOnGoogle.distServiceSmarthomeApiV1Mod

import typings.actionsOnGoogle.anon.TypeChallengeType
import typings.actionsOnGoogle.distCommonMod.ApiClientObjectMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SmartHomeV1ExecuteResponseCommands extends StObject {
  
  var challengeNeeded: js.UndefOr[TypeChallengeType] = js.undefined
  
  var debugString: js.UndefOr[String] = js.undefined
  
  var errorCode: js.UndefOr[SmartHomeV1ExecuteErrors] = js.undefined
  
  var ids: js.Array[String]
  
  var states: js.UndefOr[ApiClientObjectMap[Any]] = js.undefined
  
  var status: SmartHomeV1ExecuteStatus
}
object SmartHomeV1ExecuteResponseCommands {
  
  inline def apply(ids: js.Array[String], status: SmartHomeV1ExecuteStatus): SmartHomeV1ExecuteResponseCommands = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ExecuteResponseCommands]
  }
  
  extension [Self <: SmartHomeV1ExecuteResponseCommands](x: Self) {
    
    inline def setChallengeNeeded(value: TypeChallengeType): Self = StObject.set(x, "challengeNeeded", value.asInstanceOf[js.Any])
    
    inline def setChallengeNeededUndefined: Self = StObject.set(x, "challengeNeeded", js.undefined)
    
    inline def setDebugString(value: String): Self = StObject.set(x, "debugString", value.asInstanceOf[js.Any])
    
    inline def setDebugStringUndefined: Self = StObject.set(x, "debugString", js.undefined)
    
    inline def setErrorCode(value: SmartHomeV1ExecuteErrors): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
    
    inline def setIds(value: js.Array[String]): Self = StObject.set(x, "ids", value.asInstanceOf[js.Any])
    
    inline def setIdsVarargs(value: String*): Self = StObject.set(x, "ids", js.Array(value*))
    
    inline def setStates(value: ApiClientObjectMap[Any]): Self = StObject.set(x, "states", value.asInstanceOf[js.Any])
    
    inline def setStatesUndefined: Self = StObject.set(x, "states", js.undefined)
    
    inline def setStatus(value: SmartHomeV1ExecuteStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
