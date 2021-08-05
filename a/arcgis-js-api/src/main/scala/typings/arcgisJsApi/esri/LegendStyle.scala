package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`side-by-side`
import typings.arcgisJsApi.arcgisJsApiStrings.auto
import typings.arcgisJsApi.arcgisJsApiStrings.card
import typings.arcgisJsApi.arcgisJsApiStrings.classic
import typings.arcgisJsApi.arcgisJsApiStrings.stack
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendStyle
  extends StObject
     with Object {
  
  /**
    * When a `card` type is specified, you can specify one of the following layout options.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#style)
    */
  var layout: js.UndefOr[auto | `side-by-side` | stack] = js.undefined
  
  /**
    * Specifies the style of the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#style)
    */
  var `type`: classic | card
}
object LegendStyle {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: classic | card
  ): LegendStyle = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendStyle]
  }
  
  extension [Self <: LegendStyle](x: Self) {
    
    inline def setLayout(value: auto | `side-by-side` | stack): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setType(value: classic | card): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
