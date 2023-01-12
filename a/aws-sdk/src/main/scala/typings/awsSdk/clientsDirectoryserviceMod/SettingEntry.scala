package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SettingEntry extends StObject {
  
  /**
    * The valid range of values for the directory setting.
    */
  var AllowedValues: js.UndefOr[DirectoryConfigurationSettingAllowedValues] = js.undefined
  
  /**
    * The value of the directory setting that is applied to the directory.
    */
  var AppliedValue: js.UndefOr[DirectoryConfigurationSettingValue] = js.undefined
  
  /**
    * The date and time when the request to update a directory setting was last submitted.
    */
  var LastRequestedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The date and time when the directory setting was last updated.
    */
  var LastUpdatedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The name of the directory setting. For example:  TLS_1_0 
    */
  var Name: js.UndefOr[DirectoryConfigurationSettingName] = js.undefined
  
  /**
    * Details about the status of the request to update the directory setting. If the directory setting is deployed in more than one region, status is returned for the request in each region where the setting is deployed.
    */
  var RequestDetailedStatus: js.UndefOr[DirectoryConfigurationSettingRequestDetailedStatus] = js.undefined
  
  /**
    * The overall status of the request to update the directory setting request. If the directory setting is deployed in more than one region, and the request fails in any region, the overall status is Failed.
    */
  var RequestStatus: js.UndefOr[DirectoryConfigurationStatus] = js.undefined
  
  /**
    * The last status message for the directory status request.
    */
  var RequestStatusMessage: js.UndefOr[DirectoryConfigurationSettingRequestStatusMessage] = js.undefined
  
  /**
    * The value that was last requested for the directory setting.
    */
  var RequestedValue: js.UndefOr[DirectoryConfigurationSettingValue] = js.undefined
  
  /**
    * The type of directory setting. For example, Protocol or Cipher.
    */
  var Type: js.UndefOr[DirectoryConfigurationSettingType] = js.undefined
}
object SettingEntry {
  
  inline def apply(): SettingEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SettingEntry]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SettingEntry] (val x: Self) extends AnyVal {
    
    inline def setAllowedValues(value: DirectoryConfigurationSettingAllowedValues): Self = StObject.set(x, "AllowedValues", value.asInstanceOf[js.Any])
    
    inline def setAllowedValuesUndefined: Self = StObject.set(x, "AllowedValues", js.undefined)
    
    inline def setAppliedValue(value: DirectoryConfigurationSettingValue): Self = StObject.set(x, "AppliedValue", value.asInstanceOf[js.Any])
    
    inline def setAppliedValueUndefined: Self = StObject.set(x, "AppliedValue", js.undefined)
    
    inline def setLastRequestedDateTime(value: js.Date): Self = StObject.set(x, "LastRequestedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastRequestedDateTimeUndefined: Self = StObject.set(x, "LastRequestedDateTime", js.undefined)
    
    inline def setLastUpdatedDateTime(value: js.Date): Self = StObject.set(x, "LastUpdatedDateTime", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedDateTimeUndefined: Self = StObject.set(x, "LastUpdatedDateTime", js.undefined)
    
    inline def setName(value: DirectoryConfigurationSettingName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setRequestDetailedStatus(value: DirectoryConfigurationSettingRequestDetailedStatus): Self = StObject.set(x, "RequestDetailedStatus", value.asInstanceOf[js.Any])
    
    inline def setRequestDetailedStatusUndefined: Self = StObject.set(x, "RequestDetailedStatus", js.undefined)
    
    inline def setRequestStatus(value: DirectoryConfigurationStatus): Self = StObject.set(x, "RequestStatus", value.asInstanceOf[js.Any])
    
    inline def setRequestStatusMessage(value: DirectoryConfigurationSettingRequestStatusMessage): Self = StObject.set(x, "RequestStatusMessage", value.asInstanceOf[js.Any])
    
    inline def setRequestStatusMessageUndefined: Self = StObject.set(x, "RequestStatusMessage", js.undefined)
    
    inline def setRequestStatusUndefined: Self = StObject.set(x, "RequestStatus", js.undefined)
    
    inline def setRequestedValue(value: DirectoryConfigurationSettingValue): Self = StObject.set(x, "RequestedValue", value.asInstanceOf[js.Any])
    
    inline def setRequestedValueUndefined: Self = StObject.set(x, "RequestedValue", js.undefined)
    
    inline def setType(value: DirectoryConfigurationSettingType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
