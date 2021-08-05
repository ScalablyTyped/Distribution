package typings.awsSdk.anon

import typings.awsSdk.ec2Mod.Boolean
import typings.awsSdk.ec2Mod.CustomerGatewayId
import typings.awsSdk.ec2Mod.CustomerGatewayIdStringList
import typings.awsSdk.ec2Mod.Filter
import typings.awsSdk.ec2Mod.FilterList
import typings.awsSdk.serviceMod.WaiterConfiguration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined aws-sdk.aws-sdk/clients/ec2.DescribeCustomerGatewaysRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
trait DescribeCustomerGatewaysR extends StObject {
  
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.undefined
  
  /**
    * One or more customer gateway IDs. Default: Describes all your customer gateways.
    */
  var CustomerGatewayIds: js.UndefOr[CustomerGatewayIdStringList] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * One or more filters.    bgp-asn - The customer gateway's Border Gateway Protocol (BGP) Autonomous System Number (ASN).    customer-gateway-id - The ID of the customer gateway.    ip-address - The IP address of the customer gateway's Internet-routable external interface.    state - The state of the customer gateway (pending | available | deleting | deleted).    type - The type of customer gateway. Currently, the only supported type is ipsec.1.    tag:&lt;key&gt; - The key/value combination of a tag assigned to the resource. Use the tag key in the filter name and the tag value as the filter value. For example, to find all resources that have a tag with the key Owner and the value TeamA, specify tag:Owner for the filter name and TeamA for the filter value.    tag-key - The key of a tag assigned to the resource. Use this filter to find all resources assigned a tag with a specific key, regardless of the tag value.  
    */
  var Filters: js.UndefOr[FilterList] = js.undefined
}
object DescribeCustomerGatewaysR {
  
  inline def apply(): DescribeCustomerGatewaysR = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeCustomerGatewaysR]
  }
  
  extension [Self <: DescribeCustomerGatewaysR](x: Self) {
    
    inline def set$waiter(value: WaiterConfiguration): Self = StObject.set(x, "$waiter", value.asInstanceOf[js.Any])
    
    inline def set$waiterUndefined: Self = StObject.set(x, "$waiter", js.undefined)
    
    inline def setCustomerGatewayIds(value: CustomerGatewayIdStringList): Self = StObject.set(x, "CustomerGatewayIds", value.asInstanceOf[js.Any])
    
    inline def setCustomerGatewayIdsUndefined: Self = StObject.set(x, "CustomerGatewayIds", js.undefined)
    
    inline def setCustomerGatewayIdsVarargs(value: CustomerGatewayId*): Self = StObject.set(x, "CustomerGatewayIds", js.Array(value :_*))
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setFilters(value: FilterList): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setFiltersVarargs(value: Filter*): Self = StObject.set(x, "Filters", js.Array(value :_*))
  }
}
