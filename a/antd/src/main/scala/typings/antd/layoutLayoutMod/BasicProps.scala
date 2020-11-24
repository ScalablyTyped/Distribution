package typings.antd.layoutLayoutMod

import typings.react.mod.HTMLAttributes
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BasicProps extends HTMLAttributes[HTMLDivElement] {
  
  var hasSider: js.UndefOr[Boolean] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
}
object BasicProps {
  
  @scala.inline
  def apply(): BasicProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BasicProps]
  }
  
  @scala.inline
  implicit class BasicPropsOps[Self <: BasicProps] (val x: Self) extends AnyVal {
    
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
    def setHasSider(value: Boolean): Self = this.set("hasSider", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasSider: Self = this.set("hasSider", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
  }
}
