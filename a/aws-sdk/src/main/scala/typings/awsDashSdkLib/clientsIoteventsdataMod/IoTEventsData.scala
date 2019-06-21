package typings
package awsDashSdkLib.clientsIoteventsdataMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IoTEventsData
  extends awsDashSdkLib.libServiceMod.Service {
  @JSName("config")
  var config_IoTEventsData: awsDashSdkLib.libConfigMod.ConfigBase with ClientConfiguration = js.native
  /**
    * Sends a set of messages to the AWS IoT Events system. Each message payload is transformed into the input you specify ("inputName") and ingested into any detectors that monitor that input. If multiple messages are sent, the order in which the messages are processed isn't guaranteed. To guarantee ordering, you must send messages one at a time and wait for a successful response.
    */
  def batchPutMessage(): awsDashSdkLib.libRequestMod.Request[BatchPutMessageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchPutMessage(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchPutMessageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchPutMessageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Sends a set of messages to the AWS IoT Events system. Each message payload is transformed into the input you specify ("inputName") and ingested into any detectors that monitor that input. If multiple messages are sent, the order in which the messages are processed isn't guaranteed. To guarantee ordering, you must send messages one at a time and wait for a successful response.
    */
  def batchPutMessage(params: BatchPutMessageRequest): awsDashSdkLib.libRequestMod.Request[BatchPutMessageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchPutMessage(
    params: BatchPutMessageRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchPutMessageResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchPutMessageResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the state, variable values, and timer settings of one or more detectors (instances) of a specified detector model.
    */
  def batchUpdateDetector(): awsDashSdkLib.libRequestMod.Request[BatchUpdateDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchUpdateDetector(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchUpdateDetectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchUpdateDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Updates the state, variable values, and timer settings of one or more detectors (instances) of a specified detector model.
    */
  def batchUpdateDetector(params: BatchUpdateDetectorRequest): awsDashSdkLib.libRequestMod.Request[BatchUpdateDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def batchUpdateDetector(
    params: BatchUpdateDetectorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ BatchUpdateDetectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[BatchUpdateDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the specified detector (instance).
    */
  def describeDetector(): awsDashSdkLib.libRequestMod.Request[DescribeDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDetector(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDetectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Returns information about the specified detector (instance).
    */
  def describeDetector(params: DescribeDetectorRequest): awsDashSdkLib.libRequestMod.Request[DescribeDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def describeDetector(
    params: DescribeDetectorRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ DescribeDetectorResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[DescribeDetectorResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists detectors (the instances of a detector model).
    */
  def listDetectors(): awsDashSdkLib.libRequestMod.Request[ListDetectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDetectors(
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDetectorsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDetectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  /**
    * Lists detectors (the instances of a detector model).
    */
  def listDetectors(params: ListDetectorsRequest): awsDashSdkLib.libRequestMod.Request[ListDetectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
  def listDetectors(
    params: ListDetectorsRequest,
    callback: js.Function2[
      /* err */ awsDashSdkLib.libErrorMod.AWSError, 
      /* data */ ListDetectorsResponse, 
      scala.Unit
    ]
  ): awsDashSdkLib.libRequestMod.Request[ListDetectorsResponse, awsDashSdkLib.libErrorMod.AWSError] = js.native
}

