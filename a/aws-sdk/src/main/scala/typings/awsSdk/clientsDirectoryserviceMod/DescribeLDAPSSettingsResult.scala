package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLDAPSSettingsResult extends StObject {
  
  /**
    * Information about LDAP security for the specified directory, including status of enablement, state last updated date time, and the reason for the state.
    */
  var LDAPSSettingsInfo: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.LDAPSSettingsInfo] = js.undefined
  
  /**
    * The next token used to retrieve the LDAPS settings if the number of setting types exceeds page limit and there is another page.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.NextToken] = js.undefined
}
object DescribeLDAPSSettingsResult {
  
  inline def apply(): DescribeLDAPSSettingsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLDAPSSettingsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeLDAPSSettingsResult] (val x: Self) extends AnyVal {
    
    inline def setLDAPSSettingsInfo(value: LDAPSSettingsInfo): Self = StObject.set(x, "LDAPSSettingsInfo", value.asInstanceOf[js.Any])
    
    inline def setLDAPSSettingsInfoUndefined: Self = StObject.set(x, "LDAPSSettingsInfo", js.undefined)
    
    inline def setLDAPSSettingsInfoVarargs(value: LDAPSSettingInfo*): Self = StObject.set(x, "LDAPSSettingsInfo", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
