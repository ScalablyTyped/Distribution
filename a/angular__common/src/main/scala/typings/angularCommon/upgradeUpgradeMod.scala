package typings.angularCommon

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.angularCommon.anon.Hash
import typings.angularCommon.mod.HashLocationStrategy
import typings.angularCommon.mod.Location
import typings.angularCommon.mod.LocationStrategy
import typings.angularCommon.mod.PathLocationStrategy
import typings.angularCommon.mod.PlatformLocation
import typings.angularCore.mod.InjectionToken
import typings.angularCore.mod.ModuleWithProviders
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object upgradeUpgradeMod {
  
  @JSImport("@angular/common/upgrade/upgrade", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/common/upgrade/upgrade", "AngularJSUrlCodec")
  @js.native
  class AngularJSUrlCodec () extends UrlCodec {
    
    def decodePath(path: String, html5Mode: Boolean): String = js.native
  }
  
  @JSImport("@angular/common/upgrade/upgrade", "LOCATION_UPGRADE_CONFIGURATION")
  @js.native
  val LOCATION_UPGRADE_CONFIGURATION: InjectionToken[LocationUpgradeConfig] = js.native
  
  @JSImport("@angular/common/upgrade/upgrade", "LocationUpgradeModule")
  @js.native
  class LocationUpgradeModule () extends StObject
  /* static members */
  object LocationUpgradeModule {
    
    @JSImport("@angular/common/upgrade/upgrade", "LocationUpgradeModule")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def config(): ModuleWithProviders[LocationUpgradeModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("config")().asInstanceOf[ModuleWithProviders[LocationUpgradeModule]]
    @scala.inline
    def config(config: LocationUpgradeConfig): ModuleWithProviders[LocationUpgradeModule] = ^.asInstanceOf[js.Dynamic].applyDynamic("config")(config.asInstanceOf[js.Any]).asInstanceOf[ModuleWithProviders[LocationUpgradeModule]]
  }
  
  @JSImport("@angular/common/upgrade/upgrade", "UrlCodec")
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
    def decodeSearch(search: String): StringDictionary[js.Any] = js.native
    
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
    def encodeSearch(search: StringDictionary[js.Any]): String = js.native
    
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
    def normalize(path: String, search: StringDictionary[js.Any], hash: String): String = js.native
    def normalize(path: String, search: StringDictionary[js.Any], hash: String, baseUrl: String): String = js.native
    
    /**
      * Parses the URL string based on the base URL
      *
      * @param url The full URL string
      * @param base The base for the URL
      */
    def parse(url: String): Hash = js.native
    def parse(url: String, base: String): Hash = js.native
  }
  
  @JSImport("@angular/common/upgrade/upgrade", "$locationShim")
  @js.native
  class locationShim protected () extends StObject {
    def this(
      $injector: js.Any,
      location: Location,
      platformLocation: PlatformLocation,
      urlCodec: UrlCodec,
      locationStrategy: LocationStrategy
    ) = this()
    
    @JSName("$$absUrl")
    var DollarDollarabsUrl: js.Any = js.native
    
    @JSName("$$changeListeners")
    var DollarDollarchangeListeners: js.Any = js.native
    
    @JSName("$$hash")
    var DollarDollarhash: js.Any = js.native
    
    @JSName("$$host")
    var DollarDollarhost: js.Any = js.native
    
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
    
    @JSName("$$path")
    var DollarDollarpath: js.Any = js.native
    
    @JSName("$$port")
    var DollarDollarport: js.Any = js.native
    
    @JSName("$$protocol")
    var DollarDollarprotocol: js.Any = js.native
    
    @JSName("$$replace")
    var DollarDollarreplace: js.Any = js.native
    
    @JSName("$$search")
    var DollarDollarsearch: js.Any = js.native
    
    @JSName("$$state")
    var DollarDollarstate: js.Any = js.native
    
    @JSName("$$url")
    var DollarDollarurl: js.Any = js.native
    
    /**
      * Retrieves the full URL representation with all segments encoded according to
      * rules specified in
      * [RFC 3986](http://www.ietf.org/rfc/rfc3986.txt).
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
    var browserState: js.Any = js.native
    
    var browserUrl: js.Any = js.native
    
    var cacheState: js.Any = js.native
    
    var cachedState: js.Any = js.native
    
    var composeUrls: js.Any = js.native
    
    var getServerBase: js.Any = js.native
    
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
    
    var initalizing: js.Any = js.native
    
    var initialize: js.Any = js.native
    
    var lastBrowserUrl: js.Any = js.native
    
    var lastCachedState: js.Any = js.native
    
    var lastHistoryState: js.Any = js.native
    
    var location: js.Any = js.native
    
    var locationStrategy: js.Any = js.native
    
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
    def onChange(
      fn: js.Function4[/* url */ String, /* state */ js.Any, /* oldUrl */ String, /* oldState */ js.Any, Unit]
    ): Unit = js.native
    def onChange(
      fn: js.Function4[/* url */ String, /* state */ js.Any, /* oldUrl */ String, /* oldState */ js.Any, Unit],
      err: js.Function1[/* e */ Error, Unit]
    ): Unit = js.native
    
    var parseAppUrl: js.Any = js.native
    
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
    
    var platformLocation: js.Any = js.native
    
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
    
    var resetBrowserUpdate: js.Any = js.native
    
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
    def search(): StringDictionary[js.Any] = js.native
    def search(search: String): this.type = js.native
    def search(search: String, paramValue: String): this.type = js.native
    def search(search: String, paramValue: js.Array[String]): this.type = js.native
    def search(search: String, paramValue: Boolean): this.type = js.native
    def search(search: String, paramValue: Double): this.type = js.native
    def search(search: StringDictionary[js.Any]): this.type = js.native
    def search(search: StringDictionary[js.Any], paramValue: String): this.type = js.native
    def search(search: StringDictionary[js.Any], paramValue: js.Array[String]): this.type = js.native
    def search(search: StringDictionary[js.Any], paramValue: Boolean): this.type = js.native
    def search(search: StringDictionary[js.Any], paramValue: Double): this.type = js.native
    def search(search: Double): this.type = js.native
    def search(search: Double, paramValue: String): this.type = js.native
    def search(search: Double, paramValue: js.Array[String]): this.type = js.native
    def search(search: Double, paramValue: Boolean): this.type = js.native
    def search(search: Double, paramValue: Double): this.type = js.native
    
    var setBrowserUrlWithFallback: js.Any = js.native
    
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
    def state(): js.Any = js.native
    def state(state: js.Any): this.type = js.native
    
    var stripBaseUrl: js.Any = js.native
    
    var updateBrowser: js.Any = js.native
    
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
    
    var urlChanges: js.Any = js.native
    
    var urlCodec: js.Any = js.native
  }
  
  @JSImport("@angular/common/upgrade/upgrade", "$locationShimProvider")
  @js.native
  class locationShimProvider protected () extends StObject {
    def this(
      ngUpgrade: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpgradeModule */ js.Any,
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
    def html5Mode(mode: js.Any): Unit = js.native
    
    var location: js.Any = js.native
    
    var locationStrategy: js.Any = js.native
    
    var ngUpgrade: js.Any = js.native
    
    var platformLocation: js.Any = js.native
    
    var urlCodec: js.Any = js.native
  }
  
  @scala.inline
  def ɵangularPackagesCommonUpgradeUpgradeA(config: LocationUpgradeConfig): String = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_common_upgrade_upgrade_a")(config.asInstanceOf[js.Any]).asInstanceOf[String]
  @scala.inline
  def ɵangularPackagesCommonUpgradeUpgradeA(config: LocationUpgradeConfig, appBaseHref: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_common_upgrade_upgrade_a")(config.asInstanceOf[js.Any], appBaseHref.asInstanceOf[js.Any])).asInstanceOf[String]
  
  @scala.inline
  def ɵangularPackagesCommonUpgradeUpgradeB(config: LocationUpgradeConfig): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_common_upgrade_upgrade_b")(config.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def ɵangularPackagesCommonUpgradeUpgradeC(platformLocation: PlatformLocation, baseHref: String): HashLocationStrategy | PathLocationStrategy = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_common_upgrade_upgrade_c")(platformLocation.asInstanceOf[js.Any], baseHref.asInstanceOf[js.Any])).asInstanceOf[HashLocationStrategy | PathLocationStrategy]
  @scala.inline
  def ɵangularPackagesCommonUpgradeUpgradeC(platformLocation: PlatformLocation, baseHref: String, options: LocationUpgradeConfig): HashLocationStrategy | PathLocationStrategy = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_common_upgrade_upgrade_c")(platformLocation.asInstanceOf[js.Any], baseHref.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[HashLocationStrategy | PathLocationStrategy]
  
  @scala.inline
  def ɵangularPackagesCommonUpgradeUpgradeD(
    ngUpgrade: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify UpgradeModule */ js.Any,
    location: Location,
    platformLocation: PlatformLocation,
    urlCodec: UrlCodec,
    locationStrategy: LocationStrategy
  ): locationShim = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275angular_packages_common_upgrade_upgrade_d")(ngUpgrade.asInstanceOf[js.Any], location.asInstanceOf[js.Any], platformLocation.asInstanceOf[js.Any], urlCodec.asInstanceOf[js.Any], locationStrategy.asInstanceOf[js.Any])).asInstanceOf[locationShim]
  
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
    
    @scala.inline
    def apply(): LocationUpgradeConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LocationUpgradeConfig]
    }
    
    @scala.inline
    implicit class LocationUpgradeConfigMutableBuilder[Self <: LocationUpgradeConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppBaseHref(value: String): Self = StObject.set(x, "appBaseHref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppBaseHrefUndefined: Self = StObject.set(x, "appBaseHref", js.undefined)
      
      @scala.inline
      def setHashPrefix(value: String): Self = StObject.set(x, "hashPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHashPrefixUndefined: Self = StObject.set(x, "hashPrefix", js.undefined)
      
      @scala.inline
      def setServerBaseHref(value: String): Self = StObject.set(x, "serverBaseHref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServerBaseHrefUndefined: Self = StObject.set(x, "serverBaseHref", js.undefined)
      
      @scala.inline
      def setUrlCodec(value: Instantiable0[UrlCodec]): Self = StObject.set(x, "urlCodec", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlCodecUndefined: Self = StObject.set(x, "urlCodec", js.undefined)
      
      @scala.inline
      def setUseHash(value: Boolean): Self = StObject.set(x, "useHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseHashUndefined: Self = StObject.set(x, "useHash", js.undefined)
    }
  }
}
