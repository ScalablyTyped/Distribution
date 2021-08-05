package typings.algoliaClientSearch.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasPendingMappingsOptions extends StObject {
  
  /**
    * If the clusters pending mapping state should be on the response.
    *
    * @defaultValue false
    *
    * @internal
    */
  val getClusters: js.UndefOr[Boolean] = js.undefined
  
  /**
    * If the clusters pending mapping state should be on the response.
    *
    * @defaultValue false
    */
  val retrieveMappings: js.UndefOr[Boolean] = js.undefined
}
object HasPendingMappingsOptions {
  
  inline def apply(): HasPendingMappingsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HasPendingMappingsOptions]
  }
  
  extension [Self <: HasPendingMappingsOptions](x: Self) {
    
    inline def setGetClusters(value: Boolean): Self = StObject.set(x, "getClusters", value.asInstanceOf[js.Any])
    
    inline def setGetClustersUndefined: Self = StObject.set(x, "getClusters", js.undefined)
    
    inline def setRetrieveMappings(value: Boolean): Self = StObject.set(x, "retrieveMappings", value.asInstanceOf[js.Any])
    
    inline def setRetrieveMappingsUndefined: Self = StObject.set(x, "retrieveMappings", js.undefined)
  }
}
