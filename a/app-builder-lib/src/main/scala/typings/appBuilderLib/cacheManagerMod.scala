package typings.appBuilderLib

import typings.builderUtil.archMod.Arch
import typings.node.cryptoMod.Hash
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheManagerMod {
  
  @JSImport("app-builder-lib/out/util/cacheManager", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("app-builder-lib/out/util/cacheManager", "BuildCacheManager")
  @js.native
  class BuildCacheManager protected () extends StObject {
    def this(outDir: String, executableFile: String, arch: Arch) = this()
    
    val cacheDir: String = js.native
    
    val cacheFile: String = js.native
    
    var cacheInfo: BuildCacheInfo | Null = js.native
    
    val cacheInfoFile: String = js.native
    
    def copyIfValid(digest: String): js.Promise[Boolean] = js.native
    
    val executableFile: js.Any = js.native
    
    var newDigest: js.Any = js.native
    
    def save(): js.Promise[Unit] = js.native
  }
  /* static members */
  object BuildCacheManager {
    
    @JSImport("app-builder-lib/out/util/cacheManager", "BuildCacheManager")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("app-builder-lib/out/util/cacheManager", "BuildCacheManager.VERSION")
    @js.native
    def VERSION: String = js.native
    @scala.inline
    def VERSION_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("VERSION")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def digest(hash: Hash, files: js.Array[String]): js.Promise[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("digest")(hash.asInstanceOf[js.Any], files.asInstanceOf[js.Any])).asInstanceOf[js.Promise[String]]
  
  trait BuildCacheInfo extends StObject {
    
    var executableDigest: String
  }
  object BuildCacheInfo {
    
    @scala.inline
    def apply(executableDigest: String): BuildCacheInfo = {
      val __obj = js.Dynamic.literal(executableDigest = executableDigest.asInstanceOf[js.Any])
      __obj.asInstanceOf[BuildCacheInfo]
    }
    
    @scala.inline
    implicit class BuildCacheInfoMutableBuilder[Self <: BuildCacheInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExecutableDigest(value: String): Self = StObject.set(x, "executableDigest", value.asInstanceOf[js.Any])
    }
  }
}
