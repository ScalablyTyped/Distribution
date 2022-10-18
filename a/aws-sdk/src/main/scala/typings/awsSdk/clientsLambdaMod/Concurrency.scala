package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Concurrency extends StObject {
  
  /**
    * The number of concurrent executions that are reserved for this function. For more information, see Managing Concurrency.
    */
  var ReservedConcurrentExecutions: js.UndefOr[typings.awsSdk.clientsLambdaMod.ReservedConcurrentExecutions] = js.undefined
}
object Concurrency {
  
  inline def apply(): Concurrency = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Concurrency]
  }
  
  extension [Self <: Concurrency](x: Self) {
    
    inline def setReservedConcurrentExecutions(value: ReservedConcurrentExecutions): Self = StObject.set(x, "ReservedConcurrentExecutions", value.asInstanceOf[js.Any])
    
    inline def setReservedConcurrentExecutionsUndefined: Self = StObject.set(x, "ReservedConcurrentExecutions", js.undefined)
  }
}
