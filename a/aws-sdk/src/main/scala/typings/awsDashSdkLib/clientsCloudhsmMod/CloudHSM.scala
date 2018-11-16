package typings
package awsDashSdkLib.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudHSM
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_CloudHSM: awsDashSdkLib.libConfigMod.ConfigBase with awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ClientConfiguration = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Adds or overwrites one or more tags for the specified AWS CloudHSM resource. Each tag consists of a key and a value. Tag keys must be unique to each resource.
     */
  def addTagsToResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.AddTagsToResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Adds or overwrites one or more tags for the specified AWS CloudHSM resource. Each tag consists of a key and a value. Tag keys must be unique to each resource.
     */
  def addTagsToResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.AddTagsToResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.AddTagsToResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Adds or overwrites one or more tags for the specified AWS CloudHSM resource. Each tag consists of a key and a value. Tag keys must be unique to each resource.
     */
  def addTagsToResource(params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.AddTagsToResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.AddTagsToResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Adds or overwrites one or more tags for the specified AWS CloudHSM resource. Each tag consists of a key and a value. Tag keys must be unique to each resource.
     */
  def addTagsToResource(
    params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.AddTagsToResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.AddTagsToResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.AddTagsToResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates a high-availability partition group. A high-availability partition group is a group of partitions that spans multiple physical HSMs.
     */
  def createHapg(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.CreateHapgResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates a high-availability partition group. A high-availability partition group is a group of partitions that spans multiple physical HSMs.
     */
  def createHapg(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.CreateHapgResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.CreateHapgResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates a high-availability partition group. A high-availability partition group is a group of partitions that spans multiple physical HSMs.
     */
  def createHapg(params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.CreateHapgRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.CreateHapgResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates a high-availability partition group. A high-availability partition group is a group of partitions that spans multiple physical HSMs.
     */
  def createHapg(
    params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.CreateHapgRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.CreateHapgResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.CreateHapgResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates an uninitialized HSM instance. There is an upfront fee charged for each HSM instance that you create with the CreateHsm operation. If you accidentally provision an HSM and want to request a refund, delete the instance using the DeleteHsm operation, go to the AWS Support Center, create a new case, and select Account and Billing Support.  It can take up to 20 minutes to create and provision an HSM. You can monitor the status of the HSM with the DescribeHsm operation. The HSM is ready to be initialized when the status changes to RUNNING. 
     */
  def createHsm(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.CreateHsmResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates an uninitialized HSM instance. There is an upfront fee charged for each HSM instance that you create with the CreateHsm operation. If you accidentally provision an HSM and want to request a refund, delete the instance using the DeleteHsm operation, go to the AWS Support Center, create a new case, and select Account and Billing Support.  It can take up to 20 minutes to create and provision an HSM. You can monitor the status of the HSM with the DescribeHsm operation. The HSM is ready to be initialized when the status changes to RUNNING. 
     */
  def createHsm(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.CreateHsmResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.CreateHsmResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates an uninitialized HSM instance. There is an upfront fee charged for each HSM instance that you create with the CreateHsm operation. If you accidentally provision an HSM and want to request a refund, delete the instance using the DeleteHsm operation, go to the AWS Support Center, create a new case, and select Account and Billing Support.  It can take up to 20 minutes to create and provision an HSM. You can monitor the status of the HSM with the DescribeHsm operation. The HSM is ready to be initialized when the status changes to RUNNING. 
     */
  def createHsm(params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.CreateHsmRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.CreateHsmResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates an uninitialized HSM instance. There is an upfront fee charged for each HSM instance that you create with the CreateHsm operation. If you accidentally provision an HSM and want to request a refund, delete the instance using the DeleteHsm operation, go to the AWS Support Center, create a new case, and select Account and Billing Support.  It can take up to 20 minutes to create and provision an HSM. You can monitor the status of the HSM with the DescribeHsm operation. The HSM is ready to be initialized when the status changes to RUNNING. 
     */
  def createHsm(
    params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.CreateHsmRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.CreateHsmResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.CreateHsmResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates an HSM client.
     */
  def createLunaClient(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.CreateLunaClientResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates an HSM client.
     */
  def createLunaClient(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.CreateLunaClientResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.CreateLunaClientResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates an HSM client.
     */
  def createLunaClient(params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.CreateLunaClientRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.CreateLunaClientResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Creates an HSM client.
     */
  def createLunaClient(
    params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.CreateLunaClientRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.CreateLunaClientResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.CreateLunaClientResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes a high-availability partition group.
     */
  def deleteHapg(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DeleteHapgResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes a high-availability partition group.
     */
  def deleteHapg(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DeleteHapgResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DeleteHapgResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes a high-availability partition group.
     */
  def deleteHapg(params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DeleteHapgRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DeleteHapgResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes a high-availability partition group.
     */
  def deleteHapg(
    params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DeleteHapgRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DeleteHapgResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DeleteHapgResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes an HSM. After completion, this operation cannot be undone and your key material cannot be recovered.
     */
  def deleteHsm(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DeleteHsmResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes an HSM. After completion, this operation cannot be undone and your key material cannot be recovered.
     */
  def deleteHsm(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DeleteHsmResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DeleteHsmResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes an HSM. After completion, this operation cannot be undone and your key material cannot be recovered.
     */
  def deleteHsm(params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DeleteHsmRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DeleteHsmResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes an HSM. After completion, this operation cannot be undone and your key material cannot be recovered.
     */
  def deleteHsm(
    params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DeleteHsmRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DeleteHsmResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DeleteHsmResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes a client.
     */
  def deleteLunaClient(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DeleteLunaClientResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes a client.
     */
  def deleteLunaClient(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DeleteLunaClientResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DeleteLunaClientResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes a client.
     */
  def deleteLunaClient(params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DeleteLunaClientRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DeleteLunaClientResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Deletes a client.
     */
  def deleteLunaClient(
    params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DeleteLunaClientRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DeleteLunaClientResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DeleteLunaClientResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about a high-availability partition group.
     */
  def describeHapg(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DescribeHapgResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about a high-availability partition group.
     */
  def describeHapg(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DescribeHapgResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DescribeHapgResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about a high-availability partition group.
     */
  def describeHapg(params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DescribeHapgRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DescribeHapgResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about a high-availability partition group.
     */
  def describeHapg(
    params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DescribeHapgRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DescribeHapgResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DescribeHapgResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about an HSM. You can identify the HSM by its ARN or its serial number.
     */
  def describeHsm(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DescribeHsmResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about an HSM. You can identify the HSM by its ARN or its serial number.
     */
  def describeHsm(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DescribeHsmResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DescribeHsmResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about an HSM. You can identify the HSM by its ARN or its serial number.
     */
  def describeHsm(params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DescribeHsmRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DescribeHsmResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about an HSM. You can identify the HSM by its ARN or its serial number.
     */
  def describeHsm(
    params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DescribeHsmRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DescribeHsmResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DescribeHsmResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about an HSM client.
     */
  def describeLunaClient(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DescribeLunaClientResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about an HSM client.
     */
  def describeLunaClient(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DescribeLunaClientResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DescribeLunaClientResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about an HSM client.
     */
  def describeLunaClient(params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DescribeLunaClientRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DescribeLunaClientResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves information about an HSM client.
     */
  def describeLunaClient(
    params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DescribeLunaClientRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DescribeLunaClientResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.DescribeLunaClientResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Gets the configuration files necessary to connect to all high availability partition groups the client is associated with.
     */
  def getConfig(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.GetConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Gets the configuration files necessary to connect to all high availability partition groups the client is associated with.
     */
  def getConfig(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.GetConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.GetConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Gets the configuration files necessary to connect to all high availability partition groups the client is associated with.
     */
  def getConfig(params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.GetConfigRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.GetConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Gets the configuration files necessary to connect to all high availability partition groups the client is associated with.
     */
  def getConfig(
    params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.GetConfigRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.GetConfigResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.GetConfigResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists the Availability Zones that have available AWS CloudHSM capacity.
     */
  def listAvailableZones(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListAvailableZonesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists the Availability Zones that have available AWS CloudHSM capacity.
     */
  def listAvailableZones(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListAvailableZonesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListAvailableZonesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists the Availability Zones that have available AWS CloudHSM capacity.
     */
  def listAvailableZones(params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListAvailableZonesRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListAvailableZonesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists the Availability Zones that have available AWS CloudHSM capacity.
     */
  def listAvailableZones(
    params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListAvailableZonesRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListAvailableZonesResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListAvailableZonesResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists the high-availability partition groups for the account. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListHapgs to retrieve the next set of items.
     */
  def listHapgs(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListHapgsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists the high-availability partition groups for the account. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListHapgs to retrieve the next set of items.
     */
  def listHapgs(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListHapgsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListHapgsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists the high-availability partition groups for the account. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListHapgs to retrieve the next set of items.
     */
  def listHapgs(params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListHapgsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListHapgsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists the high-availability partition groups for the account. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListHapgs to retrieve the next set of items.
     */
  def listHapgs(
    params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListHapgsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListHapgsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListHapgsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves the identifiers of all of the HSMs provisioned for the current customer. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListHsms to retrieve the next set of items.
     */
  def listHsms(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListHsmsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves the identifiers of all of the HSMs provisioned for the current customer. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListHsms to retrieve the next set of items.
     */
  def listHsms(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListHsmsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListHsmsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves the identifiers of all of the HSMs provisioned for the current customer. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListHsms to retrieve the next set of items.
     */
  def listHsms(params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListHsmsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListHsmsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Retrieves the identifiers of all of the HSMs provisioned for the current customer. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListHsms to retrieve the next set of items.
     */
  def listHsms(
    params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListHsmsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListHsmsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListHsmsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists all of the clients. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListLunaClients to retrieve the next set of items.
     */
  def listLunaClients(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListLunaClientsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists all of the clients. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListLunaClients to retrieve the next set of items.
     */
  def listLunaClients(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListLunaClientsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListLunaClientsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists all of the clients. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListLunaClients to retrieve the next set of items.
     */
  def listLunaClients(params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListLunaClientsRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListLunaClientsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Lists all of the clients. This operation supports pagination with the use of the NextToken member. If more results are available, the NextToken member of the response contains a token that you pass in the next call to ListLunaClients to retrieve the next set of items.
     */
  def listLunaClients(
    params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListLunaClientsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListLunaClientsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListLunaClientsResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Returns a list of all tags for the specified AWS CloudHSM resource.
     */
  def listTagsForResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Returns a list of all tags for the specified AWS CloudHSM resource.
     */
  def listTagsForResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Returns a list of all tags for the specified AWS CloudHSM resource.
     */
  def listTagsForResource(params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListTagsForResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Returns a list of all tags for the specified AWS CloudHSM resource.
     */
  def listTagsForResource(
    params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListTagsForResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListTagsForResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ListTagsForResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies an existing high-availability partition group.
     */
  def modifyHapg(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ModifyHapgResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies an existing high-availability partition group.
     */
  def modifyHapg(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ModifyHapgResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ModifyHapgResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies an existing high-availability partition group.
     */
  def modifyHapg(params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ModifyHapgRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ModifyHapgResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies an existing high-availability partition group.
     */
  def modifyHapg(
    params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ModifyHapgRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ModifyHapgResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ModifyHapgResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies an HSM.  This operation can result in the HSM being offline for up to 15 minutes while the AWS CloudHSM service is reconfigured. If you are modifying a production HSM, you should ensure that your AWS CloudHSM service is configured for high availability, and consider executing this operation during a maintenance window. 
     */
  def modifyHsm(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ModifyHsmResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies an HSM.  This operation can result in the HSM being offline for up to 15 minutes while the AWS CloudHSM service is reconfigured. If you are modifying a production HSM, you should ensure that your AWS CloudHSM service is configured for high availability, and consider executing this operation during a maintenance window. 
     */
  def modifyHsm(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ModifyHsmResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ModifyHsmResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies an HSM.  This operation can result in the HSM being offline for up to 15 minutes while the AWS CloudHSM service is reconfigured. If you are modifying a production HSM, you should ensure that your AWS CloudHSM service is configured for high availability, and consider executing this operation during a maintenance window. 
     */
  def modifyHsm(params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ModifyHsmRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ModifyHsmResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies an HSM.  This operation can result in the HSM being offline for up to 15 minutes while the AWS CloudHSM service is reconfigured. If you are modifying a production HSM, you should ensure that your AWS CloudHSM service is configured for high availability, and consider executing this operation during a maintenance window. 
     */
  def modifyHsm(
    params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ModifyHsmRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ModifyHsmResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ModifyHsmResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies the certificate used by the client. This action can potentially start a workflow to install the new certificate on the client's HSMs.
     */
  def modifyLunaClient(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ModifyLunaClientResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies the certificate used by the client. This action can potentially start a workflow to install the new certificate on the client's HSMs.
     */
  def modifyLunaClient(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ModifyLunaClientResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ModifyLunaClientResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies the certificate used by the client. This action can potentially start a workflow to install the new certificate on the client's HSMs.
     */
  def modifyLunaClient(params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ModifyLunaClientRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ModifyLunaClientResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Modifies the certificate used by the client. This action can potentially start a workflow to install the new certificate on the client's HSMs.
     */
  def modifyLunaClient(
    params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ModifyLunaClientRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ModifyLunaClientResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.ModifyLunaClientResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Removes one or more tags from the specified AWS CloudHSM resource. To remove a tag, specify only the tag key to remove (not the value). To overwrite the value for an existing tag, use AddTagsToResource.
     */
  def removeTagsFromResource(): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.RemoveTagsFromResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Removes one or more tags from the specified AWS CloudHSM resource. To remove a tag, specify only the tag key to remove (not the value). To overwrite the value for an existing tag, use AddTagsToResource.
     */
  def removeTagsFromResource(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.RemoveTagsFromResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.RemoveTagsFromResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Removes one or more tags from the specified AWS CloudHSM resource. To remove a tag, specify only the tag key to remove (not the value). To overwrite the value for an existing tag, use AddTagsToResource.
     */
  def removeTagsFromResource(params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.RemoveTagsFromResourceRequest): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.RemoveTagsFromResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
  /**
     * This is documentation for AWS CloudHSM Classic. For more information, see AWS CloudHSM Classic FAQs, the AWS CloudHSM Classic User Guide, and the AWS CloudHSM Classic API Reference.  For information about the current version of AWS CloudHSM, see AWS CloudHSM, the AWS CloudHSM User Guide, and the AWS CloudHSM API Reference. Removes one or more tags from the specified AWS CloudHSM resource. To remove a tag, specify only the tag key to remove (not the value). To overwrite the value for an existing tag, use AddTagsToResource.
     */
  def removeTagsFromResource(
    params: awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.RemoveTagsFromResourceRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.RemoveTagsFromResourceResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[
    awsDashSdkLib.clientsCloudhsmMod.CloudHSMNs.RemoveTagsFromResourceResponse, 
    awsDashSdkLib.libErrorMod.AWSError
  ] = js.native
}

