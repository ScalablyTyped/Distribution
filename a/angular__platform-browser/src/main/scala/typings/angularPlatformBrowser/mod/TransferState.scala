package typings.angularPlatformBrowser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/platform-browser", "TransferState")
@js.native
class TransferState () extends js.Object {
  var onSerializeCallbacks: js.Any = js.native
  var store: js.Any = js.native
  /**
    * Get the value corresponding to a key. Return `defaultValue` if key is not found.
    */
  def get[T](key: StateKey[T], defaultValue: T): T = js.native
  /**
    * Test whether a key exists in the store.
    */
  def hasKey[T](key: StateKey[T]): Boolean = js.native
  /**
    * Register a callback to provide the value for a key when `toJson` is called.
    */
  def onSerialize[T](key: StateKey[T], callback: js.Function0[T]): Unit = js.native
  /**
    * Remove a key from the store.
    */
  def remove[T](key: StateKey[T]): Unit = js.native
  /**
    * Set the value corresponding to a key.
    */
  def set[T](key: StateKey[T], value: T): Unit = js.native
  /**
    * Serialize the current state of the store to JSON.
    */
  def toJson(): String = js.native
}

