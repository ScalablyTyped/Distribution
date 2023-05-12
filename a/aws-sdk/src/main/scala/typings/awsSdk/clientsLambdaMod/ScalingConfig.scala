package typings.awsSdk.clientsLambdaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScalingConfig extends StObject {
  
  /**
    * Limits the number of concurrent instances that the Amazon SQS event source can invoke.
    */
  var MaximumConcurrency: js.UndefOr[typings.awsSdk.clientsLambdaMod.MaximumConcurrency] = js.undefined
}
object ScalingConfig {
  
  inline def apply(): ScalingConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScalingConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ScalingConfig] (val x: Self) extends AnyVal {
    
    inline def setMaximumConcurrency(value: MaximumConcurrency): Self = StObject.set(x, "MaximumConcurrency", value.asInstanceOf[js.Any])
    
    inline def setMaximumConcurrencyUndefined: Self = StObject.set(x, "MaximumConcurrency", js.undefined)
  }
}
