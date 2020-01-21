package typings.angularCookie.angular.cookie

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
  def apply(key: String): js.Any = js.native
  /**
    * Create a cookie
    */
  def apply(key: String, value: js.Any): js.Any = js.native
  def apply(key: String, value: js.Any, options: CookieOptions): js.Any = js.native
  /**
    * Remove a cookie
    */
  def remove(key: String): Unit = js.native
  def remove(key: String, options: CookieOptions): Unit = js.native
}

