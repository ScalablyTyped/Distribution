package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasPendingMappingsResponse extends StObject {
  
  /**
    * Describe cluster pending (migrating, creating, deleting) mapping state.
    */
  var clusters: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
  
  /**
    * If there is any clusters with pending mapping state.
    */
  var pending: Boolean
}
object HasPendingMappingsResponse {
  
  inline def apply(pending: Boolean): HasPendingMappingsResponse = {
    val __obj = js.Dynamic.literal(pending = pending.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasPendingMappingsResponse]
  }
  
  extension [Self <: HasPendingMappingsResponse](x: Self) {
    
    inline def setClusters(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "clusters", value.asInstanceOf[js.Any])
    
    inline def setClustersUndefined: Self = StObject.set(x, "clusters", js.undefined)
    
    inline def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
  }
}
