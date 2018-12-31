package typings
package angularDashCookiesLib.angularDashCookiesMod.angularMod.cookiesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * CookieService
  * see http://docs.angularjs.org/api/ngCookies.$cookies
  */
/**
  * CookieStoreService
  * see http://docs.angularjs.org/api/ngCookies.$cookieStore
  */
@js.native
trait ICookiesService
  extends /* index */ org.scalablytyped.runtime.StringDictionary[js.Any] {
  def get(key: java.lang.String): java.lang.String = js.native
  def getAll(): js.Any = js.native
  def getObject(key: java.lang.String): js.Any = js.native
  @JSName("getObject")
  def getObject_TT[T](key: java.lang.String): T = js.native
  def put(key: java.lang.String, value: java.lang.String): scala.Unit = js.native
  def put(key: java.lang.String, value: java.lang.String, options: ICookiesOptions): scala.Unit = js.native
  def putObject(key: java.lang.String, value: js.Any): scala.Unit = js.native
  def putObject(key: java.lang.String, value: js.Any, options: ICookiesOptions): scala.Unit = js.native
  def remove(key: java.lang.String): scala.Unit = js.native
  def remove(key: java.lang.String, options: ICookiesOptions): scala.Unit = js.native
}

