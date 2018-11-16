package typings
package angularDashLocalDashStorageLib.angularDashLocalDashStorageMod.angularMod.localNs.storageNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICookie extends js.Object {
  /**
               * Checks if cookies are enabled in the browser.
               * Returns: Boolean
               */
  var isSupported: scala.Boolean = js.native
  /**
               * Remove all data for this app from cookie.
               */
  def clearAll(): js.Any = js.native
  /**
               * Directly get a value from a cookie.
               * Returns: value from local storage
               * @param key
               */
  def get(key: java.lang.String): java.lang.String = js.native
  /**
               * Remove directly value from a cookie.
               * Returns: Boolean
               * @param key
               */
  def remove(key: java.lang.String): scala.Boolean = js.native
  /**
               * Directly adds a value to cookies.
               * Note: Typically used as a fallback if local storage is not supported.
               * Returns: Boolean
               * @param key
               * @param val
               */
  def set(key: java.lang.String, `val`: java.lang.String): scala.Boolean = js.native
  /**
               * Directly adds a value to cookies with an expiration.
               * Note: Typically used as a fallback if local storage is not supported.
               * Returns: Boolean
               * @param key
               * @param val
               * @param daysToExpiry
               */
  def set(key: java.lang.String, `val`: java.lang.String, daysToExpiry: scala.Double): scala.Boolean = js.native
}

