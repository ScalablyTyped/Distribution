package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlacementStrategy extends StObject {
  
  /**
    * The field to apply the placement strategy against. For the spread placement strategy, valid values are instanceId (or host, which has the same effect), or any platform or custom attribute that is applied to a container instance, such as attribute:ecs.availability-zone. For the binpack placement strategy, valid values are cpu and memory. For the random placement strategy, this field is not used. 
    */
  var field: js.UndefOr[PlacementStrategyField] = js.undefined
  
  /**
    * The type of placement strategy. The random placement strategy randomly places tasks on available candidates. The spread placement strategy spreads placement across available candidates evenly based on the field parameter. The binpack strategy places tasks on available candidates that have the least available amount of the resource that is specified with the field parameter. For example, if you binpack on memory, a task is placed on the instance with the least amount of remaining memory (but still enough to run the task). 
    */
  var `type`: js.UndefOr[PlacementStrategyType] = js.undefined
}
object PlacementStrategy {
  
  inline def apply(): PlacementStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlacementStrategy]
  }
  
  extension [Self <: PlacementStrategy](x: Self) {
    
    inline def setField(value: PlacementStrategyField): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setType(value: PlacementStrategyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
