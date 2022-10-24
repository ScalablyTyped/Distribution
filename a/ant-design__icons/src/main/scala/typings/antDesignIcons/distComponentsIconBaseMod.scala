package typings.antDesignIcons

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsSvg.libTypesMod.IconDefinition
import typings.react.mod.CSSProperties
import typings.react.mod.FunctionComponent
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distComponentsIconBaseMod extends Shortcut {
  
  @JSImport("@ant-design/icons/dist/components/IconBase", JSImport.Default)
  @js.native
  val default: IconBaseComponent[IconProps] = js.native
  
  @js.native
  trait IconBaseComponent[P]
    extends StObject
       with FunctionComponent[P] {
    
    var getTwoToneColors: js.Function0[TwoToneColorPalette] = js.native
    
    var setTwoToneColors: js.Function1[/* param0 */ TwoToneColorPaletteSetter, Unit] = js.native
  }
  
  trait IconProps extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var focusable: js.UndefOr[String] = js.undefined
    
    var icon: IconDefinition
    
    var onClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.undefined
    
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
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFocusable(value: String): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      inline def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      inline def setIcon(value: IconDefinition): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      inline def setOnClick(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
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
  
  type _To = IconBaseComponent[IconProps]
  
  /* This means you don't have to write `default`, but can instead just say `distComponentsIconBaseMod.foo` */
  override def _to: IconBaseComponent[IconProps] = default
}
