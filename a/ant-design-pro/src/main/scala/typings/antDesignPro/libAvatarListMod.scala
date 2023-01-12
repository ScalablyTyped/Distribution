package typings.antDesignPro

import org.scalablytyped.runtime.Instantiable1
import typings.antDesignPro.libAvatarListAvatarItemMod.AvatarItemProps
import typings.antDesignPro.libAvatarListAvatarItemMod.SizeType
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAvatarListMod {
  
  @JSImport("ant-design-pro/lib/AvatarList", JSImport.Default)
  @js.native
  open class default () extends Component[AvatarListProps, Any, Any]
  /* static members */
  object default {
    
    @JSImport("ant-design-pro/lib/AvatarList", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ant-design-pro/lib/AvatarList", "default.Item")
    @js.native
    def Item: Instantiable1[
        /* props */ AvatarItemProps, 
        typings.antDesignPro.libAvatarListAvatarItemMod.default
      ] = js.native
    inline def Item_=(
      x: Instantiable1[
          /* props */ AvatarItemProps, 
          typings.antDesignPro.libAvatarListAvatarItemMod.default
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("Item")(x.asInstanceOf[js.Any])
  }
  
  type AvatarList = Component[AvatarListProps, Any, Any]
  
  trait AvatarListProps extends StObject {
    
    var Item: js.UndefOr[ReactElement] = js.undefined
    
    var children: ReactElement | js.Array[ReactElement]
    
    var excessItemsStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[SizeType] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object AvatarListProps {
    
    inline def apply(children: ReactElement | js.Array[ReactElement]): AvatarListProps = {
      val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvatarListProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvatarListProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactElement | js.Array[ReactElement]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenVarargs(value: ReactElement*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setExcessItemsStyle(value: CSSProperties): Self = StObject.set(x, "excessItemsStyle", value.asInstanceOf[js.Any])
      
      inline def setExcessItemsStyleUndefined: Self = StObject.set(x, "excessItemsStyle", js.undefined)
      
      inline def setItem(value: ReactElement): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      inline def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
