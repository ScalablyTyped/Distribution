package typings.angularDevkitArchitect

import typings.angularDevkitArchitect.apiMod.BuilderContext
import typings.angularDevkitArchitect.apiMod.BuilderHandlerFn
import typings.angularDevkitArchitect.apiMod.BuilderInfo
import typings.angularDevkitArchitect.apiMod.BuilderOutput
import typings.angularDevkitArchitect.apiMod.ScheduleOptions
import typings.angularDevkitArchitect.apiMod.Target
import typings.angularDevkitArchitect.internalMod.ArchitectHost
import typings.angularDevkitArchitect.internalMod.Builder
import typings.angularDevkitArchitect.progressSchemaMod.State
import typings.angularDevkitCore.interfaceMod.SchemaRegistry
import typings.angularDevkitCore.jobsApiMod.Registry
import typings.angularDevkitCore.utilsMod.JsonObject
import typings.angularDevkitCore.utilsMod.JsonValue
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
    extends typings.angularDevkitArchitect.architectMod.Architect {
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
    
    /* "error" */ val Error: typings.angularDevkitArchitect.progressSchemaMod.State.Error & String = js.native
    
    /* "running" */ val Running: typings.angularDevkitArchitect.progressSchemaMod.State.Running & String = js.native
    
    /* "stopped" */ val Stopped: typings.angularDevkitArchitect.progressSchemaMod.State.Stopped & String = js.native
    
    /* "waiting" */ val Waiting: typings.angularDevkitArchitect.progressSchemaMod.State.Waiting & String = js.native
  }
  
  inline def createBuilder[OptT, OutT /* <: BuilderOutput */](fn: BuilderHandlerFn[OptT]): Builder[OptT & JsonObject] = ^.asInstanceOf[js.Dynamic].applyDynamic("createBuilder")(fn.asInstanceOf[js.Any]).asInstanceOf[Builder[OptT & JsonObject]]
  
  inline def fromAsyncIterable[T](iterable: AsyncIterable[T]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromAsyncIterable")(iterable.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def isBuilderOutput(obj: Any): /* is @angular-devkit/architect.@angular-devkit/architect/src/api.BuilderOutput */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBuilderOutput")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @angular-devkit/architect.@angular-devkit/architect/src/api.BuilderOutput */ Boolean]
  
  inline def scheduleTargetAndForget(context: BuilderContext, target: Target): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleTargetAndForget")(context.asInstanceOf[js.Any], target.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def scheduleTargetAndForget(context: BuilderContext, target: Target, overrides: Unit, scheduleOptions: ScheduleOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleTargetAndForget")(context.asInstanceOf[js.Any], target.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any], scheduleOptions.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def scheduleTargetAndForget(context: BuilderContext, target: Target, overrides: JsonObject): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleTargetAndForget")(context.asInstanceOf[js.Any], target.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def scheduleTargetAndForget(context: BuilderContext, target: Target, overrides: JsonObject, scheduleOptions: ScheduleOptions): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("scheduleTargetAndForget")(context.asInstanceOf[js.Any], target.asInstanceOf[js.Any], overrides.asInstanceOf[js.Any], scheduleOptions.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def targetFromTargetString(str: String): Target = ^.asInstanceOf[js.Dynamic].applyDynamic("targetFromTargetString")(str.asInstanceOf[js.Any]).asInstanceOf[Target]
  
  inline def targetStringFromTarget(hasProjectTargetConfiguration: Target): String = ^.asInstanceOf[js.Dynamic].applyDynamic("targetStringFromTarget")(hasProjectTargetConfiguration.asInstanceOf[js.Any]).asInstanceOf[String]
}
