package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LDAPSSettingInfo extends StObject {
  
  /**
    * The state of the LDAPS settings.
    */
  var LDAPSStatus: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.LDAPSStatus] = js.undefined
  
  /**
    * Describes a state change for LDAPS.
    */
  var LDAPSStatusReason: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.LDAPSStatusReason] = js.undefined
  
  /**
    * The date and time when the LDAPS settings were last updated.
    */
  var LastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
}
object LDAPSSettingInfo {
  
  inline def apply(): LDAPSSettingInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LDAPSSettingInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LDAPSSettingInfo] (val x: Self) extends AnyVal {
    
    inline def setLDAPSStatus(value: LDAPSStatus): Self = StObject.set(x, "LDAPSStatus", value.asInstanceOf[js.Any])
    
    inline def setLDAPSStatusReason(value: LDAPSStatusReason): Self = StObject.set(x, "LDAPSStatusReason", value.asInstanceOf[js.Any])
    
    inline def setLDAPSStatusReasonUndefined: Self = StObject.set(x, "LDAPSStatusReason", js.undefined)
    
    inline def setLDAPSStatusUndefined: Self = StObject.set(x, "LDAPSStatus", js.undefined)
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "LastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "LastUpdatedDateTime", js.undefined)
  }
}
