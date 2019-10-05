package typings.angularDashCookies.angularDashCookiesMod.angularMod.cookies

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
  def get(key: String): js.Any
  /**
    * Sets a value for given cookie key
    * @param key Id for the value
    * @param value Value to be stored
    */
  def put(key: String, value: js.Any): Unit
  /**
    * Remove given cookie
    * @param key Id of the key-value pair to delete
    */
  def remove(key: String): Unit
}

object ICookieStoreService {
  @scala.inline
  def apply(get: String => js.Any, put: (String, js.Any) => Unit, remove: String => Unit): ICookieStoreService = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), put = js.Any.fromFunction2(put), remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[ICookieStoreService]
  }
}

