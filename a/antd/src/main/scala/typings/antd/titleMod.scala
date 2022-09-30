package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object titleMod extends Shortcut {
  
  @JSImport("antd/lib/skeleton/Title", JSImport.Default)
  @js.native
  val default: FC[SkeletonTitleProps] = js.native
  
  trait SkeletonTitleProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var width: js.UndefOr[Double | String] = js.undefined
  }
  object SkeletonTitleProps {
    
    inline def apply(): SkeletonTitleProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonTitleProps]
    }
    
    extension [Self <: SkeletonTitleProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
  
  type _To = FC[SkeletonTitleProps]
  
  /* This means you don't have to write `default`, but can instead just say `titleMod.foo` */
  override def _to: FC[SkeletonTitleProps] = default
}
