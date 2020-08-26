package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScopeSelector extends js.Object {
  var scopeSelector: js.UndefOr[String] = js.native
  var source: js.UndefOr[String] = js.native
}

object ScopeSelector {
  @scala.inline
  def apply(): ScopeSelector = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScopeSelector]
  }
  @scala.inline
  implicit class ScopeSelectorOps[Self <: ScopeSelector] (val x: Self) extends AnyVal {
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
    def setScopeSelector(value: String): Self = this.set("scopeSelector", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScopeSelector: Self = this.set("scopeSelector", js.undefined)
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSource: Self = this.set("source", js.undefined)
  }
  
}

