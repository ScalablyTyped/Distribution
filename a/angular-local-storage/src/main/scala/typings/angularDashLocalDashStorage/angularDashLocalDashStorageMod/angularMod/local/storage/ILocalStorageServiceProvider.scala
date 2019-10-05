package typings.angularDashLocalDashStorage.angularDashLocalDashStorageMod.angularMod.local.storage

import typings.angular.angularMod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILocalStorageServiceProvider extends IServiceProvider {
  /**
    * If localStorage is not supported, the library will default to cookies instead. This behavior can be disabled
    * @param shouldDefault default: true
    */
  def setDefaultToCookie(shouldDefault: Boolean): typings.angularDashLocalDashStorage.angularDashLocalDashStorageMod.angularMod.local.storage.ILocalStorageServiceProvider
  /**
    * Send signals for each of the following actions:
    * @param setItem default: true
    * @param removeItem default: false
    */
  def setNotify(setItem: Boolean, removeItem: Boolean): typings.angularDashLocalDashStorage.angularDashLocalDashStorageMod.angularMod.local.storage.ILocalStorageServiceProvider
  /**
    * Setter for the prefix
    * You should set a prefix to avoid overwriting any local storage variables from the rest of your app
    * e.g. localStorageServiceProvider.setPrefix('youAppName');
    * With provider you can use config as this:
    * myApp.config(function (localStorageServiceProvider) {
    *  localStorageServiceProvider.prefix = 'yourAppName';
    * });
    * @param prefix default: ls.<your-key>
    */
  def setPrefix(prefix: String): typings.angularDashLocalDashStorage.angularDashLocalDashStorageMod.angularMod.local.storage.ILocalStorageServiceProvider
  /**
    * Setter for cookie config
    * @param exp number of days before cookies expire (0 = does not expire). default: 30
    * @param path the web path the cookie represents. default: '/'
    * @param secure to store cookies as secure. default: false
    */
  def setStorageCookie(exp: Double, path: String, secure: Boolean): typings.angularDashLocalDashStorage.angularDashLocalDashStorageMod.angularMod.local.storage.ILocalStorageServiceProvider
  /**
    * Set the cookie domain, since this runs inside a the config() block, only providers and constants can be injected. As a result, $location service can't be used here, use a hardcoded string or window.location.
    * No default value
    */
  def setStorageCookieDomain(domain: String): typings.angularDashLocalDashStorage.angularDashLocalDashStorageMod.angularMod.local.storage.ILocalStorageServiceProvider
  /**
    * Setter for the storageType
    * @param storageType localstorage or sessionStorage. default: localStorage
    */
  def setStorageType(storageType: String): typings.angularDashLocalDashStorage.angularDashLocalDashStorageMod.angularMod.local.storage.ILocalStorageServiceProvider
}

object ILocalStorageServiceProvider {
  @scala.inline
  def apply(
    $get: js.Any,
    setDefaultToCookie: Boolean => typings.angularDashLocalDashStorage.angularDashLocalDashStorageMod.angularMod.local.storage.ILocalStorageServiceProvider,
    setNotify: (Boolean, Boolean) => typings.angularDashLocalDashStorage.angularDashLocalDashStorageMod.angularMod.local.storage.ILocalStorageServiceProvider,
    setPrefix: String => typings.angularDashLocalDashStorage.angularDashLocalDashStorageMod.angularMod.local.storage.ILocalStorageServiceProvider,
    setStorageCookie: (Double, String, Boolean) => typings.angularDashLocalDashStorage.angularDashLocalDashStorageMod.angularMod.local.storage.ILocalStorageServiceProvider,
    setStorageCookieDomain: String => typings.angularDashLocalDashStorage.angularDashLocalDashStorageMod.angularMod.local.storage.ILocalStorageServiceProvider,
    setStorageType: String => typings.angularDashLocalDashStorage.angularDashLocalDashStorageMod.angularMod.local.storage.ILocalStorageServiceProvider
  ): ILocalStorageServiceProvider = {
    val __obj = js.Dynamic.literal($get = $get, setDefaultToCookie = js.Any.fromFunction1(setDefaultToCookie), setNotify = js.Any.fromFunction2(setNotify), setPrefix = js.Any.fromFunction1(setPrefix), setStorageCookie = js.Any.fromFunction3(setStorageCookie), setStorageCookieDomain = js.Any.fromFunction1(setStorageCookieDomain), setStorageType = js.Any.fromFunction1(setStorageType))
  
    __obj.asInstanceOf[ILocalStorageServiceProvider]
  }
}

