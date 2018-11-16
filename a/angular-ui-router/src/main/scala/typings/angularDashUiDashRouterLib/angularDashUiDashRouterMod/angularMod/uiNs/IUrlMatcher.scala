package typings
package angularDashUiDashRouterLib.angularDashUiDashRouterMod.angularMod.uiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IUrlMatcher extends js.Object {
  def concat(pattern: java.lang.String): IUrlMatcher = js.native
  def exec(path: java.lang.String): js.Object = js.native
  def exec(path: java.lang.String, search: js.Any): js.Object = js.native
  def exec(path: java.lang.String, search: js.Any, hash: java.lang.String): js.Object = js.native
  def exec(path: java.lang.String, search: js.Any, hash: java.lang.String, options: js.Any): js.Object = js.native
  def format(values: js.Object): java.lang.String = js.native
  def parameters(): js.Array[java.lang.String] = js.native
}

