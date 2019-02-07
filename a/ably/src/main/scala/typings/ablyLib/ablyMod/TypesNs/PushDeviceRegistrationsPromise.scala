package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PushDeviceRegistrationsPromise extends js.Object {
  def get(deviceIdOrDetails: DeviceDetails): js.Promise[DeviceDetails] = js.native
  def get(deviceIdOrDetails: java.lang.String): js.Promise[DeviceDetails] = js.native
  def list(params: DeviceRegistrationParams): js.Promise[PaginatedResult[DeviceDetails]] = js.native
  def remove(deviceIdOrDetails: DeviceDetails): js.Promise[scala.Unit] = js.native
  def remove(deviceIdOrDetails: java.lang.String): js.Promise[scala.Unit] = js.native
  def removeWhere(params: DeviceRegistrationParams): js.Promise[scala.Unit] = js.native
  def save(deviceDetails: DeviceDetails): js.Promise[DeviceDetails] = js.native
}

