package typings
package amplifierLib.amplifierMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Store extends StorageTypeStore {
  /***
    * Firefox 2+
    */
  @JSName("globalStorage")
  var globalStorage_Original: StorageTypeStore = js.native
  /***
    * IE 8+, Firefox 3.5+, Safari 4+, Chrome, Opera 10.5+, iPhone 2+, Android 2+
    */
  @JSName("localStorage")
  var localStorage_Original: StorageTypeStore = js.native
  /***
    * An in-memory store is provided as a fallback if none of the other storage types are available.
    */
  @JSName("memory")
  var memory_Original: StorageTypeStore = js.native
  /***
    * IE 8+, Firefox 2+, Safari 4+, Chrome, Opera 10.5+, iPhone 2+, Android 2+
    */
  @JSName("sessionStorage")
  var sessionStorage_Original: StorageTypeStore = js.native
  /***
    * IE 5 - 7
    */
  @JSName("userData")
  var userData_Original: StorageTypeStore = js.native
  /***
    * Gets a stored value based on the key of a hash of all stored values.
    */
  /***
    * Firefox 2+
    */
  def globalStorage(): js.Any = js.native
  def globalStorage(key: java.lang.String): js.Any = js.native
  /***
    * Stores a value for a given key using the default storage type.
    *
    * key: Identifier for the value being stored.
    * value: The value to store. The value can be anything that can be serialized as JSON.
    * [options]: A set of key/value pairs that relate to settings for storing the value.
    */
  /***
    * Firefox 2+
    */
  def globalStorage(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def globalStorage(key: java.lang.String, value: js.Any, options: js.Any): scala.Unit = js.native
  /***
    * Gets a stored value based on the key of a hash of all stored values.
    */
  /***
    * IE 8+, Firefox 3.5+, Safari 4+, Chrome, Opera 10.5+, iPhone 2+, Android 2+
    */
  def localStorage(): js.Any = js.native
  def localStorage(key: java.lang.String): js.Any = js.native
  /***
    * Stores a value for a given key using the default storage type.
    *
    * key: Identifier for the value being stored.
    * value: The value to store. The value can be anything that can be serialized as JSON.
    * [options]: A set of key/value pairs that relate to settings for storing the value.
    */
  /***
    * IE 8+, Firefox 3.5+, Safari 4+, Chrome, Opera 10.5+, iPhone 2+, Android 2+
    */
  def localStorage(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def localStorage(key: java.lang.String, value: js.Any, options: js.Any): scala.Unit = js.native
  /***
    * Gets a stored value based on the key of a hash of all stored values.
    */
  /***
    * An in-memory store is provided as a fallback if none of the other storage types are available.
    */
  def memory(): js.Any = js.native
  def memory(key: java.lang.String): js.Any = js.native
  /***
    * Stores a value for a given key using the default storage type.
    *
    * key: Identifier for the value being stored.
    * value: The value to store. The value can be anything that can be serialized as JSON.
    * [options]: A set of key/value pairs that relate to settings for storing the value.
    */
  /***
    * An in-memory store is provided as a fallback if none of the other storage types are available.
    */
  def memory(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def memory(key: java.lang.String, value: js.Any, options: js.Any): scala.Unit = js.native
  /***
    * Gets a stored value based on the key of a hash of all stored values.
    */
  /***
    * IE 8+, Firefox 2+, Safari 4+, Chrome, Opera 10.5+, iPhone 2+, Android 2+
    */
  def sessionStorage(): js.Any = js.native
  def sessionStorage(key: java.lang.String): js.Any = js.native
  /***
    * Stores a value for a given key using the default storage type.
    *
    * key: Identifier for the value being stored.
    * value: The value to store. The value can be anything that can be serialized as JSON.
    * [options]: A set of key/value pairs that relate to settings for storing the value.
    */
  /***
    * IE 8+, Firefox 2+, Safari 4+, Chrome, Opera 10.5+, iPhone 2+, Android 2+
    */
  def sessionStorage(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def sessionStorage(key: java.lang.String, value: js.Any, options: js.Any): scala.Unit = js.native
  /***
    * Gets a stored value based on the key of a hash of all stored values.
    */
  /***
    * IE 5 - 7
    */
  def userData(): js.Any = js.native
  def userData(key: java.lang.String): js.Any = js.native
  /***
    * Stores a value for a given key using the default storage type.
    *
    * key: Identifier for the value being stored.
    * value: The value to store. The value can be anything that can be serialized as JSON.
    * [options]: A set of key/value pairs that relate to settings for storing the value.
    */
  /***
    * IE 5 - 7
    */
  def userData(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def userData(key: java.lang.String, value: js.Any, options: js.Any): scala.Unit = js.native
}

