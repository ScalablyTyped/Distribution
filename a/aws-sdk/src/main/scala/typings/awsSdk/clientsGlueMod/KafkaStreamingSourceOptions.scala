package typings.awsSdk.clientsGlueMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KafkaStreamingSourceOptions extends StObject {
  
  /**
    * The specific TopicPartitions to consume. You must specify at least one of "topicName", "assign" or "subscribePattern".
    */
  var Assign: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * A list of bootstrap server URLs, for example, as b-1.vpc-test-2.o4q88o.c6.kafka.us-east-1.amazonaws.com:9094. This option must be specified in the API call or defined in the table metadata in the Data Catalog.
    */
  var BootstrapServers: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * An optional classification.
    */
  var Classification: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * The name of the connection.
    */
  var ConnectionName: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * Specifies the delimiter character.
    */
  var Delimiter: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * The end point when a batch query is ended. Possible values are either "latest" or a JSON string that specifies an ending offset for each TopicPartition.
    */
  var EndingOffsets: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * The rate limit on the maximum number of offsets that are processed per trigger interval. The specified total number of offsets is proportionally split across topicPartitions of different volumes. The default value is null, which means that the consumer reads all offsets until the known latest offset.
    */
  var MaxOffsetsPerTrigger: js.UndefOr[BoxedNonNegativeLong] = js.undefined
  
  /**
    * The desired minimum number of partitions to read from Kafka. The default value is null, which means that the number of spark partitions is equal to the number of Kafka partitions.
    */
  var MinPartitions: js.UndefOr[BoxedNonNegativeInt] = js.undefined
  
  /**
    * The number of times to retry before failing to fetch Kafka offsets. The default value is 3.
    */
  var NumRetries: js.UndefOr[BoxedNonNegativeInt] = js.undefined
  
  /**
    * The timeout in milliseconds to poll data from Kafka in Spark job executors. The default value is 512.
    */
  var PollTimeoutMs: js.UndefOr[BoxedNonNegativeLong] = js.undefined
  
  /**
    * The time in milliseconds to wait before retrying to fetch Kafka offsets. The default value is 10.
    */
  var RetryIntervalMs: js.UndefOr[BoxedNonNegativeLong] = js.undefined
  
  /**
    * The protocol used to communicate with brokers. The possible values are "SSL" or "PLAINTEXT".
    */
  var SecurityProtocol: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * The starting position in the Kafka topic to read data from. The possible values are "earliest" or "latest". The default value is "latest".
    */
  var StartingOffsets: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * A Java regex string that identifies the topic list to subscribe to. You must specify at least one of "topicName", "assign" or "subscribePattern".
    */
  var SubscribePattern: js.UndefOr[EnclosedInStringProperty] = js.undefined
  
  /**
    * The topic name as specified in Apache Kafka. You must specify at least one of "topicName", "assign" or "subscribePattern".
    */
  var TopicName: js.UndefOr[EnclosedInStringProperty] = js.undefined
}
object KafkaStreamingSourceOptions {
  
  inline def apply(): KafkaStreamingSourceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[KafkaStreamingSourceOptions]
  }
  
  extension [Self <: KafkaStreamingSourceOptions](x: Self) {
    
    inline def setAssign(value: EnclosedInStringProperty): Self = StObject.set(x, "Assign", value.asInstanceOf[js.Any])
    
    inline def setAssignUndefined: Self = StObject.set(x, "Assign", js.undefined)
    
    inline def setBootstrapServers(value: EnclosedInStringProperty): Self = StObject.set(x, "BootstrapServers", value.asInstanceOf[js.Any])
    
    inline def setBootstrapServersUndefined: Self = StObject.set(x, "BootstrapServers", js.undefined)
    
    inline def setClassification(value: EnclosedInStringProperty): Self = StObject.set(x, "Classification", value.asInstanceOf[js.Any])
    
    inline def setClassificationUndefined: Self = StObject.set(x, "Classification", js.undefined)
    
    inline def setConnectionName(value: EnclosedInStringProperty): Self = StObject.set(x, "ConnectionName", value.asInstanceOf[js.Any])
    
    inline def setConnectionNameUndefined: Self = StObject.set(x, "ConnectionName", js.undefined)
    
    inline def setDelimiter(value: EnclosedInStringProperty): Self = StObject.set(x, "Delimiter", value.asInstanceOf[js.Any])
    
    inline def setDelimiterUndefined: Self = StObject.set(x, "Delimiter", js.undefined)
    
    inline def setEndingOffsets(value: EnclosedInStringProperty): Self = StObject.set(x, "EndingOffsets", value.asInstanceOf[js.Any])
    
    inline def setEndingOffsetsUndefined: Self = StObject.set(x, "EndingOffsets", js.undefined)
    
    inline def setMaxOffsetsPerTrigger(value: BoxedNonNegativeLong): Self = StObject.set(x, "MaxOffsetsPerTrigger", value.asInstanceOf[js.Any])
    
    inline def setMaxOffsetsPerTriggerUndefined: Self = StObject.set(x, "MaxOffsetsPerTrigger", js.undefined)
    
    inline def setMinPartitions(value: BoxedNonNegativeInt): Self = StObject.set(x, "MinPartitions", value.asInstanceOf[js.Any])
    
    inline def setMinPartitionsUndefined: Self = StObject.set(x, "MinPartitions", js.undefined)
    
    inline def setNumRetries(value: BoxedNonNegativeInt): Self = StObject.set(x, "NumRetries", value.asInstanceOf[js.Any])
    
    inline def setNumRetriesUndefined: Self = StObject.set(x, "NumRetries", js.undefined)
    
    inline def setPollTimeoutMs(value: BoxedNonNegativeLong): Self = StObject.set(x, "PollTimeoutMs", value.asInstanceOf[js.Any])
    
    inline def setPollTimeoutMsUndefined: Self = StObject.set(x, "PollTimeoutMs", js.undefined)
    
    inline def setRetryIntervalMs(value: BoxedNonNegativeLong): Self = StObject.set(x, "RetryIntervalMs", value.asInstanceOf[js.Any])
    
    inline def setRetryIntervalMsUndefined: Self = StObject.set(x, "RetryIntervalMs", js.undefined)
    
    inline def setSecurityProtocol(value: EnclosedInStringProperty): Self = StObject.set(x, "SecurityProtocol", value.asInstanceOf[js.Any])
    
    inline def setSecurityProtocolUndefined: Self = StObject.set(x, "SecurityProtocol", js.undefined)
    
    inline def setStartingOffsets(value: EnclosedInStringProperty): Self = StObject.set(x, "StartingOffsets", value.asInstanceOf[js.Any])
    
    inline def setStartingOffsetsUndefined: Self = StObject.set(x, "StartingOffsets", js.undefined)
    
    inline def setSubscribePattern(value: EnclosedInStringProperty): Self = StObject.set(x, "SubscribePattern", value.asInstanceOf[js.Any])
    
    inline def setSubscribePatternUndefined: Self = StObject.set(x, "SubscribePattern", js.undefined)
    
    inline def setTopicName(value: EnclosedInStringProperty): Self = StObject.set(x, "TopicName", value.asInstanceOf[js.Any])
    
    inline def setTopicNameUndefined: Self = StObject.set(x, "TopicName", js.undefined)
  }
}
