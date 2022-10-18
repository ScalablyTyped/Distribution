package typings.awsSdk.clientsIotanalyticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatasetRequest extends StObject {
  
  /**
    * A list of actions that create the dataset contents.
    */
  var actions: DatasetActions
  
  /**
    * When dataset contents are created, they are delivered to destinations specified here.
    */
  var contentDeliveryRules: js.UndefOr[DatasetContentDeliveryRules] = js.undefined
  
  /**
    * The name of the dataset.
    */
  var datasetName: DatasetName
  
  /**
    * A list of data rules that send notifications to CloudWatch, when data arrives late. To specify lateDataRules, the dataset must use a DeltaTimer filter.
    */
  var lateDataRules: js.UndefOr[LateDataRules] = js.undefined
  
  /**
    * Optional. How long, in days, versions of dataset contents are kept for the dataset. If not specified or set to null, versions of dataset contents are retained for at most 90 days. The number of versions of dataset contents retained is determined by the versioningConfiguration parameter. For more information, see  Keeping Multiple Versions of IoT Analytics datasets in the IoT Analytics User Guide.
    */
  var retentionPeriod: js.UndefOr[RetentionPeriod] = js.undefined
  
  /**
    * Metadata which can be used to manage the dataset.
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * A list of triggers. A trigger causes dataset contents to be populated at a specified time interval or when another dataset's contents are created. The list of triggers can be empty or contain up to five DataSetTrigger objects.
    */
  var triggers: js.UndefOr[DatasetTriggers] = js.undefined
  
  /**
    * Optional. How many versions of dataset contents are kept. If not specified or set to null, only the latest version plus the latest succeeded version (if they are different) are kept for the time period specified by the retentionPeriod parameter. For more information, see Keeping Multiple Versions of IoT Analytics datasets in the IoT Analytics User Guide.
    */
  var versioningConfiguration: js.UndefOr[VersioningConfiguration] = js.undefined
}
object CreateDatasetRequest {
  
  inline def apply(actions: DatasetActions, datasetName: DatasetName): CreateDatasetRequest = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], datasetName = datasetName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetRequest]
  }
  
  extension [Self <: CreateDatasetRequest](x: Self) {
    
    inline def setActions(value: DatasetActions): Self = StObject.set(x, "actions", value.asInstanceOf[js.Any])
    
    inline def setActionsVarargs(value: DatasetAction*): Self = StObject.set(x, "actions", js.Array(value*))
    
    inline def setContentDeliveryRules(value: DatasetContentDeliveryRules): Self = StObject.set(x, "contentDeliveryRules", value.asInstanceOf[js.Any])
    
    inline def setContentDeliveryRulesUndefined: Self = StObject.set(x, "contentDeliveryRules", js.undefined)
    
    inline def setContentDeliveryRulesVarargs(value: DatasetContentDeliveryRule*): Self = StObject.set(x, "contentDeliveryRules", js.Array(value*))
    
    inline def setDatasetName(value: DatasetName): Self = StObject.set(x, "datasetName", value.asInstanceOf[js.Any])
    
    inline def setLateDataRules(value: LateDataRules): Self = StObject.set(x, "lateDataRules", value.asInstanceOf[js.Any])
    
    inline def setLateDataRulesUndefined: Self = StObject.set(x, "lateDataRules", js.undefined)
    
    inline def setLateDataRulesVarargs(value: LateDataRule*): Self = StObject.set(x, "lateDataRules", js.Array(value*))
    
    inline def setRetentionPeriod(value: RetentionPeriod): Self = StObject.set(x, "retentionPeriod", value.asInstanceOf[js.Any])
    
    inline def setRetentionPeriodUndefined: Self = StObject.set(x, "retentionPeriod", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setTriggers(value: DatasetTriggers): Self = StObject.set(x, "triggers", value.asInstanceOf[js.Any])
    
    inline def setTriggersUndefined: Self = StObject.set(x, "triggers", js.undefined)
    
    inline def setTriggersVarargs(value: DatasetTrigger*): Self = StObject.set(x, "triggers", js.Array(value*))
    
    inline def setVersioningConfiguration(value: VersioningConfiguration): Self = StObject.set(x, "versioningConfiguration", value.asInstanceOf[js.Any])
    
    inline def setVersioningConfigurationUndefined: Self = StObject.set(x, "versioningConfiguration", js.undefined)
  }
}
