package typings.awsSdk.clientsMediaconvertMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EsamSettings extends StObject {
  
  /**
    * Specifies an ESAM ManifestConfirmConditionNotification XML as per OC-SP-ESAM-API-I03-131025. The transcoder uses the manifest conditioning instructions that you provide in the setting MCC XML (mccXml).
    */
  var ManifestConfirmConditionNotification: js.UndefOr[EsamManifestConfirmConditionNotification] = js.undefined
  
  /**
    * Specifies the stream distance, in milliseconds, between the SCTE 35 messages that the transcoder places and the splice points that they refer to. If the time between the start of the asset and the SCTE-35 message is less than this value, then the transcoder places the SCTE-35 marker at the beginning of the stream.
    */
  var ResponseSignalPreroll: js.UndefOr[integerMin0Max30000] = js.undefined
  
  /**
    * Specifies an ESAM SignalProcessingNotification XML as per OC-SP-ESAM-API-I03-131025. The transcoder uses the signal processing instructions that you provide in the setting SCC XML (sccXml).
    */
  var SignalProcessingNotification: js.UndefOr[EsamSignalProcessingNotification] = js.undefined
}
object EsamSettings {
  
  inline def apply(): EsamSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EsamSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EsamSettings] (val x: Self) extends AnyVal {
    
    inline def setManifestConfirmConditionNotification(value: EsamManifestConfirmConditionNotification): Self = StObject.set(x, "ManifestConfirmConditionNotification", value.asInstanceOf[js.Any])
    
    inline def setManifestConfirmConditionNotificationUndefined: Self = StObject.set(x, "ManifestConfirmConditionNotification", js.undefined)
    
    inline def setResponseSignalPreroll(value: integerMin0Max30000): Self = StObject.set(x, "ResponseSignalPreroll", value.asInstanceOf[js.Any])
    
    inline def setResponseSignalPrerollUndefined: Self = StObject.set(x, "ResponseSignalPreroll", js.undefined)
    
    inline def setSignalProcessingNotification(value: EsamSignalProcessingNotification): Self = StObject.set(x, "SignalProcessingNotification", value.asInstanceOf[js.Any])
    
    inline def setSignalProcessingNotificationUndefined: Self = StObject.set(x, "SignalProcessingNotification", js.undefined)
  }
}
