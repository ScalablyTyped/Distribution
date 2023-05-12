package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TLSInspectionConfigurationMetadata extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the TLS inspection configuration.
    */
  var Arn: js.UndefOr[ResourceArn] = js.undefined
  
  /**
    * The descriptive name of the TLS inspection configuration. You can't change the name of a TLS inspection configuration after you create it.
    */
  var Name: js.UndefOr[ResourceName] = js.undefined
}
object TLSInspectionConfigurationMetadata {
  
  inline def apply(): TLSInspectionConfigurationMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TLSInspectionConfigurationMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TLSInspectionConfigurationMetadata] (val x: Self) extends AnyVal {
    
    inline def setArn(value: ResourceArn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setName(value: ResourceName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
  }
}
