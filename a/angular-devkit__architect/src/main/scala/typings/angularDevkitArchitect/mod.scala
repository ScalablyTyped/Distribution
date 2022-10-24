package typings.angularDevkitArchitect

import typings.angularDevkitArchitect.srcApiMod.BuilderContext
import typings.angularDevkitArchitect.srcApiMod.BuilderHandlerFn
import typings.angularDevkitArchitect.srcApiMod.BuilderInfo
import typings.angularDevkitArchitect.srcApiMod.BuilderOutput
import typings.angularDevkitArchitect.srcApiMod.ScheduleOptions
import typings.angularDevkitArchitect.srcApiMod.Target
import typings.angularDevkitArchitect.srcInternalMod.ArchitectHost
import typings.angularDevkitArchitect.srcInternalMod.Builder
import typings.angularDevkitArchitect.srcProgressSchemaMod.State
import typings.angularDevkitCore.srcExperimentalJobsApiMod.Registry
import typings.angularDevkitCore.srcJsonSchemaInterfaceMod.SchemaRegistry
import typings.angularDevkitCore.srcJsonUtilsMod.JsonObject
import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import typings.rxjs.mod.Observable_
import typings.std.AsyncIterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@angular-devkit/architect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular-devkit/architect", "Architect")
  @js.native
  open class Architect protected ()
    extends typings.angularDevkitArchitect.srcArchitectMod.Architect {
    def this(_host: ArchitectHost[BuilderInfo]) = this()
    def this(_host: ArchitectHost[BuilderInfo], registry: SchemaRegistry) = this()
    def this(
      _host: ArchitectHost[BuilderInfo],
      registry: Unit,
      additionalJobRegistry: Registry[JsonValue, JsonValue, JsonValue]
    ) = this()
    def this(
      _host: ArchitectHost[BuilderInfo],
      registry: SchemaRegistry,
      additionalJobRegistry: Registry[JsonValue, JsonValue, JsonValue]
    ) = this()
  }
  
  @JSImport("@angular-devkit/architect", "BuilderProgressState")
  @js.native
  object BuilderProgressState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[State & String] = js.native
    
    /* "error" */ val Error: typings.angularDevkitArchitect.srcProgressSchemaMod.State.Error & String = js.native
    
    /* "running" */ val Running: typings.angularDevkitArchitect.srcProgressSchemaMod.State.Running & String = js.native
    
    /* "stopped" */ val Stopped: typings.angularDevkitArchitect.srcProgressSchemaMod.State.Stopped & String = js.native
    
    /* "waiting" */ val Waiting: typings.angularDevkitArchitect.srcProgressSchemaMod.State.Waiting & String = js.native
  }
  
  inline def createBuilder[OptT, OutT /* <: BuilderOutput */](fn: BuilderHandlerFn[OptT]): Builder[OptT & JsonObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuilder")(fn.asInstanceOf[js.Any]).asInstanceOf[Builder[OptT & JsonObject]]
  
  inline def fromAsyncIterable[T](iterable: AsyncIterable[T]): Observable_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAsyncIterable")(iterable.asInstanceOf[js.Any]).asInstanceOf[Observable_[T]]
  
  inline def isBuilderOutput(obj: Any): /* is @angular-devkit/architect.@angular-devkit/architect/src/api.BuilderOutput */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuilderOutput")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @angular-devkit/architect.@angular-devkit/architect/src/api.BuilderOutput */ Boolean]
  
  inline def scheduleTargetAndForget(context: BuilderContext, target: Target): Observable_[BuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleTargetAndForget")(context.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuilderOutput]]
  inline def scheduleTargetAndForget(context: BuilderContext, target: Target, overrides: Unit, scheduleOptions: ScheduleOptions): Observable_[BuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleTargetAndForget")(context.asInstanceOf[js.Any], target.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any], scheduleOptions.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuilderOutput]]
  inline def scheduleTargetAndForget(context: BuilderContext, target: Target, overrides: JsonObject): Observable_[BuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleTargetAndForget")(context.asInstanceOf[js.Any], target.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuilderOutput]]
  inline def scheduleTargetAndForget(context: BuilderContext, target: Target, overrides: JsonObject, scheduleOptions: ScheduleOptions): Observable_[BuilderOutput] = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleTargetAndForget")(context.asInstanceOf[js.Any], target.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any], scheduleOptions.asInstanceOf[js.Any])).asInstanceOf[Observable_[BuilderOutput]]
  
  inline def targetFromTargetString(str: String): Target = ^.asInstanceOf[js.Dynamic].applyDynamic("targetFromTargetString")(str.asInstanceOf[js.Any]).asInstanceOf[Target]
  
  inline def targetStringFromTarget(param0: Target): String = ^.asInstanceOf[js.Dynamic].applyDynamic("targetStringFromTarget")(param0.asInstanceOf[js.Any]).asInstanceOf[String]
}
