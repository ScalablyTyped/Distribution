package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AvailConfiguration extends StObject {
  
  /**
    * Ad avail settings.
    */
  var AvailSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.AvailSettings] = js.undefined
}
object AvailConfiguration {
  
  inline def apply(): AvailConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailConfiguration]
  }
  
  extension [Self <: AvailConfiguration](x: Self) {
    
    inline def setAvailSettings(value: AvailSettings): Self = StObject.set(x, "AvailSettings", value.asInstanceOf[js.Any])
    
    inline def setAvailSettingsUndefined: Self = StObject.set(x, "AvailSettings", js.undefined)
  }
}
