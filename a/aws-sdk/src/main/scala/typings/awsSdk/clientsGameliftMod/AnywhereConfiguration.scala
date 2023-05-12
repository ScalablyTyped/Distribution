package typings.awsSdk.clientsGameliftMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AnywhereConfiguration extends StObject {
  
  /**
    * The cost to run your fleet per hour. Amazon GameLift uses the provided cost of your fleet to balance usage in queues. For more information about queues, see Setting up queues in the Amazon GameLift Developer Guide.
    */
  var Cost: NonNegativeLimitedLengthDouble
}
object AnywhereConfiguration {
  
  inline def apply(Cost: NonNegativeLimitedLengthDouble): AnywhereConfiguration = {
    val __obj = js.Dynamic.literal(Cost = Cost.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnywhereConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AnywhereConfiguration] (val x: Self) extends AnyVal {
    
    inline def setCost(value: NonNegativeLimitedLengthDouble): Self = StObject.set(x, "Cost", value.asInstanceOf[js.Any])
  }
}
