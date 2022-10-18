package typings.awsSdk.clientsDiscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeContinuousExportsResponse extends StObject {
  
  /**
    * A list of continuous export descriptions.
    */
  var descriptions: js.UndefOr[ContinuousExportDescriptions] = js.undefined
  
  /**
    * The token from the previous call to DescribeExportTasks.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeContinuousExportsResponse {
  
  inline def apply(): DescribeContinuousExportsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeContinuousExportsResponse]
  }
  
  extension [Self <: DescribeContinuousExportsResponse](x: Self) {
    
    inline def setDescriptions(value: ContinuousExportDescriptions): Self = StObject.set(x, "descriptions", value.asInstanceOf[js.Any])
    
    inline def setDescriptionsUndefined: Self = StObject.set(x, "descriptions", js.undefined)
    
    inline def setDescriptionsVarargs(value: ContinuousExportDescription*): Self = StObject.set(x, "descriptions", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
