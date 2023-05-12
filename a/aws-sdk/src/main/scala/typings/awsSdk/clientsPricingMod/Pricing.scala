package typings.awsSdk.clientsPricingMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pricing
  extends StObject
     with Service {
  
  var config: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Returns the metadata for one service or a list of the metadata for all services. Use this without a service code to get the service codes for all services. Use it with a service code, such as AmazonEC2, to get information specific to that service, such as the attribute names available for that service. For example, some of the attribute names available for EC2 are volumeType, maxIopsVolume, operation, locationType, and instanceCapacity10xlarge.
    */
  def describeServices(): Request[DescribeServicesResponse, AWSError] = js.native
  def describeServices(callback: js.Function2[/* err */ AWSError, /* data */ DescribeServicesResponse, Unit]): Request[DescribeServicesResponse, AWSError] = js.native
  /**
    * Returns the metadata for one service or a list of the metadata for all services. Use this without a service code to get the service codes for all services. Use it with a service code, such as AmazonEC2, to get information specific to that service, such as the attribute names available for that service. For example, some of the attribute names available for EC2 are volumeType, maxIopsVolume, operation, locationType, and instanceCapacity10xlarge.
    */
  def describeServices(params: DescribeServicesRequest): Request[DescribeServicesResponse, AWSError] = js.native
  def describeServices(
    params: DescribeServicesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeServicesResponse, Unit]
  ): Request[DescribeServicesResponse, AWSError] = js.native
  
  /**
    * Returns a list of attribute values. Attributes are similar to the details in a Price List API offer file. For a list of available attributes, see Offer File Definitions in the Billing and Cost Management User Guide.
    */
  def getAttributeValues(): Request[GetAttributeValuesResponse, AWSError] = js.native
  def getAttributeValues(callback: js.Function2[/* err */ AWSError, /* data */ GetAttributeValuesResponse, Unit]): Request[GetAttributeValuesResponse, AWSError] = js.native
  /**
    * Returns a list of attribute values. Attributes are similar to the details in a Price List API offer file. For a list of available attributes, see Offer File Definitions in the Billing and Cost Management User Guide.
    */
  def getAttributeValues(params: GetAttributeValuesRequest): Request[GetAttributeValuesResponse, AWSError] = js.native
  def getAttributeValues(
    params: GetAttributeValuesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetAttributeValuesResponse, Unit]
  ): Request[GetAttributeValuesResponse, AWSError] = js.native
  
  /**
    *   This feature is in preview release and is subject to change. Your use of Amazon Web Services Price List API is subject to the Beta Service Participation terms of the Amazon Web Services Service Terms (Section 1.10).   This returns the URL that you can retrieve your Price List file from. This URL is based on the PriceListArn and FileFormat that you retrieve from the  ListPriceLists  response. 
    */
  def getPriceListFileUrl(): Request[GetPriceListFileUrlResponse, AWSError] = js.native
  def getPriceListFileUrl(callback: js.Function2[/* err */ AWSError, /* data */ GetPriceListFileUrlResponse, Unit]): Request[GetPriceListFileUrlResponse, AWSError] = js.native
  /**
    *   This feature is in preview release and is subject to change. Your use of Amazon Web Services Price List API is subject to the Beta Service Participation terms of the Amazon Web Services Service Terms (Section 1.10).   This returns the URL that you can retrieve your Price List file from. This URL is based on the PriceListArn and FileFormat that you retrieve from the  ListPriceLists  response. 
    */
  def getPriceListFileUrl(params: GetPriceListFileUrlRequest): Request[GetPriceListFileUrlResponse, AWSError] = js.native
  def getPriceListFileUrl(
    params: GetPriceListFileUrlRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetPriceListFileUrlResponse, Unit]
  ): Request[GetPriceListFileUrlResponse, AWSError] = js.native
  
  /**
    * Returns a list of all products that match the filter criteria.
    */
  def getProducts(): Request[GetProductsResponse, AWSError] = js.native
  def getProducts(callback: js.Function2[/* err */ AWSError, /* data */ GetProductsResponse, Unit]): Request[GetProductsResponse, AWSError] = js.native
  /**
    * Returns a list of all products that match the filter criteria.
    */
  def getProducts(params: GetProductsRequest): Request[GetProductsResponse, AWSError] = js.native
  def getProducts(
    params: GetProductsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ GetProductsResponse, Unit]
  ): Request[GetProductsResponse, AWSError] = js.native
  
  /**
    *   This feature is in preview release and is subject to change. Your use of Amazon Web Services Price List API is subject to the Beta Service Participation terms of the Amazon Web Services Service Terms (Section 1.10).   This returns a list of Price List references that the requester if authorized to view, given a ServiceCode, CurrencyCode, and an EffectiveDate. Use without a RegionCode filter to list Price List references from all available Amazon Web Services Regions. Use with a RegionCode filter to get the Price List reference that's specific to a specific Amazon Web Services Region. You can use the PriceListArn from the response to get your preferred Price List files through the  GetPriceListFileUrl  API.
    */
  def listPriceLists(): Request[ListPriceListsResponse, AWSError] = js.native
  def listPriceLists(callback: js.Function2[/* err */ AWSError, /* data */ ListPriceListsResponse, Unit]): Request[ListPriceListsResponse, AWSError] = js.native
  /**
    *   This feature is in preview release and is subject to change. Your use of Amazon Web Services Price List API is subject to the Beta Service Participation terms of the Amazon Web Services Service Terms (Section 1.10).   This returns a list of Price List references that the requester if authorized to view, given a ServiceCode, CurrencyCode, and an EffectiveDate. Use without a RegionCode filter to list Price List references from all available Amazon Web Services Regions. Use with a RegionCode filter to get the Price List reference that's specific to a specific Amazon Web Services Region. You can use the PriceListArn from the response to get your preferred Price List files through the  GetPriceListFileUrl  API.
    */
  def listPriceLists(params: ListPriceListsRequest): Request[ListPriceListsResponse, AWSError] = js.native
  def listPriceLists(
    params: ListPriceListsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListPriceListsResponse, Unit]
  ): Request[ListPriceListsResponse, AWSError] = js.native
}
