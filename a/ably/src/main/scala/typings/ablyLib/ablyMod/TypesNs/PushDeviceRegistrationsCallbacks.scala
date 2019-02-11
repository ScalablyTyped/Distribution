package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushDeviceRegistrationsCallbacks extends js.Object {
  def get(
    deviceIdOrDetails: DeviceDetails,
    callback: js.Function2[/* error */ ErrorInfo, /* deviceDetails */ DeviceDetails, scala.Unit]
  ): scala.Unit = js.native
  def get(
    deviceIdOrDetails: java.lang.String,
    callback: js.Function2[/* error */ ErrorInfo, /* deviceDetails */ DeviceDetails, scala.Unit]
  ): scala.Unit = js.native
  def list(params: DeviceRegistrationParams, callback: paginatedResultCallback[DeviceDetails]): scala.Unit = js.native
  def remove(deviceIdOrDetails: DeviceDetails): scala.Unit = js.native
  def remove(deviceIdOrDetails: DeviceDetails, callback: errorCallback): scala.Unit = js.native
  def remove(deviceIdOrDetails: java.lang.String): scala.Unit = js.native
  def remove(deviceIdOrDetails: java.lang.String, callback: errorCallback): scala.Unit = js.native
  def removeWhere(params: DeviceRegistrationParams): scala.Unit = js.native
  def removeWhere(params: DeviceRegistrationParams, callback: errorCallback): scala.Unit = js.native
  def save(deviceDetails: DeviceDetails): scala.Unit = js.native
  def save(
    deviceDetails: DeviceDetails,
    callback: js.Function2[/* error */ ErrorInfo, /* deviceDetails */ DeviceDetails, scala.Unit]
  ): scala.Unit = js.native
}

