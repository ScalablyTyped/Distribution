package typings.angularDevkitCore.mod

import org.scalablytyped.runtime.StringDictionary
import typings.angularDevkitCore.srcUtilsLiteralsMod.TemplateTag
import typings.angularDevkitCore.srcVirtualFsHostCreateMod.SyncHostHandler
import typings.angularDevkitCore.srcVirtualFsHostInterfaceMod.Host
import typings.angularDevkitCore.srcVirtualFsHostInterfaceMod.ReadonlyHost
import typings.angularDevkitCore.srcVirtualFsPathMod.Path_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object virtualFs {
  
  @JSImport("@angular-devkit/core", "virtualFs")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/core", "virtualFs.AliasHost")
  @js.native
  open class AliasHost[StatsT /* <: js.Object */] protected ()
    extends typings.angularDevkitCore.srcVirtualFsMod.virtualFs.AliasHost[StatsT] {
    def this(_delegate: Host[StatsT]) = this()
  }
  
  @JSImport("@angular-devkit/core", "virtualFs.CordHost")
  @js.native
  open class CordHost protected ()
    extends typings.angularDevkitCore.srcVirtualFsMod.virtualFs.CordHost {
    def this(_back: ReadonlyHost[js.Object]) = this()
  }
  
  @JSImport("@angular-devkit/core", "virtualFs.Empty")
  @js.native
  open class Empty ()
    extends typings.angularDevkitCore.srcVirtualFsMod.virtualFs.Empty
  
  @JSImport("@angular-devkit/core", "virtualFs.PatternMatchingHost")
  @js.native
  open class PatternMatchingHost[StatsT /* <: js.Object */] protected ()
    extends typings.angularDevkitCore.srcVirtualFsMod.virtualFs.PatternMatchingHost[StatsT] {
    def this(_delegate: Host[StatsT]) = this()
  }
  
  /* note: abstract class */ @JSImport("@angular-devkit/core", "virtualFs.ResolverHost")
  @js.native
  open class ResolverHost[T /* <: js.Object */] protected ()
    extends typings.angularDevkitCore.srcVirtualFsMod.virtualFs.ResolverHost[T] {
    def this(_delegate: Host[T]) = this()
  }
  
  @JSImport("@angular-devkit/core", "virtualFs.SafeReadonlyHost")
  @js.native
  open class SafeReadonlyHost[StatsT /* <: js.Object */] protected ()
    extends typings.angularDevkitCore.srcVirtualFsMod.virtualFs.SafeReadonlyHost[StatsT] {
    def this(_delegate: ReadonlyHost[StatsT]) = this()
  }
  
  @JSImport("@angular-devkit/core", "virtualFs.ScopedHost")
  @js.native
  open class ScopedHost[T /* <: js.Object */] protected ()
    extends typings.angularDevkitCore.srcVirtualFsMod.virtualFs.ScopedHost[T] {
    def this(delegate: Host[T]) = this()
    def this(delegate: Host[T], _root: Path_) = this()
  }
  
  @JSImport("@angular-devkit/core", "virtualFs.SimpleMemoryHost")
  @js.native
  open class SimpleMemoryHost ()
    extends typings.angularDevkitCore.srcVirtualFsMod.virtualFs.SimpleMemoryHost
  
  @JSImport("@angular-devkit/core", "virtualFs.SyncDelegateHost")
  @js.native
  open class SyncDelegateHost[T /* <: js.Object */] protected ()
    extends typings.angularDevkitCore.srcVirtualFsMod.virtualFs.SyncDelegateHost[T] {
    def this(_delegate: Host[T]) = this()
  }
  
  @JSImport("@angular-devkit/core", "virtualFs.SynchronousDelegateExpectedException")
  @js.native
  open class SynchronousDelegateExpectedException ()
    extends typings.angularDevkitCore.srcVirtualFsMod.virtualFs.SynchronousDelegateExpectedException
  
  inline def createSyncHost[StatsT /* <: js.Object */](handler: SyncHostHandler[StatsT]): Host[StatsT] = ^.asInstanceOf[js.Dynamic].applyDynamic("createSyncHost")(handler.asInstanceOf[js.Any]).asInstanceOf[Host[StatsT]]
  
  @JSImport("@angular-devkit/core", "virtualFs.fileBuffer")
  @js.native
  val fileBuffer: TemplateTag[js.typedarray.ArrayBuffer] = js.native
  
  inline def fileBufferToString(fileBuffer: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fileBufferToString")(fileBuffer.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def stringToFileBuffer(str: String): js.typedarray.ArrayBuffer = ^.asInstanceOf[js.Dynamic].applyDynamic("stringToFileBuffer")(str.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.ArrayBuffer]
  
  object test {
    
    @JSImport("@angular-devkit/core", "virtualFs.test.TestHost")
    @js.native
    open class TestHost ()
      extends typings.angularDevkitCore.srcVirtualFsMod.virtualFs.test.TestHost {
      def this(map: StringDictionary[String]) = this()
    }
  }
}
