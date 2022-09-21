package typings.angularDevkitCore

import typings.angularDevkitCore.angularDevkitCoreStrings.create
import typings.angularDevkitCore.angularDevkitCoreStrings.delete
import typings.angularDevkitCore.angularDevkitCoreStrings.overwrite
import typings.angularDevkitCore.angularDevkitCoreStrings.rename
import typings.angularDevkitCore.hostInterfaceMod.Host
import typings.angularDevkitCore.hostInterfaceMod.HostCapabilities
import typings.angularDevkitCore.hostInterfaceMod.ReadonlyHost
import typings.angularDevkitCore.memoryMod.SimpleMemoryHost
import typings.angularDevkitCore.pathMod.Path_
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object recordMod {
  
  @JSImport("@angular-devkit/core/src/virtual-fs/host/record", "CordHost")
  @js.native
  open class CordHost protected () extends SimpleMemoryHost {
    def this(_back: ReadonlyHost[js.Object]) = this()
    
    /* protected */ var _back: ReadonlyHost[js.Object] = js.native
    
    /* protected */ var _filesToCreate: Set[Path_] = js.native
    
    /* protected */ var _filesToDelete: Set[Path_] = js.native
    
    /* protected */ var _filesToOverwrite: Set[Path_] = js.native
    
    /* protected */ var _filesToRename: Map[Path_, Path_] = js.native
    
    /* protected */ var _filesToRenameRevert: Map[Path_, Path_] = js.native
    
    def backend: ReadonlyHost[js.Object] = js.native
    
    @JSName("capabilities")
    def capabilities_MCordHost: HostCapabilities = js.native
    
    /**
      * Commit the changes recorded to a Host. It is assumed that the host does have the same structure
      * as the host that was used for backend (could be the same host).
      * @param host The host to create/delete/rename/overwrite files to.
      * @param force Whether to skip existence checks when creating/overwriting. This is
      *   faster but might lead to incorrect states. Because Hosts natively don't support creation
      *   versus overwriting (it's only writing), we check for existence before completing a request.
      * @returns An observable that completes when done, or error if an error occured.
      */
    def commit(host: Host[js.Object]): Any = js.native
    def commit(host: Host[js.Object], force: Boolean): Any = js.native
    
    /**
      * Specialized version of {@link CordHost#write} which forces the creation of a file whether it
      * exists or not.
      * @param {} path
      * @param {FileBuffer} content
      * @returns {Observable<void>}
      */
    def create(path: Path_, content: js.typedarray.ArrayBuffer): Any = js.native
    
    def overwrite(path: Path_, content: js.typedarray.ArrayBuffer): Any = js.native
    
    def records(): js.Array[CordHostRecord] = js.native
    
    def willCreate(path: Path_): Boolean = js.native
    
    def willDelete(path: Path_): Boolean = js.native
    
    def willOverwrite(path: Path_): Boolean = js.native
    
    def willRename(path: Path_): Boolean = js.native
    
    def willRenameTo(path: Path_, to: Path_): Boolean = js.native
  }
  
  trait CordHostCreate
    extends StObject
       with CordHostRecord {
    
    var content: js.typedarray.ArrayBuffer
    
    var kind: create
    
    var path: Path_
  }
  object CordHostCreate {
    
    inline def apply(content: js.typedarray.ArrayBuffer, path: Path_): CordHostCreate = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], kind = "create", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[CordHostCreate]
    }
    
    extension [Self <: CordHostCreate](x: Self) {
      
      inline def setContent(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setKind(value: create): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setPath(value: Path_): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait CordHostDelete
    extends StObject
       with CordHostRecord {
    
    var kind: delete
    
    var path: Path_
  }
  object CordHostDelete {
    
    inline def apply(path: Path_): CordHostDelete = {
      val __obj = js.Dynamic.literal(kind = "delete", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[CordHostDelete]
    }
    
    extension [Self <: CordHostDelete](x: Self) {
      
      inline def setKind(value: delete): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setPath(value: Path_): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait CordHostOverwrite
    extends StObject
       with CordHostRecord {
    
    var content: js.typedarray.ArrayBuffer
    
    var kind: overwrite
    
    var path: Path_
  }
  object CordHostOverwrite {
    
    inline def apply(content: js.typedarray.ArrayBuffer, path: Path_): CordHostOverwrite = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], kind = "overwrite", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[CordHostOverwrite]
    }
    
    extension [Self <: CordHostOverwrite](x: Self) {
      
      inline def setContent(value: js.typedarray.ArrayBuffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setKind(value: overwrite): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setPath(value: Path_): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularDevkitCore.recordMod.CordHostCreate
    - typings.angularDevkitCore.recordMod.CordHostOverwrite
    - typings.angularDevkitCore.recordMod.CordHostRename
    - typings.angularDevkitCore.recordMod.CordHostDelete
  */
  trait CordHostRecord extends StObject
  object CordHostRecord {
    
    inline def CordHostCreate(content: js.typedarray.ArrayBuffer, path: Path_): typings.angularDevkitCore.recordMod.CordHostCreate = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], kind = "create", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularDevkitCore.recordMod.CordHostCreate]
    }
    
    inline def CordHostDelete(path: Path_): typings.angularDevkitCore.recordMod.CordHostDelete = {
      val __obj = js.Dynamic.literal(kind = "delete", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularDevkitCore.recordMod.CordHostDelete]
    }
    
    inline def CordHostOverwrite(content: js.typedarray.ArrayBuffer, path: Path_): typings.angularDevkitCore.recordMod.CordHostOverwrite = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], kind = "overwrite", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularDevkitCore.recordMod.CordHostOverwrite]
    }
    
    inline def CordHostRename(from: Path_, to: Path_): typings.angularDevkitCore.recordMod.CordHostRename = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], kind = "rename", to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularDevkitCore.recordMod.CordHostRename]
    }
  }
  
  trait CordHostRename
    extends StObject
       with CordHostRecord {
    
    var from: Path_
    
    var kind: rename
    
    var to: Path_
  }
  object CordHostRename {
    
    inline def apply(from: Path_, to: Path_): CordHostRename = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], kind = "rename", to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[CordHostRename]
    }
    
    extension [Self <: CordHostRename](x: Self) {
      
      inline def setFrom(value: Path_): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setKind(value: rename): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Path_): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
