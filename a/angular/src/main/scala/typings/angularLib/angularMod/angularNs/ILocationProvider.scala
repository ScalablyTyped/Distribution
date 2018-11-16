package typings
package angularLib.angularMod.angularNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ILocationProvider extends IServiceProvider {
  def hashPrefix(): java.lang.String = js.native
  def hashPrefix(prefix: java.lang.String): ILocationProvider = js.native
  def html5Mode(): scala.Boolean = js.native
  // Documentation states that parameter is string, but
  // implementation tests it as boolean, which makes more sense
  // since this is a toggler
  def html5Mode(active: scala.Boolean): ILocationProvider = js.native
  def html5Mode(mode: angularLib.Anon_RewriteLinks): ILocationProvider = js.native
}

