package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LicenseSpecification extends StObject {
  
  /**
    * Scope of AMI associations. The possible value is cross-account.
    */
  var AmiAssociationScope: js.UndefOr[String] = js.undefined
  
  /**
    * Amazon Resource Name (ARN) of the license configuration.
    */
  var LicenseConfigurationArn: String
}
object LicenseSpecification {
  
  inline def apply(LicenseConfigurationArn: String): LicenseSpecification = {
    val __obj = js.Dynamic.literal(LicenseConfigurationArn = LicenseConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LicenseSpecification]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LicenseSpecification] (val x: Self) extends AnyVal {
    
    inline def setAmiAssociationScope(value: String): Self = StObject.set(x, "AmiAssociationScope", value.asInstanceOf[js.Any])
    
    inline def setAmiAssociationScopeUndefined: Self = StObject.set(x, "AmiAssociationScope", js.undefined)
    
    inline def setLicenseConfigurationArn(value: String): Self = StObject.set(x, "LicenseConfigurationArn", value.asInstanceOf[js.Any])
  }
}
