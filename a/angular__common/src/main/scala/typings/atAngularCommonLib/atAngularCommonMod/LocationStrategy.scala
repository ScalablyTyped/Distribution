package typings
package atAngularCommonLib.atAngularCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "LocationStrategy")
@js.native
abstract class LocationStrategy () extends js.Object {
  def back(): scala.Unit = js.native
  def forward(): scala.Unit = js.native
  def getBaseHref(): java.lang.String = js.native
  def onPopState(fn: LocationChangeListener): scala.Unit = js.native
  def path(): java.lang.String = js.native
  def path(includeHash: scala.Boolean): java.lang.String = js.native
  def prepareExternalUrl(internal: java.lang.String): java.lang.String = js.native
  def pushState(state: js.Any, title: java.lang.String, url: java.lang.String, queryParams: java.lang.String): scala.Unit = js.native
  def replaceState(state: js.Any, title: java.lang.String, url: java.lang.String, queryParams: java.lang.String): scala.Unit = js.native
}

