package typings.awsSdk.clientsSecurityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsOpenSearchServiceDomainAdvancedSecurityOptionsDetails extends StObject {
  
  /**
    * Enables fine-grained access control. 
    */
  var Enabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Enables the internal user database. 
    */
  var InternalUserDatabaseEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specifies information about the master user of the domain. 
    */
  var MasterUserOptions: js.UndefOr[AwsOpenSearchServiceDomainMasterUserOptionsDetails] = js.undefined
}
object AwsOpenSearchServiceDomainAdvancedSecurityOptionsDetails {
  
  inline def apply(): AwsOpenSearchServiceDomainAdvancedSecurityOptionsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsOpenSearchServiceDomainAdvancedSecurityOptionsDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AwsOpenSearchServiceDomainAdvancedSecurityOptionsDetails] (val x: Self) extends AnyVal {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "Enabled", js.undefined)
    
    inline def setInternalUserDatabaseEnabled(value: Boolean): Self = StObject.set(x, "InternalUserDatabaseEnabled", value.asInstanceOf[js.Any])
    
    inline def setInternalUserDatabaseEnabledUndefined: Self = StObject.set(x, "InternalUserDatabaseEnabled", js.undefined)
    
    inline def setMasterUserOptions(value: AwsOpenSearchServiceDomainMasterUserOptionsDetails): Self = StObject.set(x, "MasterUserOptions", value.asInstanceOf[js.Any])
    
    inline def setMasterUserOptionsUndefined: Self = StObject.set(x, "MasterUserOptions", js.undefined)
  }
}
