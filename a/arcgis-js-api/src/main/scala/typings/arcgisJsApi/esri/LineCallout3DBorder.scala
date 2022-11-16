package typings.arcgisJsApi.esri

import typings.arcgisJsApi.HashMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineCallout3DBorder
  extends StObject
     with AnonymousAccessor {
  
  /**
    * The color of the callout line border.
    *
    * @default white
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html#border)
    */
  var color: js.UndefOr[Color_] = js.undefined
}
object LineCallout3DBorder {
  
  inline def apply(
    set: (js.UndefOr[js.Function2[/* propertyName */ String, /* value */ Any, LineCallout3DBorder]]) & (js.UndefOr[js.Function1[/* props */ HashMap[Any], LineCallout3DBorder]])
  ): LineCallout3DBorder = {
    val __obj = js.Dynamic.literal(set = set.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineCallout3DBorder]
  }
  
  extension [Self <: LineCallout3DBorder](x: Self) {
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
