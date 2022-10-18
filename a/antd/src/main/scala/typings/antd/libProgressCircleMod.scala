package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libProgressProgressMod.ProgressGradient
import typings.antd.libProgressProgressMod.ProgressProps
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libProgressCircleMod extends Shortcut {
  
  @JSImport("antd/lib/progress/Circle", JSImport.Default)
  @js.native
  val default: FC[CircleProps] = js.native
  
  trait CircleProps
    extends StObject
       with ProgressProps {
    
    @JSName("children")
    var children_CircleProps: ReactNode
    
    @JSName("prefixCls")
    var prefixCls_CircleProps: String
    
    var progressStatus: String
    
    @JSName("strokeColor")
    var strokeColor_CircleProps: js.UndefOr[String | ProgressGradient] = js.undefined
  }
  object CircleProps {
    
    inline def apply(prefixCls: String, progressStatus: String): CircleProps = {
      val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], progressStatus = progressStatus.asInstanceOf[js.Any])
      __obj.asInstanceOf[CircleProps]
    }
    
    extension [Self <: CircleProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setProgressStatus(value: String): Self = StObject.set(x, "progressStatus", value.asInstanceOf[js.Any])
      
      inline def setStrokeColor(value: String | ProgressGradient): Self = StObject.set(x, "strokeColor", value.asInstanceOf[js.Any])
      
      inline def setStrokeColorUndefined: Self = StObject.set(x, "strokeColor", js.undefined)
    }
  }
  
  type _To = FC[CircleProps]
  
  /* This means you don't have to write `default`, but can instead just say `libProgressCircleMod.foo` */
  override def _to: FC[CircleProps] = default
}
