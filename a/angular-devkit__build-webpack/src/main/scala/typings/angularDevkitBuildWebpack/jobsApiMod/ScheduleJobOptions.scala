package typings.angularDevkitBuildWebpack.jobsApiMod

import typings.angularDevkitBuildWebpack.utilsMod.JsonValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScheduleJobOptions extends StObject {
  
  /**
    * Jobs that need to finish before scheduling this job. These dependencies will be passed
    * to the job itself in its context.
    */
  var dependencies: js.UndefOr[
    (Job[JsonValue, JsonValue, JsonValue]) | (js.Array[Job[JsonValue, JsonValue, JsonValue]])
  ] = js.undefined
}
object ScheduleJobOptions {
  
  inline def apply(): ScheduleJobOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduleJobOptions]
  }
  
  extension [Self <: ScheduleJobOptions](x: Self) {
    
    inline def setDependencies(value: (Job[JsonValue, JsonValue, JsonValue]) | (js.Array[Job[JsonValue, JsonValue, JsonValue]])): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: (Job[JsonValue, JsonValue, JsonValue])*): Self = StObject.set(x, "dependencies", js.Array(value*))
  }
}
