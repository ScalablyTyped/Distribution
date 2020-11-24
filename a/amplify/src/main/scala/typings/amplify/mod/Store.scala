package typings.amplify.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Store extends StorageTypeStore {
  
  /***
    * Gets a hash of all stored values.
    */
  /***
    * Firefox 2+
    */
  def globalStorage(): js.Any = js.native
  /***
    * Gets a stored value based on the key.
    */
  /***
    * Firefox 2+
    */
  def globalStorage(key: String): js.Any = js.native
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
  def globalStorage(key: String, value: js.Any): Unit = js.native
  def globalStorage(key: String, value: js.Any, options: js.Any): Unit = js.native
  /***
    * Firefox 2+
    */
  @JSName("globalStorage")
  var globalStorage_Original: StorageTypeStore = js.native
  
  /***
    * Gets a hash of all stored values.
    */
  /***
    * IE 8+, Firefox 3.5+, Safari 4+, Chrome, Opera 10.5+, iPhone 2+, Android 2+
    */
  def localStorage(): js.Any = js.native
  /***
    * Gets a stored value based on the key.
    */
  /***
    * IE 8+, Firefox 3.5+, Safari 4+, Chrome, Opera 10.5+, iPhone 2+, Android 2+
    */
  def localStorage(key: String): js.Any = js.native
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
  def localStorage(key: String, value: js.Any): Unit = js.native
  def localStorage(key: String, value: js.Any, options: js.Any): Unit = js.native
  /***
    * IE 8+, Firefox 3.5+, Safari 4+, Chrome, Opera 10.5+, iPhone 2+, Android 2+
    */
  @JSName("localStorage")
  var localStorage_Original: StorageTypeStore = js.native
  
  /***
    * Gets a hash of all stored values.
    */
  /***
    * An in-memory store is provided as a fallback if none of the other storage types are available.
    */
  def memory(): js.Any = js.native
  /***
    * Gets a stored value based on the key.
    */
  /***
    * An in-memory store is provided as a fallback if none of the other storage types are available.
    */
  def memory(key: String): js.Any = js.native
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
  def memory(key: String, value: js.Any): Unit = js.native
  def memory(key: String, value: js.Any, options: js.Any): Unit = js.native
  /***
    * An in-memory store is provided as a fallback if none of the other storage types are available.
    */
  @JSName("memory")
  var memory_Original: StorageTypeStore = js.native
  
  /***
    * Gets a hash of all stored values.
    */
  /***
    * IE 8+, Firefox 2+, Safari 4+, Chrome, Opera 10.5+, iPhone 2+, Android 2+
    */
  def sessionStorage(): js.Any = js.native
  /***
    * Gets a stored value based on the key.
    */
  /***
    * IE 8+, Firefox 2+, Safari 4+, Chrome, Opera 10.5+, iPhone 2+, Android 2+
    */
  def sessionStorage(key: String): js.Any = js.native
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
  def sessionStorage(key: String, value: js.Any): Unit = js.native
  def sessionStorage(key: String, value: js.Any, options: js.Any): Unit = js.native
  /***
    * IE 8+, Firefox 2+, Safari 4+, Chrome, Opera 10.5+, iPhone 2+, Android 2+
    */
  @JSName("sessionStorage")
  var sessionStorage_Original: StorageTypeStore = js.native
  
  /***
    * Gets a hash of all stored values.
    */
  /***
    * IE 5 - 7
    */
  def userData(): js.Any = js.native
  /***
    * Gets a stored value based on the key.
    */
  /***
    * IE 5 - 7
    */
  def userData(key: String): js.Any = js.native
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
  def userData(key: String, value: js.Any): Unit = js.native
  def userData(key: String, value: js.Any, options: js.Any): Unit = js.native
  /***
    * IE 5 - 7
    */
  @JSName("userData")
  var userData_Original: StorageTypeStore = js.native
}
