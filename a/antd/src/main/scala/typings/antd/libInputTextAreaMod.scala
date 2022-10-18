package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.anon.Count
import typings.antd.libConfigProviderSizeContextMod.SizeType
import typings.antd.libInputInputMod.InputFocusOptions
import typings.antd.libUtilStatusUtilsMod.InputStatus
import typings.rcTextarea.esResizableTextAreaMod.ResizableTextAreaRef
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInputTextAreaMod extends Shortcut {
  
  @JSImport("antd/lib/input/TextArea", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TextAreaProps & RefAttributes[TextAreaRef]] = js.native
  
  trait ShowCountProps extends StObject {
    
    def formatter(args: Count): String
  }
  object ShowCountProps {
    
    inline def apply(formatter: Count => String): ShowCountProps = {
      val __obj = js.Dynamic.literal(formatter = js.Any.fromFunction1(formatter))
      __obj.asInstanceOf[ShowCountProps]
    }
    
    extension [Self <: ShowCountProps](x: Self) {
      
      inline def setFormatter(value: Count => String): Self = StObject.set(x, "formatter", js.Any.fromFunction1(value))
    }
  }
  
  trait TextAreaProps
    extends StObject
       with typings.rcTextarea.mod.TextAreaProps {
    
    var allowClear: js.UndefOr[Boolean] = js.undefined
    
    var bordered: js.UndefOr[Boolean] = js.undefined
    
    var showCount: js.UndefOr[Boolean | ShowCountProps] = js.undefined
    
    var size: js.UndefOr[SizeType] = js.undefined
    
    var status: js.UndefOr[InputStatus] = js.undefined
  }
  object TextAreaProps {
    
    inline def apply(): TextAreaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaProps]
    }
    
    extension [Self <: TextAreaProps](x: Self) {
      
      inline def setAllowClear(value: Boolean): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
      
      inline def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
      
      inline def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      inline def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      inline def setShowCount(value: Boolean | ShowCountProps): Self = StObject.set(x, "showCount", value.asInstanceOf[js.Any])
      
      inline def setShowCountUndefined: Self = StObject.set(x, "showCount", js.undefined)
      
      inline def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStatus(value: InputStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
  
  @js.native
  trait TextAreaRef extends StObject {
    
    def blur(): Unit = js.native
    
    def focus(): Unit = js.native
    def focus(options: InputFocusOptions): Unit = js.native
    
    var resizableTextArea: js.UndefOr[ResizableTextAreaRef] = js.native
  }
  
  type _To = ForwardRefExoticComponent[TextAreaProps & RefAttributes[TextAreaRef]]
  
  /* This means you don't have to write `default`, but can instead just say `libInputTextAreaMod.foo` */
  override def _to: ForwardRefExoticComponent[TextAreaProps & RefAttributes[TextAreaRef]] = default
}
