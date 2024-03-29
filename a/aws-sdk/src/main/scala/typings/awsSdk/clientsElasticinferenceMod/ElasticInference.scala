package typings.awsSdk.clientsElasticinferenceMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ElasticInference extends Service {
  
  @JSName("config")
  var config_ElasticInference: ConfigBase & ClientConfiguration = js.native
  
  /**
    *  Describes the locations in which a given accelerator type or set of types is present in a given region.   February 15, 2023: Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference (EI), and will help current customers migrate their workloads to options that offer better price and performance. After April 15, 2023, new customers will not be able to launch instances with Amazon EI accelerators in Amazon SageMaker, Amazon ECS, or Amazon EC2. However, customers who have used Amazon EI at least once during the past 30-day period are considered current customers and will be able to continue using the service. 
    */
  def describeAcceleratorOfferings(): Request[DescribeAcceleratorOfferingsResponse, AWSError] = js.native
  def describeAcceleratorOfferings(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAcceleratorOfferingsResponse, Unit]): Request[DescribeAcceleratorOfferingsResponse, AWSError] = js.native
  /**
    *  Describes the locations in which a given accelerator type or set of types is present in a given region.   February 15, 2023: Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference (EI), and will help current customers migrate their workloads to options that offer better price and performance. After April 15, 2023, new customers will not be able to launch instances with Amazon EI accelerators in Amazon SageMaker, Amazon ECS, or Amazon EC2. However, customers who have used Amazon EI at least once during the past 30-day period are considered current customers and will be able to continue using the service. 
    */
  def describeAcceleratorOfferings(params: DescribeAcceleratorOfferingsRequest): Request[DescribeAcceleratorOfferingsResponse, AWSError] = js.native
  def describeAcceleratorOfferings(
    params: DescribeAcceleratorOfferingsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAcceleratorOfferingsResponse, Unit]
  ): Request[DescribeAcceleratorOfferingsResponse, AWSError] = js.native
  
  /**
    *  Describes the accelerator types available in a given region, as well as their characteristics, such as memory and throughput.   February 15, 2023: Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference (EI), and will help current customers migrate their workloads to options that offer better price and performance. After April 15, 2023, new customers will not be able to launch instances with Amazon EI accelerators in Amazon SageMaker, Amazon ECS, or Amazon EC2. However, customers who have used Amazon EI at least once during the past 30-day period are considered current customers and will be able to continue using the service. 
    */
  def describeAcceleratorTypes(): Request[DescribeAcceleratorTypesResponse, AWSError] = js.native
  def describeAcceleratorTypes(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAcceleratorTypesResponse, Unit]): Request[DescribeAcceleratorTypesResponse, AWSError] = js.native
  /**
    *  Describes the accelerator types available in a given region, as well as their characteristics, such as memory and throughput.   February 15, 2023: Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference (EI), and will help current customers migrate their workloads to options that offer better price and performance. After April 15, 2023, new customers will not be able to launch instances with Amazon EI accelerators in Amazon SageMaker, Amazon ECS, or Amazon EC2. However, customers who have used Amazon EI at least once during the past 30-day period are considered current customers and will be able to continue using the service. 
    */
  def describeAcceleratorTypes(params: DescribeAcceleratorTypesRequest): Request[DescribeAcceleratorTypesResponse, AWSError] = js.native
  def describeAcceleratorTypes(
    params: DescribeAcceleratorTypesRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAcceleratorTypesResponse, Unit]
  ): Request[DescribeAcceleratorTypesResponse, AWSError] = js.native
  
  /**
    *  Describes information over a provided set of accelerators belonging to an account.   February 15, 2023: Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference (EI), and will help current customers migrate their workloads to options that offer better price and performance. After April 15, 2023, new customers will not be able to launch instances with Amazon EI accelerators in Amazon SageMaker, Amazon ECS, or Amazon EC2. However, customers who have used Amazon EI at least once during the past 30-day period are considered current customers and will be able to continue using the service. 
    */
  def describeAccelerators(): Request[DescribeAcceleratorsResponse, AWSError] = js.native
  def describeAccelerators(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAcceleratorsResponse, Unit]): Request[DescribeAcceleratorsResponse, AWSError] = js.native
  /**
    *  Describes information over a provided set of accelerators belonging to an account.   February 15, 2023: Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference (EI), and will help current customers migrate their workloads to options that offer better price and performance. After April 15, 2023, new customers will not be able to launch instances with Amazon EI accelerators in Amazon SageMaker, Amazon ECS, or Amazon EC2. However, customers who have used Amazon EI at least once during the past 30-day period are considered current customers and will be able to continue using the service. 
    */
  def describeAccelerators(params: DescribeAcceleratorsRequest): Request[DescribeAcceleratorsResponse, AWSError] = js.native
  def describeAccelerators(
    params: DescribeAcceleratorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAcceleratorsResponse, Unit]
  ): Request[DescribeAcceleratorsResponse, AWSError] = js.native
  
  /**
    *  Returns all tags of an Elastic Inference Accelerator.   February 15, 2023: Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference (EI), and will help current customers migrate their workloads to options that offer better price and performance. After April 15, 2023, new customers will not be able to launch instances with Amazon EI accelerators in Amazon SageMaker, Amazon ECS, or Amazon EC2. However, customers who have used Amazon EI at least once during the past 30-day period are considered current customers and will be able to continue using the service. 
    */
  def listTagsForResource(): Request[ListTagsForResourceResult, AWSError] = js.native
  def listTagsForResource(callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResult, Unit]): Request[ListTagsForResourceResult, AWSError] = js.native
  /**
    *  Returns all tags of an Elastic Inference Accelerator.   February 15, 2023: Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference (EI), and will help current customers migrate their workloads to options that offer better price and performance. After April 15, 2023, new customers will not be able to launch instances with Amazon EI accelerators in Amazon SageMaker, Amazon ECS, or Amazon EC2. However, customers who have used Amazon EI at least once during the past 30-day period are considered current customers and will be able to continue using the service. 
    */
  def listTagsForResource(params: ListTagsForResourceRequest): Request[ListTagsForResourceResult, AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListTagsForResourceResult, Unit]
  ): Request[ListTagsForResourceResult, AWSError] = js.native
  
  /**
    *  Adds the specified tags to an Elastic Inference Accelerator.   February 15, 2023: Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference (EI), and will help current customers migrate their workloads to options that offer better price and performance. After April 15, 2023, new customers will not be able to launch instances with Amazon EI accelerators in Amazon SageMaker, Amazon ECS, or Amazon EC2. However, customers who have used Amazon EI at least once during the past 30-day period are considered current customers and will be able to continue using the service. 
    */
  def tagResource(): Request[TagResourceResult, AWSError] = js.native
  def tagResource(callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResult, Unit]): Request[TagResourceResult, AWSError] = js.native
  /**
    *  Adds the specified tags to an Elastic Inference Accelerator.   February 15, 2023: Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference (EI), and will help current customers migrate their workloads to options that offer better price and performance. After April 15, 2023, new customers will not be able to launch instances with Amazon EI accelerators in Amazon SageMaker, Amazon ECS, or Amazon EC2. However, customers who have used Amazon EI at least once during the past 30-day period are considered current customers and will be able to continue using the service. 
    */
  def tagResource(params: TagResourceRequest): Request[TagResourceResult, AWSError] = js.native
  def tagResource(
    params: TagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ TagResourceResult, Unit]
  ): Request[TagResourceResult, AWSError] = js.native
  
  /**
    *  Removes the specified tags from an Elastic Inference Accelerator.   February 15, 2023: Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference (EI), and will help current customers migrate their workloads to options that offer better price and performance. After April 15, 2023, new customers will not be able to launch instances with Amazon EI accelerators in Amazon SageMaker, Amazon ECS, or Amazon EC2. However, customers who have used Amazon EI at least once during the past 30-day period are considered current customers and will be able to continue using the service. 
    */
  def untagResource(): Request[UntagResourceResult, AWSError] = js.native
  def untagResource(callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResult, Unit]): Request[UntagResourceResult, AWSError] = js.native
  /**
    *  Removes the specified tags from an Elastic Inference Accelerator.   February 15, 2023: Starting April 15, 2023, AWS will not onboard new customers to Amazon Elastic Inference (EI), and will help current customers migrate their workloads to options that offer better price and performance. After April 15, 2023, new customers will not be able to launch instances with Amazon EI accelerators in Amazon SageMaker, Amazon ECS, or Amazon EC2. However, customers who have used Amazon EI at least once during the past 30-day period are considered current customers and will be able to continue using the service. 
    */
  def untagResource(params: UntagResourceRequest): Request[UntagResourceResult, AWSError] = js.native
  def untagResource(
    params: UntagResourceRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ UntagResourceResult, Unit]
  ): Request[UntagResourceResult, AWSError] = js.native
}
