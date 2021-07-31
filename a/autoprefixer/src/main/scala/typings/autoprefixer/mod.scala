package typings.autoprefixer

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StringDictionary
import typings.autoprefixer.anon.Browsers
import typings.autoprefixer.autoprefixerBooleans.`false`
import typings.autoprefixer.autoprefixerStrings.`no-2009`
import typings.autoprefixer.autoprefixerStrings.`no-autoplace`
import typings.autoprefixer.autoprefixerStrings.autoplace
import typings.browserslist.mod.Stats
import typings.postcss.mod.Plugin_
import typings.postcss.mod.Result
import typings.postcss.mod.Root_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("autoprefixer", JSImport.Namespace)
  @js.native
  val ^ : Autoprefixer = js.native
  
  @js.native
  trait Autoprefixer
    extends Plugin_[Options]
       with ExportedAPI {
    
    /* InferMemberOverrides */
    override def apply(arg1: /* root */ Root_, arg2: /* result */ Result): js.Promise[js.Any] | js.Any = js.native
  }
  
  type BrowserslistTarget = String | js.Array[String] | StringDictionary[js.Array[String]]
  
  trait ExportedAPI extends StObject {
    
    /** Autoprefixer data */
    var data: Browsers
    
    /** Autoprefixer default browsers */
    var defaults: js.Any
    
    /** Inspect with default Autoprefixer */
    def info(): Unit
  }
  object ExportedAPI {
    
    @scala.inline
    def apply(data: Browsers, defaults: js.Any, info: () => Unit): ExportedAPI = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], defaults = defaults.asInstanceOf[js.Any], info = js.Any.fromFunction0(info))
      __obj.asInstanceOf[ExportedAPI]
    }
    
    @scala.inline
    implicit class ExportedAPIMutableBuilder[Self <: ExportedAPI] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Browsers): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaults(value: js.Any): Self = StObject.set(x, "defaults", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfo(value: () => Unit): Self = StObject.set(x, "info", js.Any.fromFunction0(value))
    }
  }
  
  trait Options extends StObject {
    
    /** should Autoprefixer add prefixes. */
    var add: js.UndefOr[Boolean] = js.undefined
    
    /** @deprecated 'Change `browser` option to `overrideBrowserslist` in Autoprefixer */
    var browser: js.UndefOr[String] = js.undefined
    
    /**
      * @deprecated Replace Autoprefixer `browsers` option to Browserslist config.
      * Use `browserslist` key in `package.json` or `.browserslistrc` file.
      */
    var browsers: js.UndefOr[js.Array[String] | String] = js.undefined
    
    /** @deprecated Change `browserslist` option to `overrideBrowserslist` in Autoprefixer */
    var browserslist: js.UndefOr[js.Array[String] | String] = js.undefined
    
    /** should Autoprefixer use Visual Cascade, if CSS is uncompressed */
    var cascade: js.UndefOr[Boolean] = js.undefined
    
    /** environment for `Browserslist` */
    var env: js.UndefOr[String] = js.undefined
    
    /** should Autoprefixer add prefixes for flexbox properties */
    var flexbox: js.UndefOr[Boolean | `no-2009`] = js.undefined
    
    /** should Autoprefixer add IE 10-11 prefixes for Grid Layout properties */
    var grid: js.UndefOr[`false` | autoplace | `no-autoplace`] = js.undefined
    
    /** do not raise error on unknown browser version in `Browserslist` config. */
    var ignoreUnknownVersions: js.UndefOr[Boolean] = js.undefined
    
    /**
      * list of queries for target browsers.
      * Try to not use it.
      * The best practice is to use `.browserslistrc` config or `browserslist` key in `package.json`
      * to share target browsers with Babel, ESLint and Stylelint
      */
    var overrideBrowserslist: js.UndefOr[BrowserslistTarget] = js.undefined
    
    /** should Autoprefixer [remove outdated] prefixes */
    var remove: js.UndefOr[Boolean] = js.undefined
    
    /** custom usage statistics for > 10% in my stats browsers query */
    var stats: js.UndefOr[Stats] = js.undefined
    
    /** should Autoprefixer add prefixes for @supports parameters. */
    var supports: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdd(value: Boolean): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
      
      @scala.inline
      def setBrowser(value: String): Self = StObject.set(x, "browser", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserUndefined: Self = StObject.set(x, "browser", js.undefined)
      
      @scala.inline
      def setBrowsers(value: js.Array[String] | String): Self = StObject.set(x, "browsers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowsersUndefined: Self = StObject.set(x, "browsers", js.undefined)
      
      @scala.inline
      def setBrowsersVarargs(value: String*): Self = StObject.set(x, "browsers", js.Array(value :_*))
      
      @scala.inline
      def setBrowserslist(value: js.Array[String] | String): Self = StObject.set(x, "browserslist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBrowserslistUndefined: Self = StObject.set(x, "browserslist", js.undefined)
      
      @scala.inline
      def setBrowserslistVarargs(value: String*): Self = StObject.set(x, "browserslist", js.Array(value :_*))
      
      @scala.inline
      def setCascade(value: Boolean): Self = StObject.set(x, "cascade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCascadeUndefined: Self = StObject.set(x, "cascade", js.undefined)
      
      @scala.inline
      def setEnv(value: String): Self = StObject.set(x, "env", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnvUndefined: Self = StObject.set(x, "env", js.undefined)
      
      @scala.inline
      def setFlexbox(value: Boolean | `no-2009`): Self = StObject.set(x, "flexbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexboxUndefined: Self = StObject.set(x, "flexbox", js.undefined)
      
      @scala.inline
      def setGrid(value: `false` | autoplace | `no-autoplace`): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      @scala.inline
      def setIgnoreUnknownVersions(value: Boolean): Self = StObject.set(x, "ignoreUnknownVersions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUnknownVersionsUndefined: Self = StObject.set(x, "ignoreUnknownVersions", js.undefined)
      
      @scala.inline
      def setOverrideBrowserslist(value: BrowserslistTarget): Self = StObject.set(x, "overrideBrowserslist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverrideBrowserslistUndefined: Self = StObject.set(x, "overrideBrowserslist", js.undefined)
      
      @scala.inline
      def setOverrideBrowserslistVarargs(value: String*): Self = StObject.set(x, "overrideBrowserslist", js.Array(value :_*))
      
      @scala.inline
      def setRemove(value: Boolean): Self = StObject.set(x, "remove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveUndefined: Self = StObject.set(x, "remove", js.undefined)
      
      @scala.inline
      def setStats(value: Stats): Self = StObject.set(x, "stats", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatsUndefined: Self = StObject.set(x, "stats", js.undefined)
      
      @scala.inline
      def setSupports(value: Boolean): Self = StObject.set(x, "supports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSupportsUndefined: Self = StObject.set(x, "supports", js.undefined)
    }
  }
  
  type _To = Autoprefixer
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Autoprefixer = ^
}
