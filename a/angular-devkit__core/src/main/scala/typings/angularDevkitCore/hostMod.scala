package typings.angularDevkitCore

import org.scalablytyped.runtime.StringDictionary
import typings.angularDevkitCore.createMod.SyncHostHandler
import typings.angularDevkitCore.hostInterfaceMod.Host
import typings.angularDevkitCore.hostInterfaceMod.ReadonlyHost
import typings.angularDevkitCore.literalsMod.TemplateTag
import typings.angularDevkitCore.pathMod.Path_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hostMod {
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host", "AliasHost")
  @js.native
  open class AliasHost[StatsT /* <: js.Object */] protected ()
    extends typings.angularDevkitCore.aliasMod.AliasHost[StatsT] {
    def this(_delegate: Host[StatsT]) = this()
  }
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host", "CordHost")
  @js.native
  open class CordHost protected ()
    extends typings.angularDevkitCore.recordMod.CordHost {
    def this(_back: ReadonlyHost[js.Object]) = this()
  }
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host", "Empty")
  @js.native
  open class Empty ()
    extends typings.angularDevkitCore.emptyMod.Empty
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host", "PatternMatchingHost")
  @js.native
  open class PatternMatchingHost[StatsT /* <: js.Object */] protected ()
    extends typings.angularDevkitCore.patternMod.PatternMatchingHost[StatsT] {
    def this(_delegate: Host[StatsT]) = this()
  }
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host", "ResolverHost")
  @js.native
  abstract class ResolverHost[T /* <: js.Object */] protected ()
    extends typings.angularDevkitCore.resolverMod.ResolverHost[T] {
    def this(_delegate: Host[T]) = this()
  }
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host", "SafeReadonlyHost")
  @js.native
  open class SafeReadonlyHost[StatsT /* <: js.Object */] protected ()
    extends typings.angularDevkitCore.safeMod.SafeReadonlyHost[StatsT] {
    def this(_delegate: ReadonlyHost[StatsT]) = this()
  }
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host", "ScopedHost")
  @js.native
  open class ScopedHost[T /* <: js.Object */] protected ()
    extends typings.angularDevkitCore.scopedMod.ScopedHost[T] {
    def this(delegate: Host[T]) = this()
    def this(delegate: Host[T], _root: Path_) = this()
  }
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host", "SimpleMemoryHost")
  @js.native
  open class SimpleMemoryHost ()
    extends typings.angularDevkitCore.memoryMod.SimpleMemoryHost
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host", "SyncDelegateHost")
  @js.native
  open class SyncDelegateHost[T /* <: js.Object */] protected ()
    extends typings.angularDevkitCore.syncMod.SyncDelegateHost[T] {
    def this(_delegate: Host[T]) = this()
  }
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host", "SynchronousDelegateExpectedException")
  @js.native
  open class SynchronousDelegateExpectedException ()
    extends typings.angularDevkitCore.syncMod.SynchronousDelegateExpectedException
  
  inline def createSyncHost[StatsT /* <: js.Object */](handler: SyncHostHandler[StatsT]): Host[StatsT] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSyncHost")(handler.asInstanceOf[js.Any]).asInstanceOf[Host[StatsT]]
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host", "fileBuffer")
  @js.native
  val fileBuffer: TemplateTag[js.typedarray.ArrayBuffer] = js.native
  
  inline def fileBufferToString(fileBuffer: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fileBufferToString")(fileBuffer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringToFileBuffer(str: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToFileBuffer")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  
  object test {
    
    @JSImport("@angular-devkit/core/src/virtual-fs/host", "test.TestHost")
    @js.native
    open class TestHost ()
      extends typings.angularDevkitCore.testMod.test.TestHost {
      def this(map: StringDictionary[String]) = this()
    }
  }
}
