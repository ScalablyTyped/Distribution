package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeIpamResourceDiscoveryAssociationsResult extends StObject {
  
  /**
    * The resource discovery associations.
    */
  var IpamResourceDiscoveryAssociations: js.UndefOr[IpamResourceDiscoveryAssociationSet] = js.undefined
  
  /**
    * Specify the pagination token from a previous request to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsEc2Mod.NextToken] = js.undefined
}
object DescribeIpamResourceDiscoveryAssociationsResult {
  
  inline def apply(): DescribeIpamResourceDiscoveryAssociationsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeIpamResourceDiscoveryAssociationsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeIpamResourceDiscoveryAssociationsResult] (val x: Self) extends AnyVal {
    
    inline def setIpamResourceDiscoveryAssociations(value: IpamResourceDiscoveryAssociationSet): Self = StObject.set(x, "IpamResourceDiscoveryAssociations", value.asInstanceOf[js.Any])
    
    inline def setIpamResourceDiscoveryAssociationsUndefined: Self = StObject.set(x, "IpamResourceDiscoveryAssociations", js.undefined)
    
    inline def setIpamResourceDiscoveryAssociationsVarargs(value: IpamResourceDiscoveryAssociation*): Self = StObject.set(x, "IpamResourceDiscoveryAssociations", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
