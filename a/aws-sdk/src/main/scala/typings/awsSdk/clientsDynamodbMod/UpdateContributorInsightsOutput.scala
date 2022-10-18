package typings.awsSdk.clientsDynamodbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateContributorInsightsOutput extends StObject {
  
  /**
    * The status of contributor insights
    */
  var ContributorInsightsStatus: js.UndefOr[typings.awsSdk.clientsDynamodbMod.ContributorInsightsStatus] = js.undefined
  
  /**
    * The name of the global secondary index, if applicable.
    */
  var IndexName: js.UndefOr[typings.awsSdk.clientsDynamodbMod.IndexName] = js.undefined
  
  /**
    * The name of the table.
    */
  var TableName: js.UndefOr[typings.awsSdk.clientsDynamodbMod.TableName] = js.undefined
}
object UpdateContributorInsightsOutput {
  
  inline def apply(): UpdateContributorInsightsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateContributorInsightsOutput]
  }
  
  extension [Self <: UpdateContributorInsightsOutput](x: Self) {
    
    inline def setContributorInsightsStatus(value: ContributorInsightsStatus): Self = StObject.set(x, "ContributorInsightsStatus", value.asInstanceOf[js.Any])
    
    inline def setContributorInsightsStatusUndefined: Self = StObject.set(x, "ContributorInsightsStatus", js.undefined)
    
    inline def setIndexName(value: IndexName): Self = StObject.set(x, "IndexName", value.asInstanceOf[js.Any])
    
    inline def setIndexNameUndefined: Self = StObject.set(x, "IndexName", js.undefined)
    
    inline def setTableName(value: TableName): Self = StObject.set(x, "TableName", value.asInstanceOf[js.Any])
    
    inline def setTableNameUndefined: Self = StObject.set(x, "TableName", js.undefined)
  }
}
