package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains a helper method for generating a predominance visualization.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html)
  */
trait predominance extends StObject {
  
  /**
    * Generates a predominance renderer based on a set of competing numeric fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
    */
  def createRenderer(params: predominanceCreateRendererParams): js.Promise[predominanceRendererResult]
}
object predominance {
  
  inline def apply(createRenderer: predominanceCreateRendererParams => js.Promise[predominanceRendererResult]): predominance = {
    val __obj = js.Dynamic.literal(createRenderer = js.Any.fromFunction1(createRenderer))
    __obj.asInstanceOf[predominance]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: predominance] (val x: Self) extends AnyVal {
    
    inline def setCreateRenderer(value: predominanceCreateRendererParams => js.Promise[predominanceRendererResult]): Self = StObject.set(x, "createRenderer", js.Any.fromFunction1(value))
  }
}
