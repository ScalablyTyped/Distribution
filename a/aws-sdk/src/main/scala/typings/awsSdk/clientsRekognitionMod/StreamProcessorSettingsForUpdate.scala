package typings.awsSdk.clientsRekognitionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamProcessorSettingsForUpdate extends StObject {
  
  /**
    *  The label detection settings you want to use for your stream processor. 
    */
  var ConnectedHomeForUpdate: js.UndefOr[ConnectedHomeSettingsForUpdate] = js.undefined
}
object StreamProcessorSettingsForUpdate {
  
  inline def apply(): StreamProcessorSettingsForUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StreamProcessorSettingsForUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StreamProcessorSettingsForUpdate] (val x: Self) extends AnyVal {
    
    inline def setConnectedHomeForUpdate(value: ConnectedHomeSettingsForUpdate): Self = StObject.set(x, "ConnectedHomeForUpdate", value.asInstanceOf[js.Any])
    
    inline def setConnectedHomeForUpdateUndefined: Self = StObject.set(x, "ConnectedHomeForUpdate", js.undefined)
  }
}
