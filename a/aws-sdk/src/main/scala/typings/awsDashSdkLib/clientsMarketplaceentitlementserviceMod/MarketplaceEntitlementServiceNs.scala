package typings
package awsDashSdkLib.clientsMarketplaceentitlementserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/marketplaceentitlementservice", "MarketplaceEntitlementService")
@js.native
object MarketplaceEntitlementServiceNs extends js.Object {
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait Entitlement extends js.Object {
    /**
         * The customer identifier is a handle to each unique customer in an application. Customer identifiers are obtained through the ResolveCustomer operation in AWS Marketplace Metering Service.
         */
    var CustomerIdentifier: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The dimension for which the given entitlement applies. Dimensions represent categories of capacity in a product and are specified when the product is listed in AWS Marketplace.
         */
    var Dimension: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * The expiration date represents the minimum date through which this entitlement is expected to remain valid. For contractual products listed on AWS Marketplace, the expiration date is the date at which the customer will renew or cancel their contract. Customers who are opting to renew their contract will still have entitlements with an expiration date.
         */
    var ExpirationDate: js.UndefOr[Timestamp] = js.undefined
    /**
         * The product code for which the given entitlement applies. Product codes are provided by AWS Marketplace when the product listing is created.
         */
    var ProductCode: js.UndefOr[ProductCode] = js.undefined
    /**
         * The EntitlementValue represents the amount of capacity that the customer is entitled to for the product.
         */
    var Value: js.UndefOr[EntitlementValue] = js.undefined
  }
  
  
  trait EntitlementValue extends js.Object {
    /**
         * The BooleanValue field will be populated with a boolean value when the entitlement is a boolean type. Otherwise, the field will not be set.
         */
    var BooleanValue: js.UndefOr[scala.Boolean] = js.undefined
    /**
         * The DoubleValue field will be populated with a double value when the entitlement is a double type. Otherwise, the field will not be set.
         */
    var DoubleValue: js.UndefOr[Double] = js.undefined
    /**
         * The IntegerValue field will be populated with an integer value when the entitlement is an integer type. Otherwise, the field will not be set.
         */
    var IntegerValue: js.UndefOr[Integer] = js.undefined
    /**
         * The StringValue field will be populated with a string value when the entitlement is a string type. Otherwise, the field will not be set.
         */
    var StringValue: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait GetEntitlementFilters
    extends /* key */ ScalablyTyped.runtime.StringDictionary[FilterValueList]
  
  
  trait GetEntitlementsRequest extends js.Object {
    /**
         * Filter is used to return entitlements for a specific customer or for a specific dimension. Filters are described as keys mapped to a lists of values. Filtered requests are unioned for each value in the value list, and then intersected for each filter key.
         */
    var Filter: js.UndefOr[GetEntitlementFilters] = js.undefined
    /**
         * The maximum number of items to retrieve from the GetEntitlements operation. For pagination, use the NextToken field in subsequent calls to GetEntitlements.
         */
    var MaxResults: js.UndefOr[Integer] = js.undefined
    /**
         * For paginated calls to GetEntitlements, pass the NextToken from the previous GetEntitlementsResult.
         */
    var NextToken: js.UndefOr[NonEmptyString] = js.undefined
    /**
         * Product code is used to uniquely identify a product in AWS Marketplace. The product code will be provided by AWS Marketplace when the product listing is created.
         */
    var ProductCode: ProductCode
  }
  
  
  trait GetEntitlementsResult extends js.Object {
    /**
         * The set of entitlements found through the GetEntitlements operation. If the result contains an empty set of entitlements, NextToken might still be present and should be used.
         */
    var Entitlements: js.UndefOr[EntitlementList] = js.undefined
    /**
         * For paginated results, use NextToken in subsequent calls to GetEntitlements. If the result contains an empty set of entitlements, NextToken might still be present and should be used.
         */
    var NextToken: js.UndefOr[NonEmptyString] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * GetEntitlements retrieves entitlement values for a given product. The results can be filtered based on customer identifier or product dimensions.
       */
    def getEntitlements(): awsDashSdkLib.libRequestMod.Request[GetEntitlementsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * GetEntitlements retrieves entitlement values for a given product. The results can be filtered based on customer identifier or product dimensions.
       */
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
    /**
       * GetEntitlements retrieves entitlement values for a given product. The results can be filtered based on customer identifier or product dimensions.
       */
    def getEntitlements(
      params: GetEntitlementsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetEntitlementsResult, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetEntitlementsResult, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  val TypesNs: this.type = js.native
  type Boolean = scala.Boolean
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type Double = scala.Double
  type EntitlementList = js.Array[Entitlement]
  type FilterValue = java.lang.String
  type FilterValueList = js.Array[FilterValue]
  type GetEntitlementFilterName = awsDashSdkLib.awsDashSdkLibStrings.CUSTOMER_IDENTIFIER | awsDashSdkLib.awsDashSdkLibStrings.DIMENSION | java.lang.String
  type Integer = scala.Double
  type NonEmptyString = java.lang.String
  type ProductCode = java.lang.String
  type String = java.lang.String
  type Timestamp = stdLib.Date
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-01-11` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

