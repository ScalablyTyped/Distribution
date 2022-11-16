package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalFetchSettingsOptions extends StObject {
  
  /**
    * Signal object that can be used to abort the asynchronous task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-Portal.html#fetchSettings)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object PortalFetchSettingsOptions {
  
  inline def apply(): PortalFetchSettingsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalFetchSettingsOptions]
  }
  
  extension [Self <: PortalFetchSettingsOptions](x: Self) {
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
