package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.configProviderSizeContextMod.SizeType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaMod extends Shortcut {
  
  @JSImport("antd/lib/input/TextArea", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TextAreaProps with RefAttributes[TextAreaRef]] = js.native
  
  @js.native
  trait TextAreaProps
    extends typings.rcTextarea.mod.TextAreaProps {
    
    var allowClear: js.UndefOr[Boolean] = js.native
    
    var bordered: js.UndefOr[Boolean] = js.native
    
    var showCount: js.UndefOr[Boolean] = js.native
    
    var size: js.UndefOr[SizeType] = js.native
  }
  object TextAreaProps {
    
    @scala.inline
    def apply(): TextAreaProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TextAreaProps]
    }
    
    @scala.inline
    implicit class TextAreaPropsMutableBuilder[Self <: TextAreaProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowClear(value: Boolean): Self = StObject.set(x, "allowClear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowClearUndefined: Self = StObject.set(x, "allowClear", js.undefined)
      
      @scala.inline
      def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
      
      @scala.inline
      def setShowCount(value: Boolean): Self = StObject.set(x, "showCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowCountUndefined: Self = StObject.set(x, "showCount", js.undefined)
      
      @scala.inline
      def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait TextAreaRef extends HTMLTextAreaElement {
    
    var resizableTextArea: js.Any = js.native
  }
  
  type _To = ForwardRefExoticComponent[TextAreaProps with RefAttributes[TextAreaRef]]
  
  /* This means you don't have to write `default`, but can instead just say `textAreaMod.foo` */
  override def _to: ForwardRefExoticComponent[TextAreaProps with RefAttributes[TextAreaRef]] = default
}
