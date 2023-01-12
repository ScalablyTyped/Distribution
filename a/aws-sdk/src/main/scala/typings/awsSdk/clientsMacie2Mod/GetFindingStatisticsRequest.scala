package typings.awsSdk.clientsMacie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetFindingStatisticsRequest extends StObject {
  
  /**
    * The criteria to use to filter the query results.
    */
  var findingCriteria: js.UndefOr[FindingCriteria] = js.undefined
  
  /**
    * The finding property to use to group the query results. Valid values are: classificationDetails.jobId - The unique identifier for the classification job that produced the finding. resourcesAffected.s3Bucket.name - The name of the S3 bucket that the finding applies to. severity.description - The severity level of the finding, such as High or Medium. type - The type of finding, such as Policy:IAMUser/S3BucketPublic and SensitiveData:S3Object/Personal.
    */
  var groupBy: GroupBy
  
  /**
    * The maximum number of items to include in each page of the response.
    */
  var size: js.UndefOr[integer] = js.undefined
  
  /**
    * The criteria to use to sort the query results.
    */
  var sortCriteria: js.UndefOr[FindingStatisticsSortCriteria] = js.undefined
}
object GetFindingStatisticsRequest {
  
  inline def apply(groupBy: GroupBy): GetFindingStatisticsRequest = {
    val __obj = js.Dynamic.literal(groupBy = groupBy.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingStatisticsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetFindingStatisticsRequest] (val x: Self) extends AnyVal {
    
    inline def setFindingCriteria(value: FindingCriteria): Self = StObject.set(x, "findingCriteria", value.asInstanceOf[js.Any])
    
    inline def setFindingCriteriaUndefined: Self = StObject.set(x, "findingCriteria", js.undefined)
    
    inline def setGroupBy(value: GroupBy): Self = StObject.set(x, "groupBy", value.asInstanceOf[js.Any])
    
    inline def setSize(value: integer): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    
    inline def setSortCriteria(value: FindingStatisticsSortCriteria): Self = StObject.set(x, "sortCriteria", value.asInstanceOf[js.Any])
    
    inline def setSortCriteriaUndefined: Self = StObject.set(x, "sortCriteria", js.undefined)
  }
}
