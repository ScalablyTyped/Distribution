package typings.awsSdk.chimesdkmessagingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetChannelMessageStatusResponse extends StObject {
  
  /**
    * The message status and details.
    */
  var Status: js.UndefOr[ChannelMessageStatusStructure] = js.undefined
}
object GetChannelMessageStatusResponse {
  
  inline def apply(): GetChannelMessageStatusResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetChannelMessageStatusResponse]
  }
  
  extension [Self <: GetChannelMessageStatusResponse](x: Self) {
    
    inline def setStatus(value: ChannelMessageStatusStructure): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
