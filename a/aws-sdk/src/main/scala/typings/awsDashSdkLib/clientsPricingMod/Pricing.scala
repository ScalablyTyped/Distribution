package typings
package awsDashSdkLib.clientsPricingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Pricing
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_Pricing: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsPricingMod.PricingNs.ClientConfiguration = js.native
  /**
    * Returns the metadata for one service or a list of the metadata for all services. Use this without a service code to get the service codes for all services. Use it with a service code, such as AmazonEC2, to get information specific to that service, such as the attribute names available for that service. For example, some of the attribute names available for EC2 are volumeType, maxIopsVolume, operation, locationType, and instanceCapacity10xlarge.
    */
  def describeServices(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPricingMod.PricingNs.DescribeServicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeServices(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPricingMod.PricingNs.DescribeServicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPricingMod.PricingNs.DescribeServicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns the metadata for one service or a list of the metadata for all services. Use this without a service code to get the service codes for all services. Use it with a service code, such as AmazonEC2, to get information specific to that service, such as the attribute names available for that service. For example, some of the attribute names available for EC2 are volumeType, maxIopsVolume, operation, locationType, and instanceCapacity10xlarge.
    */
  def describeServices(params: awsDashSdkLib.clientsPricingMod.PricingNs.DescribeServicesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPricingMod.PricingNs.DescribeServicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def describeServices(
    params: awsDashSdkLib.clientsPricingMod.PricingNs.DescribeServicesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPricingMod.PricingNs.DescribeServicesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPricingMod.PricingNs.DescribeServicesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of attribute values. Attibutes are similar to the details in a Price List API offer file. For a list of available attributes, see Offer File Definitions in the AWS Billing and Cost Management User Guide.
    */
  def getAttributeValues(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPricingMod.PricingNs.GetAttributeValuesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAttributeValues(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPricingMod.PricingNs.GetAttributeValuesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPricingMod.PricingNs.GetAttributeValuesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of attribute values. Attibutes are similar to the details in a Price List API offer file. For a list of available attributes, see Offer File Definitions in the AWS Billing and Cost Management User Guide.
    */
  def getAttributeValues(params: awsDashSdkLib.clientsPricingMod.PricingNs.GetAttributeValuesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPricingMod.PricingNs.GetAttributeValuesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getAttributeValues(
    params: awsDashSdkLib.clientsPricingMod.PricingNs.GetAttributeValuesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPricingMod.PricingNs.GetAttributeValuesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPricingMod.PricingNs.GetAttributeValuesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of all products that match the filter criteria.
    */
  def getProducts(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPricingMod.PricingNs.GetProductsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getProducts(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPricingMod.PricingNs.GetProductsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPricingMod.PricingNs.GetProductsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
    * Returns a list of all products that match the filter criteria.
    */
  def getProducts(params: awsDashSdkLib.clientsPricingMod.PricingNs.GetProductsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPricingMod.PricingNs.GetProductsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  def getProducts(
    params: awsDashSdkLib.clientsPricingMod.PricingNs.GetProductsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsPricingMod.PricingNs.GetProductsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsPricingMod.PricingNs.GetProductsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

