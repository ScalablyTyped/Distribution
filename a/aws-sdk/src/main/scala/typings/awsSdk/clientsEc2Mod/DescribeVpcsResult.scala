package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeVpcsResult extends StObject {
  
  /**
    * The token to include in another request to get the next page of items. This value is null when there are no more items to return.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about one or more VPCs.
    */
  var Vpcs: js.UndefOr[VpcList] = js.undefined
}
object DescribeVpcsResult {
  
  inline def apply(): DescribeVpcsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeVpcsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeVpcsResult] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setVpcs(value: VpcList): Self = StObject.set(x, "Vpcs", value.asInstanceOf[js.Any])
    
    inline def setVpcsUndefined: Self = StObject.set(x, "Vpcs", js.undefined)
    
    inline def setVpcsVarargs(value: Vpc*): Self = StObject.set(x, "Vpcs", js.Array(value*))
  }
}
