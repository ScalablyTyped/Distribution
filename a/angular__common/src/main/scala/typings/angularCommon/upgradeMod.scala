package typings.angularCommon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.angularCommon.anon.Hash
import typings.angularCommon.anon.TypeofCommonModule
import typings.angularCommon.mod.Location
import typings.angularCommon.mod.LocationStrategy
import typings.angularCommon.mod.PlatformLocation
import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.ModuleWithProviders
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectorDeclaration
import typings.angularCore.mod.ɵɵNgModuleDeclaration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object upgradeMod {
  
  @JSImport("@angular/common/upgrade", "AngularJSUrlCodec")
  @js.native
  open class AngularJSUrlCodec () extends UrlCodec {
    
    def decodePath(path: String, html5Mode: Boolean): String = js.native
  }
  
  @JSImport("@angular/common/upgrade", "LOCATION_UPGRADE_CONFIGURATION")
  @js.native
  val LOCATION_UPGRADE_CONFIGURATION: InjectionToken[LocationUpgradeConfig] = js.native
  
  @JSImport("@angular/common/upgrade", "LocationUpgradeModule")
  @js.native
  open class LocationUpgradeModule () extends StObject
  /* static members */
  object LocationUpgradeModule {
    
    @JSImport("@angular/common/upgrade", "LocationUpgradeModule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def config(): ModuleWithProviders[LocationUpgradeModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("config")().asInstanceOf[ModuleWithProviders[LocationUpgradeModule]]
    inline def config(config: LocationUpgradeConfig): ModuleWithProviders[LocationUpgradeModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(config.asInstanceOf[js.Any]).asInstanceOf[ModuleWithProviders[LocationUpgradeModule]]
    
    @JSImport("@angular/common/upgrade", "LocationUpgradeModule.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[LocationUpgradeModule, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[LocationUpgradeModule, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/common/upgrade", "LocationUpgradeModule.\u0275inj")
    @js.native
    def ɵinj: ɵɵInjectorDeclaration[LocationUpgradeModule] = js.native
    inline def ɵinj_=(x: ɵɵInjectorDeclaration[LocationUpgradeModule]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275inj")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/common/upgrade", "LocationUpgradeModule.\u0275mod")
    @js.native
    def ɵmod: ɵɵNgModuleDeclaration[LocationUpgradeModule, scala.Nothing, js.Array[TypeofCommonModule], scala.Nothing] = js.native
    inline def ɵmod_=(
      x: ɵɵNgModuleDeclaration[LocationUpgradeModule, scala.Nothing, js.Array[TypeofCommonModule], scala.Nothing]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275mod")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular/common/upgrade", "UrlCodec")
  @js.native
  abstract class UrlCodec () extends StObject {
    
    /**
      * Checks whether the two strings are equal
      * @param valA First string for comparison
      * @param valB Second string for comparison
      */
    def areEqual(valA: String, valB: String): Boolean = js.native
    
    /**
      * Decodes the hash from the provided string
      *
      * @param path The hash string
      */
    def decodeHash(hash: String): String = js.native
    
    /**
      * Decodes the path from the provided string
      *
      * @param path The path string
      */
    def decodePath(path: String): String = js.native
    
    /**
      * Decodes the search objects from the provided string
      *
      * @param path The path string
      */
    def decodeSearch(search: String): StringDictionary[Any] = js.native
    
    /**
      * Encodes the hash from the provided string
      *
      * @param path The hash string
      */
    def encodeHash(hash: String): String = js.native
    
    /**
      * Encodes the path from the provided string
      *
      * @param path The path string
      */
    def encodePath(path: String): String = js.native
    
    /**
      * Encodes the search string from the provided string or object
      *
      * @param path The path string or object
      */
    def encodeSearch(search: String): String = js.native
    def encodeSearch(search: StringDictionary[Any]): String = js.native
    
    /**
      * Normalizes the URL from the provided string
      *
      * @param path The URL string
      */
    def normalize(href: String): String = js.native
    /**
      * Normalizes the URL from the provided string, search, hash, and base URL parameters
      *
      * @param path The URL path
      * @param search The search object
      * @param hash The has string
      * @param baseUrl The base URL for the URL
      */
    def normalize(path: String, search: StringDictionary[Any], hash: String): String = js.native
    def normalize(path: String, search: StringDictionary[Any], hash: String, baseUrl: String): String = js.native
    
    /**
      * Parses the URL string based on the base URL
      *
      * @param url The full URL string
      * @param base The base for the URL
      */
    def parse(url: String): Hash = js.native
    def parse(url: String, base: String): Hash = js.native
  }
  
  @JSImport("@angular/common/upgrade", "$locationShim")
  @js.native
  open class locationShim protected () extends StObject {
    def this(
      $injector: Any,
      location: Location,
      platformLocation: PlatformLocation,
      urlCodec: UrlCodec,
      locationStrategy: LocationStrategy
    ) = this()
    
    /* private */ @JSName("$$absUrl")
    var DollarDollarabsUrl: Any = js.native
    
    /* private */ @JSName("$$changeListeners")
    var DollarDollarchangeListeners: Any = js.native
    
    /* private */ @JSName("$$hash")
    var DollarDollarhash: Any = js.native
    
    /* private */ @JSName("$$host")
    var DollarDollarhost: Any = js.native
    
    /**
      * Parses the provided URL, and sets the current URL to the parsed result.
      *
      * @param url The URL string.
      */
    @JSName("$$parse")
    def DollarDollarparse(url: String): Unit = js.native
    
    /**
      * Parses the provided URL and its relative URL.
      *
      * @param url The full URL string.
      * @param relHref A URL string relative to the full URL string.
      */
    @JSName("$$parseLinkUrl")
    def DollarDollarparseLinkUrl(url: String): Boolean = js.native
    @JSName("$$parseLinkUrl")
    def DollarDollarparseLinkUrl(url: String, relHref: String): Boolean = js.native
    
    /* private */ @JSName("$$path")
    var DollarDollarpath: Any = js.native
    
    /* private */ @JSName("$$port")
    var DollarDollarport: Any = js.native
    
    /* private */ @JSName("$$protocol")
    var DollarDollarprotocol: Any = js.native
    
    /* private */ @JSName("$$replace")
    var DollarDollarreplace: Any = js.native
    
    /* private */ @JSName("$$search")
    var DollarDollarsearch: Any = js.native
    
    /* private */ @JSName("$$state")
    var DollarDollarstate: Any = js.native
    
    /* private */ @JSName("$$url")
    var DollarDollarurl: Any = js.native
    
    /**
      * Retrieves the full URL representation with all segments encoded according to
      * rules specified in
      * [RFC 3986](https://tools.ietf.org/html/rfc3986).
      *
      *
      * ```js
      * // given URL http://example.com/#/some/path?foo=bar&baz=xoxo
      * let absUrl = $location.absUrl();
      * // => "http://example.com/#/some/path?foo=bar&baz=xoxo"
      * ```
      */
    def absUrl(): String = js.native
    
    /**
      * This function emulates the $browser.state() function from AngularJS. It will cause
      * history.state to be cached unless changed with deep equality check.
      */
    /* private */ var browserState: Any = js.native
    
    /* private */ var browserUrl: Any = js.native
    
    /* private */ var cacheState: Any = js.native
    
    /* private */ var cachedState: Any = js.native
    
    /* private */ var composeUrls: Any = js.native
    
    /* private */ var getServerBase: Any = js.native
    
    def hash(): this.type = js.native
    def hash(hash: String): this.type = js.native
    def hash(hash: Double): this.type = js.native
    /**
      * Retrieves the current hash fragment, or changes the hash fragment and returns a reference to
      * its own instance.
      *
      * ```js
      * // given URL http://example.com/#/some/path?foo=bar&baz=xoxo#hashValue
      * let hash = $location.hash();
      * // => "hashValue"
      * ```
      */
    @JSName("hash")
    def hash_String(): String = js.native
    
    /**
      * Retrieves the protocol of the current URL.
      *
      * In contrast to the non-AngularJS version `location.host` which returns `hostname:port`, this
      * returns the `hostname` portion only.
      *
      *
      * ```js
      * // given URL http://example.com/#/some/path?foo=bar&baz=xoxo
      * let host = $location.host();
      * // => "example.com"
      *
      * // given URL http://user:password@example.com:8080/#/some/path?foo=bar&baz=xoxo
      * host = $location.host();
      * // => "example.com"
      * host = location.host;
      * // => "example.com:8080"
      * ```
      */
    def host(): String = js.native
    
    /* private */ var initialize: Any = js.native
    
    /* private */ var initializing: Any = js.native
    
    /* private */ var lastBrowserUrl: Any = js.native
    
    /* private */ var lastCachedState: Any = js.native
    
    /* private */ var lastHistoryState: Any = js.native
    
    /* private */ var location: Any = js.native
    
    /* private */ var locationStrategy: Any = js.native
    
    /**
      * Registers listeners for URL changes. This API is used to catch updates performed by the
      * AngularJS framework. These changes are a subset of the `$locationChangeStart` and
      * `$locationChangeSuccess` events which fire when AngularJS updates its internally-referenced
      * version of the browser URL.
      *
      * It's possible for `$locationChange` events to happen, but for the browser URL
      * (window.location) to remain unchanged. This `onChange` callback will fire only when AngularJS
      * actually updates the browser URL (window.location).
      *
      * @param fn The callback function that is triggered for the listener when the URL changes.
      * @param err The callback function that is triggered when an error occurs.
      */
    def onChange(fn: js.Function4[/* url */ String, /* state */ Any, /* oldUrl */ String, /* oldState */ Any, Unit]): Unit = js.native
    def onChange(
      fn: js.Function4[/* url */ String, /* state */ Any, /* oldUrl */ String, /* oldState */ Any, Unit],
      err: js.Function1[/* e */ js.Error, Unit]
    ): Unit = js.native
    
    /* private */ var parseAppUrl: Any = js.native
    
    def path(): this.type = js.native
    def path(path: String): this.type = js.native
    def path(path: Double): this.type = js.native
    /**
      * Retrieves the path of the current URL, or changes the path and returns a reference to its own
      * instance.
      *
      * Paths should always begin with forward slash (/). This method adds the forward slash
      * if it is missing.
      *
      * ```js
      * // given URL http://example.com/#/some/path?foo=bar&baz=xoxo
      * let path = $location.path();
      * // => "/some/path"
      * ```
      */
    @JSName("path")
    def path_String(): String = js.native
    
    /* private */ var platformLocation: Any = js.native
    
    /**
      * Retrieves the port of the current URL.
      *
      * ```js
      * // given URL http://example.com/#/some/path?foo=bar&baz=xoxo
      * let port = $location.port();
      * // => 80
      * ```
      */
    def port(): Double | Null = js.native
    
    /**
      * Retrieves the protocol of the current URL.
      *
      * ```js
      * // given URL http://example.com/#/some/path?foo=bar&baz=xoxo
      * let protocol = $location.protocol();
      * // => "http"
      * ```
      */
    def protocol(): String = js.native
    
    /**
      * Changes to `$location` during the current `$digest` will replace the current
      * history record, instead of adding a new one.
      */
    def replace(): this.type = js.native
    
    /* private */ var resetBrowserUpdate: Any = js.native
    
    /**
      * Retrieves a map of the search parameters of the current URL, or changes a search
      * part and returns a reference to its own instance.
      *
      *
      * ```js
      * // given URL http://example.com/#/some/path?foo=bar&baz=xoxo
      * let searchObject = $location.search();
      * // => {foo: 'bar', baz: 'xoxo'}
      *
      * // set foo to 'yipee'
      * $location.search('foo', 'yipee');
      * // $location.search() => {foo: 'yipee', baz: 'xoxo'}
      * ```
      *
      * @param {string|Object.<string>|Object.<Array.<string>>} search New search params - string or
      * hash object.
      *
      * When called with a single argument the method acts as a setter, setting the `search` component
      * of `$location` to the specified value.
      *
      * If the argument is a hash object containing an array of values, these values will be encoded
      * as duplicate search parameters in the URL.
      *
      * @param {(string|Number|Array<string>|boolean)=} paramValue If `search` is a string or number,
      *     then `paramValue`
      * will override only a single search property.
      *
      * If `paramValue` is an array, it will override the property of the `search` component of
      * `$location` specified via the first argument.
      *
      * If `paramValue` is `null`, the property specified via the first argument will be deleted.
      *
      * If `paramValue` is `true`, the property specified via the first argument will be added with no
      * value nor trailing equal sign.
      *
      * @return {Object} The parsed `search` object of the current URL, or the changed `search` object.
      */
    def search(): StringDictionary[Any] = js.native
    def search(search: String): this.type = js.native
    def search(search: String, paramValue: String): this.type = js.native
    def search(search: String, paramValue: js.Array[String]): this.type = js.native
    def search(search: String, paramValue: Boolean): this.type = js.native
    def search(search: String, paramValue: Double): this.type = js.native
    def search(search: StringDictionary[Any]): this.type = js.native
    def search(search: StringDictionary[Any], paramValue: String): this.type = js.native
    def search(search: StringDictionary[Any], paramValue: js.Array[String]): this.type = js.native
    def search(search: StringDictionary[Any], paramValue: Boolean): this.type = js.native
    def search(search: StringDictionary[Any], paramValue: Double): this.type = js.native
    def search(search: Double): this.type = js.native
    def search(search: Double, paramValue: String): this.type = js.native
    def search(search: Double, paramValue: js.Array[String]): this.type = js.native
    def search(search: Double, paramValue: Boolean): this.type = js.native
    def search(search: Double, paramValue: Double): this.type = js.native
    
    /* private */ var setBrowserUrlWithFallback: Any = js.native
    
    /**
      * Retrieves the history state object when called without any parameter.
      *
      * Change the history state object when called with one parameter and return `$location`.
      * The state object is later passed to `pushState` or `replaceState`.
      *
      * This method is supported only in HTML5 mode and only in browsers supporting
      * the HTML5 History API methods such as `pushState` and `replaceState`. If you need to support
      * older browsers (like Android < 4.0), don't use this method.
      *
      */
    def state(): Any = js.native
    def state(state: Any): this.type = js.native
    
    /* private */ var stripBaseUrl: Any = js.native
    
    /* private */ var updateBrowser: Any = js.native
    
    /**
      * Retrieves the current URL, or sets a new URL. When setting a URL,
      * changes the path, search, and hash, and returns a reference to its own instance.
      *
      * ```js
      * // given URL http://example.com/#/some/path?foo=bar&baz=xoxo
      * let url = $location.url();
      * // => "/some/path?foo=bar&baz=xoxo"
      * ```
      */
    def url(): String = js.native
    def url(url: String): this.type = js.native
    
    /* private */ var urlChanges: Any = js.native
    
    /* private */ var urlCodec: Any = js.native
  }
  
  @JSImport("@angular/common/upgrade", "$locationShimProvider")
  @js.native
  open class locationShimProvider protected () extends StObject {
    def this(
      ngUpgrade: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpgradeModule */ Any,
      location: Location,
      platformLocation: PlatformLocation,
      urlCodec: UrlCodec,
      locationStrategy: LocationStrategy
    ) = this()
    
    /**
      * Factory method that returns an instance of the $locationShim
      */
    @JSName("$get")
    def $get(): locationShim = js.native
    
    /**
      * Stub method used to keep API compatible with AngularJS. This setting is configured through
      * the LocationUpgradeModule's `config` method in your Angular app.
      */
    def hashPrefix(): Unit = js.native
    def hashPrefix(prefix: String): Unit = js.native
    
    /**
      * Stub method used to keep API compatible with AngularJS. This setting is configured through
      * the LocationUpgradeModule's `config` method in your Angular app.
      */
    def html5Mode(): Unit = js.native
    def html5Mode(mode: Any): Unit = js.native
    
    /* private */ var location: Any = js.native
    
    /* private */ var locationStrategy: Any = js.native
    
    /* private */ var ngUpgrade: Any = js.native
    
    /* private */ var platformLocation: Any = js.native
    
    /* private */ var urlCodec: Any = js.native
  }
  
  trait LocationUpgradeConfig extends StObject {
    
    /**
      * Configures the base href when used in client-side rendered applications
      */
    var appBaseHref: js.UndefOr[String] = js.undefined
    
    /**
      * Configures the hash prefix used in the URL when using the `HashLocationStrategy`
      */
    var hashPrefix: js.UndefOr[String] = js.undefined
    
    /**
      * Configures the base href when used in server-side rendered applications
      */
    var serverBaseHref: js.UndefOr[String] = js.undefined
    
    /**
      * Configures the URL codec for encoding and decoding URLs. Default is the `AngularJSCodec`
      */
    var urlCodec: js.UndefOr[Instantiable0[UrlCodec]] = js.undefined
    
    /**
      * Configures whether the location upgrade module should use the `HashLocationStrategy`
      * or the `PathLocationStrategy`
      */
    var useHash: js.UndefOr[Boolean] = js.undefined
  }
  object LocationUpgradeConfig {
    
    inline def apply(): LocationUpgradeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocationUpgradeConfig]
    }
    
    extension [Self <: LocationUpgradeConfig](x: Self) {
      
      inline def setAppBaseHref(value: String): Self = StObject.set(x, "appBaseHref", value.asInstanceOf[js.Any])
      
      inline def setAppBaseHrefUndefined: Self = StObject.set(x, "appBaseHref", js.undefined)
      
      inline def setHashPrefix(value: String): Self = StObject.set(x, "hashPrefix", value.asInstanceOf[js.Any])
      
      inline def setHashPrefixUndefined: Self = StObject.set(x, "hashPrefix", js.undefined)
      
      inline def setServerBaseHref(value: String): Self = StObject.set(x, "serverBaseHref", value.asInstanceOf[js.Any])
      
      inline def setServerBaseHrefUndefined: Self = StObject.set(x, "serverBaseHref", js.undefined)
      
      inline def setUrlCodec(value: Instantiable0[UrlCodec]): Self = StObject.set(x, "urlCodec", value.asInstanceOf[js.Any])
      
      inline def setUrlCodecUndefined: Self = StObject.set(x, "urlCodec", js.undefined)
      
      inline def setUseHash(value: Boolean): Self = StObject.set(x, "useHash", value.asInstanceOf[js.Any])
      
      inline def setUseHashUndefined: Self = StObject.set(x, "useHash", js.undefined)
    }
  }
}
