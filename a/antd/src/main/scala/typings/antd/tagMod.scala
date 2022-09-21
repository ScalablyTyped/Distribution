package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.checkableTagMod.CheckableTagProps
import typings.antd.colorsMod.PresetColorType
import typings.antd.colorsMod.PresetStatusColorType
import typings.antd.typeMod.LiteralUnion
import typings.react.mod.FC
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.HTMLElement
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tagMod extends Shortcut {
  
  @JSImport("antd/lib/tag", JSImport.Default)
  @js.native
  val default: TagType = js.native
  
  trait TagProps
    extends StObject
       with HTMLAttributes[HTMLSpanElement] {
    
    var closable: js.UndefOr[Boolean] = js.undefined
    
    var closeIcon: js.UndefOr[ReactNode] = js.undefined
    
    @JSName("color")
    var color_TagProps: js.UndefOr[LiteralUnion[PresetColorType | PresetStatusColorType, String]] = js.undefined
    
    var icon: js.UndefOr[ReactNode] = js.undefined
    
    var onClose: js.UndefOr[js.Function1[/* e */ MouseEvent[HTMLElement, NativeMouseEvent], Unit]] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    /** @deprecated `visible` will be removed in next major version. */
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object TagProps {
    
    inline def apply(): TagProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TagProps]
    }
    
    extension [Self <: TagProps](x: Self) {
      
      inline def setClosable(value: Boolean): Self = StObject.set(x, "closable", value.asInstanceOf[js.Any])
      
      inline def setClosableUndefined: Self = StObject.set(x, "closable", js.undefined)
      
      inline def setCloseIcon(value: ReactNode): Self = StObject.set(x, "closeIcon", value.asInstanceOf[js.Any])
      
      inline def setCloseIconUndefined: Self = StObject.set(x, "closeIcon", js.undefined)
      
      inline def setColor(value: LiteralUnion[PresetColorType | PresetStatusColorType, String]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setIcon(value: ReactNode): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
      
      inline def setOnClose(value: /* e */ MouseEvent[HTMLElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction1(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait TagType
    extends StObject
       with ForwardRefExoticComponent[TagProps & RefAttributes[HTMLElement]] {
    
    var CheckableTag: FC[CheckableTagProps] = js.native
  }
  
  type _To = TagType
  
  /* This means you don't have to write `default`, but can instead just say `tagMod.foo` */
  override def _to: TagType = default
}
