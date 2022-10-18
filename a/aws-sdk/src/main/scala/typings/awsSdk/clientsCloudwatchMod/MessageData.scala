package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MessageData extends StObject {
  
  /**
    * The error code or status code associated with the message.
    */
  var Code: js.UndefOr[MessageDataCode] = js.undefined
  
  /**
    * The message text.
    */
  var Value: js.UndefOr[MessageDataValue] = js.undefined
}
object MessageData {
  
  inline def apply(): MessageData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MessageData]
  }
  
  extension [Self <: MessageData](x: Self) {
    
    inline def setCode(value: MessageDataCode): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setValue(value: MessageDataValue): Self = StObject.set(x, "Value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "Value", js.undefined)
  }
}
