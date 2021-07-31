package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectSymbol3DLayerMaterial
  extends StObject
     with AnonymousAccessor {
  
  /**
    * The fill color of the object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#material)
    */
  var color: js.UndefOr[Color_] = js.undefined
}
object ObjectSymbol3DLayerMaterial {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    set: (js.UndefOr[
      js.Function2[/* propertyName */ String, /* value */ js.Any, ObjectSymbol3DLayerMaterial]
    ]) & (js.UndefOr[js.Function1[/* props */ HashMap[js.Any], ObjectSymbol3DLayerMaterial]])
  ): ObjectSymbol3DLayerMaterial = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectSymbol3DLayerMaterial]
  }
  
  @scala.inline
  implicit class ObjectSymbol3DLayerMaterialMutableBuilder[Self <: ObjectSymbol3DLayerMaterial] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
