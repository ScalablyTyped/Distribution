package typings.awsSdk.clientsForecastserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDatasetImportJobResponse extends StObject {
  
  /**
    * When the dataset import job was created.
    */
  var CreationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The size of the dataset in gigabytes (GB) after the import job has finished.
    */
  var DataSize: js.UndefOr[Double] = js.undefined
  
  /**
    * The location of the training data to import and an Identity and Access Management (IAM) role that Amazon Forecast can assume to access the data. If encryption is used, DataSource includes an Key Management Service (KMS) key.
    */
  var DataSource: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.DataSource] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the dataset that the training data was imported to.
    */
  var DatasetArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The ARN of the dataset import job.
    */
  var DatasetImportJobArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The name of the dataset import job.
    */
  var DatasetImportJobName: js.UndefOr[Name] = js.undefined
  
  /**
    * The estimated time remaining in minutes for the dataset import job to complete.
    */
  var EstimatedTimeRemainingInMinutes: js.UndefOr[Long] = js.undefined
  
  /**
    * Statistical information about each field in the input data.
    */
  var FieldStatistics: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.FieldStatistics] = js.undefined
  
  /**
    * The format of the imported data, CSV or PARQUET.
    */
  var Format: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Format] = js.undefined
  
  /**
    * The format of the geolocation attribute. Valid Values:"LAT_LONG" and "CC_POSTALCODE".
    */
  var GeolocationFormat: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.GeolocationFormat] = js.undefined
  
  /**
    * The import mode of the dataset import job, FULL or INCREMENTAL.
    */
  var ImportMode: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.ImportMode] = js.undefined
  
  /**
    * The last time the resource was modified. The timestamp depends on the status of the job:    CREATE_PENDING - The CreationTime.    CREATE_IN_PROGRESS - The current timestamp.    CREATE_STOPPING - The current timestamp.    CREATE_STOPPED - When the job stopped.    ACTIVE or CREATE_FAILED - When the job finished or failed.  
    */
  var LastModificationTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * If an error occurred, an informational message about the error.
    */
  var Message: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Message] = js.undefined
  
  /**
    * The status of the dataset import job. States include:    ACTIVE     CREATE_PENDING, CREATE_IN_PROGRESS, CREATE_FAILED     DELETE_PENDING, DELETE_IN_PROGRESS, DELETE_FAILED     CREATE_STOPPING, CREATE_STOPPED   
    */
  var Status: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.Status] = js.undefined
  
  /**
    * The single time zone applied to every item in the dataset
    */
  var TimeZone: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.TimeZone] = js.undefined
  
  /**
    * The format of timestamps in the dataset. The format that you specify depends on the DataFrequency specified when the dataset was created. The following formats are supported   "yyyy-MM-dd" For the following data frequencies: Y, M, W, and D   "yyyy-MM-dd HH:mm:ss" For the following data frequencies: H, 30min, 15min, and 1min; and optionally, for: Y, M, W, and D  
    */
  var TimestampFormat: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.TimestampFormat] = js.undefined
  
  /**
    * Whether TimeZone is automatically derived from the geolocation attribute.
    */
  var UseGeolocationForTimeZone: js.UndefOr[typings.awsSdk.clientsForecastserviceMod.UseGeolocationForTimeZone] = js.undefined
}
object DescribeDatasetImportJobResponse {
  
  inline def apply(): DescribeDatasetImportJobResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDatasetImportJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeDatasetImportJobResponse] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setCreationTimeUndefined: Self = StObject.set(x, "CreationTime", js.undefined)
    
    inline def setDataSize(value: Double): Self = StObject.set(x, "DataSize", value.asInstanceOf[js.Any])
    
    inline def setDataSizeUndefined: Self = StObject.set(x, "DataSize", js.undefined)
    
    inline def setDataSource(value: DataSource): Self = StObject.set(x, "DataSource", value.asInstanceOf[js.Any])
    
    inline def setDataSourceUndefined: Self = StObject.set(x, "DataSource", js.undefined)
    
    inline def setDatasetArn(value: Arn): Self = StObject.set(x, "DatasetArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetArnUndefined: Self = StObject.set(x, "DatasetArn", js.undefined)
    
    inline def setDatasetImportJobArn(value: Arn): Self = StObject.set(x, "DatasetImportJobArn", value.asInstanceOf[js.Any])
    
    inline def setDatasetImportJobArnUndefined: Self = StObject.set(x, "DatasetImportJobArn", js.undefined)
    
    inline def setDatasetImportJobName(value: Name): Self = StObject.set(x, "DatasetImportJobName", value.asInstanceOf[js.Any])
    
    inline def setDatasetImportJobNameUndefined: Self = StObject.set(x, "DatasetImportJobName", js.undefined)
    
    inline def setEstimatedTimeRemainingInMinutes(value: Long): Self = StObject.set(x, "EstimatedTimeRemainingInMinutes", value.asInstanceOf[js.Any])
    
    inline def setEstimatedTimeRemainingInMinutesUndefined: Self = StObject.set(x, "EstimatedTimeRemainingInMinutes", js.undefined)
    
    inline def setFieldStatistics(value: FieldStatistics): Self = StObject.set(x, "FieldStatistics", value.asInstanceOf[js.Any])
    
    inline def setFieldStatisticsUndefined: Self = StObject.set(x, "FieldStatistics", js.undefined)
    
    inline def setFormat(value: Format): Self = StObject.set(x, "Format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "Format", js.undefined)
    
    inline def setGeolocationFormat(value: GeolocationFormat): Self = StObject.set(x, "GeolocationFormat", value.asInstanceOf[js.Any])
    
    inline def setGeolocationFormatUndefined: Self = StObject.set(x, "GeolocationFormat", js.undefined)
    
    inline def setImportMode(value: ImportMode): Self = StObject.set(x, "ImportMode", value.asInstanceOf[js.Any])
    
    inline def setImportModeUndefined: Self = StObject.set(x, "ImportMode", js.undefined)
    
    inline def setLastModificationTime(value: js.Date): Self = StObject.set(x, "LastModificationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModificationTimeUndefined: Self = StObject.set(x, "LastModificationTime", js.undefined)
    
    inline def setMessage(value: Message): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setStatus(value: Status): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTimeZone(value: TimeZone): Self = StObject.set(x, "TimeZone", value.asInstanceOf[js.Any])
    
    inline def setTimeZoneUndefined: Self = StObject.set(x, "TimeZone", js.undefined)
    
    inline def setTimestampFormat(value: TimestampFormat): Self = StObject.set(x, "TimestampFormat", value.asInstanceOf[js.Any])
    
    inline def setTimestampFormatUndefined: Self = StObject.set(x, "TimestampFormat", js.undefined)
    
    inline def setUseGeolocationForTimeZone(value: UseGeolocationForTimeZone): Self = StObject.set(x, "UseGeolocationForTimeZone", value.asInstanceOf[js.Any])
    
    inline def setUseGeolocationForTimeZoneUndefined: Self = StObject.set(x, "UseGeolocationForTimeZone", js.undefined)
  }
}
