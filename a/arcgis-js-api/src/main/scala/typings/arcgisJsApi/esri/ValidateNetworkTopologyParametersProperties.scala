package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`force-rebuild`
import typings.arcgisJsApi.arcgisJsApiStrings.normal
import typings.arcgisJsApi.arcgisJsApiStrings.rebuild
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValidateNetworkTopologyParametersProperties extends StObject {
  
  /**
  		 * Specifies the geodatabase version name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-ValidateNetworkTopologyParameters.html#gdbVersion)
  		 */
  var gdbVersion: js.UndefOr[String] = js.undefined
  
  /**
  		 * Specifies the GUID used to lock the version.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-ValidateNetworkTopologyParameters.html#sessionID)
  		 */
  var sessionID: js.UndefOr[String] = js.undefined
  
  /**
  		 * Specifies the envelope of the area to validate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-ValidateNetworkTopologyParameters.html#validateArea)
  		 */
  var validateArea: js.UndefOr[ExtentProperties] = js.undefined
  
  /**
  		 * Specifies the set of features and objects to validate.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-ValidateNetworkTopologyParameters.html#validationSet)
  		 */
  var validationSet: js.UndefOr[js.Array[ValidationSetItemJSON]] = js.undefined
  
  /**
  		 * Specifies the validation to perform.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-ValidateNetworkTopologyParameters.html#validationType)
  		 */
  var validationType: js.UndefOr[normal | rebuild | `force-rebuild`] = js.undefined
}
object ValidateNetworkTopologyParametersProperties {
  
  inline def apply(): ValidateNetworkTopologyParametersProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ValidateNetworkTopologyParametersProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValidateNetworkTopologyParametersProperties] (val x: Self) extends AnyVal {
    
    inline def setGdbVersion(value: String): Self = StObject.set(x, "gdbVersion", value.asInstanceOf[js.Any])
    
    inline def setGdbVersionUndefined: Self = StObject.set(x, "gdbVersion", js.undefined)
    
    inline def setSessionID(value: String): Self = StObject.set(x, "sessionID", value.asInstanceOf[js.Any])
    
    inline def setSessionIDUndefined: Self = StObject.set(x, "sessionID", js.undefined)
    
    inline def setValidateArea(value: ExtentProperties): Self = StObject.set(x, "validateArea", value.asInstanceOf[js.Any])
    
    inline def setValidateAreaUndefined: Self = StObject.set(x, "validateArea", js.undefined)
    
    inline def setValidationSet(value: js.Array[ValidationSetItemJSON]): Self = StObject.set(x, "validationSet", value.asInstanceOf[js.Any])
    
    inline def setValidationSetUndefined: Self = StObject.set(x, "validationSet", js.undefined)
    
    inline def setValidationSetVarargs(value: ValidationSetItemJSON*): Self = StObject.set(x, "validationSet", js.Array(value*))
    
    inline def setValidationType(value: normal | rebuild | `force-rebuild`): Self = StObject.set(x, "validationType", value.asInstanceOf[js.Any])
    
    inline def setValidationTypeUndefined: Self = StObject.set(x, "validationType", js.undefined)
  }
}
