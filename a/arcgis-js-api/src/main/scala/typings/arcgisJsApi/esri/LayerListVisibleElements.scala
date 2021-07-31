package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerListVisibleElements
  extends StObject
     with Object {
  
  /**
    * Indicates whether to the status indicators will be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#VisibleElements)
    */
  var statusIndicators: js.UndefOr[Boolean] = js.undefined
}
object LayerListVisibleElements {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): LayerListVisibleElements = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[LayerListVisibleElements]
  }
  
  @scala.inline
  implicit class LayerListVisibleElementsMutableBuilder[Self <: LayerListVisibleElements] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatusIndicators(value: Boolean): Self = StObject.set(x, "statusIndicators", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusIndicatorsUndefined: Self = StObject.set(x, "statusIndicators", js.undefined)
  }
}
