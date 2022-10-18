package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputSwitchScheduleActionSettings extends StObject {
  
  /**
    * The name of the input attachment (not the name of the input!) to switch to. The name is specified in the channel configuration.
    */
  var InputAttachmentNameReference: string
  
  /**
    * Settings to let you create a clip of the file input, in order to set up the input to ingest only a portion of the file.
    */
  var InputClippingSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.InputClippingSettings] = js.undefined
  
  /**
    * The value for the variable portion of the URL for the dynamic input, for this instance of the input. Each time you use the same dynamic input in an input switch action, you can provide a different value, in order to connect the input to a different content source.
    */
  var UrlPath: js.UndefOr[listOfString] = js.undefined
}
object InputSwitchScheduleActionSettings {
  
  inline def apply(InputAttachmentNameReference: string): InputSwitchScheduleActionSettings = {
    val __obj = js.Dynamic.literal(InputAttachmentNameReference = InputAttachmentNameReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputSwitchScheduleActionSettings]
  }
  
  extension [Self <: InputSwitchScheduleActionSettings](x: Self) {
    
    inline def setInputAttachmentNameReference(value: string): Self = StObject.set(x, "InputAttachmentNameReference", value.asInstanceOf[js.Any])
    
    inline def setInputClippingSettings(value: InputClippingSettings): Self = StObject.set(x, "InputClippingSettings", value.asInstanceOf[js.Any])
    
    inline def setInputClippingSettingsUndefined: Self = StObject.set(x, "InputClippingSettings", js.undefined)
    
    inline def setUrlPath(value: listOfString): Self = StObject.set(x, "UrlPath", value.asInstanceOf[js.Any])
    
    inline def setUrlPathUndefined: Self = StObject.set(x, "UrlPath", js.undefined)
    
    inline def setUrlPathVarargs(value: string*): Self = StObject.set(x, "UrlPath", js.Array(value*))
  }
}
