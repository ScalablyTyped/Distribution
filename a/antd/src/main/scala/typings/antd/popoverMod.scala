package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.getRenderPropValueMod.RenderFunction
import typings.antd.tooltipMod.AbstractTooltipProps
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object popoverMod extends Shortcut {
  
  @JSImport("antd/lib/popover", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[PopoverProps with RefAttributes[_]] = js.native
  
  @js.native
  trait PopoverProps extends AbstractTooltipProps {
    
    var content: js.UndefOr[ReactNode | RenderFunction] = js.native
    
    var title: js.UndefOr[ReactNode | RenderFunction] = js.native
  }
  object PopoverProps {
    
    @scala.inline
    def apply(): PopoverProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PopoverProps]
    }
    
    @scala.inline
    implicit class PopoverPropsMutableBuilder[Self <: PopoverProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContent(value: ReactNode | RenderFunction): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentFunction0(value: () => ReactNode): Self = StObject.set(x, "content", js.Any.fromFunction0(value))
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setTitle(value: ReactNode | RenderFunction): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleFunction0(value: () => ReactNode): Self = StObject.set(x, "title", js.Any.fromFunction0(value))
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[PopoverProps with RefAttributes[_]]
  
  /* This means you don't have to write `default`, but can instead just say `popoverMod.foo` */
  override def _to: ForwardRefExoticComponent[PopoverProps with RefAttributes[_]] = default
}
