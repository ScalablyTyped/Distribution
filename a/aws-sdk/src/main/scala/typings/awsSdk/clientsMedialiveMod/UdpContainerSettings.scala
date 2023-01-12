package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UdpContainerSettings extends StObject {
  
  var M2tsSettings: js.UndefOr[typings.awsSdk.clientsMedialiveMod.M2tsSettings] = js.undefined
}
object UdpContainerSettings {
  
  inline def apply(): UdpContainerSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UdpContainerSettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UdpContainerSettings] (val x: Self) extends AnyVal {
    
    inline def setM2tsSettings(value: M2tsSettings): Self = StObject.set(x, "M2tsSettings", value.asInstanceOf[js.Any])
    
    inline def setM2tsSettingsUndefined: Self = StObject.set(x, "M2tsSettings", js.undefined)
  }
}
