package typings
package angularDashScenarioLib.angularScenarioNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait testLocation extends js.Object {
  def hash(): Future
  def path(): Future
  def search(): Future
  def url(): Future
}

object testLocation {
  @scala.inline
  def apply(
    hash: js.Function0[Future],
    path: js.Function0[Future],
    search: js.Function0[Future],
    url: js.Function0[Future]
  ): testLocation = {
    val __obj = js.Dynamic.literal(hash = hash, path = path, search = search, url = url)
  
    __obj.asInstanceOf[testLocation]
  }
}

