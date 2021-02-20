package typings.antDesignIconsAngular

import typings.angularCommon.httpMod.HttpBackend
import typings.angularCore.mod.ElementRef
import typings.angularCore.mod.Renderer2
import typings.angularCore.mod.RendererFactory2
import typings.angularPlatformBrowser.mod.DomSanitizer
import typings.antDesignIconsAngular.typesMod.IconDefinition
import typings.antDesignIconsAngular.typesMod.Manifest
import typings.antDesignIconsAngular.typesMod.ThemeType
import typings.std.Error
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object antDesignIconsAngularMod {
  
  @JSImport("@ant-design/icons-angular/public_api", "ANT_ICON_ANGULAR_CONSOLE_PREFIX")
  @js.native
  val ANT_ICON_ANGULAR_CONSOLE_PREFIX: /* "[@ant-design/icons-angular]:" */ String = js.native
  
  @JSImport("@ant-design/icons-angular/public_api", "DynamicLoadingTimeoutError")
  @js.native
  def DynamicLoadingTimeoutError(): Error = js.native
  
  @JSImport("@ant-design/icons-angular/public_api", "HttpModuleNotImport")
  @js.native
  def HttpModuleNotImport(): Null = js.native
  
  @JSImport("@ant-design/icons-angular/public_api", "IconDirective")
  @js.native
  class IconDirective protected ()
    extends typings.antDesignIconsAngular.iconDirectiveMod.IconDirective {
    def this(
      _iconService: typings.antDesignIconsAngular.iconServiceMod.IconService,
      _elementRef: ElementRef[_],
      _renderer: Renderer2
    ) = this()
  }
  
  @JSImport("@ant-design/icons-angular/public_api", "IconModule")
  @js.native
  class IconModule ()
    extends typings.antDesignIconsAngular.iconModuleMod.IconModule
  
  @JSImport("@ant-design/icons-angular/public_api", "IconNotFoundError")
  @js.native
  def IconNotFoundError(icon: String): Error = js.native
  
  @JSImport("@ant-design/icons-angular/public_api", "IconService")
  @js.native
  class IconService protected ()
    extends typings.antDesignIconsAngular.iconServiceMod.IconService {
    def this(
      _rendererFactory: RendererFactory2,
      _handler: HttpBackend,
      _document: js.Any,
      sanitizer: DomSanitizer
    ) = this()
  }
  
  @JSImport("@ant-design/icons-angular/public_api", "NameSpaceIsNotSpecifyError")
  @js.native
  def NameSpaceIsNotSpecifyError(): Error = js.native
  
  @JSImport("@ant-design/icons-angular/public_api", "SVGTagNotFoundError")
  @js.native
  def SVGTagNotFoundError(): Error = js.native
  
  @JSImport("@ant-design/icons-angular/public_api", "UrlNotSafeError")
  @js.native
  def UrlNotSafeError(url: String): Error = js.native
  
  @JSImport("@ant-design/icons-angular/public_api", "alreadyHasAThemeSuffix")
  @js.native
  def alreadyHasAThemeSuffix(name: String): Boolean = js.native
  
  @JSImport("@ant-design/icons-angular/public_api", "cloneSVG")
  @js.native
  def cloneSVG(svg: SVGElement): SVGElement = js.native
  
  @JSImport("@ant-design/icons-angular/public_api", "error")
  @js.native
  def error(message: String): Unit = js.native
  
  @JSImport("@ant-design/icons-angular/public_api", "getIconDefinitionFromAbbr")
  @js.native
  def getIconDefinitionFromAbbr(str: String): IconDefinition = js.native
  
  @JSImport("@ant-design/icons-angular/public_api", "getNameAndNamespace")
  @js.native
  def getNameAndNamespace(`type`: String): js.Tuple2[String, String] = js.native
  
  @JSImport("@ant-design/icons-angular/public_api", "getSecondaryColor")
  @js.native
  def getSecondaryColor(primaryColor: String): String = js.native
  
  @JSImport("@ant-design/icons-angular/public_api", "hasNamespace")
  @js.native
  def hasNamespace(`type`: String): Boolean = js.native
  
  @JSImport("@ant-design/icons-angular/public_api", "isIconDefinition")
  @js.native
  def isIconDefinition(target: String): /* is @ant-design/icons-angular.@ant-design/icons-angular/types.IconDefinition */ Boolean = js.native
  @JSImport("@ant-design/icons-angular/public_api", "isIconDefinition")
  @js.native
  def isIconDefinition(target: IconDefinition): /* is @ant-design/icons-angular.@ant-design/icons-angular/types.IconDefinition */ Boolean = js.native
  
  @JSImport("@ant-design/icons-angular/public_api", "manifest")
  @js.native
  val manifest: Manifest = js.native
  
  @JSImport("@ant-design/icons-angular/public_api", "mapAbbrToTheme")
  @js.native
  def mapAbbrToTheme(abbr: String): ThemeType = js.native
  
  @JSImport("@ant-design/icons-angular/public_api", "replaceFillColor")
  @js.native
  def replaceFillColor(raw: String): String = js.native
  
  @JSImport("@ant-design/icons-angular/public_api", "warn")
  @js.native
  def warn(message: String): Unit = js.native
  
  @JSImport("@ant-design/icons-angular/public_api", "withSuffix")
  @js.native
  def withSuffix(name: String): String = js.native
  @JSImport("@ant-design/icons-angular/public_api", "withSuffix")
  @js.native
  def withSuffix(name: String, theme: ThemeType): String = js.native
  
  @JSImport("@ant-design/icons-angular/public_api", "withSuffixAndColor")
  @js.native
  def withSuffixAndColor(name: String, theme: ThemeType, pri: String, sec: String): String = js.native
}
