package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRemediationConfigurationsRequest extends StObject {
  
  /**
    * A list of remediation configuration objects.
    */
  var RemediationConfigurations: typings.awsSdk.clientsConfigserviceMod.RemediationConfigurations
}
object PutRemediationConfigurationsRequest {
  
  inline def apply(RemediationConfigurations: RemediationConfigurations): PutRemediationConfigurationsRequest = {
    val __obj = js.Dynamic.literal(RemediationConfigurations = RemediationConfigurations.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRemediationConfigurationsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutRemediationConfigurationsRequest] (val x: Self) extends AnyVal {
    
    inline def setRemediationConfigurations(value: RemediationConfigurations): Self = StObject.set(x, "RemediationConfigurations", value.asInstanceOf[js.Any])
    
    inline def setRemediationConfigurationsVarargs(value: RemediationConfiguration*): Self = StObject.set(x, "RemediationConfigurations", js.Array(value*))
  }
}
