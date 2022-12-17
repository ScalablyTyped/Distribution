package typings.ariClient.mod

import typings.ariClient.anon.DeviceStateString
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceState
  extends StObject
     with Resource {
  
  /**
    * Destroy a device-state controlled by ARI.
    */
  def delete(): js.Promise[Unit] = js.native
  /**
    * Destroy a device-state controlled by ARI.
    */
  def delete(callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
  
  /**
    * Retrieve the current state of a device.
    */
  def get(): js.Promise[DeviceState] = js.native
  /**
    * Retrieve the current state of a device.
    */
  def get(callback: js.Function2[/* err */ js.Error, /* devicestate */ this.type, Unit]): Unit = js.native
  
  /**
    * List all ARI controlled device states.
    */
  def list(): js.Promise[js.Array[DeviceState]] = js.native
  /**
    * List all ARI controlled device states.
    */
  def list(callback: js.Function2[/* err */ js.Error, /* devicestates */ js.Array[this.type], Unit]): Unit = js.native
  
  /**
    * Name of the device.
    */
  var name: String = js.native
  
  /**
    * Devices state.
    */
  var state: String = js.native
  
  /**
    * Change the state of a device controlled by ARI. (Note - implicitly creates the device state).
    *
    * @param params.deviceState - Device state value.
    */
  def update(params: DeviceStateString): js.Promise[Unit] = js.native
  /**
    * Change the state of a device controlled by ARI. (Note - implicitly creates the device state).
    *
    * @param params.deviceState - Device state value.
    */
  def update(params: DeviceStateString, callback: js.Function1[/* err */ js.Error, Unit]): Unit = js.native
}
