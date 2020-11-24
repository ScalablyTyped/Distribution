package typings.angularLocalStorage.mod.angularAugmentingMod.local.storage

import typings.angular.mod.IScope
import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-name
@js.native
trait ILocalStorageService extends js.Object {
  
  /**
    * Bind $scope key to localStorageService.
    * Usage: localStorageService.bind(scope, property, value[optional], key[optional])
    * Returns: deregistration function for this listener.
    */
  def bind(scope: IScope, property: String): js.Function0[Unit] = js.native
  def bind(
    scope: IScope,
    property: String,
    value: js.UndefOr[scala.Nothing],
    key: js.UndefOr[scala.Nothing],
    storageType: StorageType
  ): js.Function0[Unit] = js.native
  def bind(scope: IScope, property: String, value: js.UndefOr[scala.Nothing], key: String): js.Function0[Unit] = js.native
  def bind(
    scope: IScope,
    property: String,
    value: js.UndefOr[scala.Nothing],
    key: String,
    storageType: StorageType
  ): js.Function0[Unit] = js.native
  def bind(scope: IScope, property: String, value: js.Any): js.Function0[Unit] = js.native
  def bind(
    scope: IScope,
    property: String,
    value: js.Any,
    key: js.UndefOr[scala.Nothing],
    storageType: StorageType
  ): js.Function0[Unit] = js.native
  def bind(scope: IScope, property: String, value: js.Any, key: String): js.Function0[Unit] = js.native
  def bind(scope: IScope, property: String, value: js.Any, key: String, storageType: StorageType): js.Function0[Unit] = js.native
  
  /**
    * Change the local storage prefix during execution
    */
  def changePrefix(newPrefix: String): Unit = js.native
  
  /**
    * Remove all data for this app from local storage.
    * If local storage is not supported, use cookies instead.
    * Note: Optionally takes a regular expression string and removes matching.
    */
  def clearAll(): Boolean = js.native
  def clearAll(regularExpression: js.UndefOr[scala.Nothing], storageType: StorageType): Boolean = js.native
  def clearAll(regularExpression: RegExp): Boolean = js.native
  def clearAll(regularExpression: RegExp, storageType: StorageType): Boolean = js.native
  
  /**
    * Deal with browser's cookies directly.
    */
  var cookie: ICookie = js.native
  
  /**
    * Return the derive key
    */
  def deriveKey(key: String): String = js.native
  
  /**
    * Directly get a value from local storage.
    * If local storage is not supported, use cookies instead.
    * Returns: value from local storage
    */
  def get(key: String): js.Any = js.native
  def get(key: String, storageType: StorageType): js.Any = js.native
  
  /**
    * Returns: String
    */
  def getStorageType(): String = js.native
  
  /**
    * Checks if the browser support the current storage type(e.g: localStorage, sessionStorage).
    * Returns: Boolean
    */
  var isSupported: Boolean = js.native
  
  /**
    * Return array of keys for local storage, ignore keys that not owned.
    * Returns: value from local storage
    */
  def keys(): js.Array[String] = js.native
  def keys(storageType: StorageType): js.Array[String] = js.native
  
  /**
    * Return localStorageService.length, ignore keys that not owned.
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
    */
  def set(key: String, value: js.Any): Boolean = js.native
  def set(key: String, value: js.Any, storageType: StorageType): Boolean = js.native
}
