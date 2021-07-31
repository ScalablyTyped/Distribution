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
  
  @scala.inline
  def handleGradient(strokeColor: ProgressGradient, directionConfig: DirectionType): BackgroundImage = (^.asInstanceOf[js.Dynamic].applyDynamic("handleGradient")(strokeColor.asInstanceOf[js.Any], directionConfig.asInstanceOf[js.Any])).asInstanceOf[BackgroundImage]
  
  @scala.inline
  def sortGradient(gradients: StringGradients): String = ^.asInstanceOf[js.Dynamic].applyDynamic("sortGradient")(gradients.asInstanceOf[js.Any]).asInstanceOf[String]
  
  trait LineProps
    extends StObject
       with ProgressProps {
    
    var children: ReactNode
    
    var direction: js.UndefOr[DirectionType] = js.undefined
    
    @JSName("prefixCls")
    var prefixCls_LineProps: String
  }
  object LineProps {
    
    @scala.inline
    def apply(prefixCls: String): LineProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
      __obj.asInstanceOf[LineProps]
    }
    
    @scala.inline
    implicit class LinePropsMutableBuilder[Self <: LineProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDirection(value: DirectionType): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    }
  }
}
