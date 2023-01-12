package typings.angularDevkitArchitect

import typings.angularDevkitArchitect.srcApiMod.BuilderInfo
import typings.angularDevkitArchitect.srcApiMod.BuilderRun
import typings.angularDevkitArchitect.srcApiMod.Target
import typings.angularDevkitArchitect.srcInternalMod.ArchitectHost
import typings.angularDevkitCore.mod.logging.Logger
import typings.angularDevkitCore.srcAnalyticsApiMod.Analytics
import typings.angularDevkitCore.srcExperimentalJobsApiMod.JobName
import typings.angularDevkitCore.srcExperimentalJobsApiMod.Registry
import typings.angularDevkitCore.srcJsonSchemaInterfaceMod.SchemaRegistry
import typings.angularDevkitCore.srcJsonUtilsMod.JsonObject
import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcArchitectMod {
  
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
    
    def has(name: JobName): Observable_[Boolean] = js.native
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScheduleOptions] (val x: Self) extends AnyVal {
      
      inline def setAnalytics(value: Analytics): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
      
      inline def setAnalyticsUndefined: Self = StObject.set(x, "analytics", js.undefined)
      
      inline def setLogger(value: Logger): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
    }
  }
}
