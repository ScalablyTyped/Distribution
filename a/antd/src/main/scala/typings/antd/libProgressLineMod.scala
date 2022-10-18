package typings.antd

import typings.antd.anon.BackgroundImage
import typings.antd.libConfigProviderContextMod.DirectionType
import typings.antd.libProgressProgressMod.ProgressGradient
import typings.antd.libProgressProgressMod.ProgressProps
import typings.antd.libProgressProgressMod.StringGradients
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProgressLineMod {
  
  @JSImport("antd/lib/progress/Line", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("antd/lib/progress/Line", JSImport.Default)
  @js.native
  val default: FC[LineProps] = js.native
  
  inline def handleGradient(strokeColor: ProgressGradient): BackgroundImage = ^.asInstanceOf[js.Dynamic].applyDynamic("handleGradient")(strokeColor.asInstanceOf[js.Any]).asInstanceOf[BackgroundImage]
  inline def handleGradient(strokeColor: ProgressGradient, directionConfig: DirectionType): BackgroundImage = (^.asInstanceOf[js.Dynamic].applyDynamic("handleGradient")(strokeColor.asInstanceOf[js.Any], directionConfig.asInstanceOf[js.Any])).asInstanceOf[BackgroundImage]
  
  inline def sortGradient(gradients: StringGradients): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sortGradient")(gradients.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait LineProps
    extends StObject
       with ProgressProps {
    
    @JSName("children")
    var children_LineProps: ReactNode
    
    var direction: js.UndefOr[DirectionType] = js.undefined
    
    @JSName("prefixCls")
    var prefixCls_LineProps: String
    
    @JSName("strokeColor")
    var strokeColor_LineProps: js.UndefOr[String | ProgressGradient] = js.undefined
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
      
      inline def setStrokeColor(value: String | ProgressGradient): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    }
  }
}
