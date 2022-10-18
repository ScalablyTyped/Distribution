package typings.awsSdk.clientsSesv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConfigurationSetRequest extends StObject {
  
  /**
    * The name of the configuration set. The name can contain up to 64 alphanumeric characters, including letters, numbers, hyphens (-) and underscores (_) only.
    */
  var ConfigurationSetName: typings.awsSdk.clientsSesv2Mod.ConfigurationSetName
  
  /**
    * An object that defines the dedicated IP pool that is used to send emails that you send using the configuration set.
    */
  var DeliveryOptions: js.UndefOr[typings.awsSdk.clientsSesv2Mod.DeliveryOptions] = js.undefined
  
  /**
    * An object that defines whether or not Amazon SES collects reputation metrics for the emails that you send that use the configuration set.
    */
  var ReputationOptions: js.UndefOr[typings.awsSdk.clientsSesv2Mod.ReputationOptions] = js.undefined
  
  /**
    * An object that defines whether or not Amazon SES can send email that you send using the configuration set.
    */
  var SendingOptions: js.UndefOr[typings.awsSdk.clientsSesv2Mod.SendingOptions] = js.undefined
  
  var SuppressionOptions: js.UndefOr[typings.awsSdk.clientsSesv2Mod.SuppressionOptions] = js.undefined
  
  /**
    * An array of objects that define the tags (keys and values) to associate with the configuration set.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * An object that defines the open and click tracking options for emails that you send using the configuration set.
    */
  var TrackingOptions: js.UndefOr[typings.awsSdk.clientsSesv2Mod.TrackingOptions] = js.undefined
}
object CreateConfigurationSetRequest {
  
  inline def apply(ConfigurationSetName: ConfigurationSetName): CreateConfigurationSetRequest = {
    val __obj = js.Dynamic.literal(ConfigurationSetName = ConfigurationSetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConfigurationSetRequest]
  }
  
  extension [Self <: CreateConfigurationSetRequest](x: Self) {
    
    inline def setConfigurationSetName(value: ConfigurationSetName): Self = StObject.set(x, "ConfigurationSetName", value.asInstanceOf[js.Any])
    
    inline def setDeliveryOptions(value: DeliveryOptions): Self = StObject.set(x, "DeliveryOptions", value.asInstanceOf[js.Any])
    
    inline def setDeliveryOptionsUndefined: Self = StObject.set(x, "DeliveryOptions", js.undefined)
    
    inline def setReputationOptions(value: ReputationOptions): Self = StObject.set(x, "ReputationOptions", value.asInstanceOf[js.Any])
    
    inline def setReputationOptionsUndefined: Self = StObject.set(x, "ReputationOptions", js.undefined)
    
    inline def setSendingOptions(value: SendingOptions): Self = StObject.set(x, "SendingOptions", value.asInstanceOf[js.Any])
    
    inline def setSendingOptionsUndefined: Self = StObject.set(x, "SendingOptions", js.undefined)
    
    inline def setSuppressionOptions(value: SuppressionOptions): Self = StObject.set(x, "SuppressionOptions", value.asInstanceOf[js.Any])
    
    inline def setSuppressionOptionsUndefined: Self = StObject.set(x, "SuppressionOptions", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTrackingOptions(value: TrackingOptions): Self = StObject.set(x, "TrackingOptions", value.asInstanceOf[js.Any])
    
    inline def setTrackingOptionsUndefined: Self = StObject.set(x, "TrackingOptions", js.undefined)
  }
}
