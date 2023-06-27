package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JSONSupport extends StObject {
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  def toJSON(): Any
}
object JSONSupport {
  
  inline def apply(toJSON: () => Any): JSONSupport = {
    val __obj = js.Dynamic.literal(toJSON = js.Any.fromFunction0(toJSON))
    __obj.asInstanceOf[JSONSupport]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: JSONSupport] (val x: Self) extends AnyVal {
    
    inline def setToJSON(value: () => Any): Self = StObject.set(x, "toJSON", js.Any.fromFunction0(value))
  }
}
