package typings.antDesignPro.chartCardMod

import typings.antd.cardMod.CardProps
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChartCardProps extends CardProps {
  
  var action: js.UndefOr[ReactNode] = js.native
  
  var avatar: js.UndefOr[ReactNode] = js.native
  
  var contentHeight: js.UndefOr[Double] = js.native
  
  var footer: js.UndefOr[ReactNode] = js.native
  
  @JSName("title")
  var title_IChartCardProps: ReactNode = js.native
  
  var total: js.UndefOr[ReactNode | Double | (js.Function0[ReactNode | Double])] = js.native
}
object IChartCardProps {
  
  @scala.inline
  def apply(): IChartCardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChartCardProps]
  }
  
  @scala.inline
  implicit class IChartCardPropsOps[Self <: IChartCardProps] (val x: Self) extends AnyVal {
    
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
    def setAction(value: ReactNode): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAction: Self = this.set("action", js.undefined)
    
    @scala.inline
    def setAvatar(value: ReactNode): Self = this.set("avatar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAvatar: Self = this.set("avatar", js.undefined)
    
    @scala.inline
    def setContentHeight(value: Double): Self = this.set("contentHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteContentHeight: Self = this.set("contentHeight", js.undefined)
    
    @scala.inline
    def setFooter(value: ReactNode): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFooter: Self = this.set("footer", js.undefined)
    
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    
    @scala.inline
    def setTotalFunction0(value: () => ReactNode | Double): Self = this.set("total", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTotal(value: ReactNode | Double | (js.Function0[ReactNode | Double])): Self = this.set("total", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotal: Self = this.set("total", js.undefined)
  }
}
