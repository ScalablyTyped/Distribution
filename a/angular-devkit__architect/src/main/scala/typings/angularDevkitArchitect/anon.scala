package typings.angularDevkitArchitect

import typings.angularDevkitArchitect.srcApiMod.BuilderInfo
import typings.angularDevkitArchitect.srcApiMod.Target
import typings.angularDevkitArchitect.srcApiMod.TypedBuilderProgress
import typings.angularDevkitArchitect.srcProgressSchemaMod.State.Running
import typings.angularDevkitArchitect.srcProgressSchemaMod.State.Stopped
import typings.angularDevkitArchitect.srcProgressSchemaMod.State.Waiting
import typings.angularDevkitCore.srcExperimentalJobsApiMod.Scheduler
import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import typings.angularDevkitCore.srcLoggerLoggerMod.LoggerApi
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Analytics extends StObject {
    
    var analytics: js.UndefOr[typings.angularDevkitCore.srcAnalyticsApiMod.Analytics] = js.undefined
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Analytics] (val x: Self) extends AnyVal {
      
      inline def setAnalytics(value: typings.angularDevkitCore.srcAnalyticsApiMod.Analytics): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Builder] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Current] (val x: Self) extends AnyVal {
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setState(value: Running): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
  
  trait CurrentDirectory extends StObject {
    
    var analytics: js.UndefOr[typings.angularDevkitCore.srcAnalyticsApiMod.Analytics] = js.undefined
    
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CurrentDirectory] (val x: Self) extends AnyVal {
      
      inline def setAnalytics(value: typings.angularDevkitCore.srcAnalyticsApiMod.Analytics): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
      
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
    
    var state: typings.angularDevkitArchitect.srcProgressSchemaMod.State.Error
  }
  object Error {
    
    inline def apply(state: typings.angularDevkitArchitect.srcProgressSchemaMod.State.Error): Error = {
      val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any], error = null)
      __obj.asInstanceOf[Error]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Error] (val x: Self) extends AnyVal {
      
      inline def setError(value: JsonValue): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorNull: Self = StObject.set(x, "error", null)
      
      inline def setState(value: typings.angularDevkitArchitect.srcProgressSchemaMod.State.Error): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Status] (val x: Self) extends AnyVal {
      
      inline def setState(value: Waiting): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    }
  }
}
