package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.inputInputMod.InputProps
import typings.react.mod.ChangeEvent
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.KeyboardEvent
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object searchMod extends Shortcut {
  
  @JSImport("antd/lib/input/Search", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[SearchProps with RefAttributes[typings.antd.inputInputMod.default]] = js.native
  
  @js.native
  trait SearchProps extends InputProps {
    
    var enterButton: js.UndefOr[ReactNode] = js.native
    
    var inputPrefixCls: js.UndefOr[String] = js.native
    
    var loading: js.UndefOr[Boolean] = js.native
    
    var onSearch: js.UndefOr[
        js.Function2[
          /* value */ String, 
          /* event */ js.UndefOr[
            ChangeEvent[HTMLInputElement] | (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLInputElement]
          ], 
          Unit
        ]
      ] = js.native
  }
  object SearchProps {
    
    @scala.inline
    def apply(): SearchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchProps]
    }
    
    @scala.inline
    implicit class SearchPropsMutableBuilder[Self <: SearchProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnterButton(value: ReactNode): Self = StObject.set(x, "enterButton", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnterButtonUndefined: Self = StObject.set(x, "enterButton", js.undefined)
      
      @scala.inline
      def setInputPrefixCls(value: String): Self = StObject.set(x, "inputPrefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputPrefixClsUndefined: Self = StObject.set(x, "inputPrefixCls", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setOnSearch(
        value: (/* value */ String, /* event */ js.UndefOr[
              ChangeEvent[HTMLInputElement] | (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLInputElement]
            ]) => Unit
      ): Self = StObject.set(x, "onSearch", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[SearchProps with RefAttributes[typings.antd.inputInputMod.default]]
  
  /* This means you don't have to write `default`, but can instead just say `searchMod.foo` */
  override def _to: ForwardRefExoticComponent[SearchProps with RefAttributes[typings.antd.inputInputMod.default]] = default
}
