package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.configProviderSizeContextMod.SizeType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.AddEventListenerOptions
import typings.std.EventListenerOptions
import typings.std.EventListenerOrEventListenerObject
import typings.std.HTMLTextAreaElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object textAreaMod extends Shortcut {
  
  @JSImport("antd/lib/input/TextArea", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TextAreaProps & RefAttributes[TextAreaRef]] = js.native
  
  trait TextAreaProps
    extends StObject
       with typings.rcTextarea.mod.TextAreaProps {
    
    var allowClear: js.UndefOr[Boolean] = js.undefined
    
    var bordered: js.UndefOr[Boolean] = js.undefined
    
    var showCount: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[SizeType] = js.undefined
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
      
      inline def setShowCount(value: Boolean): Self = StObject.set(x, "showCount", value.asInstanceOf[js.Any])
      
      inline def setShowCountUndefined: Self = StObject.set(x, "showCount", js.undefined)
      
      inline def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait TextAreaRef
    extends StObject
       with HTMLTextAreaElement {
    
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def addEventListener(`type`: String, listener: EventListenerOrEventListenerObject, options: AddEventListenerOptions): Unit = js.native
    
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: Boolean): Unit = js.native
    /* InferMemberOverrides */
    override def removeEventListener(`type`: String, callback: EventListenerOrEventListenerObject, options: EventListenerOptions): Unit = js.native
    
    var resizableTextArea: js.Any = js.native
  }
  
  type _To = ForwardRefExoticComponent[TextAreaProps & RefAttributes[TextAreaRef]]
  
  /* This means you don't have to write `default`, but can instead just say `textAreaMod.foo` */
  override def _to: ForwardRefExoticComponent[TextAreaProps & RefAttributes[TextAreaRef]] = default
}
