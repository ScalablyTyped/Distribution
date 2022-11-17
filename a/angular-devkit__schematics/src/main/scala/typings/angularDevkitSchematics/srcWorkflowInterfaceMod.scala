package typings.angularDevkitSchematics

import typings.angularDevkitCore.mod.logging.Logger
import typings.angularDevkitSchematics.anon.PartialWorkflowExecutionC
import typings.angularDevkitSchematics.anon.ReadonlyWorkflowExecution
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcWorkflowInterfaceMod {
  
  trait LifeCycleEvent extends StObject {
    
    var kind: "start" | "end" | "workflow-start" | "workflow-end" | "post-tasks-start" | "post-tasks-end"
  }
  object LifeCycleEvent {
    
    inline def apply(kind: "start" | "end" | "workflow-start" | "workflow-end" | "post-tasks-start" | "post-tasks-end"): LifeCycleEvent = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any])
      __obj.asInstanceOf[LifeCycleEvent]
    }
    
    extension [Self <: LifeCycleEvent](x: Self) {
      
      inline def setKind(value: "start" | "end" | "workflow-start" | "workflow-end" | "post-tasks-start" | "post-tasks-end"): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequiredWorkflowExecutionContext extends StObject {
    
    var collection: String
    
    var options: js.Object
    
    var schematic: String
  }
  object RequiredWorkflowExecutionContext {
    
    inline def apply(collection: String, options: js.Object, schematic: String): RequiredWorkflowExecutionContext = {
      val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], schematic = schematic.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequiredWorkflowExecutionContext]
    }
    
    extension [Self <: RequiredWorkflowExecutionContext](x: Self) {
      
      inline def setCollection(value: String): Self = StObject.set(x, "collection", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Object): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setSchematic(value: String): Self = StObject.set(x, "schematic", value.asInstanceOf[js.Any])
    }
  }
  
  trait Workflow extends StObject {
    
    val context: ReadonlyWorkflowExecution
    
    def execute(options: PartialWorkflowExecutionC): Observable_[Unit]
  }
  object Workflow {
    
    inline def apply(context: ReadonlyWorkflowExecution, execute: PartialWorkflowExecutionC => Observable_[Unit]): Workflow = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], execute = js.Any.fromFunction1(execute))
      __obj.asInstanceOf[Workflow]
    }
    
    extension [Self <: Workflow](x: Self) {
      
      inline def setContext(value: ReadonlyWorkflowExecution): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setExecute(value: PartialWorkflowExecutionC => Observable_[Unit]): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
    }
  }
  
  trait WorkflowExecutionContext
    extends StObject
       with RequiredWorkflowExecutionContext {
    
    var allowPrivate: js.UndefOr[Boolean] = js.undefined
    
    var debug: Boolean
    
    var logger: Logger
    
    var parentContext: js.UndefOr[ReadonlyWorkflowExecution] = js.undefined
  }
  object WorkflowExecutionContext {
    
    inline def apply(collection: String, debug: Boolean, logger: Logger, options: js.Object, schematic: String): WorkflowExecutionContext = {
      val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], schematic = schematic.asInstanceOf[js.Any])
      __obj.asInstanceOf[WorkflowExecutionContext]
    }
    
    extension [Self <: WorkflowExecutionContext](x: Self) {
      
      inline def setAllowPrivate(value: Boolean): Self = StObject.set(x, "allowPrivate", value.asInstanceOf[js.Any])
      
      inline def setAllowPrivateUndefined: Self = StObject.set(x, "allowPrivate", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setParentContext(value: ReadonlyWorkflowExecution): Self = StObject.set(x, "parentContext", value.asInstanceOf[js.Any])
      
      inline def setParentContextUndefined: Self = StObject.set(x, "parentContext", js.undefined)
    }
  }
}
