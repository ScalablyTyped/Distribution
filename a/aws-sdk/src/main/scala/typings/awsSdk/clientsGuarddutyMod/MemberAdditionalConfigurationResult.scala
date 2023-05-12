package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MemberAdditionalConfigurationResult extends StObject {
  
  /**
    * Indicates the name of the additional configuration that is set for the member account.
    */
  var Name: js.UndefOr[OrgFeatureAdditionalConfiguration] = js.undefined
  
  /**
    * Indicates the status of the additional configuration that is set for the member account.
    */
  var Status: js.UndefOr[FeatureStatus] = js.undefined
  
  /**
    * The timestamp at which the additional configuration was set for the member account. This is in UTC format.
    */
  var UpdatedAt: js.UndefOr[js.Date] = js.undefined
}
object MemberAdditionalConfigurationResult {
  
  inline def apply(): MemberAdditionalConfigurationResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MemberAdditionalConfigurationResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MemberAdditionalConfigurationResult] (val x: Self) extends AnyVal {
    
    inline def setName(value: OrgFeatureAdditionalConfiguration): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: FeatureStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setUpdatedAt(value: js.Date): Self = StObject.set(x, "UpdatedAt", value.asInstanceOf[js.Any])
    
    inline def setUpdatedAtUndefined: Self = StObject.set(x, "UpdatedAt", js.undefined)
  }
}
