package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`side-by-side`
import typings.arcgisJsApi.arcgisJsApiStrings.auto
import typings.arcgisJsApi.arcgisJsApiStrings.card
import typings.arcgisJsApi.arcgisJsApiStrings.classic
import typings.arcgisJsApi.arcgisJsApiStrings.stack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendStyle extends StObject {
  
  /**
    * When a `card` type is specified, you can specify one of the following layout options.
    *
    * @default stack
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
  
  inline def apply(`type`: classic | card): LegendStyle = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendStyle]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LegendStyle] (val x: Self) extends AnyVal {
    
    inline def setLayout(value: auto | `side-by-side` | stack): Self = StObject.set(x, "layout", value.asInstanceOf[js.Any])
    
    inline def setLayoutUndefined: Self = StObject.set(x, "layout", js.undefined)
    
    inline def setType(value: classic | card): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
