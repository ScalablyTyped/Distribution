package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelModeratorSummary extends StObject {
  
  /**
    * The data for a moderator.
    */
  var Moderator: js.UndefOr[Identity] = js.undefined
}
object ChannelModeratorSummary {
  
  inline def apply(): ChannelModeratorSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelModeratorSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChannelModeratorSummary] (val x: Self) extends AnyVal {
    
    inline def setModerator(value: Identity): Self = StObject.set(x, "Moderator", value.asInstanceOf[js.Any])
    
    inline def setModeratorUndefined: Self = StObject.set(x, "Moderator", js.undefined)
  }
}
