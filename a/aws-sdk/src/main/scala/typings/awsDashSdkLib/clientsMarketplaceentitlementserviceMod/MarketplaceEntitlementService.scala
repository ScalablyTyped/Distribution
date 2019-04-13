package typings
package awsDashSdkLib.clientsMarketplaceentitlementserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarketplaceEntitlementService
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_MarketplaceEntitlementService: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * GetEntitlements retrieves entitlement values for a given product. The results can be filtered based on customer identifier or product dimensions.
    */
  def getEntitlements(): awsDashSdkLib.libRequestMod.Request[GetEntitlementsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getEntitlements(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetEntitlementsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetEntitlementsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * GetEntitlements retrieves entitlement values for a given product. The results can be filtered based on customer identifier or product dimensions.
    */
  def getEntitlements(params: GetEntitlementsRequest): awsDashSdkLib.libRequestMod.Request[GetEntitlementsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getEntitlements(
    params: GetEntitlementsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetEntitlementsResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetEntitlementsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

