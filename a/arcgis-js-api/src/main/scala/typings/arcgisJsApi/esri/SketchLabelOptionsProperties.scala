package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchLabelOptionsProperties extends StObject {
  
  /**
  		 * Whether labels are shown next to each segment of the graphic being sketched.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-interactive-sketch-SketchLabelOptions.html#enabled)
  		 */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object SketchLabelOptionsProperties {
  
  inline def apply(): SketchLabelOptionsProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SketchLabelOptionsProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SketchLabelOptionsProperties] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
