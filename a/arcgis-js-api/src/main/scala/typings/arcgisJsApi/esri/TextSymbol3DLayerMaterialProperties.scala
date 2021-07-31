package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextSymbol3DLayerMaterialProperties
  extends StObject
     with Object {
  
  /**
    * The color of the text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-TextSymbol3DLayer.html#material)
    */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
}
object TextSymbol3DLayerMaterialProperties {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): TextSymbol3DLayerMaterialProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[TextSymbol3DLayerMaterialProperties]
  }
  
  @scala.inline
  implicit class TextSymbol3DLayerMaterialPropertiesMutableBuilder[Self <: TextSymbol3DLayerMaterialProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    @scala.inline
    def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value :_*))
  }
}
