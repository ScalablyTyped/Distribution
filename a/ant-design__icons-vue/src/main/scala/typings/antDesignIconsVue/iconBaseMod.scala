package typings.antDesignIconsVue

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsSvg.typesMod.IconDefinition
import typings.std.Event
import typings.vueRuntimeCore.mod.FunctionalComponent
import typings.vueRuntimeDom.mod.CSSProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconBaseMod extends Shortcut {
  
  @JSImport("@ant-design/icons-vue/lib/components/IconBase", JSImport.Default)
  @js.native
  val default: IconBaseType = js.native
  
  trait Color extends StObject {
    
    def getTwoToneColors(): TwoToneColorPalette
    
    def setTwoToneColors(twoToneColors: TwoToneColorPaletteSetter): Unit
  }
  object Color {
    
    inline def apply(getTwoToneColors: () => TwoToneColorPalette, setTwoToneColors: TwoToneColorPaletteSetter => Unit): Color = {
      val __obj = js.Dynamic.literal(getTwoToneColors = js.Any.fromFunction0(getTwoToneColors), setTwoToneColors = js.Any.fromFunction1(setTwoToneColors))
      __obj.asInstanceOf[Color]
    }
    
    extension [Self <: Color](x: Self) {
      
      inline def setGetTwoToneColors(value: () => TwoToneColorPalette): Self = StObject.set(x, "getTwoToneColors", js.Any.fromFunction0(value))
      
      inline def setSetTwoToneColors(value: TwoToneColorPaletteSetter => Unit): Self = StObject.set(x, "setTwoToneColors", js.Any.fromFunction1(value))
    }
  }
  
  @js.native
  trait IconBaseType
    extends StObject
       with Color
       with FunctionalComponent[IconProps, js.Object] {
    
    @JSName("displayName")
    var displayName_IconBaseType: String = js.native
  }
  
  trait IconProps extends StObject {
    
    var `class`: js.UndefOr[String] = js.undefined
    
    var focusable: js.UndefOr[String] = js.undefined
    
    var icon: IconDefinition
    
    var onClick: js.UndefOr[js.Function1[/* e */ js.UndefOr[Event], Unit]] = js.undefined
    
    var primaryColor: js.UndefOr[String] = js.undefined
    
    var secondaryColor: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object IconProps {
    
    inline def apply(icon: IconDefinition): IconProps = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconProps]
    }
    
    extension [Self <: IconProps](x: Self) {
      
      inline def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      inline def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      inline def setFocusable(value: String): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      inline def setIcon(value: IconDefinition): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: /* e */ js.UndefOr[Event] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
      
      inline def setPrimaryColorUndefined: Self = StObject.set(x, "primaryColor", js.undefined)
      
      inline def setSecondaryColor(value: String): Self = StObject.set(x, "secondaryColor", value.asInstanceOf[js.Any])
      
      inline def setSecondaryColorUndefined: Self = StObject.set(x, "secondaryColor", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait TwoToneColorPalette
    extends StObject
       with TwoToneColorPaletteSetter {
    
    var calculated: js.UndefOr[Boolean] = js.undefined
  }
  object TwoToneColorPalette {
    
    inline def apply(primaryColor: String): TwoToneColorPalette = {
      val __obj = js.Dynamic.literal(primaryColor = primaryColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwoToneColorPalette]
    }
    
    extension [Self <: TwoToneColorPalette](x: Self) {
      
      inline def setCalculated(value: Boolean): Self = StObject.set(x, "calculated", value.asInstanceOf[js.Any])
      
      inline def setCalculatedUndefined: Self = StObject.set(x, "calculated", js.undefined)
    }
  }
  
  trait TwoToneColorPaletteSetter extends StObject {
    
    var primaryColor: String
    
    var secondaryColor: js.UndefOr[String] = js.undefined
  }
  object TwoToneColorPaletteSetter {
    
    inline def apply(primaryColor: String): TwoToneColorPaletteSetter = {
      val __obj = js.Dynamic.literal(primaryColor = primaryColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwoToneColorPaletteSetter]
    }
    
    extension [Self <: TwoToneColorPaletteSetter](x: Self) {
      
      inline def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
      
      inline def setSecondaryColor(value: String): Self = StObject.set(x, "secondaryColor", value.asInstanceOf[js.Any])
      
      inline def setSecondaryColorUndefined: Self = StObject.set(x, "secondaryColor", js.undefined)
    }
  }
  
  type _To = IconBaseType
  
  /* This means you don't have to write `default`, but can instead just say `iconBaseMod.foo` */
  override def _to: IconBaseType = default
}
