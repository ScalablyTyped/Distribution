package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointSymbol3DVerticalOffsetProperties
  extends StObject
     with Object {
  
  /**
    * The maximum vertical symbol offset in world units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html#verticalOffset)
    */
  var maxWorldLength: js.UndefOr[Double] = js.undefined
  
  /**
    * The minimum vertical symbol offset in world units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html#verticalOffset)
    */
  var minWorldLength: js.UndefOr[Double] = js.undefined
  
  /**
    * The vertical symbol offset in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-PointSymbol3D.html#verticalOffset)
    */
  var screenLength: js.UndefOr[Double] = js.undefined
}
object PointSymbol3DVerticalOffsetProperties {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): PointSymbol3DVerticalOffsetProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[PointSymbol3DVerticalOffsetProperties]
  }
  
  @scala.inline
  implicit class PointSymbol3DVerticalOffsetPropertiesMutableBuilder[Self <: PointSymbol3DVerticalOffsetProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxWorldLength(value: Double): Self = StObject.set(x, "maxWorldLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxWorldLengthUndefined: Self = StObject.set(x, "maxWorldLength", js.undefined)
    
    @scala.inline
    def setMinWorldLength(value: Double): Self = StObject.set(x, "minWorldLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinWorldLengthUndefined: Self = StObject.set(x, "minWorldLength", js.undefined)
    
    @scala.inline
    def setScreenLength(value: Double): Self = StObject.set(x, "screenLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenLengthUndefined: Self = StObject.set(x, "screenLength", js.undefined)
  }
}
