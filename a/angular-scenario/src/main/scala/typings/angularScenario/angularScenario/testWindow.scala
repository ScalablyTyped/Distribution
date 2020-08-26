package typings.angularScenario.angularScenario

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait testWindow extends js.Object {
  def hash(): Future = js.native
  def href(): Future = js.native
  def path(): Future = js.native
  def search(): Future = js.native
}

object testWindow {
  @scala.inline
  def apply(hash: () => Future, href: () => Future, path: () => Future, search: () => Future): testWindow = {
    val __obj = js.Dynamic.literal(hash = js.Any.fromFunction0(hash), href = js.Any.fromFunction0(href), path = js.Any.fromFunction0(path), search = js.Any.fromFunction0(search))
    __obj.asInstanceOf[testWindow]
  }
  @scala.inline
  implicit class testWindowOps[Self <: testWindow] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setHash(value: () => Future): Self = this.set("hash", js.Any.fromFunction0(value))
    @scala.inline
    def setHref(value: () => Future): Self = this.set("href", js.Any.fromFunction0(value))
    @scala.inline
    def setPath(value: () => Future): Self = this.set("path", js.Any.fromFunction0(value))
    @scala.inline
    def setSearch(value: () => Future): Self = this.set("search", js.Any.fromFunction0(value))
  }
  
}

