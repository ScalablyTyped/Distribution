package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsSvg.typesMod.IconDefinition
import typings.antDesignIconsVue.iconMod.IconBaseProps
import typings.antDesignIconsVue.twoTonePrimaryColorMod.TwoToneColor
import typings.vueRuntimeCore.mod.FunctionalComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object antdIconMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/components/AntdIcon", JSImport.Default)
  @js.native
  val default: AntdIconType = js.native
  
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
    
    extension [Self <: AntdIconProps](x: Self) {
      
      inline def setTwoToneColor(value: TwoToneColor): Self = StObject.set(x, "twoToneColor", value.asInstanceOf[js.Any])
      
      inline def setTwoToneColorUndefined: Self = StObject.set(x, "twoToneColor", js.undefined)
    }
  }
  
  @js.native
  trait AntdIconType
    extends StObject
       with Color
       with FunctionalComponent[IconComponentProps, js.Object] {
    
    @JSName("displayName")
    var displayName_AntdIconType: String = js.native
  }
  
  trait Color extends StObject {
    
    def getTwoToneColor(): TwoToneColor
    
    def setTwoToneColor(twoToneColor: TwoToneColor): Unit
  }
  object Color {
    
    inline def apply(getTwoToneColor: () => TwoToneColor, setTwoToneColor: TwoToneColor => Unit): Color = {
      val __obj = js.Dynamic.literal(getTwoToneColor = js.Any.fromFunction0(getTwoToneColor), setTwoToneColor = js.Any.fromFunction1(setTwoToneColor))
      __obj.asInstanceOf[Color]
    }
    
    extension [Self <: Color](x: Self) {
      
      inline def setGetTwoToneColor(value: () => TwoToneColor): Self = StObject.set(x, "getTwoToneColor", js.Any.fromFunction0(value))
      
      inline def setSetTwoToneColor(value: TwoToneColor => Unit): Self = StObject.set(x, "setTwoToneColor", js.Any.fromFunction1(value))
    }
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
    
    extension [Self <: IconComponentProps](x: Self) {
      
      inline def setIcon(value: IconDefinition): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = AntdIconType
  
  /* This means you don't have to write `default`, but can instead just say `antdIconMod.foo` */
  override def _to: AntdIconType = default
}
