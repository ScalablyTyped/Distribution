package typings.awsDashSdk.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutTelemetryRecordsRequest extends js.Object {
  /**
    * 
    */
  var EC2InstanceId: js.UndefOr[typings.awsDashSdk.clientsXrayMod.EC2InstanceId] = js.undefined
  /**
    * 
    */
  var Hostname: js.UndefOr[typings.awsDashSdk.clientsXrayMod.Hostname] = js.undefined
  /**
    * 
    */
  var ResourceARN: js.UndefOr[typings.awsDashSdk.clientsXrayMod.ResourceARN] = js.undefined
  /**
    * 
    */
  var TelemetryRecords: TelemetryRecordList
}

object PutTelemetryRecordsRequest {
  @scala.inline
  def apply(
    TelemetryRecords: TelemetryRecordList,
    EC2InstanceId: EC2InstanceId = null,
    Hostname: Hostname = null,
    ResourceARN: ResourceARN = null
  ): PutTelemetryRecordsRequest = {
    val __obj = js.Dynamic.literal(TelemetryRecords = TelemetryRecords)
    if (EC2InstanceId != null) __obj.updateDynamic("EC2InstanceId")(EC2InstanceId)
    if (Hostname != null) __obj.updateDynamic("Hostname")(Hostname)
    if (ResourceARN != null) __obj.updateDynamic("ResourceARN")(ResourceARN)
    __obj.asInstanceOf[PutTelemetryRecordsRequest]
  }
}

