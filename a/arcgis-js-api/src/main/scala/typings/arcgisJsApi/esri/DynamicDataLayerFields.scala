package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DynamicDataLayerFields extends StObject {
  
  /**
  		 * The alias of the field.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicDataLayer)
  		 */
  var alias: String
  
  /**
  		 * The name of the field.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicDataLayer)
  		 */
  var name: String
}
object DynamicDataLayerFields {
  
  inline def apply(alias: String, name: String): DynamicDataLayerFields = {
    val __obj = js.Dynamic.literal(alias = alias.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicDataLayerFields]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DynamicDataLayerFields] (val x: Self) extends AnyVal {
    
    inline def setAlias(value: String): Self = StObject.set(x, "alias", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
