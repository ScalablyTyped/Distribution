package typings.awsSdk.clientsPinpointMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CampaignCustomMessage extends StObject {
  
  /**
    * The raw, JSON-formatted string to use as the payload for the message. The maximum size is 5 KB.
    */
  var Data: js.UndefOr[string] = js.undefined
}
object CampaignCustomMessage {
  
  inline def apply(): CampaignCustomMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CampaignCustomMessage]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CampaignCustomMessage] (val x: Self) extends AnyVal {
    
    inline def setData(value: string): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "Data", js.undefined)
  }
}
