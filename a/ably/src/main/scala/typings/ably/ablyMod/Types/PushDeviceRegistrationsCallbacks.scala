package typings.ably.ablyMod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushDeviceRegistrationsCallbacks extends js.Object {
  def get(
    deviceIdOrDetails: String,
    callback: js.Function2[/* error */ ErrorInfo, /* deviceDetails */ DeviceDetails, Unit]
  ): Unit = js.native
  def get(
    deviceIdOrDetails: DeviceDetails,
    callback: js.Function2[/* error */ ErrorInfo, /* deviceDetails */ DeviceDetails, Unit]
  ): Unit = js.native
  def list(params: DeviceRegistrationParams, callback: paginatedResultCallback[DeviceDetails]): Unit = js.native
  def remove(deviceIdOrDetails: String): Unit = js.native
  def remove(deviceIdOrDetails: String, callback: errorCallback): Unit = js.native
  def remove(deviceIdOrDetails: DeviceDetails): Unit = js.native
  def remove(deviceIdOrDetails: DeviceDetails, callback: errorCallback): Unit = js.native
  def removeWhere(params: DeviceRegistrationParams): Unit = js.native
  def removeWhere(params: DeviceRegistrationParams, callback: errorCallback): Unit = js.native
  def save(deviceDetails: DeviceDetails): Unit = js.native
  def save(
    deviceDetails: DeviceDetails,
    callback: js.Function2[/* error */ ErrorInfo, /* deviceDetails */ DeviceDetails, Unit]
  ): Unit = js.native
}

