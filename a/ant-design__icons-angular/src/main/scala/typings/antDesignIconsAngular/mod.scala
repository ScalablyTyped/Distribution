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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@ant-design/icons-angular", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@ant-design/icons-angular", "ANT_ICON_ANGULAR_CONSOLE_PREFIX")
  @js.native
  val ANT_ICON_ANGULAR_CONSOLE_PREFIX: /* "[@ant-design/icons-angular]:" */ String = js.native
  
  @scala.inline
  def DynamicLoadingTimeoutError(): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("DynamicLoadingTimeoutError")().asInstanceOf[Error]
  
  @scala.inline
  def HttpModuleNotImport(): Null = ^.asInstanceOf[js.Dynamic].applyDynamic("HttpModuleNotImport")().asInstanceOf[Null]
  
  @JSImport("@ant-design/icons-angular", "IconDirective")
  @js.native
  class IconDirective protected ()
    extends typings.antDesignIconsAngular.antDesignIconsAngularMod.IconDirective {
    def this(
      _iconService: typings.antDesignIconsAngular.iconServiceMod.IconService,
      _elementRef: ElementRef[js.Any],
      _renderer: Renderer2
    ) = this()
  }
  
  @JSImport("@ant-design/icons-angular", "IconModule")
  @js.native
  class IconModule ()
    extends typings.antDesignIconsAngular.antDesignIconsAngularMod.IconModule
  
  @scala.inline
  def IconNotFoundError(icon: String): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("IconNotFoundError")(icon.asInstanceOf[js.Any]).asInstanceOf[Error]
  
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
  
  @scala.inline
  def NameSpaceIsNotSpecifyError(): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("NameSpaceIsNotSpecifyError")().asInstanceOf[Error]
  
  @scala.inline
  def SVGTagNotFoundError(): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("SVGTagNotFoundError")().asInstanceOf[Error]
  
  @scala.inline
  def UrlNotSafeError(url: String): Error = ^.asInstanceOf[js.Dynamic].applyDynamic("UrlNotSafeError")(url.asInstanceOf[js.Any]).asInstanceOf[Error]
  
  @scala.inline
  def alreadyHasAThemeSuffix(name: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("alreadyHasAThemeSuffix")(name.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def cloneSVG(svg: SVGElement): SVGElement = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneSVG")(svg.asInstanceOf[js.Any]).asInstanceOf[SVGElement]
  
  @scala.inline
  def error(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("error")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def getIconDefinitionFromAbbr(str: String): IconDefinition = ^.asInstanceOf[js.Dynamic].applyDynamic("getIconDefinitionFromAbbr")(str.asInstanceOf[js.Any]).asInstanceOf[IconDefinition]
  
  @scala.inline
  def getNameAndNamespace(`type`: String): js.Tuple2[String, String] = ^.asInstanceOf[js.Dynamic].applyDynamic("getNameAndNamespace")(`type`.asInstanceOf[js.Any]).asInstanceOf[js.Tuple2[String, String]]
  
  @scala.inline
  def getSecondaryColor(primaryColor: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getSecondaryColor")(primaryColor.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def hasNamespace(`type`: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasNamespace")(`type`.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  @scala.inline
  def isIconDefinition(target: String): /* is @ant-design/icons-angular.@ant-design/icons-angular/types.IconDefinition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIconDefinition")(target.asInstanceOf[js.Any]).asInstanceOf[/* is @ant-design/icons-angular.@ant-design/icons-angular/types.IconDefinition */ Boolean]
  @scala.inline
  def isIconDefinition(target: IconDefinition): /* is @ant-design/icons-angular.@ant-design/icons-angular/types.IconDefinition */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isIconDefinition")(target.asInstanceOf[js.Any]).asInstanceOf[/* is @ant-design/icons-angular.@ant-design/icons-angular/types.IconDefinition */ Boolean]
  
  @JSImport("@ant-design/icons-angular", "manifest")
  @js.native
  val manifest: Manifest = js.native
  
  @scala.inline
  def mapAbbrToTheme(abbr: String): ThemeType = ^.asInstanceOf[js.Dynamic].applyDynamic("mapAbbrToTheme")(abbr.asInstanceOf[js.Any]).asInstanceOf[ThemeType]
  
  @scala.inline
  def replaceFillColor(raw: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("replaceFillColor")(raw.asInstanceOf[js.Any]).asInstanceOf[String]
  
  @scala.inline
  def warn(message: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("warn")(message.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @scala.inline
  def withSuffix(name: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("withSuffix")(name.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def withSuffix(name: String, theme: ThemeType): String = (^.asInstanceOf[js.Dynamic].applyDynamic("withSuffix")(name.asInstanceOf[js.Any], theme.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def withSuffixAndColor(name: String, theme: ThemeType, pri: String, sec: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("withSuffixAndColor")(name.asInstanceOf[js.Any], theme.asInstanceOf[js.Any], pri.asInstanceOf[js.Any], sec.asInstanceOf[js.Any])).asInstanceOf[String]
}
