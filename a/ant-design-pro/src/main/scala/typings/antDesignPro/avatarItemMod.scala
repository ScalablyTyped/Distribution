package typings.antDesignPro

import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object avatarItemMod {
  
  @JSImport("ant-design-pro/lib/AvatarList/AvatarItem", JSImport.Default)
  @js.native
  class default protected ()
    extends Component[AvatarItemProps, js.Any, js.Any] {
    def this(props: AvatarItemProps) = this()
  }
  
  type AvatarItem = Component[AvatarItemProps, js.Any, js.Any]
  
  @js.native
  trait AvatarItemProps extends StObject {
    
    var onClick: js.UndefOr[js.Function0[Unit]] = js.native
    
    var size: js.UndefOr[SizeType] = js.native
    
    var src: String = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var tips: ReactNode = js.native
  }
  object AvatarItemProps {
    
    @scala.inline
    def apply(src: String): AvatarItemProps = {
      val __obj = js.Dynamic.literal(src = src.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvatarItemProps]
    }
    
    @scala.inline
    implicit class AvatarItemPropsMutableBuilder[Self <: AvatarItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnClick(value: () => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setSize(value: SizeType): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTips(value: ReactNode): Self = StObject.set(x, "tips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTipsUndefined: Self = StObject.set(x, "tips", js.undefined)
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
