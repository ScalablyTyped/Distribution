package typings.arcgisJsApi.esri

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
  
  inline def apply(): LineCallout3DBorder = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineCallout3DBorder]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineCallout3DBorder] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
  }
}
