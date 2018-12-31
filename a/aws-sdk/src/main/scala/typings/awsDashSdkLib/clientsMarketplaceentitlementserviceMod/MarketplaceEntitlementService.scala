package typings
package awsDashSdkLib.clientsMarketplaceentitlementserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarketplaceEntitlementService
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_MarketplaceEntitlementService: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsMarketplaceentitlementserviceMod.MarketplaceEntitlementServiceNs.ClientConfiguration = js.native
  /**
    * GetEntitlements retrieves entitlement values for a given product. The results can be filtered based on customer identifier or product dimensions.
    */
  def getEntitlements(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMarketplaceentitlementserviceMod.MarketplaceEntitlementServiceNs.GetEntitlementsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getEntitlements(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMarketplaceentitlementserviceMod.MarketplaceEntitlementServiceNs.GetEntitlementsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMarketplaceentitlementserviceMod.MarketplaceEntitlementServiceNs.GetEntitlementsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * GetEntitlements retrieves entitlement values for a given product. The results can be filtered based on customer identifier or product dimensions.
    */
  def getEntitlements(
    params: awsDashSdkLib.clientsMarketplaceentitlementserviceMod.MarketplaceEntitlementServiceNs.GetEntitlementsRequest
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMarketplaceentitlementserviceMod.MarketplaceEntitlementServiceNs.GetEntitlementsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getEntitlements(
    params: awsDashSdkLib.clientsMarketplaceentitlementserviceMod.MarketplaceEntitlementServiceNs.GetEntitlementsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMarketplaceentitlementserviceMod.MarketplaceEntitlementServiceNs.GetEntitlementsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMarketplaceentitlementserviceMod.MarketplaceEntitlementServiceNs.GetEntitlementsResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

