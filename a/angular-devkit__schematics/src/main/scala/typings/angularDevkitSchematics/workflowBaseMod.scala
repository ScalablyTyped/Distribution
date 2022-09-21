package typings.angularDevkitSchematics

import typings.angularDevkitCore.hostInterfaceMod.Host
import typings.angularDevkitCore.interfaceMod.SchemaRegistry
import typings.angularDevkitCore.mod.schema.CoreSchemaRegistry
import typings.angularDevkitSchematics.anon.PartialWorkflowExecutionC
import typings.angularDevkitSchematics.anon.ReadonlyWorkflowExecution
import typings.angularDevkitSchematics.interfaceMod.Engine
import typings.angularDevkitSchematics.interfaceMod.EngineHost
import typings.angularDevkitSchematics.sinkMod.Sink
import typings.angularDevkitSchematics.workflowInterfaceMod.Workflow
import typings.angularDevkitSchematics.workflowInterfaceMod.WorkflowExecutionContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object workflowBaseMod {
  
  @JSImport("@angular-devkit/schematics/src/workflow/base", "BaseWorkflow")
  @js.native
  abstract class BaseWorkflow protected ()
    extends StObject
       with Workflow {
    def this(options: BaseWorkflowOptions) = this()
    
    /* protected */ var _context: js.Array[WorkflowExecutionContext] = js.native
    
    /* protected */ def _createSinks(): js.Array[Sink] = js.native
    
    /* protected */ var _dryRun: Boolean = js.native
    
    /* protected */ var _engine: Engine[js.Object, js.Object] = js.native
    
    /* protected */ var _engineHost: EngineHost[js.Object, js.Object] = js.native
    
    /* protected */ var _force: Boolean = js.native
    
    /* protected */ var _host: Host[js.Object] = js.native
    
    /* protected */ var _lifeCycle: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<LifeCycleEvent> */ Any = js.native
    
    /* protected */ var _registry: CoreSchemaRegistry = js.native
    
    /* protected */ var _reporter: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Subject<DryRunEvent> */ Any = js.native
    
    /* CompleteClass */
    override val context: ReadonlyWorkflowExecution = js.native
    @JSName("context")
    def context_MBaseWorkflow: ReadonlyWorkflowExecution = js.native
    
    def engine: Engine[js.Object, js.Object] = js.native
    
    def engineHost: EngineHost[js.Object, js.Object] = js.native
    
    /* CompleteClass */
    override def execute(options: PartialWorkflowExecutionC): Any = js.native
    
    def lifeCycle: Any = js.native
    
    def registry: SchemaRegistry = js.native
    
    def reporter: Any = js.native
  }
  
  trait BaseWorkflowOptions extends StObject {
    
    var dryRun: js.UndefOr[Boolean] = js.undefined
    
    var engineHost: EngineHost[js.Object, js.Object]
    
    var force: js.UndefOr[Boolean] = js.undefined
    
    var host: Host[js.Object]
    
    var registry: js.UndefOr[CoreSchemaRegistry] = js.undefined
  }
  object BaseWorkflowOptions {
    
    inline def apply(engineHost: EngineHost[js.Object, js.Object], host: Host[js.Object]): BaseWorkflowOptions = {
      val __obj = js.Dynamic.literal(engineHost = engineHost.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseWorkflowOptions]
    }
    
    extension [Self <: BaseWorkflowOptions](x: Self) {
      
      inline def setDryRun(value: Boolean): Self = StObject.set(x, "dryRun", value.asInstanceOf[js.Any])
      
      inline def setDryRunUndefined: Self = StObject.set(x, "dryRun", js.undefined)
      
      inline def setEngineHost(value: EngineHost[js.Object, js.Object]): Self = StObject.set(x, "engineHost", value.asInstanceOf[js.Any])
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setHost(value: Host[js.Object]): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setRegistry(value: CoreSchemaRegistry): Self = StObject.set(x, "registry", value.asInstanceOf[js.Any])
      
      inline def setRegistryUndefined: Self = StObject.set(x, "registry", js.undefined)
    }
  }
}
