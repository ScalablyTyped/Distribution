package typings
package angularDashLocalDashStorageLib.angularDashLocalDashStorageMod.angularMod.localNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILocalStorageServiceProvider
  extends angularLib.angularMod.angularNs.IServiceProvider {
  /**
    * If localStorage is not supported, the library will default to cookies instead. This behavior can be disabled
    * @param shouldDefault default: true
    */
  def setDefaultToCookie(shouldDefault: scala.Boolean): ILocalStorageServiceProvider
  /**
    * Send signals for each of the following actions:
    * @param setItem default: true
    * @param removeItem default: false
    */
  def setNotify(setItem: scala.Boolean, removeItem: scala.Boolean): ILocalStorageServiceProvider
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
  def setPrefix(prefix: java.lang.String): ILocalStorageServiceProvider
  /**
    * Setter for cookie config
    * @param exp number of days before cookies expire (0 = does not expire). default: 30
    * @param path the web path the cookie represents. default: '/'
    * @param secure to store cookies as secure. default: false
    */
  def setStorageCookie(exp: scala.Double, path: java.lang.String, secure: scala.Boolean): ILocalStorageServiceProvider
  /**
    * Set the cookie domain, since this runs inside a the config() block, only providers and constants can be injected. As a result, $location service can't be used here, use a hardcoded string or window.location.
    * No default value
    */
  def setStorageCookieDomain(domain: java.lang.String): ILocalStorageServiceProvider
  /**
    * Setter for the storageType
    * @param storageType localstorage or sessionStorage. default: localStorage
    */
  def setStorageType(storageType: java.lang.String): ILocalStorageServiceProvider
}

