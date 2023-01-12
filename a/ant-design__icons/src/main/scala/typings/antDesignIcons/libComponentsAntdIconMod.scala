package typings.antDesignIcons

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIcons.libComponentsIconMod.IconBaseProps
import typings.antDesignIcons.libComponentsTwoTonePrimaryColorMod.TwoToneColor
import typings.antDesignIconsSvg.libTypesMod.IconDefinition
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.RefAttributes
import typings.std.HTMLSpanElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libComponentsAntdIconMod extends Shortcut {
  
  @JSImport("@ant-design/icons/lib/components/AntdIcon", JSImport.Default)
  @js.native
  val default: IconBaseComponent[IconComponentProps] = js.native
  
  trait AntdIconProps
    extends StObject
       with IconBaseProps {
    
    var twoToneColor: js.UndefOr[TwoToneColor] = js.undefined
  }
  object AntdIconProps {
    
    inline def apply(): AntdIconProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AntdIconProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AntdIconProps] (val x: Self) extends AnyVal {
      
      inline def setTwoToneColor(value: TwoToneColor): Self = StObject.set(x, "twoToneColor", value.asInstanceOf[js.Any])
      
      inline def setTwoToneColorUndefined: Self = StObject.set(x, "twoToneColor", js.undefined)
    }
  }
  
  @js.native
  trait IconBaseComponent[Props]
    extends StObject
       with ForwardRefExoticComponent[Props & RefAttributes[HTMLSpanElement]] {
    
    var getTwoToneColor: js.Function0[TwoToneColor] = js.native
    
    var setTwoToneColor: js.Function1[/* twoToneColor */ TwoToneColor, Unit] = js.native
  }
  
  trait IconComponentProps
    extends StObject
       with AntdIconProps {
    
    var icon: IconDefinition
  }
  object IconComponentProps {
    
    inline def apply(icon: IconDefinition): IconComponentProps = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconComponentProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IconComponentProps] (val x: Self) extends AnyVal {
      
      inline def setIcon(value: IconDefinition): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = IconBaseComponent[IconComponentProps]
  
  /* This means you don't have to write `default`, but can instead just say `libComponentsAntdIconMod.foo` */
  override def _to: IconBaseComponent[IconComponentProps] = default
}
