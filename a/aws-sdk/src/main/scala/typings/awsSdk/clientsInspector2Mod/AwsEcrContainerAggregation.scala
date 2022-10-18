package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcrContainerAggregation extends StObject {
  
  /**
    * The architecture of the containers.
    */
  var architectures: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The image SHA values.
    */
  var imageShas: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The image tags.
    */
  var imageTags: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The container repositories.
    */
  var repositories: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The container resource IDs.
    */
  var resourceIds: js.UndefOr[StringFilterList] = js.undefined
  
  /**
    * The value to sort by.
    */
  var sortBy: js.UndefOr[AwsEcrContainerSortBy] = js.undefined
  
  /**
    * The sort order (ascending or descending).
    */
  var sortOrder: js.UndefOr[SortOrder] = js.undefined
}
object AwsEcrContainerAggregation {
  
  inline def apply(): AwsEcrContainerAggregation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcrContainerAggregation]
  }
  
  extension [Self <: AwsEcrContainerAggregation](x: Self) {
    
    inline def setArchitectures(value: StringFilterList): Self = StObject.set(x, "architectures", value.asInstanceOf[js.Any])
    
    inline def setArchitecturesUndefined: Self = StObject.set(x, "architectures", js.undefined)
    
    inline def setArchitecturesVarargs(value: StringFilter*): Self = StObject.set(x, "architectures", js.Array(value*))
    
    inline def setImageShas(value: StringFilterList): Self = StObject.set(x, "imageShas", value.asInstanceOf[js.Any])
    
    inline def setImageShasUndefined: Self = StObject.set(x, "imageShas", js.undefined)
    
    inline def setImageShasVarargs(value: StringFilter*): Self = StObject.set(x, "imageShas", js.Array(value*))
    
    inline def setImageTags(value: StringFilterList): Self = StObject.set(x, "imageTags", value.asInstanceOf[js.Any])
    
    inline def setImageTagsUndefined: Self = StObject.set(x, "imageTags", js.undefined)
    
    inline def setImageTagsVarargs(value: StringFilter*): Self = StObject.set(x, "imageTags", js.Array(value*))
    
    inline def setRepositories(value: StringFilterList): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    inline def setRepositoriesUndefined: Self = StObject.set(x, "repositories", js.undefined)
    
    inline def setRepositoriesVarargs(value: StringFilter*): Self = StObject.set(x, "repositories", js.Array(value*))
    
    inline def setResourceIds(value: StringFilterList): Self = StObject.set(x, "resourceIds", value.asInstanceOf[js.Any])
    
    inline def setResourceIdsUndefined: Self = StObject.set(x, "resourceIds", js.undefined)
    
    inline def setResourceIdsVarargs(value: StringFilter*): Self = StObject.set(x, "resourceIds", js.Array(value*))
    
    inline def setSortBy(value: AwsEcrContainerSortBy): Self = StObject.set(x, "sortBy", value.asInstanceOf[js.Any])
    
    inline def setSortByUndefined: Self = StObject.set(x, "sortBy", js.undefined)
    
    inline def setSortOrder(value: SortOrder): Self = StObject.set(x, "sortOrder", value.asInstanceOf[js.Any])
    
    inline def setSortOrderUndefined: Self = StObject.set(x, "sortOrder", js.undefined)
  }
}
