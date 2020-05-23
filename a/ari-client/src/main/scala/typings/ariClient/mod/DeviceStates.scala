package typings.ariClient.mod

import typings.ariClient.anon.DeviceName
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeviceStates extends js.Object {
  def delete(params: DeviceName): js.Promise[Unit] = js.native
  def delete(params: DeviceName, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  def get(params: DeviceName): js.Promise[DeviceState] = js.native
  def get(params: DeviceName, callback: js.Function2[/* err */ Error, /* devicestate */ DeviceState, Unit]): Unit = js.native
  def list(): js.Promise[js.Array[DeviceState]] = js.native
  /* Methods */
  def list(callback: js.Function2[/* err */ Error, /* devicestates */ js.Array[DeviceState], Unit]): Unit = js.native
  def update(params: typings.ariClient.anon.DeviceState): js.Promise[Unit] = js.native
  def update(params: typings.ariClient.anon.DeviceState, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}

