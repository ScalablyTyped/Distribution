package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`bottom-leading`
import typings.arcgisJsApi.arcgisJsApiStrings.`bottom-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`bottom-right`
import typings.arcgisJsApi.arcgisJsApiStrings.`bottom-trailing`
import typings.arcgisJsApi.arcgisJsApiStrings.`top-leading`
import typings.arcgisJsApi.arcgisJsApiStrings.`top-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`top-right`
import typings.arcgisJsApi.arcgisJsApiStrings.`top-trailing`
import typings.arcgisJsApi.arcgisJsApiStrings.manual
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UIMovePosition extends StObject {
  
  /**
    * The placement index of the component(s).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#move)
    */
  var index: js.UndefOr[Double] = js.undefined
  
  /**
    * The position in the view at which to add the component.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-ui-UI.html#move)
    */
  var position: js.UndefOr[
    `bottom-leading` | `bottom-left` | `bottom-right` | `bottom-trailing` | `top-leading` | `top-left` | `top-right` | `top-trailing` | manual
  ] = js.undefined
}
object UIMovePosition {
  
  inline def apply(): UIMovePosition = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UIMovePosition]
  }
  
  extension [Self <: UIMovePosition](x: Self) {
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
    
    inline def setPosition(
      value: `bottom-leading` | `bottom-left` | `bottom-right` | `bottom-trailing` | `top-leading` | `top-left` | `top-right` | `top-trailing` | manual
    ): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
  }
}
