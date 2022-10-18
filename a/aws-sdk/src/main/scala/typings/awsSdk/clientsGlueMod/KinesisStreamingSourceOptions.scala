package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KinesisStreamingSourceOptions extends StObject {
  
  /**
    * Adds a time delay between two consecutive getRecords operations. The default value is "False". This option is only configurable for Glue version 2.0 and above.
    */
  var AddIdleTimeBetweenReads: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * Avoids creating an empty microbatch job by checking for unread data in the Kinesis data stream before the batch is started. The default value is "False".
    */
  var AvoidEmptyBatches: js.UndefOr[BoxedBoolean] = js.undefined
  
  /**
    * An optional classification.
    */
  var Classification: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * Specifies the delimiter character.
    */
  var Delimiter: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * The minimum time interval between two ListShards API calls for your script to consider resharding. The default value is 1s.
    */
  var DescribeShardInterval: js.UndefOr[BoxedNonNegativeLong] = js.undefined
  
  /**
    * The URL of the Kinesis endpoint.
    */
  var EndpointUrl: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * The minimum time delay between two consecutive getRecords operations, specified in ms. The default value is 1000. This option is only configurable for Glue version 2.0 and above.
    */
  var IdleTimeBetweenReadsInMs: js.UndefOr[BoxedNonNegativeLong] = js.undefined
  
  /**
    * The maximum number of records to fetch per shard in the Kinesis data stream. The default value is 100000.
    */
  var MaxFetchRecordsPerShard: js.UndefOr[BoxedNonNegativeLong] = js.undefined
  
  /**
    * The maximum time spent in the job executor to fetch a record from the Kinesis data stream per shard, specified in milliseconds (ms). The default value is 1000.
    */
  var MaxFetchTimeInMs: js.UndefOr[BoxedNonNegativeLong] = js.undefined
  
  /**
    * The maximum number of records to fetch from the Kinesis data stream in each getRecords operation. The default value is 10000.
    */
  var MaxRecordPerRead: js.UndefOr[BoxedNonNegativeLong] = js.undefined
  
  /**
    * The maximum cool-off time period (specified in ms) between two retries of a Kinesis Data Streams API call. The default value is 10000.
    */
  var MaxRetryIntervalMs: js.UndefOr[BoxedNonNegativeLong] = js.undefined
  
  /**
    * The maximum number of retries for Kinesis Data Streams API requests. The default value is 3.
    */
  var NumRetries: js.UndefOr[BoxedNonNegativeInt] = js.undefined
  
  /**
    * The cool-off time period (specified in ms) before retrying the Kinesis Data Streams API call. The default value is 1000.
    */
  var RetryIntervalMs: js.UndefOr[BoxedNonNegativeLong] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the role to assume using AWS Security Token Service (AWS STS). This role must have permissions for describe or read record operations for the Kinesis data stream. You must use this parameter when accessing a data stream in a different account. Used in conjunction with "awsSTSSessionName".
    */
  var RoleArn: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * An identifier for the session assuming the role using AWS STS. You must use this parameter when accessing a data stream in a different account. Used in conjunction with "awsSTSRoleARN".
    */
  var RoleSessionName: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * The starting position in the Kinesis data stream to read data from. The possible values are "latest", "trim_horizon", or "earliest". The default value is "latest".
    */
  var StartingPosition: js.UndefOr[typings.awsSdk.clientsGlueMod.StartingPosition] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the Kinesis data stream.
    */
  var StreamArn: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * The name of the Kinesis data stream.
    */
  var StreamName: js.UndefOr[EnclosedInStringProperty] = js.undefined
}
object KinesisStreamingSourceOptions {
  
  inline def apply(): KinesisStreamingSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KinesisStreamingSourceOptions]
  }
  
  extension [Self <: KinesisStreamingSourceOptions](x: Self) {
    
    inline def setAddIdleTimeBetweenReads(value: BoxedBoolean): Self = StObject.set(x, "AddIdleTimeBetweenReads", value.asInstanceOf[js.Any])
    
    inline def setAddIdleTimeBetweenReadsUndefined: Self = StObject.set(x, "AddIdleTimeBetweenReads", js.undefined)
    
    inline def setAvoidEmptyBatches(value: BoxedBoolean): Self = StObject.set(x, "AvoidEmptyBatches", value.asInstanceOf[js.Any])
    
    inline def setAvoidEmptyBatchesUndefined: Self = StObject.set(x, "AvoidEmptyBatches", js.undefined)
    
    inline def setClassification(value: EnclosedInStringProperty): Self = StObject.set(x, "Classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationUndefined: Self = StObject.set(x, "Classification", js.undefined)
    
    inline def setDelimiter(value: EnclosedInStringProperty): Self = StObject.set(x, "Delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "Delimiter", js.undefined)
    
    inline def setDescribeShardInterval(value: BoxedNonNegativeLong): Self = StObject.set(x, "DescribeShardInterval", value.asInstanceOf[js.Any])
    
    inline def setDescribeShardIntervalUndefined: Self = StObject.set(x, "DescribeShardInterval", js.undefined)
    
    inline def setEndpointUrl(value: EnclosedInStringProperty): Self = StObject.set(x, "EndpointUrl", value.asInstanceOf[js.Any])
    
    inline def setEndpointUrlUndefined: Self = StObject.set(x, "EndpointUrl", js.undefined)
    
    inline def setIdleTimeBetweenReadsInMs(value: BoxedNonNegativeLong): Self = StObject.set(x, "IdleTimeBetweenReadsInMs", value.asInstanceOf[js.Any])
    
    inline def setIdleTimeBetweenReadsInMsUndefined: Self = StObject.set(x, "IdleTimeBetweenReadsInMs", js.undefined)
    
    inline def setMaxFetchRecordsPerShard(value: BoxedNonNegativeLong): Self = StObject.set(x, "MaxFetchRecordsPerShard", value.asInstanceOf[js.Any])
    
    inline def setMaxFetchRecordsPerShardUndefined: Self = StObject.set(x, "MaxFetchRecordsPerShard", js.undefined)
    
    inline def setMaxFetchTimeInMs(value: BoxedNonNegativeLong): Self = StObject.set(x, "MaxFetchTimeInMs", value.asInstanceOf[js.Any])
    
    inline def setMaxFetchTimeInMsUndefined: Self = StObject.set(x, "MaxFetchTimeInMs", js.undefined)
    
    inline def setMaxRecordPerRead(value: BoxedNonNegativeLong): Self = StObject.set(x, "MaxRecordPerRead", value.asInstanceOf[js.Any])
    
    inline def setMaxRecordPerReadUndefined: Self = StObject.set(x, "MaxRecordPerRead", js.undefined)
    
    inline def setMaxRetryIntervalMs(value: BoxedNonNegativeLong): Self = StObject.set(x, "MaxRetryIntervalMs", value.asInstanceOf[js.Any])
    
    inline def setMaxRetryIntervalMsUndefined: Self = StObject.set(x, "MaxRetryIntervalMs", js.undefined)
    
    inline def setNumRetries(value: BoxedNonNegativeInt): Self = StObject.set(x, "NumRetries", value.asInstanceOf[js.Any])
    
    inline def setNumRetriesUndefined: Self = StObject.set(x, "NumRetries", js.undefined)
    
    inline def setRetryIntervalMs(value: BoxedNonNegativeLong): Self = StObject.set(x, "RetryIntervalMs", value.asInstanceOf[js.Any])
    
    inline def setRetryIntervalMsUndefined: Self = StObject.set(x, "RetryIntervalMs", js.undefined)
    
    inline def setRoleArn(value: EnclosedInStringProperty): Self = StObject.set(x, "RoleArn", value.asInstanceOf[js.Any])
    
    inline def setRoleArnUndefined: Self = StObject.set(x, "RoleArn", js.undefined)
    
    inline def setRoleSessionName(value: EnclosedInStringProperty): Self = StObject.set(x, "RoleSessionName", value.asInstanceOf[js.Any])
    
    inline def setRoleSessionNameUndefined: Self = StObject.set(x, "RoleSessionName", js.undefined)
    
    inline def setStartingPosition(value: StartingPosition): Self = StObject.set(x, "StartingPosition", value.asInstanceOf[js.Any])
    
    inline def setStartingPositionUndefined: Self = StObject.set(x, "StartingPosition", js.undefined)
    
    inline def setStreamArn(value: EnclosedInStringProperty): Self = StObject.set(x, "StreamArn", value.asInstanceOf[js.Any])
    
    inline def setStreamArnUndefined: Self = StObject.set(x, "StreamArn", js.undefined)
    
    inline def setStreamName(value: EnclosedInStringProperty): Self = StObject.set(x, "StreamName", value.asInstanceOf[js.Any])
    
    inline def setStreamNameUndefined: Self = StObject.set(x, "StreamName", js.undefined)
  }
}
