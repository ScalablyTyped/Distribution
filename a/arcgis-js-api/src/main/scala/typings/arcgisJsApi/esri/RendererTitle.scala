package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RendererTitle
  extends StObject
     with Object {
  
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
  
  @scala.inline
  def apply(
    constructor: js.Function,
    field: String,
    hasOwnProperty: PropertyKey => Boolean,
    normByPct: Boolean,
    normField: String,
    propertyIsEnumerable: PropertyKey => Boolean
  ): RendererTitle = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), normByPct = normByPct.asInstanceOf[js.Any], normField = normField.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[RendererTitle]
  }
  
  @scala.inline
  implicit class RendererTitleMutableBuilder[Self <: RendererTitle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormByPct(value: Boolean): Self = StObject.set(x, "normByPct", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNormField(value: String): Self = StObject.set(x, "normField", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
