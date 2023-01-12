package typings.awsSdk.clientsCodedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TimeBasedCanary extends StObject {
  
  /**
    * The number of minutes between the first and second traffic shifts of a TimeBasedCanary deployment.
    */
  var canaryInterval: js.UndefOr[WaitTimeInMins] = js.undefined
  
  /**
    * The percentage of traffic to shift in the first increment of a TimeBasedCanary deployment.
    */
  var canaryPercentage: js.UndefOr[Percentage] = js.undefined
}
object TimeBasedCanary {
  
  inline def apply(): TimeBasedCanary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TimeBasedCanary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TimeBasedCanary] (val x: Self) extends AnyVal {
    
    inline def setCanaryInterval(value: WaitTimeInMins): Self = StObject.set(x, "canaryInterval", value.asInstanceOf[js.Any])
    
    inline def setCanaryIntervalUndefined: Self = StObject.set(x, "canaryInterval", js.undefined)
    
    inline def setCanaryPercentage(value: Percentage): Self = StObject.set(x, "canaryPercentage", value.asInstanceOf[js.Any])
    
    inline def setCanaryPercentageUndefined: Self = StObject.set(x, "canaryPercentage", js.undefined)
  }
}
