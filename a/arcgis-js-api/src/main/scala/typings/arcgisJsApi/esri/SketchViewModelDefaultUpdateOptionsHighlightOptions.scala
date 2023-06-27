package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SketchViewModelDefaultUpdateOptionsHighlightOptions extends StObject {
  
  /**
  		 * Indicates if highlighting is enabled for update operations.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch-SketchViewModel.html#defaultUpdateOptions)
  		 */
  var enabled: js.UndefOr[Boolean] = js.undefined
}
object SketchViewModelDefaultUpdateOptionsHighlightOptions {
  
  inline def apply(): SketchViewModelDefaultUpdateOptionsHighlightOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SketchViewModelDefaultUpdateOptionsHighlightOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SketchViewModelDefaultUpdateOptionsHighlightOptions] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
  }
}
