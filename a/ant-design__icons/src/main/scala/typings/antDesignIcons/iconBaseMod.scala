package typings.antDesignIcons

import org.scalablytyped.runtime.Shortcut
import typings.antDesignIconsSvg.typesMod.IconDefinition
import typings.react.mod.CSSProperties
import typings.react.mod.FunctionComponent
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import typings.std.SVGSVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconBaseMod extends Shortcut {
  
  @JSImport("@ant-design/icons/dist/components/IconBase", JSImport.Default)
  @js.native
  val default: IconBaseComponent[IconProps] = js.native
  
  @js.native
  trait IconBaseComponent[P] extends FunctionComponent[P] {
    
    var getTwoToneColors: js.Function0[TwoToneColorPalette] = js.native
    
    var setTwoToneColors: js.Function1[/* hasPrimaryColorSecondaryColor */ TwoToneColorPaletteSetter, Unit] = js.native
  }
  
  @js.native
  trait IconProps extends StObject {
    
    var className: js.UndefOr[String] = js.native
    
    var focusable: js.UndefOr[String] = js.native
    
    var icon: IconDefinition = js.native
    
    var onClick: js.UndefOr[MouseEventHandler[SVGSVGElement]] = js.native
    
    var primaryColor: js.UndefOr[String] = js.native
    
    var secondaryColor: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object IconProps {
    
    @scala.inline
    def apply(icon: IconDefinition): IconProps = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconProps]
    }
    
    @scala.inline
    implicit class IconPropsMutableBuilder[Self <: IconProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setFocusable(value: String): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      @scala.inline
      def setIcon(value: IconDefinition): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: MouseEvent[SVGSVGElement, NativeMouseEvent] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      @scala.inline
      def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimaryColorUndefined: Self = StObject.set(x, "primaryColor", js.undefined)
      
      @scala.inline
      def setSecondaryColor(value: String): Self = StObject.set(x, "secondaryColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryColorUndefined: Self = StObject.set(x, "secondaryColor", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait TwoToneColorPalette extends TwoToneColorPaletteSetter {
    
    var calculated: js.UndefOr[Boolean] = js.native
  }
  object TwoToneColorPalette {
    
    @scala.inline
    def apply(primaryColor: String): TwoToneColorPalette = {
      val __obj = js.Dynamic.literal(primaryColor = primaryColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwoToneColorPalette]
    }
    
    @scala.inline
    implicit class TwoToneColorPaletteMutableBuilder[Self <: TwoToneColorPalette] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCalculated(value: Boolean): Self = StObject.set(x, "calculated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCalculatedUndefined: Self = StObject.set(x, "calculated", js.undefined)
    }
  }
  
  @js.native
  trait TwoToneColorPaletteSetter extends StObject {
    
    var primaryColor: String = js.native
    
    var secondaryColor: js.UndefOr[String] = js.native
  }
  object TwoToneColorPaletteSetter {
    
    @scala.inline
    def apply(primaryColor: String): TwoToneColorPaletteSetter = {
      val __obj = js.Dynamic.literal(primaryColor = primaryColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwoToneColorPaletteSetter]
    }
    
    @scala.inline
    implicit class TwoToneColorPaletteSetterMutableBuilder[Self <: TwoToneColorPaletteSetter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPrimaryColor(value: String): Self = StObject.set(x, "primaryColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryColor(value: String): Self = StObject.set(x, "secondaryColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecondaryColorUndefined: Self = StObject.set(x, "secondaryColor", js.undefined)
    }
  }
  
  type _To = IconBaseComponent[IconProps]
  
  /* This means you don't have to write `default`, but can instead just say `iconBaseMod.foo` */
  override def _to: IconBaseComponent[IconProps] = default
}
