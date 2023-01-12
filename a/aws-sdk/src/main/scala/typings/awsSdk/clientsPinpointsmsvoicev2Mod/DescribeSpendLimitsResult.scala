package typings.awsSdk.clientsPinpointsmsvoicev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSpendLimitsResult extends StObject {
  
  /**
    * The token to be used for the next set of paginated results. If this field is empty then there are no more results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsPinpointsmsvoicev2Mod.NextToken] = js.undefined
  
  /**
    * An array of SpendLimit objects that contain the details for the requested spend limits.
    */
  var SpendLimits: js.UndefOr[SpendLimitList] = js.undefined
}
object DescribeSpendLimitsResult {
  
  inline def apply(): DescribeSpendLimitsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeSpendLimitsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeSpendLimitsResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setSpendLimits(value: SpendLimitList): Self = StObject.set(x, "SpendLimits", value.asInstanceOf[js.Any])
    
    inline def setSpendLimitsUndefined: Self = StObject.set(x, "SpendLimits", js.undefined)
    
    inline def setSpendLimitsVarargs(value: SpendLimit*): Self = StObject.set(x, "SpendLimits", js.Array(value*))
  }
}
