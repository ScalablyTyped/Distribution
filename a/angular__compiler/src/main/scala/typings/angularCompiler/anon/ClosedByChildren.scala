package typings.angularCompiler.anon

import typings.angularCompiler.tagsMod.TagContentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClosedByChildren extends js.Object {
  var closedByChildren: js.UndefOr[js.Array[String]] = js.native
  var closedByParent: js.UndefOr[Boolean] = js.native
  var contentType: js.UndefOr[TagContentType] = js.native
  var ignoreFirstLf: js.UndefOr[Boolean] = js.native
  var implicitNamespacePrefix: js.UndefOr[String] = js.native
  var isVoid: js.UndefOr[Boolean] = js.native
}

object ClosedByChildren {
  @scala.inline
  def apply(): ClosedByChildren = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClosedByChildren]
  }
  @scala.inline
  implicit class ClosedByChildrenOps[Self <: ClosedByChildren] (val x: Self) extends AnyVal {
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
    def setClosedByChildrenVarargs(value: String*): Self = this.set("closedByChildren", js.Array(value :_*))
    @scala.inline
    def setClosedByChildren(value: js.Array[String]): Self = this.set("closedByChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosedByChildren: Self = this.set("closedByChildren", js.undefined)
    @scala.inline
    def setClosedByParent(value: Boolean): Self = this.set("closedByParent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClosedByParent: Self = this.set("closedByParent", js.undefined)
    @scala.inline
    def setContentType(value: TagContentType): Self = this.set("contentType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContentType: Self = this.set("contentType", js.undefined)
    @scala.inline
    def setIgnoreFirstLf(value: Boolean): Self = this.set("ignoreFirstLf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIgnoreFirstLf: Self = this.set("ignoreFirstLf", js.undefined)
    @scala.inline
    def setImplicitNamespacePrefix(value: String): Self = this.set("implicitNamespacePrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImplicitNamespacePrefix: Self = this.set("implicitNamespacePrefix", js.undefined)
    @scala.inline
    def setIsVoid(value: Boolean): Self = this.set("isVoid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsVoid: Self = this.set("isVoid", js.undefined)
  }
  
}

