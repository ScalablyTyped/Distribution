package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDistributionConfigurationResponse extends StObject {
  
  /**
    * The distribution configuration object.
    */
  var distributionConfiguration: js.UndefOr[DistributionConfiguration] = js.undefined
  
  /**
    * The request ID that uniquely identifies this request.
    */
  var requestId: js.UndefOr[NonEmptyString] = js.undefined
}
object GetDistributionConfigurationResponse {
  
  inline def apply(): GetDistributionConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDistributionConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetDistributionConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setDistributionConfiguration(value: DistributionConfiguration): Self = StObject.set(x, "distributionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setDistributionConfigurationUndefined: Self = StObject.set(x, "distributionConfiguration", js.undefined)
    
    inline def setRequestId(value: NonEmptyString): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
    
    inline def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
  }
}
