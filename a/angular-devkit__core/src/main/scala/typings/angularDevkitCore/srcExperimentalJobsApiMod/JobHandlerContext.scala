package typings.angularDevkitCore.srcExperimentalJobsApiMod

import typings.angularDevkitCore.srcJsonUtilsMod.JsonValue
import typings.rxjs.mod.Observable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobHandlerContext[MinimumArgumentValueT /* <: JsonValue */, MinimumInputValueT /* <: JsonValue */, MinimumOutputValueT /* <: JsonValue */] extends StObject {
  
  val dependencies: js.Array[Job[JsonValue, JsonValue, JsonValue]]
  
  val description: JobDescription
  
  val inboundBus: Observable_[JobInboundMessage[MinimumInputValueT]]
  
  val scheduler: Scheduler[JsonValue, JsonValue, JsonValue]
}
object JobHandlerContext {
  
  inline def apply[MinimumArgumentValueT /* <: JsonValue */, MinimumInputValueT /* <: JsonValue */, MinimumOutputValueT /* <: JsonValue */](
    dependencies: js.Array[Job[JsonValue, JsonValue, JsonValue]],
    description: JobDescription,
    inboundBus: Observable_[JobInboundMessage[MinimumInputValueT]],
    scheduler: Scheduler[JsonValue, JsonValue, JsonValue]
  ): JobHandlerContext[MinimumArgumentValueT, MinimumInputValueT, MinimumOutputValueT] = {
    val __obj = js.Dynamic.literal(dependencies = dependencies.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], inboundBus = inboundBus.asInstanceOf[js.Any], scheduler = scheduler.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobHandlerContext[MinimumArgumentValueT, MinimumInputValueT, MinimumOutputValueT]]
  }
  
  extension [Self <: JobHandlerContext[?, ?, ?], MinimumArgumentValueT /* <: JsonValue */, MinimumInputValueT /* <: JsonValue */, MinimumOutputValueT /* <: JsonValue */](x: Self & (JobHandlerContext[MinimumArgumentValueT, MinimumInputValueT, MinimumOutputValueT])) {
    
    inline def setDependencies(value: js.Array[Job[JsonValue, JsonValue, JsonValue]]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesVarargs(value: (Job[JsonValue, JsonValue, JsonValue])*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setDescription(value: JobDescription): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setInboundBus(value: Observable_[JobInboundMessage[MinimumInputValueT]]): Self = StObject.set(x, "inboundBus", value.asInstanceOf[js.Any])
    
    inline def setScheduler(value: Scheduler[JsonValue, JsonValue, JsonValue]): Self = StObject.set(x, "scheduler", value.asInstanceOf[js.Any])
  }
}
