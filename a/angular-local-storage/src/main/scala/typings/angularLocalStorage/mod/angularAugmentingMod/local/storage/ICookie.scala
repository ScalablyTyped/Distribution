package typings.angularLocalStorage.mod.angularAugmentingMod.local.storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-name
@js.native
trait ICookie extends js.Object {
  /**
    * Checks if cookies are enabled in the browser.
    * Returns: Boolean
    */
  val isSupported: Boolean = js.native
  /**
    * Remove all data for this app from cookie.
    */
  def clearAll(): js.Any = js.native
  /**
    * Directly get a value from a cookie.
    */
  def get(key: String): String = js.native
  /**
    * Remove directly value from a cookie.
    */
  def remove(key: String): Boolean = js.native
  /**
    * Directly adds a value to cookies.
    * Note: Typically used as a fallback if local storage is not supported.
    */
  def set(key: String, `val`: String): Boolean = js.native
  def set(key: String, `val`: String, daysToExpiry: Double): Boolean = js.native
}

