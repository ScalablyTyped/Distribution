package typings.antDesignIconsAngular

import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  trait CachedIconDefinition extends StObject {
    
    var icon: SVGElement
    
    var name: String
    
    var theme: String
  }
  object CachedIconDefinition {
    
    @scala.inline
    def apply(icon: SVGElement, name: String, theme: String): CachedIconDefinition = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[CachedIconDefinition]
    }
    
    @scala.inline
    implicit class CachedIconDefinitionMutableBuilder[Self <: CachedIconDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: SVGElement): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: String): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait IconDefinition extends StObject {
    
    var icon: String
    
    var name: String
    
    var theme: js.UndefOr[ThemeType] = js.undefined
  }
  object IconDefinition {
    
    @scala.inline
    def apply(icon: String, name: String): IconDefinition = {
      val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[IconDefinition]
    }
    
    @scala.inline
    implicit class IconDefinitionMutableBuilder[Self <: IconDefinition] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheme(value: ThemeType): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait Manifest extends StObject {
    
    var fill: js.Array[String]
    
    var outline: js.Array[String]
    
    var twotone: js.Array[String]
  }
  object Manifest {
    
    @scala.inline
    def apply(fill: js.Array[String], outline: js.Array[String], twotone: js.Array[String]): Manifest = {
      val __obj = js.Dynamic.literal(fill = fill.asInstanceOf[js.Any], outline = outline.asInstanceOf[js.Any], twotone = twotone.asInstanceOf[js.Any])
      __obj.asInstanceOf[Manifest]
    }
    
    @scala.inline
    implicit class ManifestMutableBuilder[Self <: Manifest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFill(value: js.Array[String]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillVarargs(value: String*): Self = StObject.set(x, "fill", js.Array(value :_*))
      
      @scala.inline
      def setOutline(value: js.Array[String]): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutlineVarargs(value: String*): Self = StObject.set(x, "outline", js.Array(value :_*))
      
      @scala.inline
      def setTwotone(value: js.Array[String]): Self = StObject.set(x, "twotone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTwotoneVarargs(value: String*): Self = StObject.set(x, "twotone", js.Array(value :_*))
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antDesignIconsAngular.antDesignIconsAngularStrings.fill
    - typings.antDesignIconsAngular.antDesignIconsAngularStrings.outline
    - typings.antDesignIconsAngular.antDesignIconsAngularStrings.twotone
  */
  trait ThemeType extends StObject
  object ThemeType {
    
    @scala.inline
    def fill: typings.antDesignIconsAngular.antDesignIconsAngularStrings.fill = "fill".asInstanceOf[typings.antDesignIconsAngular.antDesignIconsAngularStrings.fill]
    
    @scala.inline
    def outline: typings.antDesignIconsAngular.antDesignIconsAngularStrings.outline = "outline".asInstanceOf[typings.antDesignIconsAngular.antDesignIconsAngularStrings.outline]
    
    @scala.inline
    def twotone: typings.antDesignIconsAngular.antDesignIconsAngularStrings.twotone = "twotone".asInstanceOf[typings.antDesignIconsAngular.antDesignIconsAngularStrings.twotone]
  }
  
  trait TwoToneColorPalette
    extends StObject
       with TwoToneColorPaletteSetter {
    
    @JSName("secondaryColor")
    var secondaryColor_TwoToneColorPalette: String
  }
  object TwoToneColorPalette {
    
    @scala.inline
    def apply(primaryColor: String, secondaryColor: String): TwoToneColorPalette = {
      val __obj = js.Dynamic.literal(primaryColor = primaryColor.asInstanceOf[js.Any], secondaryColor = secondaryColor.asInstanceOf[js.Any])
      __obj.asInstanceOf[TwoToneColorPalette]
    }
    
    @scala.inline
    implicit class TwoToneColorPaletteMutableBuilder[Self <: TwoToneColorPalette] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSecondaryColor(value: String): Self = StObject.set(x, "secondaryColor", value.asInstanceOf[js.Any])
    }
  }
  
  trait TwoToneColorPaletteSetter extends StObject {
    
    var primaryColor: String
    
    var secondaryColor: js.UndefOr[String] = js.undefined
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
