package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelModerator extends StObject {
  
  /**
    * The ARN of the moderator's channel.
    */
  var ChannelArn: js.UndefOr[ChimeArn] = js.undefined
  
  /**
    * The member who created the moderator.
    */
  var CreatedBy: js.UndefOr[Identity] = js.undefined
  
  /**
    * The time at which the moderator was created.
    */
  var CreatedTimestamp: js.UndefOr[Timestamp] = js.undefined
  
  /**
    * The moderator's data.
    */
  var Moderator: js.UndefOr[Identity] = js.undefined
}
object ChannelModerator {
  
  inline def apply(): ChannelModerator = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelModerator]
  }
  
  extension [Self <: ChannelModerator](x: Self) {
    
    inline def setChannelArn(value: ChimeArn): Self = StObject.set(x, "ChannelArn", value.asInstanceOf[js.Any])
    
    inline def setChannelArnUndefined: Self = StObject.set(x, "ChannelArn", js.undefined)
    
    inline def setCreatedBy(value: Identity): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreatedByUndefined: Self = StObject.set(x, "CreatedBy", js.undefined)
    
    inline def setCreatedTimestamp(value: Timestamp): Self = StObject.set(x, "CreatedTimestamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimestampUndefined: Self = StObject.set(x, "CreatedTimestamp", js.undefined)
    
    inline def setModerator(value: Identity): Self = StObject.set(x, "Moderator", value.asInstanceOf[js.Any])
    
    inline def setModeratorUndefined: Self = StObject.set(x, "Moderator", js.undefined)
  }
}
