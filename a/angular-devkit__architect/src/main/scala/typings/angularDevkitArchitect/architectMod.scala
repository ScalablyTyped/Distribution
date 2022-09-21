package typings.angularDevkitArchitect

import typings.angularDevkitArchitect.apiMod.BuilderInfo
import typings.angularDevkitArchitect.apiMod.BuilderRun
import typings.angularDevkitArchitect.apiMod.Target
import typings.angularDevkitArchitect.internalMod.ArchitectHost
import typings.angularDevkitCore.apiMod.Analytics
import typings.angularDevkitCore.interfaceMod.SchemaRegistry
import typings.angularDevkitCore.jobsApiMod.JobName
import typings.angularDevkitCore.jobsApiMod.Registry
import typings.angularDevkitCore.mod.logging.Logger
import typings.angularDevkitCore.utilsMod.JsonObject
import typings.angularDevkitCore.utilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object architectMod {
  
  @JSImport("@angular-devkit/architect/src/architect", "Architect")
  @js.native
  open class Architect protected () extends StObject {
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
    
    /* private */ var _host: Any = js.native
    
    /* private */ val _infoCache: Any = js.native
    
    /* private */ val _jobCache: Any = js.native
    
    /* private */ val _scheduler: Any = js.native
    
    def has(name: JobName): Any = js.native
    
    def scheduleBuilder(name: String, options: JsonObject): js.Promise[BuilderRun] = js.native
    def scheduleBuilder(name: String, options: JsonObject, scheduleOptions: ScheduleOptions): js.Promise[BuilderRun] = js.native
    
    def scheduleTarget(target: Target): js.Promise[BuilderRun] = js.native
    def scheduleTarget(target: Target, overrides: Unit, scheduleOptions: ScheduleOptions): js.Promise[BuilderRun] = js.native
    def scheduleTarget(target: Target, overrides: JsonObject): js.Promise[BuilderRun] = js.native
    def scheduleTarget(target: Target, overrides: JsonObject, scheduleOptions: ScheduleOptions): js.Promise[BuilderRun] = js.native
  }
  
  trait ScheduleOptions extends StObject {
    
    var analytics: js.UndefOr[Analytics] = js.undefined
    
    var logger: js.UndefOr[Logger] = js.undefined
  }
  object ScheduleOptions {
    
    inline def apply(): ScheduleOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ScheduleOptions]
    }
    
    extension [Self <: ScheduleOptions](x: Self) {
      
      inline def setAnalytics(value: Analytics): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
      
      inline def setAnalyticsUndefined: Self = StObject.set(x, "analytics", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    }
  }
}
