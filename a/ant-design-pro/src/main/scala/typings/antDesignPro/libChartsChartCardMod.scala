package typings.antDesignPro

import typings.antd.libCardCardMod.CardProps
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libChartsChartCardMod {
  
  @JSImport("ant-design-pro/lib/Charts/ChartCard", JSImport.Default)
  @js.native
  open class default () extends Component[IChartCardProps, Any, Any]
  
  type ChartCard = Component[IChartCardProps, Any, Any]
  
  trait IChartCardProps
    extends StObject
       with CardProps {
    
    var action: js.UndefOr[ReactNode] = js.undefined
    
    var avatar: js.UndefOr[ReactNode] = js.undefined
    
    var contentHeight: js.UndefOr[Double] = js.undefined
    
    var footer: js.UndefOr[ReactNode] = js.undefined
    
    @JSName("title")
    var title_IChartCardProps: ReactNode
    
    var total: js.UndefOr[ReactNode | Double | (js.Function0[ReactNode | Double])] = js.undefined
  }
  object IChartCardProps {
    
    inline def apply(): IChartCardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IChartCardProps]
    }
    
    extension [Self <: IChartCardProps](x: Self) {
      
      inline def setAction(value: ReactNode): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setAvatar(value: ReactNode): Self = StObject.set(x, "avatar", value.asInstanceOf[js.Any])
      
      inline def setAvatarUndefined: Self = StObject.set(x, "avatar", js.undefined)
      
      inline def setContentHeight(value: Double): Self = StObject.set(x, "contentHeight", value.asInstanceOf[js.Any])
      
      inline def setContentHeightUndefined: Self = StObject.set(x, "contentHeight", js.undefined)
      
      inline def setFooter(value: ReactNode): Self = StObject.set(x, "footer", value.asInstanceOf[js.Any])
      
      inline def setFooterUndefined: Self = StObject.set(x, "footer", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      inline def setTotal(value: ReactNode | Double | (js.Function0[ReactNode | Double])): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalFunction0(value: () => ReactNode | Double): Self = StObject.set(x, "total", js.Any.fromFunction0(value))
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
}
