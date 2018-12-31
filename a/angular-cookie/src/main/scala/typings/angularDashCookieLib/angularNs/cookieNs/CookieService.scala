package typings
package angularDashCookieLib.angularNs.cookieNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookieService extends js.Object {
  /**
    * Get all cookies
    */
  def apply(): js.Any = js.native
  /**
    * Get a cookie with a specific key
    */
  def apply(key: java.lang.String): js.Any = js.native
  /**
    * Create a cookie
    */
  def apply(key: java.lang.String, value: js.Any): js.Any = js.native
  def apply(key: java.lang.String, value: js.Any, options: CookieOptions): js.Any = js.native
  /**
    * Remove a cookie
    */
  def remove(key: java.lang.String): scala.Unit = js.native
  def remove(key: java.lang.String, options: CookieOptions): scala.Unit = js.native
}

