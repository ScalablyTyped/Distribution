package typings.antDesignProLayout.footerMod

import typings.antDesignProLayout.anon.BlankTarget
import typings.antDesignProLayout.typingsMod.WithFalse
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FooterProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var copyright: js.UndefOr[WithFalse[String]] = js.native
  
  var links: js.UndefOr[WithFalse[js.Array[BlankTarget]]] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
}
object FooterProps {
  
  @scala.inline
  def apply(): FooterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FooterProps]
  }
  
  @scala.inline
  implicit class FooterPropsOps[Self <: FooterProps] (val x: Self) extends AnyVal {
    
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
    def setCopyright(value: WithFalse[String]): Self = this.set("copyright", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyright: Self = this.set("copyright", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: BlankTarget*): Self = this.set("links", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: WithFalse[js.Array[BlankTarget]]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
