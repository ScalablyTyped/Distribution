package typings
package atAngularCommonLib.srcLocationPlatformUnderscoreLocationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common/src/location/platform_location", "PlatformLocation")
@js.native
abstract class PlatformLocation () extends js.Object {
  val hash: java.lang.String = js.native
  val pathname: java.lang.String = js.native
  val search: java.lang.String = js.native
  def back(): scala.Unit = js.native
  def forward(): scala.Unit = js.native
  def getBaseHrefFromDOM(): java.lang.String = js.native
  def onHashChange(fn: LocationChangeListener): scala.Unit = js.native
  def onPopState(fn: LocationChangeListener): scala.Unit = js.native
  def pushState(state: js.Any, title: java.lang.String, url: java.lang.String): scala.Unit = js.native
  def replaceState(state: js.Any, title: java.lang.String, url: java.lang.String): scala.Unit = js.native
}

