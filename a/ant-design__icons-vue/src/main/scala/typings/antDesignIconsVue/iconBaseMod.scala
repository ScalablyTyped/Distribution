package typings.antDesignIconsVue

import typings.antDesignIconsSvg.typesMod.IconDefinition
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object iconBaseMod {
  
  object default {
    
    @JSImport("@ant-design/icons-vue/lib/components/IconBase", JSImport.Default)
    @js.native
    def apply(
      props: IconProps,
      context: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify SetupContext */ js.Any
    ): js.Any = js.native
    @JSImport("@ant-design/icons-vue/lib/components/IconBase", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/icons-vue/lib/components/IconBase", "default.getTwoToneColors")
    @js.native
    def getTwoToneColors(): TwoToneColorPalette = js.native
    @JSImport("@ant-design/icons-vue/lib/components/IconBase", "default.getTwoToneColors")
    @js.native
    def getTwoToneColors_Fdefault: js.Function0[TwoToneColorPalette] = js.native
    
    @scala.inline
    def getTwoToneColors_Fdefault_=(x: js.Function0[TwoToneColorPalette]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getTwoToneColors")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/icons-vue/lib/components/IconBase", "default.inheritAttrs")
    @js.native
    def inheritAttrs: Boolean = js.native
    @scala.inline
    def inheritAttrs_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inheritAttrs")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/icons-vue/lib/components/IconBase", "default.setTwoToneColors")
    @js.native
    def setTwoToneColors: js.Function1[/* hasPrimaryColorSecondaryColor */ TwoToneColorPaletteSetter, Unit] = js.native
    @JSImport("@ant-design/icons-vue/lib/components/IconBase", "default.setTwoToneColors")
    @js.native
    def setTwoToneColors(hasPrimaryColorSecondaryColor: TwoToneColorPaletteSetter): Unit = js.native
    @scala.inline
    def setTwoToneColors_=(x: js.Function1[/* hasPrimaryColorSecondaryColor */ TwoToneColorPaletteSetter, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setTwoToneColors")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IconProps extends StObject {
    
    var `class`: js.UndefOr[String] = js.native
    
    var focusable: js.UndefOr[String] = js.native
    
    var icon: IconDefinition = js.native
    
    var onClick: js.UndefOr[js.Function] = js.native
    
    var primaryColor: js.UndefOr[String] = js.native
    
    var secondaryColor: js.UndefOr[String] = js.native
    
    var style: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSProperties */ js.Any
      ] = js.native
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
      def setClass(value: String): Self = StObject.set(x, "class", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassUndefined: Self = StObject.set(x, "class", js.undefined)
      
      @scala.inline
      def setFocusable(value: String): Self = StObject.set(x, "focusable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusableUndefined: Self = StObject.set(x, "focusable", js.undefined)
      
      @scala.inline
      def setIcon(value: IconDefinition): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnClick(value: js.Function): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
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
      def setStyle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify CSSProperties */ js.Any
      ): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
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
}
