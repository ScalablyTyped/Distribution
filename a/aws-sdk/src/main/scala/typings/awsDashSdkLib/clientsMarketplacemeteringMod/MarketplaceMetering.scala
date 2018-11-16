package typings
package awsDashSdkLib.clientsMarketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MarketplaceMetering
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_MarketplaceMetering: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.ClientConfiguration = js.native
  /**
     * BatchMeterUsage is called from a SaaS application listed on the AWS Marketplace to post metering records for a set of customers. For identical requests, the API is idempotent; requests can be retried with the same records or a subset of the input records. Every request to BatchMeterUsage is for one product. If you need to meter usage for multiple products, you must make multiple calls to BatchMeterUsage. BatchMeterUsage can process up to 25 UsageRecords at a time.
     */
  def batchMeterUsage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.BatchMeterUsageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * BatchMeterUsage is called from a SaaS application listed on the AWS Marketplace to post metering records for a set of customers. For identical requests, the API is idempotent; requests can be retried with the same records or a subset of the input records. Every request to BatchMeterUsage is for one product. If you need to meter usage for multiple products, you must make multiple calls to BatchMeterUsage. BatchMeterUsage can process up to 25 UsageRecords at a time.
     */
  def batchMeterUsage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.BatchMeterUsageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.BatchMeterUsageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * BatchMeterUsage is called from a SaaS application listed on the AWS Marketplace to post metering records for a set of customers. For identical requests, the API is idempotent; requests can be retried with the same records or a subset of the input records. Every request to BatchMeterUsage is for one product. If you need to meter usage for multiple products, you must make multiple calls to BatchMeterUsage. BatchMeterUsage can process up to 25 UsageRecords at a time.
     */
  def batchMeterUsage(params: awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.BatchMeterUsageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.BatchMeterUsageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * BatchMeterUsage is called from a SaaS application listed on the AWS Marketplace to post metering records for a set of customers. For identical requests, the API is idempotent; requests can be retried with the same records or a subset of the input records. Every request to BatchMeterUsage is for one product. If you need to meter usage for multiple products, you must make multiple calls to BatchMeterUsage. BatchMeterUsage can process up to 25 UsageRecords at a time.
     */
  def batchMeterUsage(
    params: awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.BatchMeterUsageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.BatchMeterUsageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.BatchMeterUsageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * API to emit metering records. For identical requests, the API is idempotent. It simply returns the metering record ID. MeterUsage is authenticated on the buyer's AWS account, generally when running from an EC2 instance on the AWS Marketplace.
     */
  def meterUsage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.MeterUsageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * API to emit metering records. For identical requests, the API is idempotent. It simply returns the metering record ID. MeterUsage is authenticated on the buyer's AWS account, generally when running from an EC2 instance on the AWS Marketplace.
     */
  def meterUsage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.MeterUsageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.MeterUsageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * API to emit metering records. For identical requests, the API is idempotent. It simply returns the metering record ID. MeterUsage is authenticated on the buyer's AWS account, generally when running from an EC2 instance on the AWS Marketplace.
     */
  def meterUsage(params: awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.MeterUsageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.MeterUsageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * API to emit metering records. For identical requests, the API is idempotent. It simply returns the metering record ID. MeterUsage is authenticated on the buyer's AWS account, generally when running from an EC2 instance on the AWS Marketplace.
     */
  def meterUsage(
    params: awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.MeterUsageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.MeterUsageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.MeterUsageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * ResolveCustomer is called by a SaaS application during the registration process. When a buyer visits your website during the registration process, the buyer submits a registration token through their browser. The registration token is resolved through this API to obtain a CustomerIdentifier and product code.
     */
  def resolveCustomer(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.ResolveCustomerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * ResolveCustomer is called by a SaaS application during the registration process. When a buyer visits your website during the registration process, the buyer submits a registration token through their browser. The registration token is resolved through this API to obtain a CustomerIdentifier and product code.
     */
  def resolveCustomer(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.ResolveCustomerResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.ResolveCustomerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * ResolveCustomer is called by a SaaS application during the registration process. When a buyer visits your website during the registration process, the buyer submits a registration token through their browser. The registration token is resolved through this API to obtain a CustomerIdentifier and product code.
     */
  def resolveCustomer(params: awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.ResolveCustomerRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.ResolveCustomerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * ResolveCustomer is called by a SaaS application during the registration process. When a buyer visits your website during the registration process, the buyer submits a registration token through their browser. The registration token is resolved through this API to obtain a CustomerIdentifier and product code.
     */
  def resolveCustomer(
    params: awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.ResolveCustomerRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.ResolveCustomerResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.ResolveCustomerResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

