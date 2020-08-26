package typings.antDesignPro.globalFooterMod

import typings.antDesignPro.anon.BlankTarget
import typings.react.mod.CSSProperties
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GlobalFooterProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var copyright: js.UndefOr[ReactNode] = js.native
  var links: js.UndefOr[js.Array[BlankTarget]] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object GlobalFooterProps {
  @scala.inline
  def apply(): GlobalFooterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GlobalFooterProps]
  }
  @scala.inline
  implicit class GlobalFooterPropsOps[Self <: GlobalFooterProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCopyright(value: ReactNode): Self = this.set("copyright", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    @scala.inline
    def setLinksVarargs(value: BlankTarget*): Self = this.set("links", js.Array(value :_*))
    @scala.inline
    def setLinks(value: js.Array[BlankTarget]): Self = this.set("links", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

