package typings.angularCommon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "PlatformLocation")
@js.native
abstract class PlatformLocation () extends js.Object {
  val hash: String = js.native
  val hostname: String = js.native
  val href: String = js.native
  val pathname: String = js.native
  val port: String = js.native
  val protocol: String = js.native
  val search: String = js.native
  def back(): Unit = js.native
  def forward(): Unit = js.native
  def getBaseHrefFromDOM(): String = js.native
  def getState(): js.Any = js.native
  def onHashChange(fn: LocationChangeListener): Unit = js.native
  def onPopState(fn: LocationChangeListener): Unit = js.native
  def pushState(state: js.Any, title: String, url: String): Unit = js.native
  def replaceState(state: js.Any, title: String, url: String): Unit = js.native
}

