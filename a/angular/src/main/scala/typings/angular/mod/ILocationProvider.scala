package typings.angular.mod

import typings.angular.anon.Enabled
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ILocationProvider extends IServiceProvider {
  
  def hashPrefix(): String = js.native
  def hashPrefix(prefix: String): ILocationProvider = js.native
  
  def html5Mode(): Boolean = js.native
  // Documentation states that parameter is string, but
  // implementation tests it as boolean, which makes more sense
  // since this is a toggler
  def html5Mode(active: Boolean): ILocationProvider = js.native
  def html5Mode(mode: Enabled): ILocationProvider = js.native
}
