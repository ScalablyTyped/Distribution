package typings
package awsDashSdkLib.clientsMarketplacemeteringMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/marketplacemetering", "MarketplaceMetering")
@js.native
object MarketplaceMeteringNs extends js.Object {
  trait BatchMeterUsageRequest extends js.Object {
    /**
      * Product code is used to uniquely identify a product in AWS Marketplace. The product code should be the same as the one used during the publishing of a new product.
      */
    var ProductCode: awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.ProductCode
    /**
      * The set of UsageRecords to submit. BatchMeterUsage accepts up to 25 UsageRecords at a time.
      */
    var UsageRecords: UsageRecordList
  }
  
  trait BatchMeterUsageResult extends js.Object {
    /**
      * Contains all UsageRecords processed by BatchMeterUsage. These records were either honored by AWS Marketplace Metering Service or were invalid.
      */
    var Results: js.UndefOr[UsageRecordResultList] = js.undefined
    /**
      * Contains all UsageRecords that were not processed by BatchMeterUsage. This is a list of UsageRecords. You can retry the failed request by making another BatchMeterUsage call with this list as input in the BatchMeterUsageRequest.
      */
    var UnprocessedRecords: js.UndefOr[UsageRecordList] = js.undefined
  }
  
  trait ClientApiVersions extends js.Object {
    /**
      * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
      */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  trait MeterUsageRequest extends js.Object {
    /**
      * Checks whether you have the permissions required for the action, but does not make the request. If you have the permissions, the request returns DryRunOperation; otherwise, it returns UnauthorizedException.
      */
    var DryRun: Boolean
    /**
      * Product code is used to uniquely identify a product in AWS Marketplace. The product code should be the same as the one used during the publishing of a new product.
      */
    var ProductCode: awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.ProductCode
    /**
      * Timestamp of the hour, recorded in UTC. The seconds and milliseconds portions of the timestamp will be ignored.
      */
    var Timestamp: awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.Timestamp
    /**
      * It will be one of the fcp dimension name provided during the publishing of the product.
      */
    var UsageDimension: awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.UsageDimension
    /**
      * Consumption value for the hour.
      */
    var UsageQuantity: awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.UsageQuantity
  }
  
  trait MeterUsageResult extends js.Object {
    /**
      * Metering record id.
      */
    var MeteringRecordId: js.UndefOr[String] = js.undefined
  }
  
  trait RegisterUsageRequest extends js.Object {
    /**
      * (Optional) To scope down the registration to a specific running software instance and guard against replay attacks.
      */
    var Nonce: js.UndefOr[Nonce] = js.undefined
    /**
      * Product code is used to uniquely identify a product in AWS Marketplace. The product code should be the same as the one used during the publishing of a new product.
      */
    var ProductCode: awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.ProductCode
    /**
      * Public Key Version provided by AWS Marketplace
      */
    var PublicKeyVersion: VersionInteger
  }
  
  trait RegisterUsageResult extends js.Object {
    /**
      * (Optional) Only included when public key version has expired
      */
    var PublicKeyRotationTimestamp: js.UndefOr[Timestamp] = js.undefined
    /**
      * JWT Token
      */
    var Signature: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  trait ResolveCustomerRequest extends js.Object {
    /**
      * When a buyer visits your website during the registration process, the buyer submits a registration token through the browser. The registration token is resolved to obtain a CustomerIdentifier and product code.
      */
    var RegistrationToken: NonEmptyString
  }
  
  trait ResolveCustomerResult extends js.Object {
    /**
      * The CustomerIdentifier is used to identify an individual customer in your application. Calls to BatchMeterUsage require CustomerIdentifiers for each UsageRecord.
      */
    var CustomerIdentifier: js.UndefOr[CustomerIdentifier] = js.undefined
    /**
      * The product code is returned to confirm that the buyer is registering for your product. Subsequent BatchMeterUsage calls should be made using this product code.
      */
    var ProductCode: js.UndefOr[ProductCode] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
      * BatchMeterUsage is called from a SaaS application listed on the AWS Marketplace to post metering records for a set of customers. For identical requests, the API is idempotent; requests can be retried with the same records or a subset of the input records. Every request to BatchMeterUsage is for one product. If you need to meter usage for multiple products, you must make multiple calls to BatchMeterUsage. BatchMeterUsage can process up to 25 UsageRecords at a time.
      */
    def batchMeterUsage(): awsDashSdkLib.libRequestMod.Request[BatchMeterUsageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchMeterUsage(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchMeterUsageResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchMeterUsageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * BatchMeterUsage is called from a SaaS application listed on the AWS Marketplace to post metering records for a set of customers. For identical requests, the API is idempotent; requests can be retried with the same records or a subset of the input records. Every request to BatchMeterUsage is for one product. If you need to meter usage for multiple products, you must make multiple calls to BatchMeterUsage. BatchMeterUsage can process up to 25 UsageRecords at a time.
      */
    def batchMeterUsage(params: BatchMeterUsageRequest): awsDashSdkLib.libRequestMod.Request[BatchMeterUsageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def batchMeterUsage(
      params: BatchMeterUsageRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ BatchMeterUsageResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[BatchMeterUsageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * API to emit metering records. For identical requests, the API is idempotent. It simply returns the metering record ID. MeterUsage is authenticated on the buyer's AWS account, generally when running from an EC2 instance on the AWS Marketplace.
      */
    def meterUsage(): awsDashSdkLib.libRequestMod.Request[MeterUsageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def meterUsage(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ MeterUsageResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[MeterUsageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * API to emit metering records. For identical requests, the API is idempotent. It simply returns the metering record ID. MeterUsage is authenticated on the buyer's AWS account, generally when running from an EC2 instance on the AWS Marketplace.
      */
    def meterUsage(params: MeterUsageRequest): awsDashSdkLib.libRequestMod.Request[MeterUsageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def meterUsage(
      params: MeterUsageRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ MeterUsageResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[MeterUsageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Paid container software products sold through AWS Marketplace must integrate with the AWS Marketplace Metering Service and call the RegisterUsage operation for software entitlement and metering. Calling RegisterUsage from containers running outside of ECS is not currently supported. Free and BYOL products for ECS aren't required to call RegisterUsage, but you may choose to do so if you would like to receive usage data in your seller reports. The sections below explain the behavior of RegisterUsage. RegisterUsage performs two primary functions: metering and entitlement.    Entitlement: RegisterUsage allows you to verify that the customer running your paid software is subscribed to your product on AWS Marketplace, enabling you to guard against unauthorized use. Your container image that integrates with RegisterUsage is only required to guard against unauthorized use at container startup, as such a CustomerNotSubscribedException/PlatformNotSupportedException will only be thrown on the initial call to RegisterUsage. Subsequent calls from the same Amazon ECS task instance (e.g. task-id) will not throw a CustomerNotSubscribedException, even if the customer unsubscribes while the Amazon ECS task is still running.    Metering: RegisterUsage meters software use per ECS task, per hour, with usage prorated to the second. A minimum of 1 minute of usage applies to tasks that are short lived. For example, if a customer has a 10 node ECS cluster and creates an ECS service configured as a Daemon Set, then ECS will launch a task on all 10 cluster nodes and the customer will be charged: (10 * hourly_rate). Metering for software use is automatically handled by the AWS Marketplace Metering Control Plane -- your software is not required to perform any metering specific actions, other than call RegisterUsage once for metering of software use to commence. The AWS Marketplace Metering Control Plane will also continue to bill customers for running ECS tasks, regardless of the customers subscription state, removing the need for your software to perform entitlement checks at runtime.  
      */
    def registerUsage(): awsDashSdkLib.libRequestMod.Request[RegisterUsageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerUsage(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterUsageResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterUsageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * Paid container software products sold through AWS Marketplace must integrate with the AWS Marketplace Metering Service and call the RegisterUsage operation for software entitlement and metering. Calling RegisterUsage from containers running outside of ECS is not currently supported. Free and BYOL products for ECS aren't required to call RegisterUsage, but you may choose to do so if you would like to receive usage data in your seller reports. The sections below explain the behavior of RegisterUsage. RegisterUsage performs two primary functions: metering and entitlement.    Entitlement: RegisterUsage allows you to verify that the customer running your paid software is subscribed to your product on AWS Marketplace, enabling you to guard against unauthorized use. Your container image that integrates with RegisterUsage is only required to guard against unauthorized use at container startup, as such a CustomerNotSubscribedException/PlatformNotSupportedException will only be thrown on the initial call to RegisterUsage. Subsequent calls from the same Amazon ECS task instance (e.g. task-id) will not throw a CustomerNotSubscribedException, even if the customer unsubscribes while the Amazon ECS task is still running.    Metering: RegisterUsage meters software use per ECS task, per hour, with usage prorated to the second. A minimum of 1 minute of usage applies to tasks that are short lived. For example, if a customer has a 10 node ECS cluster and creates an ECS service configured as a Daemon Set, then ECS will launch a task on all 10 cluster nodes and the customer will be charged: (10 * hourly_rate). Metering for software use is automatically handled by the AWS Marketplace Metering Control Plane -- your software is not required to perform any metering specific actions, other than call RegisterUsage once for metering of software use to commence. The AWS Marketplace Metering Control Plane will also continue to bill customers for running ECS tasks, regardless of the customers subscription state, removing the need for your software to perform entitlement checks at runtime.  
      */
    def registerUsage(params: RegisterUsageRequest): awsDashSdkLib.libRequestMod.Request[RegisterUsageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def registerUsage(
      params: RegisterUsageRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ RegisterUsageResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[RegisterUsageResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * ResolveCustomer is called by a SaaS application during the registration process. When a buyer visits your website during the registration process, the buyer submits a registration token through their browser. The registration token is resolved through this API to obtain a CustomerIdentifier and product code.
      */
    def resolveCustomer(): awsDashSdkLib.libRequestMod.Request[ResolveCustomerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def resolveCustomer(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResolveCustomerResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResolveCustomerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
      * ResolveCustomer is called by a SaaS application during the registration process. When a buyer visits your website during the registration process, the buyer submits a registration token through their browser. The registration token is resolved through this API to obtain a CustomerIdentifier and product code.
      */
    def resolveCustomer(params: ResolveCustomerRequest): awsDashSdkLib.libRequestMod.Request[ResolveCustomerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    def resolveCustomer(
      params: ResolveCustomerRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ ResolveCustomerResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[ResolveCustomerResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  trait UsageRecord extends js.Object {
    /**
      * The CustomerIdentifier is obtained through the ResolveCustomer operation and represents an individual buyer in your application.
      */
    var CustomerIdentifier: awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.CustomerIdentifier
    /**
      * During the process of registering a product on AWS Marketplace, up to eight dimensions are specified. These represent different units of value in your application.
      */
    var Dimension: UsageDimension
    /**
      * The quantity of usage consumed by the customer for the given dimension and time.
      */
    var Quantity: UsageQuantity
    /**
      * Timestamp of the hour, recorded in UTC. The seconds and milliseconds portions of the timestamp will be ignored. Your application can meter usage for up to one hour in the past.
      */
    var Timestamp: awsDashSdkLib.clientsMarketplacemeteringMod.MarketplaceMeteringNs.Timestamp
  }
  
  trait UsageRecordResult extends js.Object {
    /**
      * The MeteringRecordId is a unique identifier for this metering event.
      */
    var MeteringRecordId: js.UndefOr[String] = js.undefined
    /**
      * The UsageRecordResult Status indicates the status of an individual UsageRecord processed by BatchMeterUsage.    Success- The UsageRecord was accepted and honored by BatchMeterUsage.    CustomerNotSubscribed- The CustomerIdentifier specified is not subscribed to your product. The UsageRecord was not honored. Future UsageRecords for this customer will fail until the customer subscribes to your product.    DuplicateRecord- Indicates that the UsageRecord was invalid and not honored. A previously metered UsageRecord had the same customer, dimension, and time, but a different quantity.  
      */
    var Status: js.UndefOr[UsageRecordResultStatus] = js.undefined
    /**
      * The UsageRecord that was part of the BatchMeterUsage request.
      */
    var UsageRecord: js.UndefOr[UsageRecord] = js.undefined
  }
  
  trait _UsageRecordResultStatus extends js.Object
  
  trait _apiVersion extends js.Object
  
  val TypesNs: this.type = js.native
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type CustomerIdentifier = java.lang.String
  type NonEmptyString = java.lang.String
  type Nonce = java.lang.String
  type ProductCode = java.lang.String
  type String = java.lang.String
  type Timestamp = stdLib.Date
  type UsageDimension = java.lang.String
  type UsageQuantity = scala.Double
  type UsageRecordList = js.Array[UsageRecord]
  type UsageRecordResultList = js.Array[UsageRecordResult]
  type UsageRecordResultStatus = _UsageRecordResultStatus | java.lang.String
  type VersionInteger = scala.Double
  type apiVersion = _apiVersion | java.lang.String
}

