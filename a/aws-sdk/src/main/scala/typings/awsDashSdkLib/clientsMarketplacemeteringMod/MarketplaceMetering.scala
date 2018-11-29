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
     * Paid container software products sold through AWS Marketplace must integrate with the AWS Marketplace Metering Service and call the RegisterUsage operation for software entitlement and metering. Calling RegisterUsage from containers running outside of ECS is not currently supported. Free and BYOL products for ECS aren't required to call RegisterUsage, but you may choose to do so if you would like to receive usage data in your seller reports. The sections below explain the behavior of RegisterUsage. RegisterUsage performs two primary functions: metering and entitlement.    Entitlement: RegisterUsage allows you to verify that the customer running your paid software is subscribed to your product on AWS Marketplace, enabling you to guard against unauthorized use. Your container image that integrates with RegisterUsage is only required to guard against unauthorized use at container startup, as such a CustomerNotSubscribedException/PlatformNotSupportedException will only be thrown on the initial call to RegisterUsage. Subsequent calls from the same Amazon ECS task instance (e.g. task-id) will not throw a CustomerNotSubscribedException, even if the customer unsubscribes while the Amazon ECS task is still running.    Metering: RegisterUsage meters software use per ECS task, per hour, with usage prorated to the second. A minimum of 1 minute of usage applies to tasks that are short lived. For example, if a customer has a 10 node ECS cluster and creates an ECS service configured as a Daemon Set, then ECS will launch a task on all 10 cluster nodes and the customer will be charged: (10 * hourly_rate). Metering for software use is automatically handled by the AWS Marketplace Metering Control Plane -- your software is not required to perform any metering specific actions, other than call RegisterUsage once for metering of software use to commence. The AWS Marketplace Metering Control Plane will also continue to bill customers for running ECS tasks, regardless of the customers subscription state, removing the need for your software to perform entitlement checks at runtime.  
     */
  def registerUsage(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.RegisterUsageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Paid container software products sold through AWS Marketplace must integrate with the AWS Marketplace Metering Service and call the RegisterUsage operation for software entitlement and metering. Calling RegisterUsage from containers running outside of ECS is not currently supported. Free and BYOL products for ECS aren't required to call RegisterUsage, but you may choose to do so if you would like to receive usage data in your seller reports. The sections below explain the behavior of RegisterUsage. RegisterUsage performs two primary functions: metering and entitlement.    Entitlement: RegisterUsage allows you to verify that the customer running your paid software is subscribed to your product on AWS Marketplace, enabling you to guard against unauthorized use. Your container image that integrates with RegisterUsage is only required to guard against unauthorized use at container startup, as such a CustomerNotSubscribedException/PlatformNotSupportedException will only be thrown on the initial call to RegisterUsage. Subsequent calls from the same Amazon ECS task instance (e.g. task-id) will not throw a CustomerNotSubscribedException, even if the customer unsubscribes while the Amazon ECS task is still running.    Metering: RegisterUsage meters software use per ECS task, per hour, with usage prorated to the second. A minimum of 1 minute of usage applies to tasks that are short lived. For example, if a customer has a 10 node ECS cluster and creates an ECS service configured as a Daemon Set, then ECS will launch a task on all 10 cluster nodes and the customer will be charged: (10 * hourly_rate). Metering for software use is automatically handled by the AWS Marketplace Metering Control Plane -- your software is not required to perform any metering specific actions, other than call RegisterUsage once for metering of software use to commence. The AWS Marketplace Metering Control Plane will also continue to bill customers for running ECS tasks, regardless of the customers subscription state, removing the need for your software to perform entitlement checks at runtime.  
     */
  def registerUsage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.RegisterUsageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.RegisterUsageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Paid container software products sold through AWS Marketplace must integrate with the AWS Marketplace Metering Service and call the RegisterUsage operation for software entitlement and metering. Calling RegisterUsage from containers running outside of ECS is not currently supported. Free and BYOL products for ECS aren't required to call RegisterUsage, but you may choose to do so if you would like to receive usage data in your seller reports. The sections below explain the behavior of RegisterUsage. RegisterUsage performs two primary functions: metering and entitlement.    Entitlement: RegisterUsage allows you to verify that the customer running your paid software is subscribed to your product on AWS Marketplace, enabling you to guard against unauthorized use. Your container image that integrates with RegisterUsage is only required to guard against unauthorized use at container startup, as such a CustomerNotSubscribedException/PlatformNotSupportedException will only be thrown on the initial call to RegisterUsage. Subsequent calls from the same Amazon ECS task instance (e.g. task-id) will not throw a CustomerNotSubscribedException, even if the customer unsubscribes while the Amazon ECS task is still running.    Metering: RegisterUsage meters software use per ECS task, per hour, with usage prorated to the second. A minimum of 1 minute of usage applies to tasks that are short lived. For example, if a customer has a 10 node ECS cluster and creates an ECS service configured as a Daemon Set, then ECS will launch a task on all 10 cluster nodes and the customer will be charged: (10 * hourly_rate). Metering for software use is automatically handled by the AWS Marketplace Metering Control Plane -- your software is not required to perform any metering specific actions, other than call RegisterUsage once for metering of software use to commence. The AWS Marketplace Metering Control Plane will also continue to bill customers for running ECS tasks, regardless of the customers subscription state, removing the need for your software to perform entitlement checks at runtime.  
     */
  def registerUsage(params: awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.RegisterUsageRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.RegisterUsageResult, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * Paid container software products sold through AWS Marketplace must integrate with the AWS Marketplace Metering Service and call the RegisterUsage operation for software entitlement and metering. Calling RegisterUsage from containers running outside of ECS is not currently supported. Free and BYOL products for ECS aren't required to call RegisterUsage, but you may choose to do so if you would like to receive usage data in your seller reports. The sections below explain the behavior of RegisterUsage. RegisterUsage performs two primary functions: metering and entitlement.    Entitlement: RegisterUsage allows you to verify that the customer running your paid software is subscribed to your product on AWS Marketplace, enabling you to guard against unauthorized use. Your container image that integrates with RegisterUsage is only required to guard against unauthorized use at container startup, as such a CustomerNotSubscribedException/PlatformNotSupportedException will only be thrown on the initial call to RegisterUsage. Subsequent calls from the same Amazon ECS task instance (e.g. task-id) will not throw a CustomerNotSubscribedException, even if the customer unsubscribes while the Amazon ECS task is still running.    Metering: RegisterUsage meters software use per ECS task, per hour, with usage prorated to the second. A minimum of 1 minute of usage applies to tasks that are short lived. For example, if a customer has a 10 node ECS cluster and creates an ECS service configured as a Daemon Set, then ECS will launch a task on all 10 cluster nodes and the customer will be charged: (10 * hourly_rate). Metering for software use is automatically handled by the AWS Marketplace Metering Control Plane -- your software is not required to perform any metering specific actions, other than call RegisterUsage once for metering of software use to commence. The AWS Marketplace Metering Control Plane will also continue to bill customers for running ECS tasks, regardless of the customers subscription state, removing the need for your software to perform entitlement checks at runtime.  
     */
  def registerUsage(
    params: awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.RegisterUsageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.RegisterUsageResult, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.RegisterUsageResult, 
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

