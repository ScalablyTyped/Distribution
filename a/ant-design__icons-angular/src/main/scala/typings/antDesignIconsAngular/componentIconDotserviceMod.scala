package typings.antDesignIconsAngular

import typings.angularCommon.httpMod.HttpBackend
import typings.angularCommon.httpMod.HttpClient
import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.Renderer2
import typings.angularCore.mod.RendererFactory2
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import typings.angularPlatformBrowser.mod.DomSanitizer
import typings.antDesignIconsAngular.anon.Optional
import typings.antDesignIconsAngular.typesMod.CachedIconDefinition
import typings.antDesignIconsAngular.typesMod.IconDefinition
import typings.antDesignIconsAngular.typesMod.ThemeType
import typings.antDesignIconsAngular.typesMod.TwoToneColorPalette
import typings.antDesignIconsAngular.typesMod.TwoToneColorPaletteSetter
import typings.rxjs.mod.Observable_
import typings.std.Map
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentIconDotserviceMod {
  
  @JSImport("@ant-design/icons-angular/component/icon.service", "ANT_ICONS")
  @js.native
  val ANT_ICONS: InjectionToken[js.Array[IconDefinition]] = js.native
  
  @JSImport("@ant-design/icons-angular/component/icon.service", "IconService")
  @js.native
  open class IconService protected () extends StObject {
    def this(
      _rendererFactory: RendererFactory2,
      _handler: HttpBackend,
      _document: Any,
      sanitizer: DomSanitizer,
      _antIcons: js.Array[IconDefinition]
    ) = this()
    
    /* protected */ var _antIcons: js.Array[IconDefinition] = js.native
    
    /**
      * Url prefix for fetching inline SVG by dynamic importing.
      */
    /* protected */ var _assetsUrlRoot: String = js.native
    
    /* protected */ def _colorizeSVGIcon(svg: SVGElement, twotone: Boolean, pri: String, sec: String): SVGElement = js.native
    
    /* protected */ def _createSVGElementFromString(str: String): SVGElement = js.native
    
    /**
      * Disable dynamic loading (support static loading only).
      */
    /* protected */ def _disableDynamicLoading: Boolean = js.native
    
    /* protected */ var _document: Any = js.native
    
    /** A flag indicates whether jsonp loading is enabled. */
    /* private */ var _enableJsonpLoading: Any = js.native
    
    /* protected */ var _handler: HttpBackend = js.native
    
    /* protected */ var _http: HttpClient = js.native
    
    /* protected */ var _inProgressFetches: Map[String, Observable_[IconDefinition | Null]] = js.native
    
    /* private */ @JSName("_jsonpIconLoad$")
    val _jsonpIconLoad$: Any = js.native
    
    /**
      * Get raw svg and assemble a `IconDefinition` object.
      * @param type
      */
    /* protected */ def _loadIconDynamically(`type`: String): Observable_[IconDefinition | Null] = js.native
    
    /* protected */ def _loadIconDynamicallyWithJsonp(icon: IconDefinition, url: String): Observable_[IconDefinition] = js.native
    
    /**
      * Render a new `SVGElement` for a given `IconDefinition`, or make a copy from cache.
      * @param icon
      * @param twoToneColor
      */
    /* protected */ def _loadSVGFromCacheOrCreateNew(icon: IconDefinition): SVGElement = js.native
    /* protected */ def _loadSVGFromCacheOrCreateNew(icon: IconDefinition, twoToneColor: String): SVGElement = js.native
    
    /* protected */ var _renderer: Renderer2 = js.native
    
    /* protected */ var _rendererFactory: RendererFactory2 = js.native
    
    /* protected */ def _setSVGAttribute(svg: SVGElement): SVGElement = js.native
    
    /**
      * All icon definitions would be registered here.
      */
    /* protected */ val _svgDefinitions: Map[String, IconDefinition] = js.native
    
    /**
      * Cache all rendered icons. Icons are identified by name, theme,
      * and for twotone icons, primary color and secondary color.
      */
    /* protected */ val _svgRenderedDefinitions: Map[String, CachedIconDefinition] = js.native
    
    /* protected */ var _twoToneColorPalette: TwoToneColorPalette = js.native
    
    /**
      * Add icons provided by ant design.
      * @param icons
      */
    def addIcon(icons: IconDefinition*): Unit = js.native
    
    /**
      * Register an icon. Namespace is required.
      * @param type
      * @param literal
      */
    def addIconLiteral(`type`: String, literal: String): Unit = js.native
    
    /**
      * Change the prefix of the inline svg resources, so they could be deployed elsewhere, like CDN.
      * @param prefix
      */
    def changeAssetsSource(prefix: String): Unit = js.native
    
    /**
      * Remove all cache.
      */
    def clear(): Unit = js.native
    
    var defaultTheme: ThemeType = js.native
    
    def getCachedIcons(): Map[String, IconDefinition] = js.native
    
    def getRenderedContent(icon: String): Observable_[SVGElement] = js.native
    def getRenderedContent(icon: String, twoToneColor: String): Observable_[SVGElement] = js.native
    /**
      * Get a rendered `SVGElement`.
      * @param icon
      * @param twoToneColor
      */
    def getRenderedContent(icon: IconDefinition): Observable_[SVGElement] = js.native
    def getRenderedContent(icon: IconDefinition, twoToneColor: String): Observable_[SVGElement] = js.native
    
    /* protected */ var sanitizer: DomSanitizer = js.native
    
    def twoToneColor: TwoToneColorPaletteSetter = js.native
    def twoToneColor_=(param0: TwoToneColorPaletteSetter): Unit = js.native
    
    /**
      * Call this method to switch to jsonp like loading.
      */
    def useJsonpLoading(): Unit = js.native
  }
  /* static members */
  object IconService {
    
    @JSImport("@ant-design/icons-angular/component/icon.service", "IconService")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/icons-angular/component/icon.service", "IconService.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[IconService, js.Tuple5[Null, Optional, Optional, Null, Optional]] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[IconService, js.Tuple5[Null, Optional, Optional, Null, Optional]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@ant-design/icons-angular/component/icon.service", "IconService.\u0275prov")
    @js.native
    def ɵprov: ɵɵInjectableDeclaration[IconService] = js.native
    inline def ɵprov_=(x: ɵɵInjectableDeclaration[IconService]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
  }
}
