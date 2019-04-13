package typings
package angularDashLocalDashStorageLib.angularDashLocalDashStorageMod.angularMod.localNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILocalStorageService extends js.Object {
  /**
    * Deal with browser's cookies directly.
    */
  var cookie: ICookie = js.native
  /**
    * Checks if the browser support the current storage type(e.g: localStorage, sessionStorage).
    * Returns: Boolean
    */
  var isSupported: scala.Boolean = js.native
  /**
    * Bind $scope key to localStorageService.
    * Usage: localStorageService.bind(scope, property, value[optional], key[optional])
    * Returns: deregistration function for this listener.
    * @param scope
    * @param property
    * @param value optional
    * @param key The corresponding key used in local storage
    */
  def bind(scope: angularLib.angularMod.IScope, property: java.lang.String): angularLib.angularMod.Global.Function = js.native
  def bind(scope: angularLib.angularMod.IScope, property: java.lang.String, value: js.Any): angularLib.angularMod.Global.Function = js.native
  def bind(
    scope: angularLib.angularMod.IScope,
    property: java.lang.String,
    value: js.Any,
    key: java.lang.String
  ): angularLib.angularMod.Global.Function = js.native
  def bind(
    scope: angularLib.angularMod.IScope,
    property: java.lang.String,
    value: js.Any,
    key: java.lang.String,
    storageType: StorageType
  ): angularLib.angularMod.Global.Function = js.native
  /**
    * Remove all data for this app from local storage.
    * If local storage is not supported, use cookies instead.
    * Note: Optionally takes a regular expression string and removes matching.
    * Returns: Boolean
    * @param regularExpression
    */
  def clearAll(): scala.Boolean = js.native
  def clearAll(regularExpression: stdLib.RegExp): scala.Boolean = js.native
  def clearAll(regularExpression: stdLib.RegExp, storageType: StorageType): scala.Boolean = js.native
  /**
    * Return the derive key
    * Returns String
    * @param key
    */
  def deriveKey(key: java.lang.String): java.lang.String = js.native
  /**
    * Directly get a value from local storage.
    * If local storage is not supported, use cookies instead.
    * Returns: value from local storage
    * @param key
    */
  def get[T](key: java.lang.String): T = js.native
  def get[T](key: java.lang.String, storageType: StorageType): T = js.native
  /**
    * Returns: String
    */
  def getStorageType(): java.lang.String = js.native
  /**
    * Return array of keys for local storage, ignore keys that not owned.
    * Returns: value from local storage
    */
  def keys(): js.Array[java.lang.String] = js.native
  def keys(storageType: StorageType): js.Array[java.lang.String] = js.native
  /**
    * Return localStorageService.length, ignore keys that not owned.
    * Returns Number
    */
  def length(): scala.Double = js.native
  def length(storageType: StorageType): scala.Double = js.native
  /**
    * Remove an item from local storage by key.
    * If local storage is not supported, use cookies instead.
    * Returns: Boolean
    * @param key
    */
  def remove(key: java.lang.String): scala.Boolean = js.native
  /**
    * Directly adds a value to local storage.
    * If local storage is not supported, use cookies instead.
    * Returns: Boolean
    * @param key
    * @param value
    */
  def set[T](key: java.lang.String, value: T): scala.Boolean = js.native
  def set[T](key: java.lang.String, value: T, storageType: StorageType): scala.Boolean = js.native
}

