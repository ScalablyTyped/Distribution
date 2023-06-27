package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidationSetItemJSON extends StObject {
  
  /**
  		 * An array of globalId strings to validate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-ValidateNetworkTopologyParameters.html#ValidationSetItemJSON)
  		 */
  var globalIds: js.Array[String]
  
  /**
  		 * The network source id of the.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-ValidateNetworkTopologyParameters.html#ValidationSetItemJSON)
  		 */
  var sourceId: Double
}
object ValidationSetItemJSON {
  
  inline def apply(globalIds: js.Array[String], sourceId: Double): ValidationSetItemJSON = {
    val __obj = js.Dynamic.literal(globalIds = globalIds.asInstanceOf[js.Any], sourceId = sourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationSetItemJSON]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidationSetItemJSON] (val x: Self) extends AnyVal {
    
    inline def setGlobalIds(value: js.Array[String]): Self = StObject.set(x, "globalIds", value.asInstanceOf[js.Any])
    
    inline def setGlobalIdsVarargs(value: String*): Self = StObject.set(x, "globalIds", js.Array(value*))
    
    inline def setSourceId(value: Double): Self = StObject.set(x, "sourceId", value.asInstanceOf[js.Any])
  }
}
