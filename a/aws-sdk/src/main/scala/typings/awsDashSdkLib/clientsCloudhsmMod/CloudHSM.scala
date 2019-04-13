package typings
package awsDashSdkLib.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudHSM
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_CloudHSM: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Adds or overwrites one or more tags for the specified AWS CloudHSM resource. Each tag consists of a key and a value. Tag keys must be unique to each resource.
    */
  def addTagsToResource(): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addTagsToResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AddTagsToResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Adds or overwrites one or more tags for the specified AWS CloudHSM resource. Each tag consists of a key and a value. Tag keys must be unique to each resource.
    */
  def addTagsToResource(params: AddTagsToResourceRequest): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def addTagsToResource(
    params: AddTagsToResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ AddTagsToResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[AddTagsToResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates a high-availability partition group. A high-availability partition group is a group of partitions that spans multiple physical HSMs.
    */
  def createHapg(): awsDashSdkLib.libRequestMod.Request[CreateHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createHapg(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateHapgResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates a high-availability partition group. A high-availability partition group is a group of partitions that spans multiple physical HSMs.
    */
  def createHapg(params: CreateHapgRequest): awsDashSdkLib.libRequestMod.Request[CreateHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createHapg(
    params: CreateHapgRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateHapgResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates an uninitialized HSM instance. There is an upfront fee charged for each HSM instance that you create with the CreateHsm operation. If you accidentally provision an HSM and want to request a refund, delete the instance using the DeleteHsm operation, go to the AWS Support Center, create a new case, and select Account and Billing Support.  It can take up to 20 minutes to create and provision an HSM. You can monitor the status of the HSM with the DescribeHsm operation. The HSM is ready to be initialized when the status changes to RUNNING. 
    */
  def createHsm(): awsDashSdkLib.libRequestMod.Request[CreateHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createHsm(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateHsmResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates an uninitialized HSM instance. There is an upfront fee charged for each HSM instance that you create with the CreateHsm operation. If you accidentally provision an HSM and want to request a refund, delete the instance using the DeleteHsm operation, go to the AWS Support Center, create a new case, and select Account and Billing Support.  It can take up to 20 minutes to create and provision an HSM. You can monitor the status of the HSM with the DescribeHsm operation. The HSM is ready to be initialized when the status changes to RUNNING. 
    */
  def createHsm(params: CreateHsmRequest): awsDashSdkLib.libRequestMod.Request[CreateHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createHsm(
    params: CreateHsmRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateHsmResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates an HSM client.
    */
  def createLunaClient(): awsDashSdkLib.libRequestMod.Request[CreateLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLunaClient(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLunaClientResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates an HSM client.
    */
  def createLunaClient(params: CreateLunaClientRequest): awsDashSdkLib.libRequestMod.Request[CreateLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def createLunaClient(
    params: CreateLunaClientRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ CreateLunaClientResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[CreateLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes a high-availability partition group.
    */
  def deleteHapg(): awsDashSdkLib.libRequestMod.Request[DeleteHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteHapg(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteHapgResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes a high-availability partition group.
    */
  def deleteHapg(params: DeleteHapgRequest): awsDashSdkLib.libRequestMod.Request[DeleteHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteHapg(
    params: DeleteHapgRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteHapgResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes an HSM. After completion, this operation cannot be undone and your key material cannot be recovered.
    */
  def deleteHsm(): awsDashSdkLib.libRequestMod.Request[DeleteHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteHsm(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteHsmResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes an HSM. After completion, this operation cannot be undone and your key material cannot be recovered.
    */
  def deleteHsm(params: DeleteHsmRequest): awsDashSdkLib.libRequestMod.Request[DeleteHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteHsm(
    params: DeleteHsmRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteHsmResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes a client.
    */
  def deleteLunaClient(): awsDashSdkLib.libRequestMod.Request[DeleteLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLunaClient(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteLunaClientResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes a client.
    */
  def deleteLunaClient(params: DeleteLunaClientRequest): awsDashSdkLib.libRequestMod.Request[DeleteLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def deleteLunaClient(
    params: DeleteLunaClientRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DeleteLunaClientResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DeleteLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about a high-availability partition group.
    */
  def describeHapg(): awsDashSdkLib.libRequestMod.Request[DescribeHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeHapg(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeHapgResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about a high-availability partition group.
    */
  def describeHapg(params: DescribeHapgRequest): awsDashSdkLib.libRequestMod.Request[DescribeHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeHapg(
    params: DescribeHapgRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeHapgResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about an HSM. You can identify the HSM by its ARN or its serial number.
    */
  def describeHsm(): awsDashSdkLib.libRequestMod.Request[DescribeHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeHsm(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeHsmResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about an HSM. You can identify the HSM by its ARN or its serial number.
    */
  def describeHsm(params: DescribeHsmRequest): awsDashSdkLib.libRequestMod.Request[DescribeHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeHsm(
    params: DescribeHsmRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeHsmResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about an HSM client.
    */
  def describeLunaClient(): awsDashSdkLib.libRequestMod.Request[DescribeLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLunaClient(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLunaClientResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about an HSM client.
    */
  def describeLunaClient(params: DescribeLunaClientRequest): awsDashSdkLib.libRequestMod.Request[DescribeLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeLunaClient(
    params: DescribeLunaClientRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeLunaClientResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Gets the configuration files necessary to connect to all high availability partition groups the client is associated with.
    */
  def getConfig(): awsDashSdkLib.libRequestMod.Request[GetConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Gets the configuration files necessary to connect to all high availability partition groups the client is associated with.
    */
  def getConfig(params: GetConfigRequest): awsDashSdkLib.libRequestMod.Request[GetConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def getConfig(
    params: GetConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ GetConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[GetConfigResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists the Availability Zones that have available AWS CloudHSM capacity.
    */
  def listAvailableZones(): awsDashSdkLib.libRequestMod.Request[ListAvailableZonesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAvailableZones(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAvailableZonesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAvailableZonesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists the Availability Zones that have available AWS CloudHSM capacity.
    */
  def listAvailableZones(params: ListAvailableZonesRequest): awsDashSdkLib.libRequestMod.Request[ListAvailableZonesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listAvailableZones(
    params: ListAvailableZonesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListAvailableZonesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListAvailableZonesResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists the high-availability partition groups for the account. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListHapgs to retrieve the next set of items.
    */
  def listHapgs(): awsDashSdkLib.libRequestMod.Request[ListHapgsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listHapgs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListHapgsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListHapgsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists the high-availability partition groups for the account. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListHapgs to retrieve the next set of items.
    */
  def listHapgs(params: ListHapgsRequest): awsDashSdkLib.libRequestMod.Request[ListHapgsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listHapgs(
    params: ListHapgsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListHapgsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListHapgsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves the identifiers of all of the HSMs provisioned for the current customer. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListHsms to retrieve the next set of items.
    */
  def listHsms(): awsDashSdkLib.libRequestMod.Request[ListHsmsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listHsms(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListHsmsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListHsmsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves the identifiers of all of the HSMs provisioned for the current customer. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListHsms to retrieve the next set of items.
    */
  def listHsms(params: ListHsmsRequest): awsDashSdkLib.libRequestMod.Request[ListHsmsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listHsms(
    params: ListHsmsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListHsmsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListHsmsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists all of the clients. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListLunaClients to retrieve the next set of items.
    */
  def listLunaClients(): awsDashSdkLib.libRequestMod.Request[ListLunaClientsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listLunaClients(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListLunaClientsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListLunaClientsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists all of the clients. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListLunaClients to retrieve the next set of items.
    */
  def listLunaClients(params: ListLunaClientsRequest): awsDashSdkLib.libRequestMod.Request[ListLunaClientsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listLunaClients(
    params: ListLunaClientsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListLunaClientsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListLunaClientsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Returns a list of all tags for the specified AWS CloudHSM resource.
    */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Returns a list of all tags for the specified AWS CloudHSM resource.
    */
  def listTagsForResource(params: ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listTagsForResource(
    params: ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListTagsForResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies an existing high-availability partition group.
    */
  def modifyHapg(): awsDashSdkLib.libRequestMod.Request[ModifyHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyHapg(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyHapgResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies an existing high-availability partition group.
    */
  def modifyHapg(params: ModifyHapgRequest): awsDashSdkLib.libRequestMod.Request[ModifyHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyHapg(
    params: ModifyHapgRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyHapgResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyHapgResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies an HSM.  This operation can result in the HSM being offline for up to 15 minutes while the AWS CloudHSM service is reconfigured. If you are modifying a production HSM, you should ensure that your AWS CloudHSM service is configured for high availability, and consider executing this operation during a maintenance window. 
    */
  def modifyHsm(): awsDashSdkLib.libRequestMod.Request[ModifyHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyHsm(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyHsmResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies an HSM.  This operation can result in the HSM being offline for up to 15 minutes while the AWS CloudHSM service is reconfigured. If you are modifying a production HSM, you should ensure that your AWS CloudHSM service is configured for high availability, and consider executing this operation during a maintenance window. 
    */
  def modifyHsm(params: ModifyHsmRequest): awsDashSdkLib.libRequestMod.Request[ModifyHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyHsm(
    params: ModifyHsmRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyHsmResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyHsmResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies the certificate used by the client. This action can potentially start a workflow to install the new certificate on the client's HSMs.
    */
  def modifyLunaClient(): awsDashSdkLib.libRequestMod.Request[ModifyLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyLunaClient(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyLunaClientResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies the certificate used by the client. This action can potentially start a workflow to install the new certificate on the client's HSMs.
    */
  def modifyLunaClient(params: ModifyLunaClientRequest): awsDashSdkLib.libRequestMod.Request[ModifyLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def modifyLunaClient(
    params: ModifyLunaClientRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ModifyLunaClientResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ModifyLunaClientResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Removes one or more tags from the specified AWS CloudHSM resource. To remove a tag, specify only the tag key to remove (not the value). To overwrite the value for an existing tag, use AddTagsToResource.
    */
  def removeTagsFromResource(): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeTagsFromResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RemoveTagsFromResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Removes one or more tags from the specified AWS CloudHSM resource. To remove a tag, specify only the tag key to remove (not the value). To overwrite the value for an existing tag, use AddTagsToResource.
    */
  def removeTagsFromResource(params: RemoveTagsFromResourceRequest): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def removeTagsFromResource(
    params: RemoveTagsFromResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ RemoveTagsFromResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[RemoveTagsFromResourceResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

