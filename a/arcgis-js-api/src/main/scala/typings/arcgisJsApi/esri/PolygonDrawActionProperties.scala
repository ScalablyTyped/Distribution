package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.click
import typings.arcgisJsApi.arcgisJsApiStrings.freehand
import typings.arcgisJsApi.arcgisJsApiStrings.hybrid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PolygonDrawActionProperties
  extends StObject
     with DrawActionProperties {
  
  /**
  		 * The drawing mode.
  		 *
  		 * @default hybrid
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-draw-PolygonDrawAction.html#mode)
  		 */
  var mode: js.UndefOr[hybrid | freehand | click] = js.undefined
}
object PolygonDrawActionProperties {
  
  inline def apply(): PolygonDrawActionProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PolygonDrawActionProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PolygonDrawActionProperties] (val x: Self) extends AnyVal {
    
    inline def setMode(value: hybrid | freehand | click): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
  }
}
