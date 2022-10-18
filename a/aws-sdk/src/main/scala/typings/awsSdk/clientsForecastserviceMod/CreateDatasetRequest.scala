package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatasetRequest extends StObject {
  
  /**
    * The frequency of data collection. This parameter is required for RELATED_TIME_SERIES datasets. Valid intervals are Y (Year), M (Month), W (Week), D (Day), H (Hour), 30min (30 minutes), 15min (15 minutes), 10min (10 minutes), 5min (5 minutes), and 1min (1 minute). For example, "D" indicates every day and "15min" indicates every 15 minutes.
    */
  var DataFrequency: js.UndefOr[Frequency] = js.undefined
  
  /**
    * A name for the dataset.
    */
  var DatasetName: Name
  
  /**
    * The dataset type. Valid values depend on the chosen Domain.
    */
  var DatasetType: typings.awsSdk.clientsForecastserviceMod.DatasetType
  
  /**
    * The domain associated with the dataset. When you add a dataset to a dataset group, this value and the value specified for the Domain parameter of the CreateDatasetGroup operation must match. The Domain and DatasetType that you choose determine the fields that must be present in the training data that you import to the dataset. For example, if you choose the RETAIL domain and TARGET_TIME_SERIES as the DatasetType, Amazon Forecast requires item_id, timestamp, and demand fields to be present in your data. For more information, see Importing datasets.
    */
  var Domain: typings.awsSdk.clientsForecastserviceMod.Domain
  
  /**
    * An AWS Key Management Service (KMS) key and the AWS Identity and Access Management (IAM) role that Amazon Forecast can assume to access the key.
    */
  var EncryptionConfig: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.EncryptionConfig] = js.undefined
  
  /**
    * The schema for the dataset. The schema attributes and their order must match the fields in your data. The dataset Domain and DatasetType that you choose determine the minimum required fields in your training data. For information about the required fields for a specific dataset domain and type, see Dataset Domains and Dataset Types.
    */
  var Schema: typings.awsSdk.clientsForecastserviceMod.Schema
  
  /**
    * The optional metadata that you apply to the dataset to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50.   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8.   Maximum value length - 256 Unicode characters in UTF-8.   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for keys as it is reserved for AWS use. You cannot edit or delete tag keys with this prefix. Values can have this prefix. If a tag value has aws as its prefix but the key does not, then Forecast considers it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix of aws do not count against your tags per resource limit.  
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Tags] = js.undefined
}
object CreateDatasetRequest {
  
  inline def apply(DatasetName: Name, DatasetType: DatasetType, Domain: Domain, Schema: Schema): CreateDatasetRequest = {
    val __obj = js.Dynamic.literal(DatasetName = DatasetName.asInstanceOf[js.Any], DatasetType = DatasetType.asInstanceOf[js.Any], Domain = Domain.asInstanceOf[js.Any], Schema = Schema.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetRequest]
  }
  
  extension [Self <: CreateDatasetRequest](x: Self) {
    
    inline def setDataFrequency(value: Frequency): Self = StObject.set(x, "DataFrequency", value.asInstanceOf[js.Any])
    
    inline def setDataFrequencyUndefined: Self = StObject.set(x, "DataFrequency", js.undefined)
    
    inline def setDatasetName(value: Name): Self = StObject.set(x, "DatasetName", value.asInstanceOf[js.Any])
    
    inline def setDatasetType(value: DatasetType): Self = StObject.set(x, "DatasetType", value.asInstanceOf[js.Any])
    
    inline def setDomain(value: Domain): Self = StObject.set(x, "Domain", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfig(value: EncryptionConfig): Self = StObject.set(x, "EncryptionConfig", value.asInstanceOf[js.Any])
    
    inline def setEncryptionConfigUndefined: Self = StObject.set(x, "EncryptionConfig", js.undefined)
    
    inline def setSchema(value: Schema): Self = StObject.set(x, "Schema", value.asInstanceOf[js.Any])
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
