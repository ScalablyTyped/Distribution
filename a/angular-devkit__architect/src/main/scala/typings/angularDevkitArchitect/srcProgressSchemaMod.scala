package typings.angularDevkitArchitect

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcProgressSchemaMod {
  
  @js.native
  sealed trait State extends StObject
  @JSImport("@angular-devkit/architect/src/progress-schema", "State")
  @js.native
  object State extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[State & String] = js.native
    
    @js.native
    sealed trait Error
      extends StObject
         with State
    /* "error" */ val Error: typings.angularDevkitArchitect.srcProgressSchemaMod.State.Error & String = js.native
    
    @js.native
    sealed trait Running
      extends StObject
         with State
    /* "running" */ val Running: typings.angularDevkitArchitect.srcProgressSchemaMod.State.Running & String = js.native
    
    @js.native
    sealed trait Stopped
      extends StObject
         with State
    /* "stopped" */ val Stopped: typings.angularDevkitArchitect.srcProgressSchemaMod.State.Stopped & String = js.native
    
    @js.native
    sealed trait Waiting
      extends StObject
         with State
    /* "waiting" */ val Waiting: typings.angularDevkitArchitect.srcProgressSchemaMod.State.Waiting & String = js.native
  }
  
  trait Schema extends StObject {
    
    var builder: StringDictionary[Any]
    
    var current: js.UndefOr[Double] = js.undefined
    
    var error: js.UndefOr[Any] = js.undefined
    
    var id: Double
    
    var state: State
    
    var status: js.UndefOr[String] = js.undefined
    
    var target: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    var total: js.UndefOr[Double] = js.undefined
  }
  object Schema {
    
    inline def apply(builder: StringDictionary[Any], id: Double, state: State): Schema = {
      val __obj = js.Dynamic.literal(builder = builder.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
      __obj.asInstanceOf[Schema]
    }
    
    extension [Self <: Schema](x: Self) {
      
      inline def setBuilder(value: StringDictionary[Any]): Self = StObject.set(x, "builder", value.asInstanceOf[js.Any])
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setCurrentUndefined: Self = StObject.set(x, "current", js.undefined)
      
      inline def setError(value: Any): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
      
      inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      inline def setTarget(value: StringDictionary[Any]): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
    }
  }
}
