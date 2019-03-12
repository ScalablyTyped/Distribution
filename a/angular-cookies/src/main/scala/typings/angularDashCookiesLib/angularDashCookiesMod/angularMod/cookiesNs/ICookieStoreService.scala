package typings
package angularDashCookiesLib.angularDashCookiesMod.angularMod.cookiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CookieStoreService DEPRECATED
  * see https://code.angularjs.org/1.2.26/docs/api/ngCookies/service/$cookieStore
  */
trait ICookieStoreService extends js.Object {
  /**
    * Returns the value of given cookie key
    * @param key Id to use for lookup
    */
  def get(key: java.lang.String): js.Any
  /**
    * Sets a value for given cookie key
    * @param key Id for the value
    * @param value Value to be stored
    */
  def put(key: java.lang.String, value: js.Any): scala.Unit
  /**
    * Remove given cookie
    * @param key Id of the key-value pair to delete
    */
  def remove(key: java.lang.String): scala.Unit
}

object ICookieStoreService {
  @scala.inline
  def apply(
    get: java.lang.String => js.Any,
    put: (java.lang.String, js.Any) => scala.Unit,
    remove: java.lang.String => scala.Unit
  ): ICookieStoreService = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), put = js.Any.fromFunction2(put), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[ICookieStoreService]
  }
}

