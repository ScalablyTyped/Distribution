package typings.angularDevkitArchitect

import typings.angularDevkitArchitect.apiMod.BuilderInfo
import typings.angularDevkitArchitect.apiMod.Target
import typings.angularDevkitArchitect.apiMod.TypedBuilderProgress
import typings.angularDevkitArchitect.progressSchemaMod.State.Running
import typings.angularDevkitArchitect.progressSchemaMod.State.Stopped
import typings.angularDevkitArchitect.progressSchemaMod.State.Waiting
import typings.angularDevkitCore.jobsApiMod.Scheduler
import typings.angularDevkitCore.loggerLoggerMod.LoggerApi
import typings.angularDevkitCore.utilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Analytics extends StObject {
    
    var analytics: js.UndefOr[typings.angularDevkitCore.apiMod.Analytics] = js.undefined
    
    var currentDirectory: String | js.Promise[String]
    
    var logger: LoggerApi
    
    var scheduler: Scheduler[JsonValue, JsonValue, JsonValue]
    
    var target: js.UndefOr[Target] = js.undefined
    
    var workspaceRoot: String | js.Promise[String]
  }
  object Analytics {
    
    inline def apply(
      currentDirectory: String | js.Promise[String],
      logger: LoggerApi,
      scheduler: Scheduler[JsonValue, JsonValue, JsonValue],
      workspaceRoot: String | js.Promise[String]
    ): Analytics = {
      val __obj = js.Dynamic.literal(currentDirectory = currentDirectory.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], scheduler = scheduler.asInstanceOf[js.Any], workspaceRoot = workspaceRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[Analytics]
    }
    
    extension [Self <: Analytics](x: Self) {
      
      inline def setAnalytics(value: typings.angularDevkitCore.apiMod.Analytics): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
      
      inline def setAnalyticsUndefined: Self = StObject.set(x, "analytics", js.undefined)
      
      inline def setCurrentDirectory(value: String | js.Promise[String]): Self = StObject.set(x, "currentDirectory", value.asInstanceOf[js.Any])
      
      inline def setLogger(value: LoggerApi): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setScheduler(value: Scheduler[JsonValue, JsonValue, JsonValue]): Self = StObject.set(x, "scheduler", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setWorkspaceRoot(value: String | js.Promise[String]): Self = StObject.set(x, "workspaceRoot", value.asInstanceOf[js.Any])
    }
  }
  
  trait Builder extends StObject {
    
    var builder: BuilderInfo
    
    var target: js.UndefOr[Target] = js.undefined
  }
  object Builder {
    
    inline def apply(builder: BuilderInfo): Builder = {
      val __obj = js.Dynamic.literal(builder = builder.asInstanceOf[js.Any])
      __obj.asInstanceOf[Builder]
    }
    
    extension [Self <: Builder](x: Self) {
      
      inline def setBuilder(value: BuilderInfo): Self = StObject.set(x, "builder", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Target): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    }
  }
  
  trait Current
    extends StObject
       with TypedBuilderProgress {
    
    var current: Double
    
    var state: Running
    
    var status: js.UndefOr[String] = js.undefined
    
    var total: js.UndefOr[Double] = js.undefined
  }
  object Current {
    
    inline def apply(current: Double, state: Running): Current = {
      val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Current]
    }
    
    extension [Self <: Current](x: Self) {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setState(value: Running): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
  
  trait CurrentDirectory extends StObject {
    
    var analytics: js.UndefOr[typings.angularDevkitCore.apiMod.Analytics] = js.undefined
    
    var currentDirectory: String | js.Promise[String]
    
    var logger: LoggerApi
    
    var scheduler: Scheduler[JsonValue, JsonValue, JsonValue]
    
    var workspaceRoot: String | js.Promise[String]
  }
  object CurrentDirectory {
    
    inline def apply(
      currentDirectory: String | js.Promise[String],
      logger: LoggerApi,
      scheduler: Scheduler[JsonValue, JsonValue, JsonValue],
      workspaceRoot: String | js.Promise[String]
    ): CurrentDirectory = {
      val __obj = js.Dynamic.literal(currentDirectory = currentDirectory.asInstanceOf[js.Any], logger = logger.asInstanceOf[js.Any], scheduler = scheduler.asInstanceOf[js.Any], workspaceRoot = workspaceRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[CurrentDirectory]
    }
    
    extension [Self <: CurrentDirectory](x: Self) {
      
      inline def setAnalytics(value: typings.angularDevkitCore.apiMod.Analytics): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
      
      inline def setAnalyticsUndefined: Self = StObject.set(x, "analytics", js.undefined)
      
      inline def setCurrentDirectory(value: String | js.Promise[String]): Self = StObject.set(x, "currentDirectory", value.asInstanceOf[js.Any])
      
      inline def setLogger(value: LoggerApi): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setScheduler(value: Scheduler[JsonValue, JsonValue, JsonValue]): Self = StObject.set(x, "scheduler", value.asInstanceOf[js.Any])
      
      inline def setWorkspaceRoot(value: String | js.Promise[String]): Self = StObject.set(x, "workspaceRoot", value.asInstanceOf[js.Any])
    }
  }
  
  trait Error
    extends StObject
       with TypedBuilderProgress {
    
    var error: JsonValue
    
    var state: typings.angularDevkitArchitect.progressSchemaMod.State.Error
  }
  object Error {
    
    inline def apply(state: typings.angularDevkitArchitect.progressSchemaMod.State.Error): Error = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], error = null)
      __obj.asInstanceOf[Error]
    }
    
    extension [Self <: Error](x: Self) {
      
      inline def setError(value: JsonValue): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setState(value: typings.angularDevkitArchitect.progressSchemaMod.State.Error): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait State
    extends StObject
       with TypedBuilderProgress {
    
    var state: Stopped
  }
  object State {
    
    inline def apply(state: Stopped): State = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    extension [Self <: State](x: Self) {
      
      inline def setState(value: Stopped): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    }
  }
  
  trait Status
    extends StObject
       with TypedBuilderProgress {
    
    var state: Waiting
    
    var status: js.UndefOr[String] = js.undefined
  }
  object Status {
    
    inline def apply(state: Waiting): Status = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Status]
    }
    
    extension [Self <: Status](x: Self) {
      
      inline def setState(value: Waiting): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
}
