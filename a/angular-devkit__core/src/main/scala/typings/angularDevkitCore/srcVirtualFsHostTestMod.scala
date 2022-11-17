package typings.angularDevkitCore

import org.scalablytyped.runtime.StringDictionary
import typings.angularDevkitCore.anon.From
import typings.angularDevkitCore.anon.Kind
import typings.angularDevkitCore.srcVirtualFsHostMemoryMod.SimpleMemoryHost
import typings.angularDevkitCore.srcVirtualFsHostSyncMod.SyncDelegateHost
import typings.angularDevkitCore.srcVirtualFsPathMod.PathFragment
import typings.angularDevkitCore.srcVirtualFsPathMod.Path_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcVirtualFsHostTestMod {
  
  object test {
    
    @JSImport("@angular-devkit/core/src/virtual-fs/host/test", "test.TestHost")
    @js.native
    open class TestHost () extends SimpleMemoryHost {
      def this(map: StringDictionary[String]) = this()
      
      @JSName("$exists")
      def $exists(path: String): Boolean = js.native
      
      @JSName("$isDirectory")
      def $isDirectory(path: String): Boolean = js.native
      
      @JSName("$isFile")
      def $isFile(path: String): Boolean = js.native
      
      @JSName("$list")
      def $list(path: String): js.Array[PathFragment] = js.native
      
      @JSName("$read")
      def $read(path: String): String = js.native
      
      @JSName("$write")
      def $write(path: String, content: String): Unit = js.native
      
      /* protected */ var _records: js.Array[TestLogRecord] = js.native
      
      /* protected */ var _sync: SyncDelegateHost[js.Object] | Null = js.native
      
      def clearRecords(): Unit = js.native
      
      def files: js.Array[Path_] = js.native
      
      def records: js.Array[TestLogRecord] = js.native
      
      def sync: SyncDelegateHost[js.Object] = js.native
    }
    
    type TestLogRecord = Kind | From
  }
}
