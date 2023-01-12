package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsJobRateIncreaseCriteria extends StObject {
  
  /**
    * When this number of things have been notified, it will initiate an increase in the rollout rate.
    */
  var numberOfNotifiedThings: js.UndefOr[AwsJobRateIncreaseCriteriaNumberOfThings] = js.undefined
  
  /**
    * When this number of things have succeeded in their job execution, it will initiate an increase in the rollout rate.
    */
  var numberOfSucceededThings: js.UndefOr[AwsJobRateIncreaseCriteriaNumberOfThings] = js.undefined
}
object AwsJobRateIncreaseCriteria {
  
  inline def apply(): AwsJobRateIncreaseCriteria = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsJobRateIncreaseCriteria]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsJobRateIncreaseCriteria] (val x: Self) extends AnyVal {
    
    inline def setNumberOfNotifiedThings(value: AwsJobRateIncreaseCriteriaNumberOfThings): Self = StObject.set(x, "numberOfNotifiedThings", value.asInstanceOf[js.Any])
    
    inline def setNumberOfNotifiedThingsUndefined: Self = StObject.set(x, "numberOfNotifiedThings", js.undefined)
    
    inline def setNumberOfSucceededThings(value: AwsJobRateIncreaseCriteriaNumberOfThings): Self = StObject.set(x, "numberOfSucceededThings", value.asInstanceOf[js.Any])
    
    inline def setNumberOfSucceededThingsUndefined: Self = StObject.set(x, "numberOfSucceededThings", js.undefined)
  }
}
