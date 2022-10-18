package typings.antDesignIconsAngular

import typings.angularCommon.httpMod.HttpBackend
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.Renderer2
import typings.angularCore.mod.RendererFactory2
import typings.angularCore.mod.ɵɵDirectiveDeclaration
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import typings.angularCore.mod.ɵɵInjectorDeclaration
import typings.angularCore.mod.ɵɵNgModuleDeclaration
import typings.angularPlatformBrowser.mod.DomSanitizer
import typings.antDesignIconsAngular.anon.Optional
import typings.antDesignIconsAngular.anon.Theme
import typings.antDesignIconsAngular.anon.TypeofCommonModule
import typings.antDesignIconsAngular.anon.TypeofIconDirective
import typings.antDesignIconsAngular.antDesignIconsAngularBooleans.`false`
import typings.antDesignIconsAngular.antDesignIconsAngularStrings.`[antIcon]`
import typings.antDesignIconsAngular.typesMod.IconDefinition
import typings.antDesignIconsAngular.typesMod.Manifest
import typings.antDesignIconsAngular.typesMod.ThemeType
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ant-design/icons-angular", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/icons-angular", "ANT_ICONS")
  @js.native
  val ANT_ICONS: InjectionToken[js.Array[IconDefinition]] = js.native
  
  @JSImport("@ant-design/icons-angular", "ANT_ICON_ANGULAR_CONSOLE_PREFIX")
  @js.native
  val ANT_ICON_ANGULAR_CONSOLE_PREFIX: /* "[@ant-design/icons-angular]:" */ String = js.native
  
  inline def DynamicLoadingTimeoutError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("DynamicLoadingTimeoutError")().asInstanceOf[js.Error]
  
  inline def HttpModuleNotImport(): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("HttpModuleNotImport")().asInstanceOf[Null]
  
  @JSImport("@ant-design/icons-angular", "IconDirective")
  @js.native
  open class IconDirective protected ()
    extends typings.antDesignIconsAngular.publicApiMod.IconDirective {
    def this(
      _iconService: typings.antDesignIconsAngular.componentIconDotserviceMod.IconService,
      _elementRef: ElementRef[Any],
      _renderer: Renderer2
    ) = this()
  }
  /* static members */
  object IconDirective {
    
    @JSImport("@ant-design/icons-angular", "IconDirective")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/icons-angular", "IconDirective.\u0275dir")
    @js.native
    def ɵdir: ɵɵDirectiveDeclaration[
        typings.antDesignIconsAngular.componentIconDotdirectiveMod.IconDirective, 
        `[antIcon]`, 
        scala.Nothing, 
        Theme, 
        js.Object, 
        scala.Nothing, 
        scala.Nothing, 
        `false`
      ] = js.native
    inline def ɵdir_=(
      x: ɵɵDirectiveDeclaration[
          typings.antDesignIconsAngular.componentIconDotdirectiveMod.IconDirective, 
          `[antIcon]`, 
          scala.Nothing, 
          Theme, 
          js.Object, 
          scala.Nothing, 
          scala.Nothing, 
          `false`
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275dir")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/icons-angular", "IconDirective.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[
        typings.antDesignIconsAngular.componentIconDotdirectiveMod.IconDirective, 
        scala.Nothing
      ] = js.native
    inline def ɵfac_=(
      x: ɵɵFactoryDeclaration[
          typings.antDesignIconsAngular.componentIconDotdirectiveMod.IconDirective, 
          scala.Nothing
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@ant-design/icons-angular", "IconModule")
  @js.native
  open class IconModule ()
    extends typings.antDesignIconsAngular.publicApiMod.IconModule
  /* static members */
  object IconModule {
    
    @JSImport("@ant-design/icons-angular", "IconModule")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/icons-angular", "IconModule.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[typings.antDesignIconsAngular.componentIconDotmoduleMod.IconModule, scala.Nothing] = js.native
    inline def ɵfac_=(
      x: ɵɵFactoryDeclaration[typings.antDesignIconsAngular.componentIconDotmoduleMod.IconModule, scala.Nothing]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/icons-angular", "IconModule.\u0275inj")
    @js.native
    def ɵinj: ɵɵInjectorDeclaration[typings.antDesignIconsAngular.componentIconDotmoduleMod.IconModule] = js.native
    inline def ɵinj_=(x: ɵɵInjectorDeclaration[typings.antDesignIconsAngular.componentIconDotmoduleMod.IconModule]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275inj")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/icons-angular", "IconModule.\u0275mod")
    @js.native
    def ɵmod: ɵɵNgModuleDeclaration[
        typings.antDesignIconsAngular.componentIconDotmoduleMod.IconModule, 
        js.Array[TypeofIconDirective], 
        js.Array[TypeofCommonModule], 
        js.Array[TypeofIconDirective]
      ] = js.native
    inline def ɵmod_=(
      x: ɵɵNgModuleDeclaration[
          typings.antDesignIconsAngular.componentIconDotmoduleMod.IconModule, 
          js.Array[TypeofIconDirective], 
          js.Array[TypeofCommonModule], 
          js.Array[TypeofIconDirective]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275mod")(x.asInstanceOf[js.Any])
  }
  
  inline def IconNotFoundError(icon: String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("IconNotFoundError")(icon.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  @JSImport("@ant-design/icons-angular", "IconService")
  @js.native
  open class IconService protected ()
    extends typings.antDesignIconsAngular.publicApiMod.IconService {
    def this(
      _rendererFactory: RendererFactory2,
      _handler: HttpBackend,
      _document: Any,
      sanitizer: DomSanitizer,
      _antIcons: js.Array[IconDefinition]
    ) = this()
  }
  /* static members */
  object IconService {
    
    @JSImport("@ant-design/icons-angular", "IconService")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/icons-angular", "IconService.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[
        typings.antDesignIconsAngular.componentIconDotserviceMod.IconService, 
        js.Tuple5[Null, Optional, Optional, Null, Optional]
      ] = js.native
    inline def ɵfac_=(
      x: ɵɵFactoryDeclaration[
          typings.antDesignIconsAngular.componentIconDotserviceMod.IconService, 
          js.Tuple5[Null, Optional, Optional, Null, Optional]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/icons-angular", "IconService.\u0275prov")
    @js.native
    def ɵprov: ɵɵInjectableDeclaration[typings.antDesignIconsAngular.componentIconDotserviceMod.IconService] = js.native
    inline def ɵprov_=(x: ɵɵInjectableDeclaration[typings.antDesignIconsAngular.componentIconDotserviceMod.IconService]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
  }
  
  inline def NameSpaceIsNotSpecifyError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("NameSpaceIsNotSpecifyError")().asInstanceOf[js.Error]
  
  inline def SVGTagNotFoundError(): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("SVGTagNotFoundError")().asInstanceOf[js.Error]
  
  inline def UrlNotSafeError(url: String): js.Error = ^.asInstanceOf[js.Dynamic].applyDynamic("UrlNotSafeError")(url.asInstanceOf[js.Any]).asInstanceOf[js.Error]
  
  inline def alreadyHasAThemeSuffix(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("alreadyHasAThemeSuffix")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def cloneSVG(svg: SVGElement): SVGElement = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneSVG")(svg.asInstanceOf[js.Any]).asInstanceOf[SVGElement]
  
  inline def error(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getIconDefinitionFromAbbr(str: String): IconDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconDefinitionFromAbbr")(str.asInstanceOf[js.Any]).asInstanceOf[IconDefinition]
  
  inline def getNameAndNamespace(`type`: String): js.Tuple2[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNameAndNamespace")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[String, String]]
  
  inline def getSecondaryColor(primaryColor: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryColor")(primaryColor.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def hasNamespace(`type`: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasNamespace")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def isIconDefinition(target: String): /* is @ant-design/icons-angular.@ant-design/icons-angular/types.IconDefinition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIconDefinition")(target.asInstanceOf[js.Any]).asInstanceOf[/* is @ant-design/icons-angular.@ant-design/icons-angular/types.IconDefinition */ Boolean]
  inline def isIconDefinition(target: IconDefinition): /* is @ant-design/icons-angular.@ant-design/icons-angular/types.IconDefinition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIconDefinition")(target.asInstanceOf[js.Any]).asInstanceOf[/* is @ant-design/icons-angular.@ant-design/icons-angular/types.IconDefinition */ Boolean]
  
  @JSImport("@ant-design/icons-angular", "manifest")
  @js.native
  val manifest: Manifest = js.native
  
  inline def mapAbbrToTheme(abbr: String): ThemeType = ^.asInstanceOf[js.Dynamic].applyDynamic("mapAbbrToTheme")(abbr.asInstanceOf[js.Any]).asInstanceOf[ThemeType]
  
  inline def replaceFillColor(raw: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceFillColor")(raw.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def warn(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def withSuffix(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("withSuffix")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def withSuffix(name: String, theme: ThemeType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("withSuffix")(name.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def withSuffixAndColor(name: String, theme: ThemeType, pri: String, sec: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("withSuffixAndColor")(name.asInstanceOf[js.Any], theme.asInstanceOf[js.Any], pri.asInstanceOf[js.Any], sec.asInstanceOf[js.Any])).asInstanceOf[String]
}
