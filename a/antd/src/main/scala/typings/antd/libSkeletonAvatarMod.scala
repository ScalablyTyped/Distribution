package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.antdStrings.circle
import typings.antd.antdStrings.large
import typings.antd.antdStrings.small
import typings.antd.antdStrings.square
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSkeletonAvatarMod extends Shortcut {
  
  @JSImport("antd/lib/skeleton/Avatar", JSImport.Default)
  @js.native
  val default: FC[AvatarProps] = js.native
  
  /* Inlined parent std.Omit<antd.antd/lib/skeleton/Element.SkeletonElementProps, 'shape'> */
  trait AvatarProps extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var shape: js.UndefOr[circle | square] = js.undefined
    
    var size: js.UndefOr[large | small | typings.antd.antdStrings.default | Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object AvatarProps {
    
    inline def apply(): AvatarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AvatarProps]
    }
    
    extension [Self <: AvatarProps](x: Self) {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setShape(value: circle | square): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: large | small | typings.antd.antdStrings.default | Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  type _To = FC[AvatarProps]
  
  /* This means you don't have to write `default`, but can instead just say `libSkeletonAvatarMod.foo` */
  override def _to: FC[AvatarProps] = default
}
