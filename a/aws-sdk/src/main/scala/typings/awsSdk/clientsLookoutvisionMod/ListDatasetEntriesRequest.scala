package typings.awsSdk.clientsLookoutvisionMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDatasetEntriesRequest extends StObject {
  
  /**
    * Only includes entries after the specified date in the response. For example, 2020-06-23T00:00:00.
    */
  var AfterCreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * Specify normal to include only normal images. Specify anomaly to only include anomalous entries. If you don't specify a value, Amazon Lookout for Vision returns normal and anomalous images.
    */
  var AnomalyClass: js.UndefOr[AnomalyClassFilter] = js.undefined
  
  /**
    * Only includes entries before the specified date in the response. For example, 2020-06-23T00:00:00.
    */
  var BeforeCreationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The type of the dataset that you want to list. Specify train to list the training dataset. Specify test to list the test dataset. If you have a single dataset project, specify train.
    */
  var DatasetType: typings.awsSdk.clientsLookoutvisionMod.DatasetType
  
  /**
    * Specify true to include labeled entries, otherwise specify false. If you don't specify a value, Lookout for Vision returns all entries.
    */
  var Labeled: js.UndefOr[IsLabeled] = js.undefined
  
  /**
    * The maximum number of results to return per paginated call. The largest value you can specify is 100. If you specify a value greater than 100, a ValidationException error occurs. The default value is 100.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  
  /**
    * If the previous response was incomplete (because there is more data to retrieve), Amazon Lookout for Vision returns a pagination token in the response. You can use this pagination token to retrieve the next set of dataset entries.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The name of the project that contains the dataset that you want to list.
    */
  var ProjectName: typings.awsSdk.clientsLookoutvisionMod.ProjectName
  
  /**
    * Perform a "contains" search on the values of the source-ref key within the dataset. For example a value of "IMG_17" returns all JSON Lines where the source-ref key value matches *IMG_17*.
    */
  var SourceRefContains: js.UndefOr[QueryString] = js.undefined
}
object ListDatasetEntriesRequest {
  
  inline def apply(DatasetType: DatasetType, ProjectName: ProjectName): ListDatasetEntriesRequest = {
    val __obj = js.Dynamic.literal(DatasetType = DatasetType.asInstanceOf[js.Any], ProjectName = ProjectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDatasetEntriesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListDatasetEntriesRequest] (val x: Self) extends AnyVal {
    
    inline def setAfterCreationDate(value: js.Date): Self = StObject.set(x, "AfterCreationDate", value.asInstanceOf[js.Any])
    
    inline def setAfterCreationDateUndefined: Self = StObject.set(x, "AfterCreationDate", js.undefined)
    
    inline def setAnomalyClass(value: AnomalyClassFilter): Self = StObject.set(x, "AnomalyClass", value.asInstanceOf[js.Any])
    
    inline def setAnomalyClassUndefined: Self = StObject.set(x, "AnomalyClass", js.undefined)
    
    inline def setBeforeCreationDate(value: js.Date): Self = StObject.set(x, "BeforeCreationDate", value.asInstanceOf[js.Any])
    
    inline def setBeforeCreationDateUndefined: Self = StObject.set(x, "BeforeCreationDate", js.undefined)
    
    inline def setDatasetType(value: DatasetType): Self = StObject.set(x, "DatasetType", value.asInstanceOf[js.Any])
    
    inline def setLabeled(value: IsLabeled): Self = StObject.set(x, "Labeled", value.asInstanceOf[js.Any])
    
    inline def setLabeledUndefined: Self = StObject.set(x, "Labeled", js.undefined)
    
    inline def setMaxResults(value: PageSize): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setProjectName(value: ProjectName): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
    
    inline def setSourceRefContains(value: QueryString): Self = StObject.set(x, "SourceRefContains", value.asInstanceOf[js.Any])
    
    inline def setSourceRefContainsUndefined: Self = StObject.set(x, "SourceRefContains", js.undefined)
  }
}
