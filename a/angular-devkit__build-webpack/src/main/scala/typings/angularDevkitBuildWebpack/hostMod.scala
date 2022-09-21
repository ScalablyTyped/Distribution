package typings.angularDevkitBuildWebpack

import org.scalablytyped.runtime.StringDictionary
import typings.angularDevkitBuildWebpack.createMod.SyncHostHandler
import typings.angularDevkitBuildWebpack.hostInterfaceMod.Host
import typings.angularDevkitBuildWebpack.hostInterfaceMod.ReadonlyHost
import typings.angularDevkitBuildWebpack.literalsMod.TemplateTag
import typings.angularDevkitBuildWebpack.pathMod.Path_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hostMod {
  
  @JSImport("@angular-devkit/build-webpack/core/src/virtual-fs/host", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/build-webpack/core/src/virtual-fs/host", "AliasHost")
  @js.native
  open class AliasHost[StatsT /* <: js.Object */] protected ()
    extends typings.angularDevkitBuildWebpack.aliasMod.AliasHost[StatsT] {
    def this(_delegate: Host[StatsT]) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src/virtual-fs/host", "CordHost")
  @js.native
  open class CordHost protected ()
    extends typings.angularDevkitBuildWebpack.recordMod.CordHost {
    def this(_back: ReadonlyHost[js.Object]) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src/virtual-fs/host", "Empty")
  @js.native
  open class Empty ()
    extends typings.angularDevkitBuildWebpack.emptyMod.Empty
  
  @JSImport("@angular-devkit/build-webpack/core/src/virtual-fs/host", "PatternMatchingHost")
  @js.native
  open class PatternMatchingHost[StatsT /* <: js.Object */] protected ()
    extends typings.angularDevkitBuildWebpack.patternMod.PatternMatchingHost[StatsT] {
    def this(_delegate: Host[StatsT]) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src/virtual-fs/host", "ResolverHost")
  @js.native
  abstract class ResolverHost[T /* <: js.Object */] protected ()
    extends typings.angularDevkitBuildWebpack.resolverMod.ResolverHost[T] {
    def this(_delegate: Host[T]) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src/virtual-fs/host", "SafeReadonlyHost")
  @js.native
  open class SafeReadonlyHost[StatsT /* <: js.Object */] protected ()
    extends typings.angularDevkitBuildWebpack.safeMod.SafeReadonlyHost[StatsT] {
    def this(_delegate: ReadonlyHost[StatsT]) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src/virtual-fs/host", "ScopedHost")
  @js.native
  open class ScopedHost[T /* <: js.Object */] protected ()
    extends typings.angularDevkitBuildWebpack.scopedMod.ScopedHost[T] {
    def this(delegate: Host[T]) = this()
    def this(delegate: Host[T], _root: Path_) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src/virtual-fs/host", "SimpleMemoryHost")
  @js.native
  open class SimpleMemoryHost ()
    extends typings.angularDevkitBuildWebpack.memoryMod.SimpleMemoryHost
  
  @JSImport("@angular-devkit/build-webpack/core/src/virtual-fs/host", "SyncDelegateHost")
  @js.native
  open class SyncDelegateHost[T /* <: js.Object */] protected ()
    extends typings.angularDevkitBuildWebpack.syncMod.SyncDelegateHost[T] {
    def this(_delegate: Host[T]) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src/virtual-fs/host", "SynchronousDelegateExpectedException")
  @js.native
  open class SynchronousDelegateExpectedException ()
    extends typings.angularDevkitBuildWebpack.syncMod.SynchronousDelegateExpectedException
  
  inline def createSyncHost[StatsT /* <: js.Object */](handler: SyncHostHandler[StatsT]): Host[StatsT] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSyncHost")(handler.asInstanceOf[js.Any]).asInstanceOf[Host[StatsT]]
  
  @JSImport("@angular-devkit/build-webpack/core/src/virtual-fs/host", "fileBuffer")
  @js.native
  val fileBuffer: TemplateTag[js.typedarray.ArrayBuffer] = js.native
  
  inline def fileBufferToString(fileBuffer: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fileBufferToString")(fileBuffer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringToFileBuffer(str: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToFileBuffer")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  
  object test {
    
    @JSImport("@angular-devkit/build-webpack/core/src/virtual-fs/host", "test.TestHost")
    @js.native
    open class TestHost ()
      extends typings.angularDevkitBuildWebpack.testMod.test.TestHost {
      def this(map: StringDictionary[String]) = this()
    }
  }
}
