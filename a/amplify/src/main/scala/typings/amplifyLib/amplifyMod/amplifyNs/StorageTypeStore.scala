package typings
package amplifyLib.amplifyMod.amplifyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StorageTypeStore extends js.Object {
  /***
    * Gets a hash of all stored values.
    */
  def apply(): js.Any = js.native
  /***
    * Gets a stored value based on the key.
    */
  def apply(key: java.lang.String): js.Any = js.native
  /***
    * Stores a value for a given key using the default storage type.
    *
    * key: Identifier for the value being stored.
    * value: The value to store. The value can be anything that can be serialized as JSON.
    * [options]: A set of key/value pairs that relate to settings for storing the value.
    */
  def apply(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def apply(key: java.lang.String, value: js.Any, options: js.Any): scala.Unit = js.native
}

