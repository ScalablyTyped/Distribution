package typings.awsSdk.clientsChimesdkmediapipelinesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelDefinition extends StObject {
  
  /**
    * The channel ID.
    */
  var ChannelId: typings.awsSdk.clientsChimesdkmediapipelinesMod.ChannelId
  
  /**
    * Specifies whether the audio in a channel belongs to the AGENT or CUSTOMER.
    */
  var ParticipantRole: js.UndefOr[typings.awsSdk.clientsChimesdkmediapipelinesMod.ParticipantRole] = js.undefined
}
object ChannelDefinition {
  
  inline def apply(ChannelId: ChannelId): ChannelDefinition = {
    val __obj = js.Dynamic.literal(ChannelId = ChannelId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelDefinition]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelDefinition] (val x: Self) extends AnyVal {
    
    inline def setChannelId(value: ChannelId): Self = StObject.set(x, "ChannelId", value.asInstanceOf[js.Any])
    
    inline def setParticipantRole(value: ParticipantRole): Self = StObject.set(x, "ParticipantRole", value.asInstanceOf[js.Any])
    
    inline def setParticipantRoleUndefined: Self = StObject.set(x, "ParticipantRole", js.undefined)
  }
}
