package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.anon.BackgroundImage
import typings.antd.configProviderContextMod.DirectionType
import typings.antd.progressProgressMod.ProgressGradient
import typings.antd.progressProgressMod.ProgressProps
import typings.antd.progressProgressMod.StringGradients
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object lineMod extends Shortcut {
  
  @JSImport("antd/lib/progress/Line", JSImport.Default)
  @js.native
  val default: FC[LineProps] = js.native
  
  @JSImport("antd/lib/progress/Line", "handleGradient")
  @js.native
  def handleGradient(strokeColor: ProgressGradient, directionConfig: DirectionType): BackgroundImage = js.native
  
  @JSImport("antd/lib/progress/Line", "sortGradient")
  @js.native
  def sortGradient(gradients: StringGradients): String = js.native
  
  @js.native
  trait LineProps extends ProgressProps {
    
    var children: ReactNode = js.native
    
    var direction: js.UndefOr[DirectionType] = js.native
    
    @JSName("prefixCls")
    var prefixCls_LineProps: String = js.native
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
  
  type _To = FC[LineProps]
  
  /* This means you don't have to write `default`, but can instead just say `lineMod.foo` */
  override def _to: FC[LineProps] = default
}
