package typings.angularDevkitSchematics

import typings.angularDevkitCore.mod.BaseException
import typings.angularDevkitCore.srcVirtualFsPathMod.Path_
import typings.angularDevkitSchematics.angularDevkitSchematicsStrings.c
import typings.angularDevkitSchematics.angularDevkitSchematicsStrings.d
import typings.angularDevkitSchematics.angularDevkitSchematicsStrings.o
import typings.angularDevkitSchematics.angularDevkitSchematicsStrings.r
import typings.node.bufferMod.global.Buffer
import typings.std.Iterable
import typings.std.IterableIterator
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcTreeActionMod {
  
  @JSImport("@angular-devkit/schematics/src/tree/action", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/schematics/src/tree/action", "ActionList")
  @js.native
  open class ActionList ()
    extends StObject
       with Iterable[Action] {
    
    /* protected */ def _action(action: Partial[Action]): Unit = js.native
    
    /* private */ var _actions: Any = js.native
    
    def create(path: Path_, content: Buffer): Unit = js.native
    
    def delete(path: Path_): Unit = js.native
    
    def find(predicate: js.Function1[/* value */ Action, Boolean]): Action | Null = js.native
    
    def forEach(fn: js.Function3[/* value */ Action, /* index */ Double, /* array */ js.Array[Action], Unit]): Unit = js.native
    def forEach(
      fn: js.Function3[/* value */ Action, /* index */ Double, /* array */ js.Array[Action], Unit],
      thisArg: js.Object
    ): Unit = js.native
    
    def get(i: Double): Action = js.native
    
    def has(action: Action): Boolean = js.native
    
    @JSName(js.Symbol.iterator)
    var iterator_ActionList: js.Function0[IterableIterator[Action]] = js.native
    
    def length: Double = js.native
    
    def optimize(): Unit = js.native
    
    def overwrite(path: Path_, content: Buffer): Unit = js.native
    
    def push(action: Action): Unit = js.native
    
    def rename(path: Path_, to: Path_): Unit = js.native
  }
  
  @JSImport("@angular-devkit/schematics/src/tree/action", "UnknownActionException")
  @js.native
  open class UnknownActionException protected () extends BaseException {
    def this(action: Action) = this()
  }
  
  inline def isContentAction(action: Action): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isContentAction")(action.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularDevkitSchematics.srcTreeActionMod.CreateFileAction
    - typings.angularDevkitSchematics.srcTreeActionMod.OverwriteFileAction
    - typings.angularDevkitSchematics.srcTreeActionMod.RenameFileAction
    - typings.angularDevkitSchematics.srcTreeActionMod.DeleteFileAction
  */
  trait Action extends StObject
  object Action {
    
    inline def CreateFileAction(content: Buffer, id: Double, parent: Double, path: Path_): typings.angularDevkitSchematics.srcTreeActionMod.CreateFileAction = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = "c", parent = parent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularDevkitSchematics.srcTreeActionMod.CreateFileAction]
    }
    
    inline def DeleteFileAction(id: Double, parent: Double, path: Path_): typings.angularDevkitSchematics.srcTreeActionMod.DeleteFileAction = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = "d", parent = parent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularDevkitSchematics.srcTreeActionMod.DeleteFileAction]
    }
    
    inline def OverwriteFileAction(content: Buffer, id: Double, parent: Double, path: Path_): typings.angularDevkitSchematics.srcTreeActionMod.OverwriteFileAction = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = "o", parent = parent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularDevkitSchematics.srcTreeActionMod.OverwriteFileAction]
    }
    
    inline def RenameFileAction(id: Double, parent: Double, path: Path_, to: Path_): typings.angularDevkitSchematics.srcTreeActionMod.RenameFileAction = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = "r", parent = parent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.angularDevkitSchematics.srcTreeActionMod.RenameFileAction]
    }
  }
  
  trait ActionBase extends StObject {
    
    val id: Double
    
    val parent: Double
    
    val path: Path_
  }
  object ActionBase {
    
    inline def apply(id: Double, parent: Double, path: Path_): ActionBase = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionBase]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ActionBase] (val x: Self) extends AnyVal {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setParent(value: Double): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
      
      inline def setPath(value: Path_): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait CreateFileAction
    extends StObject
       with ActionBase
       with Action {
    
    val content: Buffer
    
    val kind: c
  }
  object CreateFileAction {
    
    inline def apply(content: Buffer, id: Double, parent: Double, path: Path_): CreateFileAction = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = "c", parent = parent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateFileAction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CreateFileAction] (val x: Self) extends AnyVal {
      
      inline def setContent(value: Buffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setKind(value: c): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeleteFileAction
    extends StObject
       with ActionBase
       with Action {
    
    val kind: d
  }
  object DeleteFileAction {
    
    inline def apply(id: Double, parent: Double, path: Path_): DeleteFileAction = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = "d", parent = parent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeleteFileAction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DeleteFileAction] (val x: Self) extends AnyVal {
      
      inline def setKind(value: d): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait OverwriteFileAction
    extends StObject
       with ActionBase
       with Action {
    
    val content: Buffer
    
    val kind: o
  }
  object OverwriteFileAction {
    
    inline def apply(content: Buffer, id: Double, parent: Double, path: Path_): OverwriteFileAction = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kind = "o", parent = parent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[OverwriteFileAction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: OverwriteFileAction] (val x: Self) extends AnyVal {
      
      inline def setContent(value: Buffer): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setKind(value: o): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait RenameFileAction
    extends StObject
       with ActionBase
       with Action {
    
    val kind: r
    
    val to: Path_
  }
  object RenameFileAction {
    
    inline def apply(id: Double, parent: Double, path: Path_, to: Path_): RenameFileAction = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], kind = "r", parent = parent.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[RenameFileAction]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenameFileAction] (val x: Self) extends AnyVal {
      
      inline def setKind(value: r): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Path_): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
}
