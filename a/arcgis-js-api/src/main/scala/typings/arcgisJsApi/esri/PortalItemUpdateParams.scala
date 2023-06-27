package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalItemUpdateParams extends StObject {
  
  /**
  		 * **Optional**.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html#update)
  		 */
  var data: js.UndefOr[String | Any] = js.undefined
}
object PortalItemUpdateParams {
  
  inline def apply(): PortalItemUpdateParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortalItemUpdateParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PortalItemUpdateParams] (val x: Self) extends AnyVal {
    
    inline def setData(value: String | Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
  }
}
