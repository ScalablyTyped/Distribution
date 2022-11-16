package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkQueryNamedTraceConfigurationsQuery extends StObject {
  
  /**
    * An array of the named trace configuration creators to be queried.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#queryNamedTraceConfigurations)
    */
  var creators: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An array of named trace configuration globalIds (UUID) to be queried.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#queryNamedTraceConfigurations)
    */
  var globalIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An array of named trace configuration names to be queried.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#queryNamedTraceConfigurations)
    */
  var names: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
    * An array of named trace configuration user tags to be queried.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#queryNamedTraceConfigurations)
    */
  var tags: js.UndefOr[js.Array[String]] = js.undefined
}
object NetworkQueryNamedTraceConfigurationsQuery {
  
  inline def apply(): NetworkQueryNamedTraceConfigurationsQuery = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NetworkQueryNamedTraceConfigurationsQuery]
  }
  
  extension [Self <: NetworkQueryNamedTraceConfigurationsQuery](x: Self) {
    
    inline def setCreators(value: js.Array[String]): Self = StObject.set(x, "creators", value.asInstanceOf[js.Any])
    
    inline def setCreatorsUndefined: Self = StObject.set(x, "creators", js.undefined)
    
    inline def setCreatorsVarargs(value: String*): Self = StObject.set(x, "creators", js.Array(value*))
    
    inline def setGlobalIds(value: js.Array[String]): Self = StObject.set(x, "globalIds", value.asInstanceOf[js.Any])
    
    inline def setGlobalIdsUndefined: Self = StObject.set(x, "globalIds", js.undefined)
    
    inline def setGlobalIdsVarargs(value: String*): Self = StObject.set(x, "globalIds", js.Array(value*))
    
    inline def setNames(value: js.Array[String]): Self = StObject.set(x, "names", value.asInstanceOf[js.Any])
    
    inline def setNamesUndefined: Self = StObject.set(x, "names", js.undefined)
    
    inline def setNamesVarargs(value: String*): Self = StObject.set(x, "names", js.Array(value*))
    
    inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
  }
}
