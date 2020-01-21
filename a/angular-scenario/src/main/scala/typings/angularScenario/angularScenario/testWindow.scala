package typings.angularScenario.angularScenario

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
  def apply(hash: () => Future, href: () => Future, path: () => Future, search: () => Future): testWindow = {
    val __obj = js.Dynamic.literal(hash = js.Any.fromFunction0(hash), href = js.Any.fromFunction0(href), path = js.Any.fromFunction0(path), search = js.Any.fromFunction0(search))
  
    __obj.asInstanceOf[testWindow]
  }
}

