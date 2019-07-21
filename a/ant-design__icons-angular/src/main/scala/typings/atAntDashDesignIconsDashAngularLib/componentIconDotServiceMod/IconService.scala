package typings
package atAntDashDesignIconsDashAngularLib.componentIconDotServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/icons-angular/component/icon.service", "IconService")
@js.native
class IconService protected () extends js.Object {
  def this(_rendererFactory: atAngularCoreLib.atAngularCoreMod.RendererFactory2, _handler: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HttpBackend */ js.Any, _document: js.Any, sanitizer: atAngularPlatformDashBrowserLib.atAngularPlatformDashBrowserMod.DomSanitizer) = this()
  /**
    * Url prefix for fetching inline SVG by dynamic importing.
    */
  var _assetsUrlRoot: java.lang.String = js.native
  var _document: js.Any = js.native
  var _handler: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HttpBackend */ js.Any = js.native
  var _http: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify HttpClient */ js.Any = js.native
  var _inProgressFetches: stdLib.Map[
    java.lang.String, 
    rxjsLib.rxjsMod.Observable[atAntDashDesignIconsDashAngularLib.typesMod.IconDefinition | scala.Null]
  ] = js.native
  var _renderer: atAngularCoreLib.atAngularCoreMod.Renderer2 = js.native
  var _rendererFactory: atAngularCoreLib.atAngularCoreMod.RendererFactory2 = js.native
  /**
    * All icon definitions would be registered here.
    */
  var _svgDefinitions: stdLib.Map[java.lang.String, atAntDashDesignIconsDashAngularLib.typesMod.IconDefinition] = js.native
  /**
    * Cache all rendered icons. Icons are identified by name, theme,
    * and for twotone icons, primary color and secondary color.
    */
  var _svgRenderedDefinitions: stdLib.Map[java.lang.String, atAntDashDesignIconsDashAngularLib.typesMod.CachedIconDefinition] = js.native
  var _twoToneColorPalette: atAntDashDesignIconsDashAngularLib.typesMod.TwoToneColorPalette = js.native
  var defaultTheme: atAntDashDesignIconsDashAngularLib.typesMod.ThemeType = js.native
  var sanitizer: atAngularPlatformDashBrowserLib.atAngularPlatformDashBrowserMod.DomSanitizer = js.native
  var twoToneColor: atAntDashDesignIconsDashAngularLib.typesMod.TwoToneColorPaletteSetter = js.native
  /* protected */ def _colorizeSVGIcon(svg: stdLib.SVGElement, twotone: scala.Boolean, pri: java.lang.String, sec: java.lang.String): stdLib.SVGElement = js.native
  /* protected */ def _createSVGElementFromString(str: java.lang.String): stdLib.SVGElement = js.native
  /**
    * Get raw svg and assemble a `IconDefinition` object.
    * @param type
    */
  /* protected */ def _getFromRemote(`type`: java.lang.String): rxjsLib.rxjsMod.Observable[atAntDashDesignIconsDashAngularLib.typesMod.IconDefinition | scala.Null] = js.native
  /**
    * Render a new `SVGElement` for given `IconDefinition`, or make a copy from cache.
    * @param icon
    * @param twoToneColor
    */
  /* protected */ def _loadSVGFromCacheOrCreateNew(icon: atAntDashDesignIconsDashAngularLib.typesMod.IconDefinition): stdLib.SVGElement = js.native
  /* protected */ def _loadSVGFromCacheOrCreateNew(icon: atAntDashDesignIconsDashAngularLib.typesMod.IconDefinition, twoToneColor: java.lang.String): stdLib.SVGElement = js.native
  /* protected */ def _setSVGAttribute(svg: stdLib.SVGElement): stdLib.SVGElement = js.native
  /**
    * Add icons provided by ant design.
    * @param icons
    */
  def addIcon(icons: atAntDashDesignIconsDashAngularLib.typesMod.IconDefinition*): scala.Unit = js.native
  /**
    * Register an icon. Namespace is required.
    * @param type
    * @param literal
    */
  def addIconLiteral(`type`: java.lang.String, literal: java.lang.String): scala.Unit = js.native
  /**
    * Change the prefix of the inline svg resources, so they could be deployed elsewhere, like CDN.
    * @param prefix
    */
  def changeAssetsSource(prefix: java.lang.String): scala.Unit = js.native
  /**
    * Remove all cache.
    */
  def clear(): scala.Unit = js.native
  def getCachedIcons(): stdLib.Map[java.lang.String, atAntDashDesignIconsDashAngularLib.typesMod.IconDefinition] = js.native
  /**
    * Get a rendered `SVGElement`.
    * @param icon
    * @param twoToneColor
    */
  def getRenderedContent(icon: atAntDashDesignIconsDashAngularLib.typesMod.IconDefinition): rxjsLib.rxjsMod.Observable[stdLib.SVGElement] = js.native
  def getRenderedContent(icon: atAntDashDesignIconsDashAngularLib.typesMod.IconDefinition, twoToneColor: java.lang.String): rxjsLib.rxjsMod.Observable[stdLib.SVGElement] = js.native
  def getRenderedContent(icon: java.lang.String): rxjsLib.rxjsMod.Observable[stdLib.SVGElement] = js.native
  def getRenderedContent(icon: java.lang.String, twoToneColor: java.lang.String): rxjsLib.rxjsMod.Observable[stdLib.SVGElement] = js.native
}

