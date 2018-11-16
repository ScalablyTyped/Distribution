package typings
package angularDashScenarioLib.angularScenarioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Browser extends js.Object {
  def location(): testLocation = js.native
  def navigateTo(urlDescription: java.lang.String, urlFunction: js.Function0[java.lang.String]): scala.Unit = js.native
  def navigateTo(url: java.lang.String): scala.Unit = js.native
  def reload(): scala.Unit = js.native
  def window(): testWindow = js.native
}

