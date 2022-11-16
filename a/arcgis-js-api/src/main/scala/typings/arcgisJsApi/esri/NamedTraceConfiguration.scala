package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`shortest-path`
import typings.arcgisJsApi.arcgisJsApiStrings.`subnetwork-controllers`
import typings.arcgisJsApi.arcgisJsApiStrings.connected
import typings.arcgisJsApi.arcgisJsApiStrings.downstream
import typings.arcgisJsApi.arcgisJsApiStrings.isolation
import typings.arcgisJsApi.arcgisJsApiStrings.loops
import typings.arcgisJsApi.arcgisJsApiStrings.many
import typings.arcgisJsApi.arcgisJsApiStrings.none_
import typings.arcgisJsApi.arcgisJsApiStrings.one
import typings.arcgisJsApi.arcgisJsApiStrings.subnetwork
import typings.arcgisJsApi.arcgisJsApiStrings.upstream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NamedTraceConfiguration extends StObject {
  
  /**
    * The date/time when the trace configuration has been added to the utility network.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-NamedTraceConfiguration.html#creationDate)
    */
  var creationDate: js.Date
  
  /**
    * The portal user who created the trace configuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-NamedTraceConfiguration.html#creator)
    */
  var creator: String
  
  /**
    * Short description of what kind of trace this trace configuration performs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-NamedTraceConfiguration.html#description)
    */
  var description: String
  
  /**
    * The `globalId` (UUID) uniquely identifies a trace configuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-NamedTraceConfiguration.html#globalId)
    */
  var globalId: String
  
  /**
    * The minimum number of starting points required to perform a trace with this particular trace configuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-NamedTraceConfiguration.html#minStartingPoints)
    */
  var minStartingPoints: none_ | one | many
  
  /**
    * The result types of the trace configuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-NamedTraceConfiguration.html#resultTypes)
    */
  var resultTypes: js.Array[Any]
  
  /**
    * Labels that help identify and search for a particular trace configuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-NamedTraceConfiguration.html#tags)
    */
  var tags: js.Array[String]
  
  /**
    * The title or the name of the trace configuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-NamedTraceConfiguration.html#title)
    */
  var title: String
  
  /**
    * The full definition of the trace configuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-NamedTraceConfiguration.html#traceConfiguration)
    */
  var traceConfiguration: TraceConfiguration | UNTraceConfiguration
  
  /**
    * The trace type defined in this trace configuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-NamedTraceConfiguration.html#traceType)
    */
  var traceType: connected | upstream | downstream | `shortest-path` | subnetwork | `subnetwork-controllers` | loops | isolation
}
object NamedTraceConfiguration {
  
  inline def apply(
    creationDate: js.Date,
    creator: String,
    description: String,
    globalId: String,
    minStartingPoints: none_ | one | many,
    resultTypes: js.Array[Any],
    tags: js.Array[String],
    title: String,
    traceConfiguration: TraceConfiguration | UNTraceConfiguration,
    traceType: connected | upstream | downstream | `shortest-path` | subnetwork | `subnetwork-controllers` | loops | isolation
  ): NamedTraceConfiguration = {
    val __obj = js.Dynamic.literal(creationDate = creationDate.asInstanceOf[js.Any], creator = creator.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], globalId = globalId.asInstanceOf[js.Any], minStartingPoints = minStartingPoints.asInstanceOf[js.Any], resultTypes = resultTypes.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], traceConfiguration = traceConfiguration.asInstanceOf[js.Any], traceType = traceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[NamedTraceConfiguration]
  }
  
  extension [Self <: NamedTraceConfiguration](x: Self) {
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreator(value: String): Self = StObject.set(x, "creator", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setGlobalId(value: String): Self = StObject.set(x, "globalId", value.asInstanceOf[js.Any])
    
    inline def setMinStartingPoints(value: none_ | one | many): Self = StObject.set(x, "minStartingPoints", value.asInstanceOf[js.Any])
    
    inline def setResultTypes(value: js.Array[Any]): Self = StObject.set(x, "resultTypes", value.asInstanceOf[js.Any])
    
    inline def setResultTypesVarargs(value: Any*): Self = StObject.set(x, "resultTypes", js.Array(value*))
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTraceConfiguration(value: TraceConfiguration | UNTraceConfiguration): Self = StObject.set(x, "traceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTraceType(
      value: connected | upstream | downstream | `shortest-path` | subnetwork | `subnetwork-controllers` | loops | isolation
    ): Self = StObject.set(x, "traceType", value.asInstanceOf[js.Any])
  }
}
