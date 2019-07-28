package typings.angularDashDynamicDashLocale.angularMod.dynamicLocaleNs

import typings.angular.angularMod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait tmhDynamicLocaleProvider extends IServiceProvider {
  def defaultLocale(locale: String): Unit = js.native
  def localeLocationPattern(): String = js.native
  def localeLocationPattern(location: String): tmhDynamicLocaleProvider = js.native
  def storageKey(storageKey: String): Unit = js.native
  def useCookieStorage(): Unit = js.native
  def useStorage(storageName: String): Unit = js.native
}

