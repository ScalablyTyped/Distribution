package typings.awsSdk.clientsConfigserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRemediationConfigurationsResponse extends StObject {
  
  /**
    * Returns a remediation configuration object.
    */
  var RemediationConfigurations: js.UndefOr[typings.awsSdk.clientsConfigserviceMod.RemediationConfigurations] = js.undefined
}
object DescribeRemediationConfigurationsResponse {
  
  inline def apply(): DescribeRemediationConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeRemediationConfigurationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeRemediationConfigurationsResponse] (val x: Self) extends AnyVal {
    
    inline def setRemediationConfigurations(value: RemediationConfigurations): Self = StObject.set(x, "RemediationConfigurations", value.asInstanceOf[js.Any])
    
    inline def setRemediationConfigurationsUndefined: Self = StObject.set(x, "RemediationConfigurations", js.undefined)
    
    inline def setRemediationConfigurationsVarargs(value: RemediationConfiguration*): Self = StObject.set(x, "RemediationConfigurations", js.Array(value*))
  }
}
