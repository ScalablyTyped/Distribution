package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PushDeviceRegistrationsPromise extends js.Object {
  
  def get(deviceIdOrDetails: String): js.Promise[DeviceDetails] = js.native
  def get(deviceIdOrDetails: DeviceDetails): js.Promise[DeviceDetails] = js.native
  
  def list(params: DeviceRegistrationParams): js.Promise[PaginatedResult[DeviceDetails]] = js.native
  
  def remove(deviceIdOrDetails: String): js.Promise[Unit] = js.native
  def remove(deviceIdOrDetails: DeviceDetails): js.Promise[Unit] = js.native
  
  def removeWhere(params: DeviceRegistrationParams): js.Promise[Unit] = js.native
  
  def save(deviceDetails: DeviceDetails): js.Promise[DeviceDetails] = js.native
}
