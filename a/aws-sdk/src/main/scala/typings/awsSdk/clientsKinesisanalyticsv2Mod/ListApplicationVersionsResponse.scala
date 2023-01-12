package typings.awsSdk.clientsKinesisanalyticsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListApplicationVersionsResponse extends StObject {
  
  /**
    * A list of the application versions and the associated configuration summaries. The list includes application versions that were rolled back. To get the complete description of a specific application version, invoke the DescribeApplicationVersion operation.
    */
  var ApplicationVersionSummaries: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.ApplicationVersionSummaries] = js.undefined
  
  /**
    * The pagination token for the next set of results, or null if there are no additional results. To retrieve the next set of items, pass this token into a subsequent invocation of this operation. For more information about pagination, see Using the Amazon Command Line Interface's Pagination Options.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsKinesisanalyticsv2Mod.NextToken] = js.undefined
}
object ListApplicationVersionsResponse {
  
  inline def apply(): ListApplicationVersionsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListApplicationVersionsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListApplicationVersionsResponse] (val x: Self) extends AnyVal {
    
    inline def setApplicationVersionSummaries(value: ApplicationVersionSummaries): Self = StObject.set(x, "ApplicationVersionSummaries", value.asInstanceOf[js.Any])
    
    inline def setApplicationVersionSummariesUndefined: Self = StObject.set(x, "ApplicationVersionSummaries", js.undefined)
    
    inline def setApplicationVersionSummariesVarargs(value: ApplicationVersionSummary*): Self = StObject.set(x, "ApplicationVersionSummaries", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
