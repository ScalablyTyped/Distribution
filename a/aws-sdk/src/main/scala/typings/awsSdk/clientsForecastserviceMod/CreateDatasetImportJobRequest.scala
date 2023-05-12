package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDatasetImportJobRequest extends StObject {
  
  /**
    * The location of the training data to import and an Identity and Access Management (IAM) role that Amazon Forecast can assume to access the data. The training data must be stored in an Amazon S3 bucket. If encryption is used, DataSource must include an Key Management Service (KMS) key and the IAM role must allow Amazon Forecast permission to access the key. The KMS key and IAM role must match those specified in the EncryptionConfig parameter of the CreateDataset operation.
    */
  var DataSource: typings.awsSdk.clientsForecastserviceMod.DataSource
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Forecast dataset that you want to import data to.
    */
  var DatasetArn: Arn
  
  /**
    * The name for the dataset import job. We recommend including the current timestamp in the name, for example, 20190721DatasetImport. This can help you avoid getting a ResourceAlreadyExistsException exception.
    */
  var DatasetImportJobName: Name
  
  /**
    * The format of the imported data, CSV or PARQUET. The default value is CSV.
    */
  var Format: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Format] = js.undefined
  
  /**
    * The format of the geolocation attribute. The geolocation attribute can be formatted in one of two ways:    LAT_LONG - the latitude and longitude in decimal format (Example: 47.61_-122.33).    CC_POSTALCODE (US Only) - the country code (US), followed by the 5-digit ZIP code (Example: US_98121).  
    */
  var GeolocationFormat: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.GeolocationFormat] = js.undefined
  
  /**
    * Specifies whether the dataset import job is a FULL or INCREMENTAL import. A FULL dataset import replaces all of the existing data with the newly imported data. An INCREMENTAL import appends the imported data to the existing data.
    */
  var ImportMode: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.ImportMode] = js.undefined
  
  /**
    * The optional metadata that you apply to the dataset import job to help you categorize and organize them. Each tag consists of a key and an optional value, both of which you define. The following basic restrictions apply to tags:   Maximum number of tags per resource - 50.   For each resource, each tag key must be unique, and each tag key can have only one value.   Maximum key length - 128 Unicode characters in UTF-8.   Maximum value length - 256 Unicode characters in UTF-8.   If your tagging schema is used across multiple services and resources, remember that other services may have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : / @.   Tag keys and values are case sensitive.   Do not use aws:, AWS:, or any upper or lowercase combination of such as a prefix for keys as it is reserved for Amazon Web Services use. You cannot edit or delete tag keys with this prefix. Values can have this prefix. If a tag value has aws as its prefix but the key does not, then Forecast considers it to be a user tag and will count against the limit of 50 tags. Tags with only the key prefix of aws do not count against your tags per resource limit.  
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Tags] = js.undefined
  
  /**
    * A single time zone for every item in your dataset. This option is ideal for datasets with all timestamps within a single time zone, or if all timestamps are normalized to a single time zone.  Refer to the Joda-Time API for a complete list of valid time zone names.
    */
  var TimeZone: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.TimeZone] = js.undefined
  
  /**
    * The format of timestamps in the dataset. The format that you specify depends on the DataFrequency specified when the dataset was created. The following formats are supported   "yyyy-MM-dd" For the following data frequencies: Y, M, W, and D   "yyyy-MM-dd HH:mm:ss" For the following data frequencies: H, 30min, 15min, and 1min; and optionally, for: Y, M, W, and D   If the format isn't specified, Amazon Forecast expects the format to be "yyyy-MM-dd HH:mm:ss".
    */
  var TimestampFormat: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.TimestampFormat] = js.undefined
  
  /**
    * Automatically derive time zone information from the geolocation attribute. This option is ideal for datasets that contain timestamps in multiple time zones and those timestamps are expressed in local time.
    */
  var UseGeolocationForTimeZone: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.UseGeolocationForTimeZone] = js.undefined
}
object CreateDatasetImportJobRequest {
  
  inline def apply(DataSource: DataSource, DatasetArn: Arn, DatasetImportJobName: Name): CreateDatasetImportJobRequest = {
    val __obj = js.Dynamic.literal(DataSource = DataSource.asInstanceOf[js.Any], DatasetArn = DatasetArn.asInstanceOf[js.Any], DatasetImportJobName = DatasetImportJobName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDatasetImportJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateDatasetImportJobRequest] (val x: Self) extends AnyVal {
    
    inline def setDataSource(value: DataSource): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setDatasetArn(value: Arn): Self = StObject.set(x, "DatasetArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetImportJobName(value: Name): Self = StObject.set(x, "DatasetImportJobName", value.asInstanceOf[js.Any])
    
    inline def setFormat(value: Format): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    inline def setGeolocationFormat(value: GeolocationFormat): Self = StObject.set(x, "GeolocationFormat", value.asInstanceOf[js.Any])
    
    inline def setGeolocationFormatUndefined: Self = StObject.set(x, "GeolocationFormat", js.undefined)
    
    inline def setImportMode(value: ImportMode): Self = StObject.set(x, "ImportMode", value.asInstanceOf[js.Any])
    
    inline def setImportModeUndefined: Self = StObject.set(x, "ImportMode", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setTimeZone(value: TimeZone): Self = StObject.set(x, "TimeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "TimeZone", js.undefined)
    
    inline def setTimestampFormat(value: TimestampFormat): Self = StObject.set(x, "TimestampFormat", value.asInstanceOf[js.Any])
    
    inline def setTimestampFormatUndefined: Self = StObject.set(x, "TimestampFormat", js.undefined)
    
    inline def setUseGeolocationForTimeZone(value: UseGeolocationForTimeZone): Self = StObject.set(x, "UseGeolocationForTimeZone", value.asInstanceOf[js.Any])
    
    inline def setUseGeolocationForTimeZoneUndefined: Self = StObject.set(x, "UseGeolocationForTimeZone", js.undefined)
  }
}
