package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libConfigProviderContextMod.DirectionType
import typings.rcTextarea.esResizableTextAreaMod.AutoSizeType
import typings.react.mod.CSSProperties
import typings.react.mod.FC
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypographyEditableMod extends Shortcut {
  
  @JSImport("antd/lib/typography/Editable", JSImport.Default)
  @js.native
  val default: FC[EditableProps] = js.native
  
  trait EditableProps extends StObject {
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var autoSize: js.UndefOr[Boolean | AutoSizeType] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var component: js.UndefOr[String] = js.undefined
    
    var direction: js.UndefOr[DirectionType] = js.undefined
    
    var enterIcon: js.UndefOr[ReactNode] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    def onCancel(): Unit
    
    var onEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    def onSave(value: String): Unit
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var value: String
  }
  object EditableProps {
    
    inline def apply(onCancel: () => Unit, onSave: String => Unit, value: String): EditableProps = {
      val __obj = js.Dynamic.literal(onCancel = js.Any.fromFunction0(onCancel), onSave = js.Any.fromFunction1(onSave), value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[EditableProps]
    }
    
    extension [Self <: EditableProps](x: Self) {
      
      inline def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      inline def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      inline def setAutoSize(value: Boolean | AutoSizeType): Self = StObject.set(x, "autoSize", value.asInstanceOf[js.Any])
      
      inline def setAutoSizeUndefined: Self = StObject.set(x, "autoSize", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setComponent(value: String): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setDirection(value: DirectionType): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setEnterIcon(value: ReactNode): Self = StObject.set(x, "enterIcon", value.asInstanceOf[js.Any])
      
      inline def setEnterIconUndefined: Self = StObject.set(x, "enterIcon", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setOnCancel(value: () => Unit): Self = StObject.set(x, "onCancel", js.Any.fromFunction0(value))
      
      inline def setOnEnd(value: () => Unit): Self = StObject.set(x, "onEnd", js.Any.fromFunction0(value))
      
      inline def setOnEndUndefined: Self = StObject.set(x, "onEnd", js.undefined)
      
      inline def setOnSave(value: String => Unit): Self = StObject.set(x, "onSave", js.Any.fromFunction1(value))
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = FC[EditableProps]
  
  /* This means you don't have to write `default`, but can instead just say `libTypographyEditableMod.foo` */
  override def _to: FC[EditableProps] = default
}
