package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectSymbol3DLayerResource
  extends StObject
     with Object {
  
  /**
    * The URL to the 3D model in [glTF format](https://www.khronos.org/gltf/).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#resource)
    */
  var href: js.UndefOr[String] = js.undefined
  
  /**
    * Uses a built-in shape.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-ObjectSymbol3DLayer.html#resource)
    */
  var primitive: js.UndefOr[String] = js.undefined
}
object ObjectSymbol3DLayerResource {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): ObjectSymbol3DLayerResource = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[ObjectSymbol3DLayerResource]
  }
  
  @scala.inline
  implicit class ObjectSymbol3DLayerResourceMutableBuilder[Self <: ObjectSymbol3DLayerResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
    
    @scala.inline
    def setPrimitive(value: String): Self = StObject.set(x, "primitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrimitiveUndefined: Self = StObject.set(x, "primitive", js.undefined)
  }
}
