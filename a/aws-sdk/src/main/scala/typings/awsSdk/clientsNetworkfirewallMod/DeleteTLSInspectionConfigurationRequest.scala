package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteTLSInspectionConfigurationRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the TLS inspection configuration. You must specify the ARN or the name, and you can specify both. 
    */
  var TLSInspectionConfigurationArn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The descriptive name of the TLS inspection configuration. You can't change the name of a TLS inspection configuration after you create it. You must specify the ARN or the name, and you can specify both. 
    */
  var TLSInspectionConfigurationName: js.UndefOr[ResourceName] = js.undefined
}
object DeleteTLSInspectionConfigurationRequest {
  
  inline def apply(): DeleteTLSInspectionConfigurationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteTLSInspectionConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteTLSInspectionConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setTLSInspectionConfigurationArn(value: ResourceArn): Self = StObject.set(x, "TLSInspectionConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setTLSInspectionConfigurationArnUndefined: Self = StObject.set(x, "TLSInspectionConfigurationArn", js.undefined)
    
    inline def setTLSInspectionConfigurationName(value: ResourceName): Self = StObject.set(x, "TLSInspectionConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setTLSInspectionConfigurationNameUndefined: Self = StObject.set(x, "TLSInspectionConfigurationName", js.undefined)
  }
}
