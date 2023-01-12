package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.react.mod.FC
import typings.react.mod.HTMLAttributes
import typings.std.HTMLLIElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libMenuMenuDividerMod extends Shortcut {
  
  @JSImport("antd/lib/menu/MenuDivider", JSImport.Default)
  @js.native
  val default: FC[MenuDividerProps] = js.native
  
  trait MenuDividerProps
    extends StObject
       with HTMLAttributes[HTMLLIElement] {
    
    var dashed: js.UndefOr[Boolean] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
  }
  object MenuDividerProps {
    
    inline def apply(): MenuDividerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuDividerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MenuDividerProps] (val x: Self) extends AnyVal {
      
      inline def setDashed(value: Boolean): Self = StObject.set(x, "dashed", value.asInstanceOf[js.Any])
      
      inline def setDashedUndefined: Self = StObject.set(x, "dashed", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
    }
  }
  
  type _To = FC[MenuDividerProps]
  
  /* This means you don't have to write `default`, but can instead just say `libMenuMenuDividerMod.foo` */
  override def _to: FC[MenuDividerProps] = default
}
