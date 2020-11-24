package typings.angularCookies.mod.angularAugmentingMod.cookies

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * CookiesService
  * see https://docs.angularjs.org/api/ngCookies/service/$cookies
  */
@js.native
trait ICookiesService extends js.Object {
  
  def get(key: String): String = js.native
  
  def getAll(): js.Any = js.native
  
  def getObject(key: String): js.Any = js.native
  @JSName("getObject")
  def getObject_T_T[T](key: String): T = js.native
  
  def put(key: String, value: String): Unit = js.native
  def put(key: String, value: String, options: ICookiesOptions): Unit = js.native
  
  def putObject(key: String, value: js.Any): Unit = js.native
  def putObject(key: String, value: js.Any, options: ICookiesOptions): Unit = js.native
  
  def remove(key: String): Unit = js.native
  def remove(key: String, options: ICookiesOptions): Unit = js.native
}
