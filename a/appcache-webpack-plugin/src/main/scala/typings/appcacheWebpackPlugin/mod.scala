package typings.appcacheWebpackPlugin

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Generate an HTML5 Application Cache for a Webpack build
    */
  @JSImport("appcache-webpack-plugin", JSImport.Namespace)
  @js.native
  class ^ () extends AppCachePlugin {
    def this(options: Options) = this()
  }
  
  @JSImport("appcache-webpack-plugin", "AppCache")
  @js.native
  class AppCache protected () extends StObject {
    def this(
      cache: String,
      network: js.Array[String],
      fallback: js.Array[String],
      settings: js.Array[String],
      hash: String,
      comment: String
    ) = this()
    
    def addAsset(asset: String): Unit = js.native
    
    def getManifestBody(): String = js.native
    
    def size(): Double = js.native
    
    def source(): String = js.native
  }
  
  /**
    * Generate an HTML5 Application Cache for a Webpack build
    */
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify webpack.Plugin * / any */ @js.native
  trait AppCachePlugin extends StObject {
    
    var AppCache: typings.appcacheWebpackPlugin.mod.AppCache = js.native
  }
  object AppCachePlugin {
    
    @scala.inline
    def apply(AppCache: AppCache): AppCachePlugin = {
      val __obj = js.Dynamic.literal(AppCache = AppCache.asInstanceOf[js.Any])
      __obj.asInstanceOf[AppCachePlugin]
    }
    
    @scala.inline
    implicit class AppCachePluginMutableBuilder[Self <: AppCachePlugin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppCache(value: AppCache): Self = StObject.set(x, "AppCache", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Options extends StObject {
    
    /**
      * 'additional assets to cache
      */
    var cache: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * @default ''
      */
    var comment: js.UndefOr[String] = js.native
    
    /**
      * Assets in the compilation that match any of these patterns will be excluded from the manifest.
      * @default []
      */
    var exclude: js.UndefOr[js.Array[String | RegExp]] = js.native
    
    /**
      * Fallback assets
      */
    var fallback: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Assets that may be accessed via the network.
      * @default ['*']
      */
    var network: js.UndefOr[js.Array[String] | Null] = js.native
    
    /**
      * The filename to write the appcache to
      * @default 'manifest.appcache'
      */
    var output: js.UndefOr[String] = js.native
    
    /**
      * Settings
      */
    var settings: js.UndefOr[js.Array[String]] = js.native
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
      def setCache(value: js.Array[String]): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      @scala.inline
      def setCacheVarargs(value: String*): Self = StObject.set(x, "cache", js.Array(value :_*))
      
      @scala.inline
      def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      @scala.inline
      def setExclude(value: js.Array[String | RegExp]): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      @scala.inline
      def setExcludeVarargs(value: (String | RegExp)*): Self = StObject.set(x, "exclude", js.Array(value :_*))
      
      @scala.inline
      def setFallback(value: js.Array[String]): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
      
      @scala.inline
      def setFallbackVarargs(value: String*): Self = StObject.set(x, "fallback", js.Array(value :_*))
      
      @scala.inline
      def setNetwork(value: js.Array[String]): Self = StObject.set(x, "network", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNetworkNull: Self = StObject.set(x, "network", null)
      
      @scala.inline
      def setNetworkUndefined: Self = StObject.set(x, "network", js.undefined)
      
      @scala.inline
      def setNetworkVarargs(value: String*): Self = StObject.set(x, "network", js.Array(value :_*))
      
      @scala.inline
      def setOutput(value: String): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      @scala.inline
      def setSettings(value: js.Array[String]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
      
      @scala.inline
      def setSettingsVarargs(value: String*): Self = StObject.set(x, "settings", js.Array(value :_*))
    }
  }
}
