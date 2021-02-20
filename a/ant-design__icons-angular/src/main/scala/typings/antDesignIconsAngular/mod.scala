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

object mod {
  
  @JSImport("@ant-design/icons-angular", "ANT_ICON_ANGULAR_CONSOLE_PREFIX")
  @js.native
  val ANT_ICON_ANGULAR_CONSOLE_PREFIX: /* "[@ant-design/icons-angular]:" */ String = js.native
  
  @JSImport("@ant-design/icons-angular", "DynamicLoadingTimeoutError")
  @js.native
  def DynamicLoadingTimeoutError(): Error = js.native
  
  @JSImport("@ant-design/icons-angular", "HttpModuleNotImport")
  @js.native
  def HttpModuleNotImport(): Null = js.native
  
  @JSImport("@ant-design/icons-angular", "IconDirective")
  @js.native
  class IconDirective protected ()
    extends typings.antDesignIconsAngular.antDesignIconsAngularMod.IconDirective {
    def this(
      _iconService: typings.antDesignIconsAngular.iconServiceMod.IconService,
      _elementRef: ElementRef[_],
      _renderer: Renderer2
    ) = this()
  }
  
  @JSImport("@ant-design/icons-angular", "IconModule")
  @js.native
  class IconModule ()
    extends typings.antDesignIconsAngular.antDesignIconsAngularMod.IconModule
  
  @JSImport("@ant-design/icons-angular", "IconNotFoundError")
  @js.native
  def IconNotFoundError(icon: String): Error = js.native
  
  @JSImport("@ant-design/icons-angular", "IconService")
  @js.native
  class IconService protected ()
    extends typings.antDesignIconsAngular.antDesignIconsAngularMod.IconService {
    def this(
      _rendererFactory: RendererFactory2,
      _handler: HttpBackend,
      _document: js.Any,
      sanitizer: DomSanitizer
    ) = this()
  }
  
  @JSImport("@ant-design/icons-angular", "NameSpaceIsNotSpecifyError")
  @js.native
  def NameSpaceIsNotSpecifyError(): Error = js.native
  
  @JSImport("@ant-design/icons-angular", "SVGTagNotFoundError")
  @js.native
  def SVGTagNotFoundError(): Error = js.native
  
  @JSImport("@ant-design/icons-angular", "UrlNotSafeError")
  @js.native
  def UrlNotSafeError(url: String): Error = js.native
  
  @JSImport("@ant-design/icons-angular", "alreadyHasAThemeSuffix")
  @js.native
  def alreadyHasAThemeSuffix(name: String): Boolean = js.native
  
  @JSImport("@ant-design/icons-angular", "cloneSVG")
  @js.native
  def cloneSVG(svg: SVGElement): SVGElement = js.native
  
  @JSImport("@ant-design/icons-angular", "error")
  @js.native
  def error(message: String): Unit = js.native
  
  @JSImport("@ant-design/icons-angular", "getIconDefinitionFromAbbr")
  @js.native
  def getIconDefinitionFromAbbr(str: String): IconDefinition = js.native
  
  @JSImport("@ant-design/icons-angular", "getNameAndNamespace")
  @js.native
  def getNameAndNamespace(`type`: String): js.Tuple2[String, String] = js.native
  
  @JSImport("@ant-design/icons-angular", "getSecondaryColor")
  @js.native
  def getSecondaryColor(primaryColor: String): String = js.native
  
  @JSImport("@ant-design/icons-angular", "hasNamespace")
  @js.native
  def hasNamespace(`type`: String): Boolean = js.native
  
  @JSImport("@ant-design/icons-angular", "isIconDefinition")
  @js.native
  def isIconDefinition(target: String): /* is @ant-design/icons-angular.@ant-design/icons-angular/types.IconDefinition */ Boolean = js.native
  @JSImport("@ant-design/icons-angular", "isIconDefinition")
  @js.native
  def isIconDefinition(target: IconDefinition): /* is @ant-design/icons-angular.@ant-design/icons-angular/types.IconDefinition */ Boolean = js.native
  
  @JSImport("@ant-design/icons-angular", "manifest")
  @js.native
  val manifest: Manifest = js.native
  
  @JSImport("@ant-design/icons-angular", "mapAbbrToTheme")
  @js.native
  def mapAbbrToTheme(abbr: String): ThemeType = js.native
  
  @JSImport("@ant-design/icons-angular", "replaceFillColor")
  @js.native
  def replaceFillColor(raw: String): String = js.native
  
  @JSImport("@ant-design/icons-angular", "warn")
  @js.native
  def warn(message: String): Unit = js.native
  
  @JSImport("@ant-design/icons-angular", "withSuffix")
  @js.native
  def withSuffix(name: String): String = js.native
  @JSImport("@ant-design/icons-angular", "withSuffix")
  @js.native
  def withSuffix(name: String, theme: ThemeType): String = js.native
  
  @JSImport("@ant-design/icons-angular", "withSuffixAndColor")
  @js.native
  def withSuffixAndColor(name: String, theme: ThemeType, pri: String, sec: String): String = js.native
}
