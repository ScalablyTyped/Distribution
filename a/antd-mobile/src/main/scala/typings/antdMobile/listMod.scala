package typings.antdMobile

import org.scalablytyped.runtime.Instantiable1
import typings.antdMobile.anon.PartialListProps
import typings.antdMobile.anon.TypeofItem
import typings.antdMobile.listItemMod.ListItemProps
import typings.antdMobile.listPropsTypeMod.ListPropsType
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object listMod {
  
  @JSImport("antd-mobile/lib/list", JSImport.Default)
  @js.native
  class default () extends List
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/list", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/list", "default.Item")
    @js.native
    def Item: (Instantiable1[/* props */ ListItemProps, typings.antdMobile.listItemMod.default]) & TypeofItem = js.native
    inline def Item_=(x: (Instantiable1[/* props */ ListItemProps, typings.antdMobile.listItemMod.default]) & TypeofItem): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile/lib/list", "default.defaultProps")
    @js.native
    def defaultProps: PartialListProps = js.native
    inline def defaultProps_=(x: PartialListProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait List
    extends Component[ListProps, js.Any, js.Any]
  
  trait ListProps
    extends StObject
       with ListPropsType {
    
    var className: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var role: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object ListProps {
    
    inline def apply(): ListProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ListProps]
    }
    
    extension [Self <: ListProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      inline def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
