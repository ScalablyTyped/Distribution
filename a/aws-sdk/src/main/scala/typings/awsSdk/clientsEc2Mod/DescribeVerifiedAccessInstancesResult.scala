package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVerifiedAccessInstancesResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
  
  /**
    * The IDs of the Verified Access instances.
    */
  var VerifiedAccessInstances: js.UndefOr[VerifiedAccessInstanceList] = js.undefined
}
object DescribeVerifiedAccessInstancesResult {
  
  inline def apply(): DescribeVerifiedAccessInstancesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVerifiedAccessInstancesResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeVerifiedAccessInstancesResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVerifiedAccessInstances(value: VerifiedAccessInstanceList): Self = StObject.set(x, "VerifiedAccessInstances", value.asInstanceOf[js.Any])
    
    inline def setVerifiedAccessInstancesUndefined: Self = StObject.set(x, "VerifiedAccessInstances", js.undefined)
    
    inline def setVerifiedAccessInstancesVarargs(value: VerifiedAccessInstance*): Self = StObject.set(x, "VerifiedAccessInstances", js.Array(value*))
  }
}
