package typings.antDesignIconsAngular

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable3
import typings.angularCommon.mod.CommonModule
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.Renderer2
import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectorDeclaration
import typings.angularCore.mod.ɵɵNgModuleDeclaration
import typings.antDesignIconsAngular.antDesignIconsAngularBooleans.`false`
import typings.antDesignIconsAngular.antDesignIconsAngularBooleans.`true`
import typings.antDesignIconsAngular.antDesignIconsAngularStrings.`[antIcon]`
import typings.antDesignIconsAngular.antDesignIconsAngularStrings.`type`
import typings.antDesignIconsAngular.antDesignIconsAngularStrings.theme
import typings.antDesignIconsAngular.antDesignIconsAngularStrings.twoToneColor
import typings.antDesignIconsAngular.iconDirectiveMod.IconDirective
import typings.antDesignIconsAngular.iconServiceMod.IconService
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Optional extends StObject {
    
    var optional: `true`
  }
  object Optional {
    
    inline def apply(): Optional = {
      val __obj = js.Dynamic.literal(optional = true)
      __obj.asInstanceOf[Optional]
    }
    
    extension [Self <: Optional](x: Self) {
      
      inline def setOptional(value: `true`): Self = StObject.set(x, "optional", value.asInstanceOf[js.Any])
    }
  }
  
  trait Theme extends StObject {
    
    var theme: typings.antDesignIconsAngular.antDesignIconsAngularStrings.theme
    
    var twoToneColor: typings.antDesignIconsAngular.antDesignIconsAngularStrings.twoToneColor
    
    var `type`: typings.antDesignIconsAngular.antDesignIconsAngularStrings.`type`
  }
  object Theme {
    
    inline def apply(): Theme = {
      val __obj = js.Dynamic.literal(theme = "theme", twoToneColor = "twoToneColor")
      __obj.updateDynamic("type")("type")
      __obj.asInstanceOf[Theme]
    }
    
    extension [Self <: Theme](x: Self) {
      
      inline def setTheme(value: theme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setTwoToneColor(value: twoToneColor): Self = StObject.set(x, "twoToneColor", value.asInstanceOf[js.Any])
      
      inline def setType(value: `type`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofCommonModule
    extends StObject
       with Instantiable0[CommonModule] {
    
    var ɵfac: ɵɵFactoryDeclaration[CommonModule, scala.Nothing] = js.native
    
    var ɵinj: ɵɵInjectorDeclaration[CommonModule] = js.native
    
    var ɵmod: ɵɵNgModuleDeclaration[CommonModule, scala.Nothing, js.Array[Any], js.Array[Any]] = js.native
  }
  
  @js.native
  trait TypeofIconDirective
    extends StObject
       with Instantiable3[
          /* _iconService */ IconService, 
          /* _elementRef */ ElementRef[Any], 
          /* _renderer */ Renderer2, 
          IconDirective
        ] {
    
    var ɵdir: ɵɵDirectiveDeclaration[
        IconDirective, 
        `[antIcon]`, 
        scala.Nothing, 
        Theme, 
        js.Object, 
        scala.Nothing, 
        scala.Nothing, 
        `false`
      ] = js.native
    
    var ɵfac: ɵɵFactoryDeclaration[IconDirective, scala.Nothing] = js.native
  }
}
