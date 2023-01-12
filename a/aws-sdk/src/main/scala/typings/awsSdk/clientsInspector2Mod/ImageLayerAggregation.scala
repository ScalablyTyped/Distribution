package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageLayerAggregation extends StObject {
  
  /**
    * The hashes associated with the layers.
    */
  var layerHashes: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The repository associated with the container image hosting the layers.
    */
  var repositories: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The ID of the container image layer.
    */
  var resourceIds: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The value to sort results by.
    */
  var sortBy: js.UndefOr[ImageLayerSortBy] = js.undefined
  
  /**
    * The order to sort results by.
    */
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
}
object ImageLayerAggregation {
  
  inline def apply(): ImageLayerAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageLayerAggregation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageLayerAggregation] (val x: Self) extends AnyVal {
    
    inline def setLayerHashes(value: StringFilterList): Self = StObject.set(x, "layerHashes", value.asInstanceOf[js.Any])
    
    inline def setLayerHashesUndefined: Self = StObject.set(x, "layerHashes", js.undefined)
    
    inline def setLayerHashesVarargs(value: StringFilter*): Self = StObject.set(x, "layerHashes", js.Array(value*))
    
    inline def setRepositories(value: StringFilterList): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesUndefined: Self = StObject.set(x, "repositories", js.undefined)
    
    inline def setRepositoriesVarargs(value: StringFilter*): Self = StObject.set(x, "repositories", js.Array(value*))
    
    inline def setResourceIds(value: StringFilterList): Self = StObject.set(x, "resourceIds", value.asInstanceOf[js.Any])
    
    inline def setResourceIdsUndefined: Self = StObject.set(x, "resourceIds", js.undefined)
    
    inline def setResourceIdsVarargs(value: StringFilter*): Self = StObject.set(x, "resourceIds", js.Array(value*))
    
    inline def setSortBy(value: ImageLayerSortBy): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
