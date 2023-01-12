package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RendererTitle extends StObject {
  
  /**
    * The field name used in the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RendererTitle)
    */
  var field: String
  
  /**
    * Indicates if a percentage is used in the normalization of the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RendererTitle)
    */
  var normByPct: Boolean
  
  /**
    * If a normalization field is provided to the renderer, this field is also used in the generated title for the renderer in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RendererTitle)
    */
  var normField: String
  
  /**
    * The title of the renderer as displayed in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RendererTitle)
    */
  var title: js.UndefOr[String] = js.undefined
}
object RendererTitle {
  
  inline def apply(field: String, normByPct: Boolean, normField: String): RendererTitle = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], normByPct = normByPct.asInstanceOf[js.Any], normField = normField.asInstanceOf[js.Any])
    __obj.asInstanceOf[RendererTitle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RendererTitle] (val x: Self) extends AnyVal {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setNormByPct(value: Boolean): Self = StObject.set(x, "normByPct", value.asInstanceOf[js.Any])
    
    inline def setNormField(value: String): Self = StObject.set(x, "normField", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
