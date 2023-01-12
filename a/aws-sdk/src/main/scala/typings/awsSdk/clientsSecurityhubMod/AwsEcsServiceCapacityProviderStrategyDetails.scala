package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsEcsServiceCapacityProviderStrategyDetails extends StObject {
  
  /**
    * The minimum number of tasks to run on the capacity provider. Only one strategy item can specify a value for Base. The value must be between 0 and 100000.
    */
  var Base: js.UndefOr[Integer] = js.undefined
  
  /**
    * The short name of the capacity provider.
    */
  var CapacityProvider: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The relative percentage of the total number of tasks that should use the capacity provider. If no weight is specified, the default value is 0. At least one capacity provider must have a weight greater than 0. The value can be between 0 and 1000.
    */
  var Weight: js.UndefOr[Integer] = js.undefined
}
object AwsEcsServiceCapacityProviderStrategyDetails {
  
  inline def apply(): AwsEcsServiceCapacityProviderStrategyDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsEcsServiceCapacityProviderStrategyDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsEcsServiceCapacityProviderStrategyDetails] (val x: Self) extends AnyVal {
    
    inline def setBase(value: Integer): Self = StObject.set(x, "Base", value.asInstanceOf[js.Any])
    
    inline def setBaseUndefined: Self = StObject.set(x, "Base", js.undefined)
    
    inline def setCapacityProvider(value: NonEmptyString): Self = StObject.set(x, "CapacityProvider", value.asInstanceOf[js.Any])
    
    inline def setCapacityProviderUndefined: Self = StObject.set(x, "CapacityProvider", js.undefined)
    
    inline def setWeight(value: Integer): Self = StObject.set(x, "Weight", value.asInstanceOf[js.Any])
    
    inline def setWeightUndefined: Self = StObject.set(x, "Weight", js.undefined)
  }
}
