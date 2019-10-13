package typings.angularDashLocalDashStorage.angularDashLocalDashStorageMod.angularMod.local.storage

import typings.angular.angularMod.IScope
import typings.angular.angularMod._Global_.Function
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILocalStorageService extends js.Object {
  /**
    * Deal with browser's cookies directly.
    */
  var cookie: typings.angularDashLocalDashStorage.angularDashLocalDashStorageMod.angularMod.local.storage.ICookie = js.native
  /**
    * Checks if the browser support the current storage type(e.g: localStorage, sessionStorage).
    * Returns: Boolean
    */
  var isSupported: Boolean = js.native
  /**
    * Bind $scope key to localStorageService.
    * Usage: localStorageService.bind(scope, property, value[optional], key[optional])
    * Returns: deregistration function for this listener.
    * @param scope
    * @param property
    * @param value optional
    * @param key The corresponding key used in local storage
    */
  def bind(scope: IScope, property: String): Function = js.native
  def bind(scope: IScope, property: String, value: js.Any): Function = js.native
  def bind(scope: IScope, property: String, value: js.Any, key: String): Function = js.native
  def bind(scope: IScope, property: String, value: js.Any, key: String, storageType: StorageType): Function = js.native
  /**
    * Remove all data for this app from local storage.
    * If local storage is not supported, use cookies instead.
    * Note: Optionally takes a regular expression string and removes matching.
    * Returns: Boolean
    * @param regularExpression
    */
  def clearAll(): Boolean = js.native
  def clearAll(regularExpression: RegExp): Boolean = js.native
  def clearAll(regularExpression: RegExp, storageType: StorageType): Boolean = js.native
  /**
    * Return the derive key
    * Returns String
    * @param key
    */
  def deriveKey(key: String): String = js.native
  /**
    * Directly get a value from local storage.
    * If local storage is not supported, use cookies instead.
    * Returns: value from local storage
    * @param key
    */
  def get[T](key: String): T = js.native
  def get[T](key: String, storageType: StorageType): T = js.native
  /**
    * Returns: String
    */
  def getStorageType(): String = js.native
  /**
    * Return array of keys for local storage, ignore keys that not owned.
    * Returns: value from local storage
    */
  def keys(): js.Array[String] = js.native
  def keys(storageType: StorageType): js.Array[String] = js.native
  /**
    * Return localStorageService.length, ignore keys that not owned.
    * Returns Number
    */
  def length(): Double = js.native
  def length(storageType: StorageType): Double = js.native
  /**
    * Remove a list of items from the local storage by their given keys.
    * The last item in the variable argument list can optionally be the StorageType.
    * Which specifies whether to remove from the session storage or the local storage.
    * If the last argument is not a valid storage type it is considered to be a key, 
    * and localStorage is used by default .
    * If local storage is not supported, use cookies instead.
    * Returns: Boolean
    * @param key
    */
  def remove(args: String*): Boolean = js.native
  /**
    * Directly adds a value to local storage.
    * If local storage is not supported, use cookies instead.
    * Returns: Boolean
    * @param key
    * @param value
    */
  def set[T](key: String, value: T): Boolean = js.native
  def set[T](key: String, value: T, storageType: StorageType): Boolean = js.native
}

