package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`private`
import typings.arcgisJsApi.arcgisJsApiStrings.inherit
import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalItemAddResourceOptions extends StObject {
  
  /**
    * Indicates the level of access to the resource.
    *
    * @default "inherit"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#addResource)
    */
  var access: js.UndefOr[inherit | `private`] = js.undefined
  
  /**
    * Signal object that can be used to abort the asynchronous task.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#addResource)
    */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object PortalItemAddResourceOptions {
  
  inline def apply(): PortalItemAddResourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalItemAddResourceOptions]
  }
  
  extension [Self <: PortalItemAddResourceOptions](x: Self) {
    
    inline def setAccess(value: inherit | `private`): Self = StObject.set(x, "access", value.asInstanceOf[js.Any])
    
    inline def setAccessUndefined: Self = StObject.set(x, "access", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
