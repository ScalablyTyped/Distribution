package typings
package angularDashScenarioLib.angularScenarioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait testWindow extends js.Object {
  def hash(): Future
  def href(): Future
  def path(): Future
  def search(): Future
}

object testWindow {
  @scala.inline
  def apply(
    hash: js.Function0[Future],
    href: js.Function0[Future],
    path: js.Function0[Future],
    search: js.Function0[Future]
  ): testWindow = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("hash")(hash)
    __obj.updateDynamic("href")(href)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("search")(search)
    __obj.asInstanceOf[testWindow]
  }
}

