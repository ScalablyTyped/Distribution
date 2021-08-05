package typings.antd

import typings.antd.anon.BackgroundImage
import typings.antd.configProviderContextMod.DirectionType
import typings.antd.progressProgressMod.ProgressGradient
import typings.antd.progressProgressMod.ProgressProps
import typings.antd.progressProgressMod.StringGradients
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineMod {
  
  @JSImport("antd/lib/progress/Line", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd/lib/progress/Line", JSImport.Default)
  @js.native
  val default: FC[LineProps] = js.native
  
  inline def handleGradient(strokeColor: ProgressGradient, directionConfig: DirectionType): BackgroundImage = (^.asInstanceOf[js.Dynamic].applyDynamic("handleGradient")(strokeColor.asInstanceOf[js.Any], directionConfig.asInstanceOf[js.Any])).asInstanceOf[BackgroundImage]
  
  inline def sortGradient(gradients: StringGradients): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sortGradient")(gradients.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait LineProps
    extends StObject
       with ProgressProps {
    
    var children: ReactNode
    
    var direction: js.UndefOr[DirectionType] = js.undefined
    
    @JSName("prefixCls")
    var prefixCls_LineProps: String
  }
  object LineProps {
    
    inline def apply(prefixCls: String): LineProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineProps]
    }
    
    extension [Self <: LineProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDirection(value: DirectionType): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
}
