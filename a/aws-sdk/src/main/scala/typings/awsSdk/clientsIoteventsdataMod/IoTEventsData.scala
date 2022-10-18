package typings.awsSdk.clientsIoteventsdataMod

import typings.awsSdk.libConfigBaseMod.ConfigBase
import typings.awsSdk.libErrorMod.AWSError
import typings.awsSdk.libRequestMod.Request
import typings.awsSdk.libServiceMod.Service
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IoTEventsData extends Service {
  
  /**
    * Acknowledges one or more alarms. The alarms change to the ACKNOWLEDGED state after you acknowledge them.
    */
  def batchAcknowledgeAlarm(): Request[BatchAcknowledgeAlarmResponse, AWSError] = js.native
  def batchAcknowledgeAlarm(callback: js.Function2[/* err */ AWSError, /* data */ BatchAcknowledgeAlarmResponse, Unit]): Request[BatchAcknowledgeAlarmResponse, AWSError] = js.native
  /**
    * Acknowledges one or more alarms. The alarms change to the ACKNOWLEDGED state after you acknowledge them.
    */
  def batchAcknowledgeAlarm(params: BatchAcknowledgeAlarmRequest): Request[BatchAcknowledgeAlarmResponse, AWSError] = js.native
  def batchAcknowledgeAlarm(
    params: BatchAcknowledgeAlarmRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchAcknowledgeAlarmResponse, Unit]
  ): Request[BatchAcknowledgeAlarmResponse, AWSError] = js.native
  
  /**
    * Deletes one or more detectors that were created. When a detector is deleted, its state will be cleared and the detector will be removed from the list of detectors. The deleted detector will no longer appear if referenced in the ListDetectors API call.
    */
  def batchDeleteDetector(): Request[BatchDeleteDetectorResponse, AWSError] = js.native
  def batchDeleteDetector(callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteDetectorResponse, Unit]): Request[BatchDeleteDetectorResponse, AWSError] = js.native
  /**
    * Deletes one or more detectors that were created. When a detector is deleted, its state will be cleared and the detector will be removed from the list of detectors. The deleted detector will no longer appear if referenced in the ListDetectors API call.
    */
  def batchDeleteDetector(params: BatchDeleteDetectorRequest): Request[BatchDeleteDetectorResponse, AWSError] = js.native
  def batchDeleteDetector(
    params: BatchDeleteDetectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDeleteDetectorResponse, Unit]
  ): Request[BatchDeleteDetectorResponse, AWSError] = js.native
  
  /**
    * Disables one or more alarms. The alarms change to the DISABLED state after you disable them.
    */
  def batchDisableAlarm(): Request[BatchDisableAlarmResponse, AWSError] = js.native
  def batchDisableAlarm(callback: js.Function2[/* err */ AWSError, /* data */ BatchDisableAlarmResponse, Unit]): Request[BatchDisableAlarmResponse, AWSError] = js.native
  /**
    * Disables one or more alarms. The alarms change to the DISABLED state after you disable them.
    */
  def batchDisableAlarm(params: BatchDisableAlarmRequest): Request[BatchDisableAlarmResponse, AWSError] = js.native
  def batchDisableAlarm(
    params: BatchDisableAlarmRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchDisableAlarmResponse, Unit]
  ): Request[BatchDisableAlarmResponse, AWSError] = js.native
  
  /**
    * Enables one or more alarms. The alarms change to the NORMAL state after you enable them.
    */
  def batchEnableAlarm(): Request[BatchEnableAlarmResponse, AWSError] = js.native
  def batchEnableAlarm(callback: js.Function2[/* err */ AWSError, /* data */ BatchEnableAlarmResponse, Unit]): Request[BatchEnableAlarmResponse, AWSError] = js.native
  /**
    * Enables one or more alarms. The alarms change to the NORMAL state after you enable them.
    */
  def batchEnableAlarm(params: BatchEnableAlarmRequest): Request[BatchEnableAlarmResponse, AWSError] = js.native
  def batchEnableAlarm(
    params: BatchEnableAlarmRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchEnableAlarmResponse, Unit]
  ): Request[BatchEnableAlarmResponse, AWSError] = js.native
  
  /**
    * Sends a set of messages to the IoT Events system. Each message payload is transformed into the input you specify ("inputName") and ingested into any detectors that monitor that input. If multiple messages are sent, the order in which the messages are processed isn't guaranteed. To guarantee ordering, you must send messages one at a time and wait for a successful response.
    */
  def batchPutMessage(): Request[BatchPutMessageResponse, AWSError] = js.native
  def batchPutMessage(callback: js.Function2[/* err */ AWSError, /* data */ BatchPutMessageResponse, Unit]): Request[BatchPutMessageResponse, AWSError] = js.native
  /**
    * Sends a set of messages to the IoT Events system. Each message payload is transformed into the input you specify ("inputName") and ingested into any detectors that monitor that input. If multiple messages are sent, the order in which the messages are processed isn't guaranteed. To guarantee ordering, you must send messages one at a time and wait for a successful response.
    */
  def batchPutMessage(params: BatchPutMessageRequest): Request[BatchPutMessageResponse, AWSError] = js.native
  def batchPutMessage(
    params: BatchPutMessageRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchPutMessageResponse, Unit]
  ): Request[BatchPutMessageResponse, AWSError] = js.native
  
  /**
    * Resets one or more alarms. The alarms return to the NORMAL state after you reset them.
    */
  def batchResetAlarm(): Request[BatchResetAlarmResponse, AWSError] = js.native
  def batchResetAlarm(callback: js.Function2[/* err */ AWSError, /* data */ BatchResetAlarmResponse, Unit]): Request[BatchResetAlarmResponse, AWSError] = js.native
  /**
    * Resets one or more alarms. The alarms return to the NORMAL state after you reset them.
    */
  def batchResetAlarm(params: BatchResetAlarmRequest): Request[BatchResetAlarmResponse, AWSError] = js.native
  def batchResetAlarm(
    params: BatchResetAlarmRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchResetAlarmResponse, Unit]
  ): Request[BatchResetAlarmResponse, AWSError] = js.native
  
  /**
    * Changes one or more alarms to the snooze mode. The alarms change to the SNOOZE_DISABLED state after you set them to the snooze mode.
    */
  def batchSnoozeAlarm(): Request[BatchSnoozeAlarmResponse, AWSError] = js.native
  def batchSnoozeAlarm(callback: js.Function2[/* err */ AWSError, /* data */ BatchSnoozeAlarmResponse, Unit]): Request[BatchSnoozeAlarmResponse, AWSError] = js.native
  /**
    * Changes one or more alarms to the snooze mode. The alarms change to the SNOOZE_DISABLED state after you set them to the snooze mode.
    */
  def batchSnoozeAlarm(params: BatchSnoozeAlarmRequest): Request[BatchSnoozeAlarmResponse, AWSError] = js.native
  def batchSnoozeAlarm(
    params: BatchSnoozeAlarmRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchSnoozeAlarmResponse, Unit]
  ): Request[BatchSnoozeAlarmResponse, AWSError] = js.native
  
  /**
    * Updates the state, variable values, and timer settings of one or more detectors (instances) of a specified detector model.
    */
  def batchUpdateDetector(): Request[BatchUpdateDetectorResponse, AWSError] = js.native
  def batchUpdateDetector(callback: js.Function2[/* err */ AWSError, /* data */ BatchUpdateDetectorResponse, Unit]): Request[BatchUpdateDetectorResponse, AWSError] = js.native
  /**
    * Updates the state, variable values, and timer settings of one or more detectors (instances) of a specified detector model.
    */
  def batchUpdateDetector(params: BatchUpdateDetectorRequest): Request[BatchUpdateDetectorResponse, AWSError] = js.native
  def batchUpdateDetector(
    params: BatchUpdateDetectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ BatchUpdateDetectorResponse, Unit]
  ): Request[BatchUpdateDetectorResponse, AWSError] = js.native
  
  @JSName("config")
  var config_IoTEventsData: ConfigBase & ClientConfiguration = js.native
  
  /**
    * Retrieves information about an alarm.
    */
  def describeAlarm(): Request[DescribeAlarmResponse, AWSError] = js.native
  def describeAlarm(callback: js.Function2[/* err */ AWSError, /* data */ DescribeAlarmResponse, Unit]): Request[DescribeAlarmResponse, AWSError] = js.native
  /**
    * Retrieves information about an alarm.
    */
  def describeAlarm(params: DescribeAlarmRequest): Request[DescribeAlarmResponse, AWSError] = js.native
  def describeAlarm(
    params: DescribeAlarmRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeAlarmResponse, Unit]
  ): Request[DescribeAlarmResponse, AWSError] = js.native
  
  /**
    * Returns information about the specified detector (instance).
    */
  def describeDetector(): Request[DescribeDetectorResponse, AWSError] = js.native
  def describeDetector(callback: js.Function2[/* err */ AWSError, /* data */ DescribeDetectorResponse, Unit]): Request[DescribeDetectorResponse, AWSError] = js.native
  /**
    * Returns information about the specified detector (instance).
    */
  def describeDetector(params: DescribeDetectorRequest): Request[DescribeDetectorResponse, AWSError] = js.native
  def describeDetector(
    params: DescribeDetectorRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ DescribeDetectorResponse, Unit]
  ): Request[DescribeDetectorResponse, AWSError] = js.native
  
  /**
    * Lists one or more alarms. The operation returns only the metadata associated with each alarm.
    */
  def listAlarms(): Request[ListAlarmsResponse, AWSError] = js.native
  def listAlarms(callback: js.Function2[/* err */ AWSError, /* data */ ListAlarmsResponse, Unit]): Request[ListAlarmsResponse, AWSError] = js.native
  /**
    * Lists one or more alarms. The operation returns only the metadata associated with each alarm.
    */
  def listAlarms(params: ListAlarmsRequest): Request[ListAlarmsResponse, AWSError] = js.native
  def listAlarms(
    params: ListAlarmsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListAlarmsResponse, Unit]
  ): Request[ListAlarmsResponse, AWSError] = js.native
  
  /**
    * Lists detectors (the instances of a detector model).
    */
  def listDetectors(): Request[ListDetectorsResponse, AWSError] = js.native
  def listDetectors(callback: js.Function2[/* err */ AWSError, /* data */ ListDetectorsResponse, Unit]): Request[ListDetectorsResponse, AWSError] = js.native
  /**
    * Lists detectors (the instances of a detector model).
    */
  def listDetectors(params: ListDetectorsRequest): Request[ListDetectorsResponse, AWSError] = js.native
  def listDetectors(
    params: ListDetectorsRequest,
    callback: js.Function2[/* err */ AWSError, /* data */ ListDetectorsResponse, Unit]
  ): Request[ListDetectorsResponse, AWSError] = js.native
}
