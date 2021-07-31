package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait typeUniqueValueInfo
  extends StObject
     with Object {
  
  /**
    * The number of features with the given `value` (or belonging to the given category).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#UniqueValueInfo)
    */
  var count: Double
  
  /**
    * The label describing the value or category in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#UniqueValueInfo)
    */
  var label: String
  
  /**
    * The symbol used to represent features belonging to the given category.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#UniqueValueInfo)
    */
  var symbol: Symbol
  
  /**
    * A unique value representing a type or category of features in a layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#UniqueValueInfo)
    */
  var value: String | Double
}
object typeUniqueValueInfo {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    count: Double,
    hasOwnProperty: PropertyKey => Boolean,
    label: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    symbol: Symbol,
    value: String | Double
  ): typeUniqueValueInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), label = label.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), symbol = symbol.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[typeUniqueValueInfo]
  }
  
  @scala.inline
  implicit class typeUniqueValueInfoMutableBuilder[Self <: typeUniqueValueInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbol(value: Symbol): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
