package typings
package awsDashSdkLib.clientsPricingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/clients/pricing", "Pricing")
@js.native
object PricingNs extends js.Object {
  
  trait AttributeValue extends js.Object {
    /**
         * The specific value of an attributeName.
         */
    var Value: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait ClientApiVersions extends js.Object {
    /**
         * A string in YYYY-MM-DD format that represents the latest possible API version that can be used in this service. Specify 'latest' to use the latest possible version.
         */
    var apiVersion: js.UndefOr[apiVersion] = js.undefined
  }
  
  
  trait DescribeServicesRequest extends js.Object {
    /**
         * The format version that you want the response to be in. Valid values are: aws_v1 
         */
    var FormatVersion: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The maximum number of results that you want returned in the response.
         */
    var MaxResults: js.UndefOr[BoxedInteger] = js.undefined
    /**
         * The pagination token that indicates the next set of results that you want to retrieve.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The code for the service whose information you want to retrieve, such as AmazonEC2. You can use the ServiceCode to filter the results in a GetProducts call. To retrieve a list of all services, leave this blank.
         */
    var ServiceCode: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait DescribeServicesResponse extends js.Object {
    /**
         * The format version of the response. For example, aws_v1.
         */
    var FormatVersion: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The pagination token for the next set of retreivable results.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The service metadata for the service or services in the response.
         */
    var Services: js.UndefOr[ServiceList] = js.undefined
  }
  
  
  trait Filter extends js.Object {
    /**
         * The product metadata field that you want to filter on. You can filter by just the service code to see all products for a specific service, filter by just the attribute name to see a specific attribute for multiple services, or use both a service code and an attribute name to retrieve only products that match both fields. Valid values include: ServiceCode, and all attribute names For example, you can filter by the AmazonEC2 service code and the volumeType attribute name to get the prices for only Amazon EC2 volumes.
         */
    var Field: java.lang.String
    /**
         * The type of filter that you want to use. Valid values are: TERM_MATCH. TERM_MATCH returns only products that match both the given filter field and the given value.
         */
    var Type: FilterType
    /**
         * The service code or attribute value that you want to filter by. If you are filtering by service code this is the actual service code, such as AmazonEC2. If you are filtering by attribute name, this is the attribute value that you want the returned products to match, such as a Provisioned IOPS volume.
         */
    var Value: java.lang.String
  }
  
  
  trait GetAttributeValuesRequest extends js.Object {
    /**
         * The name of the attribute that you want to retrieve the values for, such as volumeType.
         */
    var AttributeName: java.lang.String
    /**
         * The maximum number of results to return in response.
         */
    var MaxResults: js.UndefOr[BoxedInteger] = js.undefined
    /**
         * The pagination token that indicates the next set of results that you want to retrieve.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The service code for the service whose attributes you want to retrieve. For example, if you want the retrieve an EC2 attribute, use AmazonEC2.
         */
    var ServiceCode: java.lang.String
  }
  
  
  trait GetAttributeValuesResponse extends js.Object {
    /**
         * The list of values for an attribute. For example, Throughput Optimized HDD and Provisioned IOPS are two available values for the AmazonEC2 volumeType.
         */
    var AttributeValues: js.UndefOr[AttributeValueList] = js.undefined
    /**
         * The pagination token that indicates the next set of results to retrieve.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait GetProductsRequest extends js.Object {
    /**
         * The list of filters that limit the returned products. only products that match all filters are returned.
         */
    var Filters: js.UndefOr[Filters] = js.undefined
    /**
         * The format version that you want the response to be in. Valid values are: aws_v1 
         */
    var FormatVersion: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The maximum number of results to return in the response.
         */
    var MaxResults: js.UndefOr[BoxedInteger] = js.undefined
    /**
         * The pagination token that indicates the next set of results that you want to retrieve.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The code for the service whose products you want to retrieve. 
         */
    var ServiceCode: js.UndefOr[java.lang.String] = js.undefined
  }
  
  
  trait GetProductsResponse extends js.Object {
    /**
         * The format version of the response. For example, aws_v1.
         */
    var FormatVersion: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The pagination token that indicates the next set of results to retrieve.
         */
    var NextToken: js.UndefOr[java.lang.String] = js.undefined
    /**
         * The list of products that match your filters. The list contains both the product metadata and the price information.
         */
    var PriceList: js.UndefOr[PriceList] = js.undefined
  }
  
  
  trait Service extends js.Object {
    /**
         * The attributes that are available for this service.
         */
    var AttributeNames: js.UndefOr[AttributeNameList] = js.undefined
    /**
         * The code for the AWS service.
         */
    var ServiceCode: js.UndefOr[java.lang.String] = js.undefined
  }
  
  @js.native
  trait Types
    extends awsDashSdkLib.libServiceMod.Service {
    @JSName("config")
    var config_Types: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
    /**
       * Returns the metadata for one service or a list of the metadata for all services. Use this without a service code to get the service codes for all services. Use it with a service code, such as AmazonEC2, to get information specific to that service, such as the attribute names available for that service. For example, some of the attribute names available for EC2 are volumeType, maxIopsVolume, operation, locationType, and instanceCapacity10xlarge.
       */
    def describeServices(): awsDashSdkLib.libRequestMod.Request[DescribeServicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the metadata for one service or a list of the metadata for all services. Use this without a service code to get the service codes for all services. Use it with a service code, such as AmazonEC2, to get information specific to that service, such as the attribute names available for that service. For example, some of the attribute names available for EC2 are volumeType, maxIopsVolume, operation, locationType, and instanceCapacity10xlarge.
       */
    def describeServices(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeServicesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeServicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the metadata for one service or a list of the metadata for all services. Use this without a service code to get the service codes for all services. Use it with a service code, such as AmazonEC2, to get information specific to that service, such as the attribute names available for that service. For example, some of the attribute names available for EC2 are volumeType, maxIopsVolume, operation, locationType, and instanceCapacity10xlarge.
       */
    def describeServices(params: DescribeServicesRequest): awsDashSdkLib.libRequestMod.Request[DescribeServicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns the metadata for one service or a list of the metadata for all services. Use this without a service code to get the service codes for all services. Use it with a service code, such as AmazonEC2, to get information specific to that service, such as the attribute names available for that service. For example, some of the attribute names available for EC2 are volumeType, maxIopsVolume, operation, locationType, and instanceCapacity10xlarge.
       */
    def describeServices(
      params: DescribeServicesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ DescribeServicesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[DescribeServicesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of attribute values. Attibutes are similar to the details in a Price List API offer file. For a list of available attributes, see Offer File Definitions in the AWS Billing and Cost Management User Guide.
       */
    def getAttributeValues(): awsDashSdkLib.libRequestMod.Request[GetAttributeValuesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of attribute values. Attibutes are similar to the details in a Price List API offer file. For a list of available attributes, see Offer File Definitions in the AWS Billing and Cost Management User Guide.
       */
    def getAttributeValues(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAttributeValuesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAttributeValuesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of attribute values. Attibutes are similar to the details in a Price List API offer file. For a list of available attributes, see Offer File Definitions in the AWS Billing and Cost Management User Guide.
       */
    def getAttributeValues(params: GetAttributeValuesRequest): awsDashSdkLib.libRequestMod.Request[GetAttributeValuesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of attribute values. Attibutes are similar to the details in a Price List API offer file. For a list of available attributes, see Offer File Definitions in the AWS Billing and Cost Management User Guide.
       */
    def getAttributeValues(
      params: GetAttributeValuesRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetAttributeValuesResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetAttributeValuesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of all products that match the filter criteria.
       */
    def getProducts(): awsDashSdkLib.libRequestMod.Request[GetProductsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of all products that match the filter criteria.
       */
    def getProducts(
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetProductsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetProductsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of all products that match the filter criteria.
       */
    def getProducts(params: GetProductsRequest): awsDashSdkLib.libRequestMod.Request[GetProductsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
    /**
       * Returns a list of all products that match the filter criteria.
       */
    def getProducts(
      params: GetProductsRequest,
      callback: js.Function2[
          /* err */ awsDashSdkLib.libErrorMod.AWSError, 
          /* data */ GetProductsResponse, 
          scala.Unit
        ]
    ): awsDashSdkLib.libRequestMod.Request[GetProductsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  }
  
  val TypesNs: this.type = js.native
  type AttributeNameList = js.Array[java.lang.String]
  type AttributeValueList = js.Array[AttributeValue]
  type BoxedInteger = scala.Double
  type ClientConfiguration = awsDashSdkLib.libServiceMod.ServiceConfigurationOptions with ClientApiVersions
  type FilterType = awsDashSdkLib.awsDashSdkLibStrings.TERM_MATCH | java.lang.String
  type Filters = js.Array[Filter]
  type PriceList = js.Array[PriceListItemJSON]
  type PriceListItemJSON = java.lang.String
  type ServiceList = js.Array[Service]
  type String = java.lang.String
  type apiVersion = awsDashSdkLib.awsDashSdkLibStrings.`2017-10-15` | awsDashSdkLib.awsDashSdkLibStrings.latest | java.lang.String
}

