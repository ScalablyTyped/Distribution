package typings.awsSdk.clientsChimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChannelMessageStatusStructure extends StObject {
  
  /**
    * Contains more details about the messasge status.
    */
  var Detail: js.UndefOr[StatusDetail] = js.undefined
  
  /**
    * The message status value.
    */
  var Value: js.UndefOr[ChannelMessageStatus] = js.undefined
}
object ChannelMessageStatusStructure {
  
  inline def apply(): ChannelMessageStatusStructure = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChannelMessageStatusStructure]
  }
  
  extension [Self <: ChannelMessageStatusStructure](x: Self) {
    
    inline def setDetail(value: StatusDetail): Self = StObject.set(x, "Detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "Detail", js.undefined)
    
    inline def setValue(value: ChannelMessageStatus): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
