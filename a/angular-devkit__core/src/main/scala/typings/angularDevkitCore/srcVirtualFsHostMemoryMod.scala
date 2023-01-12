package typings.angularDevkitCore

import typings.angularDevkitCore.anon.Birthtime
import typings.angularDevkitCore.anon.Content
import typings.angularDevkitCore.anon.StatsSimpleMemoryHostStat
import typings.angularDevkitCore.srcVirtualFsHostInterfaceMod.Host
import typings.angularDevkitCore.srcVirtualFsHostInterfaceMod.HostCapabilities
import typings.angularDevkitCore.srcVirtualFsHostInterfaceMod.HostWatchEvent
import typings.angularDevkitCore.srcVirtualFsHostInterfaceMod.HostWatchEventType
import typings.angularDevkitCore.srcVirtualFsHostInterfaceMod.HostWatchOptions
import typings.angularDevkitCore.srcVirtualFsHostInterfaceMod.Stats
import typings.angularDevkitCore.srcVirtualFsPathMod.PathFragment
import typings.angularDevkitCore.srcVirtualFsPathMod.Path_
import typings.rxjs.mod.Observable_
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcVirtualFsHostMemoryMod {
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host/memory", "SimpleMemoryHost")
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
    
    /* protected */ def _watch(path: Path_): Observable_[HostWatchEvent] = js.native
    /* protected */ def _watch(path: Path_, options: HostWatchOptions): Observable_[HostWatchEvent] = js.native
    
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
    override def exists(path: Path_): Observable_[Boolean] = js.native
    
    /* CompleteClass */
    override def isDirectory(path: Path_): Observable_[Boolean] = js.native
    
    /* CompleteClass */
    override def isFile(path: Path_): Observable_[Boolean] = js.native
    
    /* CompleteClass */
    override def list(path: Path_): Observable_[js.Array[PathFragment]] = js.native
    
    /* CompleteClass */
    override def read(path: Path_): Observable_[js.typedarray.ArrayBuffer] = js.native
    
    def reset(): Unit = js.native
    
    /* CompleteClass */
    override def stat(path: Path_): (Observable_[Stats[js.Object] | Null]) | Null = js.native
    
    def write(path: Path_, content: js.typedarray.ArrayBuffer): Observable_[Unit] = js.native
  }
  
  trait SimpleMemoryHostStats extends StObject {
    
    val content: js.typedarray.ArrayBuffer | Null
  }
  object SimpleMemoryHostStats {
    
    inline def apply(): SimpleMemoryHostStats = {
      val __obj = js.Dynamic.literal(content = null)
      __obj.asInstanceOf[SimpleMemoryHostStats]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimpleMemoryHostStats] (val x: Self) extends AnyVal {
      
      inline def setContent(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentNull: Self = StObject.set(x, "content", null)
    }
  }
}
