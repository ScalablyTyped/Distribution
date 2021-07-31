package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait supportJsonUtils extends StObject {
  
  /**
    * Creates a new instance of an appropriate [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) class and initializes it with values from a JSON object generated from a product in the ArcGIS platform.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-support-jsonUtils.html#fromJSON)
    */
  def fromJSON(json: js.Any): Renderer
}
object supportJsonUtils {
  
  @scala.inline
  def apply(fromJSON: js.Any => Renderer): supportJsonUtils = {
    val __obj = js.Dynamic.literal(fromJSON = js.Any.fromFunction1(fromJSON))
    __obj.asInstanceOf[supportJsonUtils]
  }
  
  @scala.inline
  implicit class supportJsonUtilsMutableBuilder[Self <: supportJsonUtils] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFromJSON(value: js.Any => Renderer): Self = StObject.set(x, "fromJSON", js.Any.fromFunction1(value))
  }
}
