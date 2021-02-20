package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transButtonMod extends Shortcut {
  
  @JSImport("antd/lib/_util/transButton", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[TransButtonProps with RefAttributes[HTMLDivElement]] = js.native
  
  @js.native
  trait TransButtonProps extends HTMLAttributes[HTMLDivElement] {
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var noStyle: js.UndefOr[Boolean] = js.native
    
    @JSName("onClick")
    var onClick_TransButtonProps: js.UndefOr[
        js.Function1[/* e */ js.UndefOr[MouseEvent[HTMLDivElement, NativeMouseEvent]], Unit]
      ] = js.native
  }
  object TransButtonProps {
    
    @scala.inline
    def apply(): TransButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransButtonProps]
    }
    
    @scala.inline
    implicit class TransButtonPropsMutableBuilder[Self <: TransButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setNoStyle(value: Boolean): Self = StObject.set(x, "noStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoStyleUndefined: Self = StObject.set(x, "noStyle", js.undefined)
      
      @scala.inline
      def setOnClick(value: /* e */ js.UndefOr[MouseEvent[HTMLDivElement, NativeMouseEvent]] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[TransButtonProps with RefAttributes[HTMLDivElement]]
  
  /* This means you don't have to write `default`, but can instead just say `transButtonMod.foo` */
  override def _to: ForwardRefExoticComponent[TransButtonProps with RefAttributes[HTMLDivElement]] = default
}
