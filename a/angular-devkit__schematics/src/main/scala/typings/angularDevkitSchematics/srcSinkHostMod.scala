package typings.angularDevkitSchematics

import typings.angularDevkitCore.srcVirtualFsHostInterfaceMod.Host
import typings.angularDevkitCore.srcVirtualFsPathMod.Path_
import typings.angularDevkitSchematics.srcSinkSinkMod.SimpleSinkBase
import typings.node.bufferMod.global.Buffer
import typings.rxjs.mod.Observable_
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSinkHostMod {
  
  @JSImport("@angular-devkit/schematics/src/sink/host", "HostSink")
  @js.native
  open class HostSink protected () extends SimpleSinkBase {
    def this(_host: Host[js.Object]) = this()
    def this(_host: Host[js.Object], _force: Boolean) = this()
    
    /* protected */ def _createFile(path: Path_, content: Buffer): Observable_[Unit] = js.native
    
    /* protected */ def _deleteFile(path: Path_): Observable_[Unit] = js.native
    
    /* protected */ var _filesToCreate: Map[Path_, Buffer] = js.native
    
    /* protected */ var _filesToDelete: Set[Path_] = js.native
    
    /* protected */ var _filesToRename: Set[js.Tuple2[Path_, Path_]] = js.native
    
    /* protected */ var _filesToUpdate: Map[Path_, Buffer] = js.native
    
    /* protected */ var _force: Boolean = js.native
    
    /* protected */ var _host: Host[js.Object] = js.native
    
    /* protected */ def _overwriteFile(path: Path_, content: Buffer): Observable_[Unit] = js.native
    
    /* protected */ def _renameFile(from: Path_, to: Path_): Observable_[Unit] = js.native
    
    /* protected */ def _validateFileExists(p: Path_): Observable_[Boolean] = js.native
  }
}
