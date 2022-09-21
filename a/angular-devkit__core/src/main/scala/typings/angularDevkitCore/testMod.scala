package typings.angularDevkitCore

import org.scalablytyped.runtime.StringDictionary
import typings.angularDevkitCore.angularDevkitCoreStrings.delete
import typings.angularDevkitCore.angularDevkitCoreStrings.exists
import typings.angularDevkitCore.angularDevkitCoreStrings.isDirectory
import typings.angularDevkitCore.angularDevkitCoreStrings.isFile
import typings.angularDevkitCore.angularDevkitCoreStrings.list
import typings.angularDevkitCore.angularDevkitCoreStrings.read
import typings.angularDevkitCore.angularDevkitCoreStrings.stat
import typings.angularDevkitCore.angularDevkitCoreStrings.watch
import typings.angularDevkitCore.angularDevkitCoreStrings.write
import typings.angularDevkitCore.memoryMod.SimpleMemoryHost
import typings.angularDevkitCore.pathMod.PathFragment
import typings.angularDevkitCore.pathMod.Path_
import typings.angularDevkitCore.syncMod.SyncDelegateHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testMod {
  
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
    
    /* Rewritten from type alias, can be one of: 
      - typings.angularDevkitCore.anon.Kind
      - typings.angularDevkitCore.anon.From
    */
    trait TestLogRecord extends StObject
    object TestLogRecord {
      
      inline def From(from: Path_, to: Path_): typings.angularDevkitCore.anon.From = {
        val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], kind = "rename", to = to.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.angularDevkitCore.anon.From]
      }
      
      inline def Kind(kind: write | read | delete | list | exists | isDirectory | isFile | stat | watch, path: Path_): typings.angularDevkitCore.anon.Kind = {
        val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.angularDevkitCore.anon.Kind]
      }
    }
  }
}
