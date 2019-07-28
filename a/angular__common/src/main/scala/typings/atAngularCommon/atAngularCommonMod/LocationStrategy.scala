package typings.atAngularCommon.atAngularCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "LocationStrategy")
@js.native
abstract class LocationStrategy () extends js.Object {
  def back(): Unit = js.native
  def forward(): Unit = js.native
  def getBaseHref(): String = js.native
  def onPopState(fn: LocationChangeListener): Unit = js.native
  def path(): String = js.native
  def path(includeHash: Boolean): String = js.native
  def prepareExternalUrl(internal: String): String = js.native
  def pushState(state: js.Any, title: String, url: String, queryParams: String): Unit = js.native
  def replaceState(state: js.Any, title: String, url: String, queryParams: String): Unit = js.native
}

