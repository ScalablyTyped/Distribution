package typings.angularDevkitBuildWebpack

import typings.angularDevkitBuildWebpack.anon.Birthtime
import typings.angularDevkitBuildWebpack.anon.Content
import typings.angularDevkitBuildWebpack.anon.StatsSimpleMemoryHostStat
import typings.angularDevkitBuildWebpack.hostInterfaceMod.Host
import typings.angularDevkitBuildWebpack.hostInterfaceMod.HostCapabilities
import typings.angularDevkitBuildWebpack.hostInterfaceMod.HostWatchEventType
import typings.angularDevkitBuildWebpack.hostInterfaceMod.HostWatchOptions
import typings.angularDevkitBuildWebpack.pathMod.PathFragment
import typings.angularDevkitBuildWebpack.pathMod.Path_
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object memoryMod {
  
  @JSImport("@angular-devkit/build-webpack/core/src/virtual-fs/host/memory", "SimpleMemoryHost")
  @js.native
  open class SimpleMemoryHost ()
    extends StObject
       with Host[js.Object] {
    
    /* protected */ var _cache: Map[Path_, StatsSimpleMemoryHostStat] = js.native
    
    /* protected */ def _delete(path: Path_): Unit = js.native
    
    /* protected */ def _exists(path: Path_): Boolean = js.native
    
    /* protected */ def _isDirectory(path: Path_): Boolean = js.native
    
    /* protected */ def _isFile(path: Path_): Boolean = js.native
    
    /* protected */ def _list(path: Path_): js.Array[PathFragment] = js.native
    
    /* protected */ def _newDirStats(): Birthtime = js.native
    
    /* protected */ def _newFileStats(content: js.typedarray.ArrayBuffer): Content = js.native
    /* protected */ def _newFileStats(content: js.typedarray.ArrayBuffer, oldStats: StatsSimpleMemoryHostStat): Content = js.native
    
    /* protected */ def _read(path: Path_): js.typedarray.ArrayBuffer = js.native
    
    /* protected */ def _rename(from: Path_, to: Path_): Unit = js.native
    
    /* protected */ def _stat(path: Path_): StatsSimpleMemoryHostStat | Null = js.native
    
    /* protected */ def _toAbsolute(path: Path_): Path_ = js.native
    
    /* protected */ def _updateWatchers(path: Path_, `type`: HostWatchEventType): Unit = js.native
    
    /* protected */ def _watch(path: Path_): Any = js.native
    /* protected */ def _watch(path: Path_, options: HostWatchOptions): Any = js.native
    
    /* private */ var _watchers: Any = js.native
    
    /**
      * List of protected methods that give direct access outside the observables to the cache
      * and internal states.
      */
    /* protected */ def _write(path: Path_, content: js.typedarray.ArrayBuffer): Unit = js.native
    
    /* CompleteClass */
    override val capabilities: HostCapabilities = js.native
    @JSName("capabilities")
    def capabilities_MSimpleMemoryHost: HostCapabilities = js.native
    
    /* CompleteClass */
    override def exists(path: Path_): Any = js.native
    
    /* CompleteClass */
    override def isDirectory(path: Path_): Any = js.native
    
    /* CompleteClass */
    override def isFile(path: Path_): Any = js.native
    
    /* CompleteClass */
    override def list(path: Path_): Any = js.native
    
    /* CompleteClass */
    override def read(path: Path_): Any = js.native
    
    def reset(): Unit = js.native
    
    /* CompleteClass */
    override def stat(path: Path_): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<Stats<StatsT> | null> */ Any) | Null = js.native
    
    def write(path: Path_, content: js.typedarray.ArrayBuffer): Any = js.native
  }
  
  trait SimpleMemoryHostStats extends StObject {
    
    val content: js.typedarray.ArrayBuffer | Null
  }
  object SimpleMemoryHostStats {
    
    inline def apply(): SimpleMemoryHostStats = {
      val __obj = js.Dynamic.literal(content = null)
      __obj.asInstanceOf[SimpleMemoryHostStats]
    }
    
    extension [Self <: SimpleMemoryHostStats](x: Self) {
      
      inline def setContent(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
    }
  }
}
