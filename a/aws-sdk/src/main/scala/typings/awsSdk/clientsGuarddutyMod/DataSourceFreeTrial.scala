package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DataSourceFreeTrial extends StObject {
  
  /**
    * A value that specifies the number of days left to use each enabled data source.
    */
  var FreeTrialDaysRemaining: js.UndefOr[Integer] = js.undefined
}
object DataSourceFreeTrial {
  
  inline def apply(): DataSourceFreeTrial = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DataSourceFreeTrial]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DataSourceFreeTrial] (val x: Self) extends AnyVal {
    
    inline def setFreeTrialDaysRemaining(value: Integer): Self = StObject.set(x, "FreeTrialDaysRemaining", value.asInstanceOf[js.Any])
    
    inline def setFreeTrialDaysRemainingUndefined: Self = StObject.set(x, "FreeTrialDaysRemaining", js.undefined)
  }
}
