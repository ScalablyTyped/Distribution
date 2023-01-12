package typings.awsSdk.clientsDiscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeContinuousExportsRequest extends StObject {
  
  /**
    * The unique IDs assigned to the exports.
    */
  var exportIds: js.UndefOr[ContinuousExportIds] = js.undefined
  
  /**
    * A number between 1 and 100 specifying the maximum number of continuous export descriptions returned.
    */
  var maxResults: js.UndefOr[DescribeContinuousExportsMaxResults] = js.undefined
  
  /**
    * The token from the previous call to DescribeExportTasks.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeContinuousExportsRequest {
  
  inline def apply(): DescribeContinuousExportsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeContinuousExportsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeContinuousExportsRequest] (val x: Self) extends AnyVal {
    
    inline def setExportIds(value: ContinuousExportIds): Self = StObject.set(x, "exportIds", value.asInstanceOf[js.Any])
    
    inline def setExportIdsUndefined: Self = StObject.set(x, "exportIds", js.undefined)
    
    inline def setExportIdsVarargs(value: ConfigurationsExportId*): Self = StObject.set(x, "exportIds", js.Array(value*))
    
    inline def setMaxResults(value: DescribeContinuousExportsMaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
