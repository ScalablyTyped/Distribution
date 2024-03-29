package typings.antd

import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTableHooksUseFilterFilterWrapperMod {
  
  @JSImport("antd/lib/table/hooks/useFilter/FilterWrapper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: FilterDropdownMenuWrapperProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait FilterDropdownMenuWrapperProps extends StObject {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
  }
  object FilterDropdownMenuWrapperProps {
    
    inline def apply(): FilterDropdownMenuWrapperProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FilterDropdownMenuWrapperProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FilterDropdownMenuWrapperProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    }
  }
}
