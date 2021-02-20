package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelSymbol3DVerticalOffsetProperties extends Object {
  
  /**
    * The maximum vertical symbol offset in world units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#verticalOffset)
    */
  var maxWorldLength: js.UndefOr[Double] = js.native
  
  /**
    * The minimum vertical symbol offset in world units.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#verticalOffset)
    */
  var minWorldLength: js.UndefOr[Double] = js.native
  
  /**
    * The vertical symbol offset in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LabelSymbol3D.html#verticalOffset)
    */
  var screenLength: js.UndefOr[Double] = js.native
}
object LabelSymbol3DVerticalOffsetProperties {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): LabelSymbol3DVerticalOffsetProperties = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[LabelSymbol3DVerticalOffsetProperties]
  }
  
  @scala.inline
  implicit class LabelSymbol3DVerticalOffsetPropertiesMutableBuilder[Self <: LabelSymbol3DVerticalOffsetProperties] (val x: Self) extends AnyVal {
    
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
