package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Sources extends js.Object {
  var excludeSources: js.UndefOr[js.Array[String]] = js.native
  var scope: js.UndefOr[typings.atom.mod.ScopeDescriptor] = js.native
  var sources: js.UndefOr[js.Array[String]] = js.native
}

object Sources {
  @scala.inline
  def apply(): Sources = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Sources]
  }
  @scala.inline
  implicit class SourcesOps[Self <: Sources] (val x: Self) extends AnyVal {
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
    def setExcludeSourcesVarargs(value: String*): Self = this.set("excludeSources", js.Array(value :_*))
    @scala.inline
    def setExcludeSources(value: js.Array[String]): Self = this.set("excludeSources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludeSources: Self = this.set("excludeSources", js.undefined)
    @scala.inline
    def setScope(value: typings.atom.mod.ScopeDescriptor): Self = this.set("scope", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScope: Self = this.set("scope", js.undefined)
    @scala.inline
    def setSourcesVarargs(value: String*): Self = this.set("sources", js.Array(value :_*))
    @scala.inline
    def setSources(value: js.Array[String]): Self = this.set("sources", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSources: Self = this.set("sources", js.undefined)
  }
  
}

