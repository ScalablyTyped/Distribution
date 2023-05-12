package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailConfiguration extends StObject {
  
  /**
    * Controls how SCTE-35 messages create cues. Splice Insert mode treats all segmentation signals traditionally. With Time Signal APOS mode only Time Signal Placement Opportunity and Break messages create segment breaks. With ESAM mode, signals are forwarded to an ESAM server for possible update.
    */
  var AvailSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.AvailSettings] = js.undefined
}
object AvailConfiguration {
  
  inline def apply(): AvailConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AvailConfiguration] (val x: Self) extends AnyVal {
    
    inline def setAvailSettings(value: AvailSettings): Self = StObject.set(x, "AvailSettings", value.asInstanceOf[js.Any])
    
    inline def setAvailSettingsUndefined: Self = StObject.set(x, "AvailSettings", js.undefined)
  }
}
