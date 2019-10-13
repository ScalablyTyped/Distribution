package typings.atAntDashDesignIconsDashAngular

import typings.atAngularCore.atAngularCoreMod.ElementRef
import typings.atAngularCore.atAngularCoreMod.Renderer2
import typings.atAngularCore.atAngularCoreMod.RendererFactory2
import typings.atAngularPlatformDashBrowser.atAngularPlatformDashBrowserMod.DomSanitizer
import typings.atAntDashDesignIconsDashAngular.atAntDashDesignIconsDashAngularStrings.`[@ant-design/icons-angular]: `
import typings.atAntDashDesignIconsDashAngular.typesMod.IconDefinition
import typings.atAntDashDesignIconsDashAngular.typesMod.Manifest
import typings.atAntDashDesignIconsDashAngular.typesMod.ThemeType
import typings.std.Error
import typings.std.SVGElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/icons-angular", JSImport.Namespace)
@js.native
object atAntDashDesignIconsDashAngularMod extends js.Object {
  @js.native
  class IconDirective protected ()
    extends typings.atAntDashDesignIconsDashAngular.publicUnderscoreApiMod.IconDirective {
    def this(
      _iconService: typings.atAntDashDesignIconsDashAngular.componentIconDotServiceMod.IconService,
      _elementRef: ElementRef[_],
      _renderer: Renderer2
    ) = this()
  }
  
  @js.native
  class IconModule ()
    extends typings.atAntDashDesignIconsDashAngular.componentIconDotModuleMod.IconModule
  
  @js.native
  class IconService protected ()
    extends typings.atAntDashDesignIconsDashAngular.publicUnderscoreApiMod.IconService {
    def this(
      _rendererFactory: RendererFactory2,
      _handler: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HttpBackend */ js.Any,
      _document: js.Any,
      sanitizer: DomSanitizer
    ) = this()
  }
  
  val antIconConsolePrefix: `[@ant-design/icons-angular]: ` = js.native
  val manifest: Manifest = js.native
  def HttpModuleNotImport(): Null = js.native
  def IconNotFoundError(icon: String): Error = js.native
  def NameSpaceIsNotSpecifyError(): Error = js.native
  def SVGTagNotFoundError(): Error = js.native
  def UrlNotSafeError(url: String): Error = js.native
  def alreadyHasAThemeSuffix(name: String): Boolean = js.native
  def cloneSVG(svg: SVGElement): SVGElement = js.native
  def getIconDefinitionFromAbbr(str: String): IconDefinition = js.native
  def getNameAndNamespace(`type`: String): js.Tuple2[String, String] = js.native
  def getSecondaryColor(primaryColor: String): String = js.native
  def hasNamespace(`type`: String): Boolean = js.native
  def isIconDefinition(target: String): /* is @ant-design/icons-angular.@ant-design/icons-angular/types.IconDefinition */ Boolean = js.native
  def isIconDefinition(target: IconDefinition): /* is @ant-design/icons-angular.@ant-design/icons-angular/types.IconDefinition */ Boolean = js.native
  def mapAbbrToTheme(abbr: String): ThemeType = js.native
  def printErr(message: String): Unit = js.native
  def printWarn(message: String): Unit = js.native
  def replaceFillColor(raw: String): String = js.native
  def withSuffix(name: String): String = js.native
  def withSuffix(name: String, theme: ThemeType): String = js.native
  def withSuffixAndColor(name: String, theme: ThemeType, pri: String, sec: String): String = js.native
}

