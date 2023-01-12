package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRetentionConfigurationResponse extends StObject {
  
  /**
    * Returns a retention configuration object.
    */
  var RetentionConfiguration: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.RetentionConfiguration] = js.undefined
}
object PutRetentionConfigurationResponse {
  
  inline def apply(): PutRetentionConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutRetentionConfigurationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutRetentionConfigurationResponse] (val x: Self) extends AnyVal {
    
    inline def setRetentionConfiguration(value: RetentionConfiguration): Self = StObject.set(x, "RetentionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setRetentionConfigurationUndefined: Self = StObject.set(x, "RetentionConfiguration", js.undefined)
  }
}
