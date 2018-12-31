package typings
package angularDashLockerLib.angularMod.lockerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILockerService extends js.Object {
  /**
    * Add an item to storage if it doesn't already exist
    *
    * @param  {String}  key    The key to add
    * @param  {Mixed}  value  The value to add
    */
  def add(key: java.lang.String, value: js.Any): scala.Boolean = js.native
  /**
    * Return all items in storage within the current namespace/driver
    *
    */
  def all(): js.Any = js.native
  /**
    * Bind a storage key to a $scope property
    *
    * @param  {Object}  $scope  The angular $scope object
    * @param  {String}  key     The key in storage to bind to
    * @param  {Mixed}   def     The default value to initially bind
    */
  def bind(scope: angularLib.angularMod.angularNs.IScope, property: java.lang.String): ILockerService = js.native
  def bind(
    scope: angularLib.angularMod.angularNs.IScope,
    property: java.lang.String,
    defaultPropertyValue: js.Any
  ): ILockerService = js.native
  /**
    * Remove all items set within the current namespace/driver
    */
  def clean(): ILockerService = js.native
  /**
    * Get the total number of items within the current namespace
    */
  def count(): scala.Double = js.native
  /**
    * Set the storage driver on a new instance to enable overriding defaults
    *
    * @param  {String}  driver  The driver to switch to
    */
  def driver(localStorageType: java.lang.String): ILockerService = js.native
  /**
    * Empty the current storage driver completely. careful now.
    */
  def empty(): ILockerService = js.native
  /**
    * Remove specified item(s) from storage
    *
    * @param  {String}  key  The key to remove
    */
  def forget(key: java.lang.String): ILockerService = js.native
  /**
    * Remove specified item(s) from storage
    *
    * @param  {Array}  keys  The array of keys to remove
    *
    */
  def forget(keys: js.Array[java.lang.String]): ILockerService = js.native
  /**
    * Retrieve the specified item from storage
    *
    * @param  {String|Array}  key  The key to get
    * @param  {Mixed}         def  The default value if it does not exist
    */
  def get(key: java.lang.String): js.Any = js.native
  def get(key: java.lang.String, defaultValue: js.Any): js.Any = js.native
  def get(key: js.Array[java.lang.String]): js.Any = js.native
  def get(key: js.Array[java.lang.String], defaultValue: js.Any): js.Any = js.native
  /**
    * Get the currently set namespace
    */
  def getNamespace(): java.lang.String = js.native
  /**
    * Determine whether the item exists in storage
    *
    * @param  {String|Function}  key  -  The key to remove
    */
  def has(key: java.lang.String): scala.Boolean = js.native
  /**
    * Get a new instance of Locker
    *
    * @param  {Object}  options  The config options to instantiate with
    */
  def instance(lockerSettings: ILockerSettings): ILockerService = js.native
  /**
    * Get the storage keys as an array
    */
  def keys(): js.Array[java.lang.String] = js.native
  /**
    * Set the namespace on a new instance to enable overriding defaults
    *
    * @param  {String}  namespace  The namespace to switch to
    */
  def namespace(name: java.lang.String): ILockerService = js.native
  /**
    * Retrieve the specified item from storage and then remove it
    *
    * @param  {String|Array}  key  The key to pull from storage
    * @param  {Mixed}   def  The default value if it does not exist
    */
  def pull(key: java.lang.String): js.Any = js.native
  def pull(key: java.lang.String, defaultValue: js.Any): js.Any = js.native
  def pull(key: js.Array[java.lang.String]): js.Any = js.native
  def pull(key: js.Array[java.lang.String], defaultValue: js.Any): js.Any = js.native
  /**
    * Add a new item to storage (even if it already exists)
    *
    * @param  {Object}  keyValuePairs    Key value object
    */
  def put(keyValuePairs: js.Object): ILockerService | scala.Boolean = js.native
  /**
    * Add a new item to storage (even if it already exists)
    *
    * @param  {Mixed}  key    The key to add
    * @param  {Mixed}  putFunction    The default to pass to function if doesn't already exist
    * @param  {Mixed}  value  The value to add
    */
  def put(key: java.lang.String, putFunction: ILockerServicePutFunction, value: js.Any): ILockerService | scala.Boolean = js.native
  /**
    * Add a new item to storage (even if it already exists)
    *
    * @param  {Mixed}  key    The key to add
    * @param  {Mixed}  value  The value to add
    */
  def put(key: java.lang.String, value: js.Any): ILockerService | scala.Boolean = js.native
  /**
    * Add a new item to storage (even if it already exists)
    *
    * @param  {Mixed}  putFunction    The default to pass to function if doesn't already exist
    */
  def put(putFunction: angularLib.angularMod.Global.Function): ILockerService | scala.Boolean = js.native
  /**
    * Check browser support
    *
    * @see github.com/Modernizr/Modernizr/blob/master/feature-detects/storage/localstorage.js#L38-L47
    *
    * @param  {String}  driver  The driver to check support with
    */
  def supported(driver: java.lang.String): scala.Boolean = js.native
  /**
    * Unbind a storage key from a $scope property
    *
    * @param  {Object}  $scope  The angular $scope object
    * @param  {String}  key     The key to remove from bindings
    */
  def unbind(scope: angularLib.angularMod.angularNs.IScope, property: java.lang.String): ILockerService = js.native
}

