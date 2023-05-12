package typings.awsSdk.clientsConnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChatParticipantRoleConfig extends StObject {
  
  /**
    * A list of participant timers. You can specify any unique combination of role and timer type. Duplicate entries error out the request with a 400.
    */
  var ParticipantTimerConfigList: typings.awsSdk.clientsConnectMod.ParticipantTimerConfigList
}
object ChatParticipantRoleConfig {
  
  inline def apply(ParticipantTimerConfigList: ParticipantTimerConfigList): ChatParticipantRoleConfig = {
    val __obj = js.Dynamic.literal(ParticipantTimerConfigList = ParticipantTimerConfigList.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChatParticipantRoleConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChatParticipantRoleConfig] (val x: Self) extends AnyVal {
    
    inline def setParticipantTimerConfigList(value: ParticipantTimerConfigList): Self = StObject.set(x, "ParticipantTimerConfigList", value.asInstanceOf[js.Any])
    
    inline def setParticipantTimerConfigListVarargs(value: ParticipantTimerConfiguration*): Self = StObject.set(x, "ParticipantTimerConfigList", js.Array(value*))
  }
}
