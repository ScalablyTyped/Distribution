package typings.angularCookies.mod.angularAugmentingMod.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CookieStoreService DEPRECATED
  * see https://code.angularjs.org/1.2.26/docs/api/ngCookies/service/$cookieStore
  */
@js.native
trait ICookieStoreService extends js.Object {
  /**
    * Returns the value of given cookie key
    * @param key Id to use for lookup
    */
  def get(key: String): js.Any = js.native
  /**
    * Sets a value for given cookie key
    * @param key Id for the value
    * @param value Value to be stored
    */
  def put(key: String, value: js.Any): Unit = js.native
  /**
    * Remove given cookie
    * @param key Id of the key-value pair to delete
    */
  def remove(key: String): Unit = js.native
}

object ICookieStoreService {
  @scala.inline
  def apply(get: String => js.Any, put: (String, js.Any) => Unit, remove: String => Unit): ICookieStoreService = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), put = js.Any.fromFunction2(put), remove = js.Any.fromFunction1(remove))
    __obj.asInstanceOf[ICookieStoreService]
  }
  @scala.inline
  implicit class ICookieStoreServiceOps[Self <: ICookieStoreService] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGet(value: String => js.Any): Self = this.set("get", js.Any.fromFunction1(value))
    @scala.inline
    def setPut(value: (String, js.Any) => Unit): Self = this.set("put", js.Any.fromFunction2(value))
    @scala.inline
    def setRemove(value: String => Unit): Self = this.set("remove", js.Any.fromFunction1(value))
  }
  
}

