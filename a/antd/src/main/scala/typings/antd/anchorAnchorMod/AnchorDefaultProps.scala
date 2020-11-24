package typings.antd.anchorAnchorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnchorDefaultProps extends AnchorProps {
  
  @JSName("affix")
  var affix_AnchorDefaultProps: Boolean = js.native
  
  @JSName("getContainer")
  def getContainer_MAnchorDefaultProps(): AnchorContainer = js.native
  
  @JSName("prefixCls")
  var prefixCls_AnchorDefaultProps: String = js.native
  
  @JSName("showInkInFixed")
  var showInkInFixed_AnchorDefaultProps: Boolean = js.native
}
object AnchorDefaultProps {
  
  @scala.inline
  def apply(affix: Boolean, getContainer: () => AnchorContainer, prefixCls: String, showInkInFixed: Boolean): AnchorDefaultProps = {
    val __obj = js.Dynamic.literal(affix = affix.asInstanceOf[js.Any], getContainer = js.Any.fromFunction0(getContainer), prefixCls = prefixCls.asInstanceOf[js.Any], showInkInFixed = showInkInFixed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnchorDefaultProps]
  }
  
  @scala.inline
  implicit class AnchorDefaultPropsOps[Self <: AnchorDefaultProps] (val x: Self) extends AnyVal {
    
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
    def setAffix(value: Boolean): Self = this.set("affix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetContainer(value: () => AnchorContainer): Self = this.set("getContainer", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowInkInFixed(value: Boolean): Self = this.set("showInkInFixed", value.asInstanceOf[js.Any])
  }
}
