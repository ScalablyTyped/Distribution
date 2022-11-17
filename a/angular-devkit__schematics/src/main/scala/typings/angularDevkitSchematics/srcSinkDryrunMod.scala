package typings.angularDevkitSchematics

import typings.angularDevkitCore.srcVirtualFsHostInterfaceMod.Host
import typings.angularDevkitSchematics.srcSinkHostMod.HostSink
import typings.node.bufferMod.global.Buffer
import typings.rxjs.mod.Observable_
import typings.rxjs.mod.Subject
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcSinkDryrunMod {
  
  @JSImport("@angular-devkit/schematics/src/sink/dryrun", "DryRunSink")
  @js.native
  open class DryRunSink protected () extends HostSink {
    /**
      * @param {host} dir The host to use to output. This should be scoped.
      * @param {boolean} force Whether to force overwriting files that already exist.
      */
    def this(host: Host[js.Object]) = this()
    def this(host: Host[js.Object], force: Boolean) = this()
    
    /* protected */ var _fileAlreadyExistExceptionSet: Set[String] = js.native
    
    /* protected */ var _fileDoesNotExistExceptionSet: Set[String] = js.native
    
    /* protected */ var _subject: Subject[DryRunEvent] = js.native
    
    val reporter: Observable_[DryRunEvent] = js.native
  }
  
  trait DryRunCreateEvent extends StObject {
    
    var content: Buffer
    
    var kind: "create"
    
    var path: String
  }
  object DryRunCreateEvent {
    
    inline def apply(content: Buffer, path: String): DryRunCreateEvent = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], kind = "create", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[DryRunCreateEvent]
    }
    
    extension [Self <: DryRunCreateEvent](x: Self) {
      
      inline def setContent(value: Buffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setKind(value: "create"): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait DryRunDeleteEvent extends StObject {
    
    var kind: "delete"
    
    var path: String
  }
  object DryRunDeleteEvent {
    
    inline def apply(path: String): DryRunDeleteEvent = {
      val __obj = js.Dynamic.literal(kind = "delete", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[DryRunDeleteEvent]
    }
    
    extension [Self <: DryRunDeleteEvent](x: Self) {
      
      inline def setKind(value: "delete"): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait DryRunErrorEvent extends StObject {
    
    var description: "alreadyExist" | "doesNotExist"
    
    var kind: "error"
    
    var path: String
  }
  object DryRunErrorEvent {
    
    inline def apply(description: "alreadyExist" | "doesNotExist", path: String): DryRunErrorEvent = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = "error", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[DryRunErrorEvent]
    }
    
    extension [Self <: DryRunErrorEvent](x: Self) {
      
      inline def setDescription(value: "alreadyExist" | "doesNotExist"): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setKind(value: "error"): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  type DryRunEvent = DryRunErrorEvent | DryRunDeleteEvent | DryRunCreateEvent | DryRunUpdateEvent | DryRunRenameEvent
  
  trait DryRunRenameEvent extends StObject {
    
    var kind: "rename"
    
    var path: String
    
    var to: String
  }
  object DryRunRenameEvent {
    
    inline def apply(path: String, to: String): DryRunRenameEvent = {
      val __obj = js.Dynamic.literal(kind = "rename", path = path.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[DryRunRenameEvent]
    }
    
    extension [Self <: DryRunRenameEvent](x: Self) {
      
      inline def setKind(value: "rename"): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait DryRunUpdateEvent extends StObject {
    
    var content: Buffer
    
    var kind: "update"
    
    var path: String
  }
  object DryRunUpdateEvent {
    
    inline def apply(content: Buffer, path: String): DryRunUpdateEvent = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], kind = "update", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[DryRunUpdateEvent]
    }
    
    extension [Self <: DryRunUpdateEvent](x: Self) {
      
      inline def setContent(value: Buffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setKind(value: "update"): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
