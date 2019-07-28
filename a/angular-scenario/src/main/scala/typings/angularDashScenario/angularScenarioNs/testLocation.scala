package typings.angularDashScenario.angularScenarioNs

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
  def apply(hash: () => Future, path: () => Future, search: () => Future, url: () => Future): testLocation = {
    val __obj = js.Dynamic.literal(hash = js.Any.fromFunction0(hash), path = js.Any.fromFunction0(path), search = js.Any.fromFunction0(search), url = js.Any.fromFunction0(url))
  
    __obj.asInstanceOf[testLocation]
  }
}

