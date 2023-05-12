package typings.awsSdk.clientsGrafanaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NetworkAccessConfiguration extends StObject {
  
  /**
    * An array of prefix list IDs. A prefix list is a list of CIDR ranges of IP addresses. The IP addresses specified are allowed to access your workspace. If the list is not included in the configuration then no IP addresses will be allowed to access the workspace. You create a prefix list using the Amazon VPC console. Prefix list IDs have the format pl-1a2b3c4d . For more information about prefix lists, see Group CIDR blocks using managed prefix listsin the Amazon Virtual Private Cloud User Guide.
    */
  var prefixListIds: PrefixListIds
  
  /**
    * An array of Amazon VPC endpoint IDs for the workspace. You can create VPC endpoints to your Amazon Managed Grafana workspace for access from within a VPC. If a NetworkAccessConfiguration is specified then only VPC endpoints specified here will be allowed to access the workspace. VPC endpoint IDs have the format vpce-1a2b3c4d . For more information about creating an interface VPC endpoint, see Interface VPC endpoints in the Amazon Managed Grafana User Guide.  The only VPC endpoints that can be specified here are interface VPC endpoints for Grafana workspaces (using the com.amazonaws.[region].grafana-workspace service endpoint). Other VPC endpoints will be ignored. 
    */
  var vpceIds: VpceIds
}
object NetworkAccessConfiguration {
  
  inline def apply(prefixListIds: PrefixListIds, vpceIds: VpceIds): NetworkAccessConfiguration = {
    val __obj = js.Dynamic.literal(prefixListIds = prefixListIds.asInstanceOf[js.Any], vpceIds = vpceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[NetworkAccessConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NetworkAccessConfiguration] (val x: Self) extends AnyVal {
    
    inline def setPrefixListIds(value: PrefixListIds): Self = StObject.set(x, "prefixListIds", value.asInstanceOf[js.Any])
    
    inline def setPrefixListIdsVarargs(value: PrefixListId*): Self = StObject.set(x, "prefixListIds", js.Array(value*))
    
    inline def setVpceIds(value: VpceIds): Self = StObject.set(x, "vpceIds", value.asInstanceOf[js.Any])
    
    inline def setVpceIdsVarargs(value: VpceId*): Self = StObject.set(x, "vpceIds", js.Array(value*))
  }
}
