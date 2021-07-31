package typings.ariClient.mod

import typings.ariClient.anon.DeviceName
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceStates extends StObject {
  
  /**
    * Destroy a device-state controlled by ARI.
    *
    * @param params.deviceName - Name of the device.
    */
  def delete(params: DeviceName): js.Promise[Unit] = js.native
  /**
    * Destroy a device-state controlled by ARI.
    *
    * @param params.deviceName - Name of the device.
    */
  def delete(params: DeviceName, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
  
  /**
    * Retrieve the current state of a device.
    *
    * @param params.deviceName - Name of the device.
    */
  def get(params: DeviceName): js.Promise[DeviceState] = js.native
  /**
    * Retrieve the current state of a device.
    *
    * @param params.deviceName - Name of the device.
    */
  def get(params: DeviceName, callback: js.Function2[/* err */ Error, /* devicestate */ DeviceState, Unit]): Unit = js.native
  
  /**
    * List all ARI controlled device states.
    */
  def list(): js.Promise[js.Array[DeviceState]] = js.native
  /**
    * List all ARI controlled device states.
    */
  def list(callback: js.Function2[/* err */ Error, /* devicestates */ js.Array[DeviceState], Unit]): Unit = js.native
  
  /**
    * Change the state of a device controlled by ARI. (Note - implicitly creates the device state).
    *
    * @param params.deviceName - Name of the device.
    * @param params.deviceState - Device state value.
    */
  def update(params: typings.ariClient.anon.DeviceState): js.Promise[Unit] = js.native
  /**
    * Change the state of a device controlled by ARI. (Note - implicitly creates the device state).
    *
    * @param params.deviceName - Name of the device.
    * @param params.deviceState - Device state value.
    */
  def update(params: typings.ariClient.anon.DeviceState, callback: js.Function1[/* err */ Error, Unit]): Unit = js.native
}
