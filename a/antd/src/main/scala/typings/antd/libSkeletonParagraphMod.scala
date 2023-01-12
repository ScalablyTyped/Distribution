package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSkeletonParagraphMod extends Shortcut {
  
  @JSImport("antd/lib/skeleton/Paragraph", JSImport.Default)
  @js.native
  val default: FC[SkeletonParagraphProps] = js.native
  
  trait SkeletonParagraphProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var width: js.UndefOr[widthUnit | js.Array[widthUnit]] = js.undefined
  }
  object SkeletonParagraphProps {
    
    inline def apply(): SkeletonParagraphProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SkeletonParagraphProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SkeletonParagraphProps] (val x: Self) extends AnyVal {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setWidth(value: widthUnit | js.Array[widthUnit]): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      inline def setWidthVarargs(value: widthUnit*): Self = StObject.set(x, "width", js.Array(value*))
    }
  }
  
  type _To = FC[SkeletonParagraphProps]
  
  /* This means you don't have to write `default`, but can instead just say `libSkeletonParagraphMod.foo` */
  override def _to: FC[SkeletonParagraphProps] = default
  
  type widthUnit = Double | String
}
