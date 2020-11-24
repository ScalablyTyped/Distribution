package typings.actionsOnGoogle.apiV1Mod

import typings.actionsOnGoogle.anon.TypeChallengeType
import typings.actionsOnGoogle.commonMod.ApiClientObjectMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SmartHomeV1ExecuteResponseCommands extends js.Object {
  
  var challengeNeeded: js.UndefOr[TypeChallengeType] = js.native
  
  var debugString: js.UndefOr[String] = js.native
  
  var errorCode: js.UndefOr[SmartHomeV1ExecuteErrors] = js.native
  
  var ids: js.Array[String] = js.native
  
  var states: js.UndefOr[ApiClientObjectMap[_]] = js.native
  
  var status: SmartHomeV1ExecuteStatus = js.native
}
object SmartHomeV1ExecuteResponseCommands {
  
  @scala.inline
  def apply(ids: js.Array[String], status: SmartHomeV1ExecuteStatus): SmartHomeV1ExecuteResponseCommands = {
    val __obj = js.Dynamic.literal(ids = ids.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartHomeV1ExecuteResponseCommands]
  }
  
  @scala.inline
  implicit class SmartHomeV1ExecuteResponseCommandsOps[Self <: SmartHomeV1ExecuteResponseCommands] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIdsVarargs(value: String*): Self = this.set("ids", js.Array(value :_*))
    
    @scala.inline
    def setIds(value: js.Array[String]): Self = this.set("ids", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: SmartHomeV1ExecuteStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChallengeNeeded(value: TypeChallengeType): Self = this.set("challengeNeeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChallengeNeeded: Self = this.set("challengeNeeded", js.undefined)
    
    @scala.inline
    def setDebugString(value: String): Self = this.set("debugString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebugString: Self = this.set("debugString", js.undefined)
    
    @scala.inline
    def setErrorCode(value: SmartHomeV1ExecuteErrors): Self = this.set("errorCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorCode: Self = this.set("errorCode", js.undefined)
    
    @scala.inline
    def setStates(value: ApiClientObjectMap[_]): Self = this.set("states", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStates: Self = this.set("states", js.undefined)
  }
}
