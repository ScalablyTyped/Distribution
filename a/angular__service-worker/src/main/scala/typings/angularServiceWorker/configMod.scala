package typings.angularServiceWorker

import typings.angularServiceWorker.angularServiceWorkerStrings.`lazy`
import typings.angularServiceWorker.angularServiceWorkerStrings.freshness
import typings.angularServiceWorker.angularServiceWorkerStrings.performance
import typings.angularServiceWorker.angularServiceWorkerStrings.prefetch
import typings.angularServiceWorker.anon.CacheOpaqueResponses
import typings.angularServiceWorker.anon.Files
import typings.angularServiceWorker.anon.PickCacheQueryOptionsigno
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object configMod {
  
  /**
    * Consumes service worker configuration files and processes them into control files.
    *
    * @publicApi
    */
  @JSImport("@angular/service-worker/config", "Generator")
  @js.native
  open class Generator protected ()
    extends StObject
       with Generator2 {
    def this(fs: Filesystem, baseHref: String) = this()
    
    /* private */ /* CompleteClass */
    var baseHref: Any = js.native
    
    /* CompleteClass */
    override val fs: Filesystem = js.native
    
    /* CompleteClass */
    override def process(config: Config): js.Promise[js.Object] = js.native
    
    /* private */ /* CompleteClass */
    var processAssetGroups: Any = js.native
    
    /* private */ /* CompleteClass */
    var processDataGroups: Any = js.native
  }
  
  trait AssetGroup extends StObject {
    
    var cacheQueryOptions: js.UndefOr[PickCacheQueryOptionsigno] = js.undefined
    
    var installMode: js.UndefOr[prefetch | `lazy`] = js.undefined
    
    var name: String
    
    var resources: Files
    
    var updateMode: js.UndefOr[prefetch | `lazy`] = js.undefined
  }
  object AssetGroup {
    
    inline def apply(name: String, resources: Files): AssetGroup = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any])
      __obj.asInstanceOf[AssetGroup]
    }
    
    extension [Self <: AssetGroup](x: Self) {
      
      inline def setCacheQueryOptions(value: PickCacheQueryOptionsigno): Self = StObject.set(x, "cacheQueryOptions", value.asInstanceOf[js.Any])
      
      inline def setCacheQueryOptionsUndefined: Self = StObject.set(x, "cacheQueryOptions", js.undefined)
      
      inline def setInstallMode(value: prefetch | `lazy`): Self = StObject.set(x, "installMode", value.asInstanceOf[js.Any])
      
      inline def setInstallModeUndefined: Self = StObject.set(x, "installMode", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setResources(value: Files): Self = StObject.set(x, "resources", value.asInstanceOf[js.Any])
      
      inline def setUpdateMode(value: prefetch | `lazy`): Self = StObject.set(x, "updateMode", value.asInstanceOf[js.Any])
      
      inline def setUpdateModeUndefined: Self = StObject.set(x, "updateMode", js.undefined)
    }
  }
  
  trait Config extends StObject {
    
    var appData: js.UndefOr[js.Object] = js.undefined
    
    var assetGroups: js.UndefOr[js.Array[AssetGroup]] = js.undefined
    
    var dataGroups: js.UndefOr[js.Array[DataGroup]] = js.undefined
    
    var index: String
    
    var navigationRequestStrategy: js.UndefOr[freshness | performance] = js.undefined
    
    var navigationUrls: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Config {
    
    inline def apply(index: String): Config = {
      val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setAppData(value: js.Object): Self = StObject.set(x, "appData", value.asInstanceOf[js.Any])
      
      inline def setAppDataUndefined: Self = StObject.set(x, "appData", js.undefined)
      
      inline def setAssetGroups(value: js.Array[AssetGroup]): Self = StObject.set(x, "assetGroups", value.asInstanceOf[js.Any])
      
      inline def setAssetGroupsUndefined: Self = StObject.set(x, "assetGroups", js.undefined)
      
      inline def setAssetGroupsVarargs(value: AssetGroup*): Self = StObject.set(x, "assetGroups", js.Array(value*))
      
      inline def setDataGroups(value: js.Array[DataGroup]): Self = StObject.set(x, "dataGroups", value.asInstanceOf[js.Any])
      
      inline def setDataGroupsUndefined: Self = StObject.set(x, "dataGroups", js.undefined)
      
      inline def setDataGroupsVarargs(value: DataGroup*): Self = StObject.set(x, "dataGroups", js.Array(value*))
      
      inline def setIndex(value: String): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setNavigationRequestStrategy(value: freshness | performance): Self = StObject.set(x, "navigationRequestStrategy", value.asInstanceOf[js.Any])
      
      inline def setNavigationRequestStrategyUndefined: Self = StObject.set(x, "navigationRequestStrategy", js.undefined)
      
      inline def setNavigationUrls(value: js.Array[String]): Self = StObject.set(x, "navigationUrls", value.asInstanceOf[js.Any])
      
      inline def setNavigationUrlsUndefined: Self = StObject.set(x, "navigationUrls", js.undefined)
      
      inline def setNavigationUrlsVarargs(value: String*): Self = StObject.set(x, "navigationUrls", js.Array(value*))
    }
  }
  
  trait DataGroup extends StObject {
    
    var cacheConfig: CacheOpaqueResponses
    
    var cacheQueryOptions: js.UndefOr[PickCacheQueryOptionsigno] = js.undefined
    
    var name: String
    
    var urls: js.Array[Glob]
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object DataGroup {
    
    inline def apply(cacheConfig: CacheOpaqueResponses, name: String, urls: js.Array[Glob]): DataGroup = {
      val __obj = js.Dynamic.literal(cacheConfig = cacheConfig.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], urls = urls.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataGroup]
    }
    
    extension [Self <: DataGroup](x: Self) {
      
      inline def setCacheConfig(value: CacheOpaqueResponses): Self = StObject.set(x, "cacheConfig", value.asInstanceOf[js.Any])
      
      inline def setCacheQueryOptions(value: PickCacheQueryOptionsigno): Self = StObject.set(x, "cacheQueryOptions", value.asInstanceOf[js.Any])
      
      inline def setCacheQueryOptionsUndefined: Self = StObject.set(x, "cacheQueryOptions", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUrls(value: js.Array[Glob]): Self = StObject.set(x, "urls", value.asInstanceOf[js.Any])
      
      inline def setUrlsVarargs(value: Glob*): Self = StObject.set(x, "urls", js.Array(value*))
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  type Duration = String
  
  trait Filesystem extends StObject {
    
    def hash(file: String): js.Promise[String]
    
    def list(dir: String): js.Promise[js.Array[String]]
    
    def read(file: String): js.Promise[String]
    
    def write(file: String, contents: String): js.Promise[Unit]
  }
  object Filesystem {
    
    inline def apply(
      hash: String => js.Promise[String],
      list: String => js.Promise[js.Array[String]],
      read: String => js.Promise[String],
      write: (String, String) => js.Promise[Unit]
    ): Filesystem = {
      val __obj = js.Dynamic.literal(hash = js.Any.fromFunction1(hash), list = js.Any.fromFunction1(list), read = js.Any.fromFunction1(read), write = js.Any.fromFunction2(write))
      __obj.asInstanceOf[Filesystem]
    }
    
    extension [Self <: Filesystem](x: Self) {
      
      inline def setHash(value: String => js.Promise[String]): Self = StObject.set(x, "hash", js.Any.fromFunction1(value))
      
      inline def setList(value: String => js.Promise[js.Array[String]]): Self = StObject.set(x, "list", js.Any.fromFunction1(value))
      
      inline def setRead(value: String => js.Promise[String]): Self = StObject.set(x, "read", js.Any.fromFunction1(value))
      
      inline def setWrite(value: (String, String) => js.Promise[Unit]): Self = StObject.set(x, "write", js.Any.fromFunction2(value))
    }
  }
  
  /**
    * Consumes service worker configuration files and processes them into control files.
    *
    * @publicApi
    */
  trait Generator2 extends StObject {
    
    /* private */ var baseHref: Any
    
    val fs: Filesystem
    
    def process(config: Config): js.Promise[js.Object]
    
    /* private */ var processAssetGroups: Any
    
    /* private */ var processDataGroups: Any
  }
  object Generator2 {
    
    inline def apply(
      baseHref: Any,
      fs: Filesystem,
      process: Config => js.Promise[js.Object],
      processAssetGroups: Any,
      processDataGroups: Any
    ): Generator2 = {
      val __obj = js.Dynamic.literal(baseHref = baseHref.asInstanceOf[js.Any], fs = fs.asInstanceOf[js.Any], process = js.Any.fromFunction1(process), processAssetGroups = processAssetGroups.asInstanceOf[js.Any], processDataGroups = processDataGroups.asInstanceOf[js.Any])
      __obj.asInstanceOf[Generator2]
    }
    
    extension [Self <: Generator2](x: Self) {
      
      inline def setBaseHref(value: Any): Self = StObject.set(x, "baseHref", value.asInstanceOf[js.Any])
      
      inline def setFs(value: Filesystem): Self = StObject.set(x, "fs", value.asInstanceOf[js.Any])
      
      inline def setProcess(value: Config => js.Promise[js.Object]): Self = StObject.set(x, "process", js.Any.fromFunction1(value))
      
      inline def setProcessAssetGroups(value: Any): Self = StObject.set(x, "processAssetGroups", value.asInstanceOf[js.Any])
      
      inline def setProcessDataGroups(value: Any): Self = StObject.set(x, "processDataGroups", value.asInstanceOf[js.Any])
    }
  }
  
  type Glob = String
}
