package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.aggregatedGeometry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResultTypeJSON extends StObject {
  
  /**
  		 * Specifies the name of a predefined Diagram Template.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceParameters.html#ResultTypeJSON)
  		 */
  var diagramTemplateName: String
  
  /**
  		 * Specifies whether to return geometry values in resultTypes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceParameters.html#ResultTypeJSON)
  		 */
  var includeGeometry: Boolean
  
  /**
  		 * Specifies whether to return propagated values in resultTypes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceParameters.html#ResultTypeJSON)
  		 */
  var includePropagatedValues: Boolean
  
  /**
  		 * Specifies the network attribute names.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceParameters.html#ResultTypeJSON)
  		 */
  var networkAttributeNames: js.Array[String]
  
  /**
  		 * Specifies the types of output fields that can be generated from geoprocessing tools.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceParameters.html#ResultTypeJSON)
  		 */
  var resultTypeFields: js.Array[Any]
  
  /**
  		 * Specifies whether to return type `"elements"` or `"aggregatedGeometry"`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceParameters.html#ResultTypeJSON)
  		 */
  var `type`: typings.arcgisJsApi.arcgisJsApiStrings.elements | aggregatedGeometry
}
object ResultTypeJSON {
  
  inline def apply(
    diagramTemplateName: String,
    includeGeometry: Boolean,
    includePropagatedValues: Boolean,
    networkAttributeNames: js.Array[String],
    resultTypeFields: js.Array[Any],
    `type`: typings.arcgisJsApi.arcgisJsApiStrings.elements | aggregatedGeometry
  ): ResultTypeJSON = {
    val __obj = js.Dynamic.literal(diagramTemplateName = diagramTemplateName.asInstanceOf[js.Any], includeGeometry = includeGeometry.asInstanceOf[js.Any], includePropagatedValues = includePropagatedValues.asInstanceOf[js.Any], networkAttributeNames = networkAttributeNames.asInstanceOf[js.Any], resultTypeFields = resultTypeFields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResultTypeJSON]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResultTypeJSON] (val x: Self) extends AnyVal {
    
    inline def setDiagramTemplateName(value: String): Self = StObject.set(x, "diagramTemplateName", value.asInstanceOf[js.Any])
    
    inline def setIncludeGeometry(value: Boolean): Self = StObject.set(x, "includeGeometry", value.asInstanceOf[js.Any])
    
    inline def setIncludePropagatedValues(value: Boolean): Self = StObject.set(x, "includePropagatedValues", value.asInstanceOf[js.Any])
    
    inline def setNetworkAttributeNames(value: js.Array[String]): Self = StObject.set(x, "networkAttributeNames", value.asInstanceOf[js.Any])
    
    inline def setNetworkAttributeNamesVarargs(value: String*): Self = StObject.set(x, "networkAttributeNames", js.Array(value*))
    
    inline def setResultTypeFields(value: js.Array[Any]): Self = StObject.set(x, "resultTypeFields", value.asInstanceOf[js.Any])
    
    inline def setResultTypeFieldsVarargs(value: Any*): Self = StObject.set(x, "resultTypeFields", js.Array(value*))
    
    inline def setType(value: typings.arcgisJsApi.arcgisJsApiStrings.elements | aggregatedGeometry): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
