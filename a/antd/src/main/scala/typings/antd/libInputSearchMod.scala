package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antd.libInputInputMod.InputProps
import typings.rcInput.esInterfaceMod.InputRef
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libInputSearchMod extends Shortcut {
  
  @JSImport("antd/lib/input/Search", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[SearchProps & RefAttributes[InputRef]] = js.native
  
  trait SearchProps
    extends StObject
       with InputProps {
    
    var enterButton: js.UndefOr[ReactNode] = js.undefined
    
    var inputPrefixCls: js.UndefOr[String] = js.undefined
    
    var loading: js.UndefOr[Boolean] = js.undefined
    
    var onSearch: js.UndefOr[
        js.Function2[
          /* value */ String, 
          /* event */ js.UndefOr[
            ChangeEvent[HTMLInputElement] | (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLInputElement]
          ], 
          Unit
        ]
      ] = js.undefined
  }
  object SearchProps {
    
    inline def apply(): SearchProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SearchProps]
    }
    
    extension [Self <: SearchProps](x: Self) {
      
      inline def setEnterButton(value: ReactNode): Self = StObject.set(x, "enterButton", value.asInstanceOf[js.Any])
      
      inline def setEnterButtonUndefined: Self = StObject.set(x, "enterButton", js.undefined)
      
      inline def setInputPrefixCls(value: String): Self = StObject.set(x, "inputPrefixCls", value.asInstanceOf[js.Any])
      
      inline def setInputPrefixClsUndefined: Self = StObject.set(x, "inputPrefixCls", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setOnSearch(
        value: (/* value */ String, /* event */ js.UndefOr[
              ChangeEvent[HTMLInputElement] | (MouseEvent[HTMLElement, NativeMouseEvent]) | KeyboardEvent[HTMLInputElement]
            ]) => Unit
      ): Self = StObject.set(x, "onSearch", js.Any.fromFunction2(value))
      
      inline def setOnSearchUndefined: Self = StObject.set(x, "onSearch", js.undefined)
    }
  }
  
  type _To = ForwardRefExoticComponent[SearchProps & RefAttributes[InputRef]]
  
  /* This means you don't have to write `default`, but can instead just say `libInputSearchMod.foo` */
  override def _to: ForwardRefExoticComponent[SearchProps & RefAttributes[InputRef]] = default
}
