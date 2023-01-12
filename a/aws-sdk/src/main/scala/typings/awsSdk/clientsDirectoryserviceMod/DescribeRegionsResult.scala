package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRegionsResult extends StObject {
  
  /**
    * If not null, more results are available. Pass this value for the NextToken parameter in a subsequent call to DescribeRegions to retrieve the next set of items.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.NextToken] = js.undefined
  
  /**
    * List of Region information related to the directory for each replicated Region.
    */
  var RegionsDescription: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.RegionsDescription] = js.undefined
}
object DescribeRegionsResult {
  
  inline def apply(): DescribeRegionsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRegionsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeRegionsResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRegionsDescription(value: RegionsDescription): Self = StObject.set(x, "RegionsDescription", value.asInstanceOf[js.Any])
    
    inline def setRegionsDescriptionUndefined: Self = StObject.set(x, "RegionsDescription", js.undefined)
    
    inline def setRegionsDescriptionVarargs(value: RegionDescription*): Self = StObject.set(x, "RegionsDescription", js.Array(value*))
  }
}
