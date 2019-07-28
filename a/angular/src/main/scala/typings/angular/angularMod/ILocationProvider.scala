package typings.angular.angularMod

import typings.angular.Anon_Enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILocationProvider extends IServiceProvider {
  def hashPrefix(): String = js.native
  def hashPrefix(prefix: String): ILocationProvider = js.native
  def html5Mode(): Boolean = js.native
  // Documentation states that parameter is string, but
  // implementation tests it as boolean, which makes more sense
  // since this is a toggler
  def html5Mode(active: Boolean): ILocationProvider = js.native
  def html5Mode(mode: Anon_Enabled): ILocationProvider = js.native
}

