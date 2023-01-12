package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libTooltipMod.AbstractTooltipProps
import typings.antd.libUtilGetRenderPropValueMod.RenderFunction
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPopoverMod extends Shortcut {
  
  @JSImport("antd/lib/popover", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PopoverProps & RefAttributes[Any]] = js.native
  
  trait PopoverProps
    extends StObject
       with AbstractTooltipProps {
    
    var content: js.UndefOr[ReactNode | RenderFunction] = js.undefined
    
    var title: js.UndefOr[ReactNode | RenderFunction] = js.undefined
  }
  object PopoverProps {
    
    inline def apply(): PopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PopoverProps] (val x: Self) extends AnyVal {
      
      inline def setContent(value: ReactNode | RenderFunction): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentFunction0(value: () => ReactNode): Self = StObject.set(x, "content", js.Any.fromFunction0(value))
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setTitle(value: ReactNode | RenderFunction): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleFunction0(value: () => ReactNode): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[PopoverProps & RefAttributes[Any]]
  
  /* This means you don't have to write `default`, but can instead just say `libPopoverMod.foo` */
  override def _to: ForwardRefExoticComponent[PopoverProps & RefAttributes[Any]] = default
}
