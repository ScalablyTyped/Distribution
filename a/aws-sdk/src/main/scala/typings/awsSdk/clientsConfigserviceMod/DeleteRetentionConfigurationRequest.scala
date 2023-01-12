package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteRetentionConfigurationRequest extends StObject {
  
  /**
    * The name of the retention configuration to delete.
    */
  var RetentionConfigurationName: typings.awsSdk.clientsConfigserviceMod.RetentionConfigurationName
}
object DeleteRetentionConfigurationRequest {
  
  inline def apply(RetentionConfigurationName: RetentionConfigurationName): DeleteRetentionConfigurationRequest = {
    val __obj = js.Dynamic.literal(RetentionConfigurationName = RetentionConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRetentionConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteRetentionConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setRetentionConfigurationName(value: RetentionConfigurationName): Self = StObject.set(x, "RetentionConfigurationName", value.asInstanceOf[js.Any])
  }
}
