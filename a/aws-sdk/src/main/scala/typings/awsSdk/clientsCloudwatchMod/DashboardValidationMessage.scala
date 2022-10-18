package typings.awsSdk.clientsCloudwatchMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DashboardValidationMessage extends StObject {
  
  /**
    * The data path related to the message.
    */
  var DataPath: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.DataPath] = js.undefined
  
  /**
    * A message describing the error or warning.
    */
  var Message: js.UndefOr[typings.awsSdk.clientsCloudwatchMod.Message] = js.undefined
}
object DashboardValidationMessage {
  
  inline def apply(): DashboardValidationMessage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DashboardValidationMessage]
  }
  
  extension [Self <: DashboardValidationMessage](x: Self) {
    
    inline def setDataPath(value: DataPath): Self = StObject.set(x, "DataPath", value.asInstanceOf[js.Any])
    
    inline def setDataPathUndefined: Self = StObject.set(x, "DataPath", js.undefined)
    
    inline def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
  }
}
