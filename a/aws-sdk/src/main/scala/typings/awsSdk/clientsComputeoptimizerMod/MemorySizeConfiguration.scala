package typings.awsSdk.clientsComputeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemorySizeConfiguration extends StObject {
  
  /**
    *  The amount of memory in the container. 
    */
  var memory: js.UndefOr[NullableMemory] = js.undefined
  
  /**
    *  The limit of memory reserve for the container. 
    */
  var memoryReservation: js.UndefOr[NullableMemoryReservation] = js.undefined
}
object MemorySizeConfiguration {
  
  inline def apply(): MemorySizeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemorySizeConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemorySizeConfiguration] (val x: Self) extends AnyVal {
    
    inline def setMemory(value: NullableMemory): Self = StObject.set(x, "memory", value.asInstanceOf[js.Any])
    
    inline def setMemoryReservation(value: NullableMemoryReservation): Self = StObject.set(x, "memoryReservation", value.asInstanceOf[js.Any])
    
    inline def setMemoryReservationUndefined: Self = StObject.set(x, "memoryReservation", js.undefined)
    
    inline def setMemoryUndefined: Self = StObject.set(x, "memory", js.undefined)
  }
}
