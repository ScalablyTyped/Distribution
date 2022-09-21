package typings.angularDevkitBuildWebpack.srcMod

import org.scalablytyped.runtime.StringDictionary
import typings.angularDevkitBuildWebpack.createMod.SyncHostHandler
import typings.angularDevkitBuildWebpack.hostInterfaceMod.Host
import typings.angularDevkitBuildWebpack.hostInterfaceMod.ReadonlyHost
import typings.angularDevkitBuildWebpack.literalsMod.TemplateTag
import typings.angularDevkitBuildWebpack.pathMod.Path_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object virtualFs {
  
  @JSImport("@angular-devkit/build-webpack/core/src", "virtualFs")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/build-webpack/core/src", "virtualFs.AliasHost")
  @js.native
  open class AliasHost[StatsT /* <: js.Object */] protected ()
    extends typings.angularDevkitBuildWebpack.virtualFsMod.virtualFs.AliasHost[StatsT] {
    def this(_delegate: Host[StatsT]) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src", "virtualFs.CordHost")
  @js.native
  open class CordHost protected ()
    extends typings.angularDevkitBuildWebpack.virtualFsMod.virtualFs.CordHost {
    def this(_back: ReadonlyHost[js.Object]) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src", "virtualFs.Empty")
  @js.native
  open class Empty ()
    extends typings.angularDevkitBuildWebpack.virtualFsMod.virtualFs.Empty
  
  @JSImport("@angular-devkit/build-webpack/core/src", "virtualFs.PatternMatchingHost")
  @js.native
  open class PatternMatchingHost[StatsT /* <: js.Object */] protected ()
    extends typings.angularDevkitBuildWebpack.virtualFsMod.virtualFs.PatternMatchingHost[StatsT] {
    def this(_delegate: Host[StatsT]) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src", "virtualFs.ResolverHost")
  @js.native
  abstract class ResolverHost[T /* <: js.Object */] protected ()
    extends typings.angularDevkitBuildWebpack.virtualFsMod.virtualFs.ResolverHost[T] {
    def this(_delegate: Host[T]) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src", "virtualFs.SafeReadonlyHost")
  @js.native
  open class SafeReadonlyHost[StatsT /* <: js.Object */] protected ()
    extends typings.angularDevkitBuildWebpack.virtualFsMod.virtualFs.SafeReadonlyHost[StatsT] {
    def this(_delegate: ReadonlyHost[StatsT]) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src", "virtualFs.ScopedHost")
  @js.native
  open class ScopedHost[T /* <: js.Object */] protected ()
    extends typings.angularDevkitBuildWebpack.virtualFsMod.virtualFs.ScopedHost[T] {
    def this(delegate: Host[T]) = this()
    def this(delegate: Host[T], _root: Path_) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src", "virtualFs.SimpleMemoryHost")
  @js.native
  open class SimpleMemoryHost ()
    extends typings.angularDevkitBuildWebpack.virtualFsMod.virtualFs.SimpleMemoryHost
  
  @JSImport("@angular-devkit/build-webpack/core/src", "virtualFs.SyncDelegateHost")
  @js.native
  open class SyncDelegateHost[T /* <: js.Object */] protected ()
    extends typings.angularDevkitBuildWebpack.virtualFsMod.virtualFs.SyncDelegateHost[T] {
    def this(_delegate: Host[T]) = this()
  }
  
  @JSImport("@angular-devkit/build-webpack/core/src", "virtualFs.SynchronousDelegateExpectedException")
  @js.native
  open class SynchronousDelegateExpectedException ()
    extends typings.angularDevkitBuildWebpack.virtualFsMod.virtualFs.SynchronousDelegateExpectedException
  
  inline def createSyncHost[StatsT /* <: js.Object */](handler: SyncHostHandler[StatsT]): Host[StatsT] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSyncHost")(handler.asInstanceOf[js.Any]).asInstanceOf[Host[StatsT]]
  
  @JSImport("@angular-devkit/build-webpack/core/src", "virtualFs.fileBuffer")
  @js.native
  val fileBuffer: TemplateTag[js.typedarray.ArrayBuffer] = js.native
  
  inline def fileBufferToString(fileBuffer: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fileBufferToString")(fileBuffer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringToFileBuffer(str: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToFileBuffer")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  
  object test {
    
    @JSImport("@angular-devkit/build-webpack/core/src", "virtualFs.test.TestHost")
    @js.native
    open class TestHost ()
      extends typings.angularDevkitBuildWebpack.virtualFsMod.virtualFs.test.TestHost {
      def this(map: StringDictionary[String]) = this()
    }
  }
}
