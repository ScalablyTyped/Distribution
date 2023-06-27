package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalItemFetchDataOptions extends StObject {
  
  /**
  		 * Signal object that can be used to abort the asynchronous task.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#fetchData)
  		 */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object PortalItemFetchDataOptions {
  
  inline def apply(): PortalItemFetchDataOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalItemFetchDataOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PortalItemFetchDataOptions] (val x: Self) extends AnyVal {
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
