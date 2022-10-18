package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribePoolsResult extends StObject {
  
  /**
    * The token to be used for the next set of paginated results. If this field is empty then there are no more results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.NextToken] = js.undefined
  
  /**
    * An array of PoolInformation objects that contain the details for the requested pools. 
    */
  var Pools: js.UndefOr[PoolInformationList] = js.undefined
}
object DescribePoolsResult {
  
  inline def apply(): DescribePoolsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribePoolsResult]
  }
  
  extension [Self <: DescribePoolsResult](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setPools(value: PoolInformationList): Self = StObject.set(x, "Pools", value.asInstanceOf[js.Any])
    
    inline def setPoolsUndefined: Self = StObject.set(x, "Pools", js.undefined)
    
    inline def setPoolsVarargs(value: PoolInformation*): Self = StObject.set(x, "Pools", js.Array(value*))
  }
}
