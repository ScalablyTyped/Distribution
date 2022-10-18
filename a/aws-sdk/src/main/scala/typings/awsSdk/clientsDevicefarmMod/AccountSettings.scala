package typings.awsSdk.clientsDevicefarmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccountSettings extends StObject {
  
  /**
    * The AWS account number specified in the AccountSettings container.
    */
  var awsAccountNumber: js.UndefOr[AWSAccountNumber] = js.undefined
  
  /**
    * The default number of minutes (at the account level) a test run executes before it times out. The default value is 150 minutes.
    */
  var defaultJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined
  
  /**
    * The maximum number of minutes a test run executes before it times out.
    */
  var maxJobTimeoutMinutes: js.UndefOr[JobTimeoutMinutes] = js.undefined
  
  /**
    * The maximum number of device slots that the AWS account can purchase. Each maximum is expressed as an offering-id:number pair, where the offering-id represents one of the IDs returned by the ListOfferings command.
    */
  var maxSlots: js.UndefOr[MaxSlotMap] = js.undefined
  
  /**
    * When set to true, for private devices, Device Farm does not sign your app again. For public devices, Device Farm always signs your apps again. For more information about how Device Farm re-signs your apps, see Do you modify my app? in the AWS Device Farm FAQs.
    */
  var skipAppResign: js.UndefOr[SkipAppResign] = js.undefined
  
  /**
    * Information about an AWS account's usage of free trial device minutes.
    */
  var trialMinutes: js.UndefOr[TrialMinutes] = js.undefined
  
  /**
    * Returns the unmetered devices you have purchased or want to purchase.
    */
  var unmeteredDevices: js.UndefOr[PurchasedDevicesMap] = js.undefined
  
  /**
    * Returns the unmetered remote access devices you have purchased or want to purchase.
    */
  var unmeteredRemoteAccessDevices: js.UndefOr[PurchasedDevicesMap] = js.undefined
}
object AccountSettings {
  
  inline def apply(): AccountSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccountSettings]
  }
  
  extension [Self <: AccountSettings](x: Self) {
    
    inline def setAwsAccountNumber(value: AWSAccountNumber): Self = StObject.set(x, "awsAccountNumber", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountNumberUndefined: Self = StObject.set(x, "awsAccountNumber", js.undefined)
    
    inline def setDefaultJobTimeoutMinutes(value: JobTimeoutMinutes): Self = StObject.set(x, "defaultJobTimeoutMinutes", value.asInstanceOf[js.Any])
    
    inline def setDefaultJobTimeoutMinutesUndefined: Self = StObject.set(x, "defaultJobTimeoutMinutes", js.undefined)
    
    inline def setMaxJobTimeoutMinutes(value: JobTimeoutMinutes): Self = StObject.set(x, "maxJobTimeoutMinutes", value.asInstanceOf[js.Any])
    
    inline def setMaxJobTimeoutMinutesUndefined: Self = StObject.set(x, "maxJobTimeoutMinutes", js.undefined)
    
    inline def setMaxSlots(value: MaxSlotMap): Self = StObject.set(x, "maxSlots", value.asInstanceOf[js.Any])
    
    inline def setMaxSlotsUndefined: Self = StObject.set(x, "maxSlots", js.undefined)
    
    inline def setSkipAppResign(value: SkipAppResign): Self = StObject.set(x, "skipAppResign", value.asInstanceOf[js.Any])
    
    inline def setSkipAppResignUndefined: Self = StObject.set(x, "skipAppResign", js.undefined)
    
    inline def setTrialMinutes(value: TrialMinutes): Self = StObject.set(x, "trialMinutes", value.asInstanceOf[js.Any])
    
    inline def setTrialMinutesUndefined: Self = StObject.set(x, "trialMinutes", js.undefined)
    
    inline def setUnmeteredDevices(value: PurchasedDevicesMap): Self = StObject.set(x, "unmeteredDevices", value.asInstanceOf[js.Any])
    
    inline def setUnmeteredDevicesUndefined: Self = StObject.set(x, "unmeteredDevices", js.undefined)
    
    inline def setUnmeteredRemoteAccessDevices(value: PurchasedDevicesMap): Self = StObject.set(x, "unmeteredRemoteAccessDevices", value.asInstanceOf[js.Any])
    
    inline def setUnmeteredRemoteAccessDevicesUndefined: Self = StObject.set(x, "unmeteredRemoteAccessDevices", js.undefined)
  }
}
