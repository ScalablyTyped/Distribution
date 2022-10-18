package typings.angularDevkitCore

import org.scalablytyped.runtime.StringDictionary
import typings.angularDevkitCore.srcUtilsLiteralsMod.TemplateTag
import typings.angularDevkitCore.srcVirtualFsHostCreateMod.SyncHostHandler
import typings.angularDevkitCore.srcVirtualFsHostInterfaceMod.Host
import typings.angularDevkitCore.srcVirtualFsHostInterfaceMod.ReadonlyHost
import typings.angularDevkitCore.srcVirtualFsPathMod.Path_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcVirtualFsHostMod {
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host", "AliasHost")
  @js.native
  open class AliasHost[StatsT /* <: js.Object */] protected ()
    extends typings.angularDevkitCore.srcVirtualFsHostAliasMod.AliasHost[StatsT] {
    def this(_delegate: Host[StatsT]) = this()
  }
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host", "CordHost")
  @js.native
  open class CordHost protected ()
    extends typings.angularDevkitCore.srcVirtualFsHostRecordMod.CordHost {
    def this(_back: ReadonlyHost[js.Object]) = this()
  }
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host", "Empty")
  @js.native
  open class Empty ()
    extends typings.angularDevkitCore.srcVirtualFsHostEmptyMod.Empty
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host", "PatternMatchingHost")
  @js.native
  open class PatternMatchingHost[StatsT /* <: js.Object */] protected ()
    extends typings.angularDevkitCore.srcVirtualFsHostPatternMod.PatternMatchingHost[StatsT] {
    def this(_delegate: Host[StatsT]) = this()
  }
  
  /* note: abstract class */ @JSImport("@angular-devkit/core/src/virtual-fs/host", "ResolverHost")
  @js.native
  open class ResolverHost[T /* <: js.Object */] protected ()
    extends typings.angularDevkitCore.srcVirtualFsHostResolverMod.ResolverHost[T] {
    def this(_delegate: Host[T]) = this()
  }
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host", "SafeReadonlyHost")
  @js.native
  open class SafeReadonlyHost[StatsT /* <: js.Object */] protected ()
    extends typings.angularDevkitCore.srcVirtualFsHostSafeMod.SafeReadonlyHost[StatsT] {
    def this(_delegate: ReadonlyHost[StatsT]) = this()
  }
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host", "ScopedHost")
  @js.native
  open class ScopedHost[T /* <: js.Object */] protected ()
    extends typings.angularDevkitCore.srcVirtualFsHostScopedMod.ScopedHost[T] {
    def this(delegate: Host[T]) = this()
    def this(delegate: Host[T], _root: Path_) = this()
  }
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host", "SimpleMemoryHost")
  @js.native
  open class SimpleMemoryHost ()
    extends typings.angularDevkitCore.srcVirtualFsHostMemoryMod.SimpleMemoryHost
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host", "SyncDelegateHost")
  @js.native
  open class SyncDelegateHost[T /* <: js.Object */] protected ()
    extends typings.angularDevkitCore.srcVirtualFsHostSyncMod.SyncDelegateHost[T] {
    def this(_delegate: Host[T]) = this()
  }
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host", "SynchronousDelegateExpectedException")
  @js.native
  open class SynchronousDelegateExpectedException ()
    extends typings.angularDevkitCore.srcVirtualFsHostSyncMod.SynchronousDelegateExpectedException
  
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
      extends typings.angularDevkitCore.srcVirtualFsHostTestMod.test.TestHost {
      def this(map: StringDictionary[String]) = this()
    }
  }
}
