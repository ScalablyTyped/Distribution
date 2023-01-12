package typings.antDesignPro

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAvatarListAvatarItemMod {
  
  @JSImport("ant-design-pro/lib/AvatarList/AvatarItem", JSImport.Default)
  @js.native
  open class default protected () extends Component[AvatarItemProps, Any, Any] {
    def this(props: AvatarItemProps) = this()
  }
  
  type AvatarItem = Component[AvatarItemProps, Any, Any]
  
  trait AvatarItemProps extends StObject {
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var size: js.UndefOr[SizeType] = js.undefined
    
    var src: String
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var tips: ReactNode
  }
  object AvatarItemProps {
    
    inline def apply(src: String): AvatarItemProps = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvatarItemProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvatarItemProps] (val x: Self) extends AnyVal {
      
      inline def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTips(value: ReactNode): Self = StObject.set(x, "tips", value.asInstanceOf[js.Any])
      
      inline def setTipsUndefined: Self = StObject.set(x, "tips", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - scala.Double
    - typings.antDesignPro.antDesignProStrings.small
    - typings.antDesignPro.antDesignProStrings.default
    - typings.antDesignPro.antDesignProStrings.large
  */
  type SizeType = _SizeType | Double
  
  trait _SizeType extends StObject
}
