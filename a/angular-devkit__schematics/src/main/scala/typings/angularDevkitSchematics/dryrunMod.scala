package typings.angularDevkitSchematics

import typings.angularDevkitCore.hostInterfaceMod.Host
import typings.angularDevkitSchematics.angularDevkitSchematicsStrings.alreadyExist
import typings.angularDevkitSchematics.angularDevkitSchematicsStrings.create
import typings.angularDevkitSchematics.angularDevkitSchematicsStrings.delete
import typings.angularDevkitSchematics.angularDevkitSchematicsStrings.doesNotExist
import typings.angularDevkitSchematics.angularDevkitSchematicsStrings.error
import typings.angularDevkitSchematics.angularDevkitSchematicsStrings.rename
import typings.angularDevkitSchematics.angularDevkitSchematicsStrings.update
import typings.angularDevkitSchematics.hostMod.HostSink
import typings.node.bufferMod.global.Buffer
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dryrunMod {
  
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
    
    /* protected */ var _subject: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<DryRunEvent> */ Any = js.native
    
    val reporter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Observable<DryRunEvent> */ Any = js.native
  }
  
  trait DryRunCreateEvent
    extends StObject
       with DryRunEvent {
    
    var content: Buffer
    
    var kind: create
    
    var path: String
  }
  object DryRunCreateEvent {
    
    inline def apply(content: Buffer, path: String): DryRunCreateEvent = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], kind = "create", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[DryRunCreateEvent]
    }
    
    extension [Self <: DryRunCreateEvent](x: Self) {
      
      inline def setContent(value: Buffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setKind(value: create): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait DryRunDeleteEvent
    extends StObject
       with DryRunEvent {
    
    var kind: delete
    
    var path: String
  }
  object DryRunDeleteEvent {
    
    inline def apply(path: String): DryRunDeleteEvent = {
      val __obj = js.Dynamic.literal(kind = "delete", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[DryRunDeleteEvent]
    }
    
    extension [Self <: DryRunDeleteEvent](x: Self) {
      
      inline def setKind(value: delete): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait DryRunErrorEvent
    extends StObject
       with DryRunEvent {
    
    var description: alreadyExist | doesNotExist
    
    var kind: error
    
    var path: String
  }
  object DryRunErrorEvent {
    
    inline def apply(description: alreadyExist | doesNotExist, path: String): DryRunErrorEvent = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = "error", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[DryRunErrorEvent]
    }
    
    extension [Self <: DryRunErrorEvent](x: Self) {
      
      inline def setDescription(value: alreadyExist | doesNotExist): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setKind(value: error): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularDevkitSchematics.dryrunMod.DryRunErrorEvent
    - typings.angularDevkitSchematics.dryrunMod.DryRunDeleteEvent
    - typings.angularDevkitSchematics.dryrunMod.DryRunCreateEvent
    - typings.angularDevkitSchematics.dryrunMod.DryRunUpdateEvent
    - typings.angularDevkitSchematics.dryrunMod.DryRunRenameEvent
  */
  trait DryRunEvent extends StObject
  object DryRunEvent {
    
    inline def DryRunCreateEvent(content: Buffer, path: String): typings.angularDevkitSchematics.dryrunMod.DryRunCreateEvent = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], kind = "create", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularDevkitSchematics.dryrunMod.DryRunCreateEvent]
    }
    
    inline def DryRunDeleteEvent(path: String): typings.angularDevkitSchematics.dryrunMod.DryRunDeleteEvent = {
      val __obj = js.Dynamic.literal(kind = "delete", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularDevkitSchematics.dryrunMod.DryRunDeleteEvent]
    }
    
    inline def DryRunErrorEvent(description: alreadyExist | doesNotExist, path: String): typings.angularDevkitSchematics.dryrunMod.DryRunErrorEvent = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], kind = "error", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularDevkitSchematics.dryrunMod.DryRunErrorEvent]
    }
    
    inline def DryRunRenameEvent(path: String, to: String): typings.angularDevkitSchematics.dryrunMod.DryRunRenameEvent = {
      val __obj = js.Dynamic.literal(kind = "rename", path = path.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularDevkitSchematics.dryrunMod.DryRunRenameEvent]
    }
    
    inline def DryRunUpdateEvent(content: Buffer, path: String): typings.angularDevkitSchematics.dryrunMod.DryRunUpdateEvent = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], kind = "update", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularDevkitSchematics.dryrunMod.DryRunUpdateEvent]
    }
  }
  
  trait DryRunRenameEvent
    extends StObject
       with DryRunEvent {
    
    var kind: rename
    
    var path: String
    
    var to: String
  }
  object DryRunRenameEvent {
    
    inline def apply(path: String, to: String): DryRunRenameEvent = {
      val __obj = js.Dynamic.literal(kind = "rename", path = path.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[DryRunRenameEvent]
    }
    
    extension [Self <: DryRunRenameEvent](x: Self) {
      
      inline def setKind(value: rename): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setTo(value: String): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait DryRunUpdateEvent
    extends StObject
       with DryRunEvent {
    
    var content: Buffer
    
    var kind: update
    
    var path: String
  }
  object DryRunUpdateEvent {
    
    inline def apply(content: Buffer, path: String): DryRunUpdateEvent = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], kind = "update", path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[DryRunUpdateEvent]
    }
    
    extension [Self <: DryRunUpdateEvent](x: Self) {
      
      inline def setContent(value: Buffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setKind(value: update): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
