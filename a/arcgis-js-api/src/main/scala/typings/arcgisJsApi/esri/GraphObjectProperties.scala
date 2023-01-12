package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GraphObjectProperties extends StObject {
  
  /**
    * The properties of the graph object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-GraphObject.html#properties)
    */
  var properties: js.UndefOr[Any] = js.undefined
}
object GraphObjectProperties {
  
  inline def apply(): GraphObjectProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GraphObjectProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GraphObjectProperties] (val x: Self) extends AnyVal {
    
    inline def setProperties(value: Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
  }
}
