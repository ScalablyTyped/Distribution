package typings.angularScenario.angularScenario

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Browser extends js.Object {
  def location(): testLocation = js.native
  def navigateTo(urlDescription: String, urlFunction: js.Function0[String]): Unit = js.native
  def navigateTo(url: String): Unit = js.native
  def reload(): Unit = js.native
  def window(): testWindow = js.native
}

