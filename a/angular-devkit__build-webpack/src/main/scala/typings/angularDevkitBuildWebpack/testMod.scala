package typings.angularDevkitBuildWebpack

import org.scalablytyped.runtime.StringDictionary
import typings.angularDevkitBuildWebpack.angularDevkitBuildWebpackStrings.delete
import typings.angularDevkitBuildWebpack.angularDevkitBuildWebpackStrings.exists
import typings.angularDevkitBuildWebpack.angularDevkitBuildWebpackStrings.isDirectory
import typings.angularDevkitBuildWebpack.angularDevkitBuildWebpackStrings.isFile
import typings.angularDevkitBuildWebpack.angularDevkitBuildWebpackStrings.list
import typings.angularDevkitBuildWebpack.angularDevkitBuildWebpackStrings.read
import typings.angularDevkitBuildWebpack.angularDevkitBuildWebpackStrings.stat
import typings.angularDevkitBuildWebpack.angularDevkitBuildWebpackStrings.watch
import typings.angularDevkitBuildWebpack.angularDevkitBuildWebpackStrings.write
import typings.angularDevkitBuildWebpack.memoryMod.SimpleMemoryHost
import typings.angularDevkitBuildWebpack.pathMod.PathFragment
import typings.angularDevkitBuildWebpack.pathMod.Path_
import typings.angularDevkitBuildWebpack.syncMod.SyncDelegateHost
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object testMod {
  
  object test {
    
    @JSImport("@angular-devkit/build-webpack/core/src/virtual-fs/host/test", "test.TestHost")
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
      - typings.angularDevkitBuildWebpack.anon.Kind
      - typings.angularDevkitBuildWebpack.anon.From
    */
    trait TestLogRecord extends StObject
    object TestLogRecord {
      
      inline def From(from: Path_, to: Path_): typings.angularDevkitBuildWebpack.anon.From = {
        val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], kind = "rename", to = to.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.angularDevkitBuildWebpack.anon.From]
      }
      
      inline def Kind(kind: write | read | delete | list | exists | isDirectory | isFile | stat | watch, path: Path_): typings.angularDevkitBuildWebpack.anon.Kind = {
        val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.angularDevkitBuildWebpack.anon.Kind]
      }
    }
  }
}
