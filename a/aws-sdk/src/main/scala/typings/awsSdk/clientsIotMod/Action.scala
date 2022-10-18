package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  /**
    * Change the state of a CloudWatch alarm.
    */
  var cloudwatchAlarm: js.UndefOr[CloudwatchAlarmAction] = js.undefined
  
  /**
    * Send data to CloudWatch Logs.
    */
  var cloudwatchLogs: js.UndefOr[CloudwatchLogsAction] = js.undefined
  
  /**
    * Capture a CloudWatch metric.
    */
  var cloudwatchMetric: js.UndefOr[CloudwatchMetricAction] = js.undefined
  
  /**
    * Write to a DynamoDB table.
    */
  var dynamoDB: js.UndefOr[DynamoDBAction] = js.undefined
  
  /**
    * Write to a DynamoDB table. This is a new version of the DynamoDB action. It allows you to write each attribute in an MQTT message payload into a separate DynamoDB column.
    */
  var dynamoDBv2: js.UndefOr[DynamoDBv2Action] = js.undefined
  
  /**
    * Write data to an Amazon OpenSearch Service domain.  The Elasticsearch action can only be used by existing rule actions. To create a new rule action or to update an existing rule action, use the OpenSearch rule action instead. For more information, see OpenSearchAction. 
    */
  var elasticsearch: js.UndefOr[ElasticsearchAction] = js.undefined
  
  /**
    * Write to an Amazon Kinesis Firehose stream.
    */
  var firehose: js.UndefOr[FirehoseAction] = js.undefined
  
  /**
    * Send data to an HTTPS endpoint.
    */
  var http: js.UndefOr[HttpAction] = js.undefined
  
  /**
    * Sends message data to an IoT Analytics channel.
    */
  var iotAnalytics: js.UndefOr[IotAnalyticsAction] = js.undefined
  
  /**
    * Sends an input to an IoT Events detector.
    */
  var iotEvents: js.UndefOr[IotEventsAction] = js.undefined
  
  /**
    * Sends data from the MQTT message that triggered the rule to IoT SiteWise asset properties.
    */
  var iotSiteWise: js.UndefOr[IotSiteWiseAction] = js.undefined
  
  /**
    * Send messages to an Amazon Managed Streaming for Apache Kafka (Amazon MSK) or self-managed Apache Kafka cluster.
    */
  var kafka: js.UndefOr[KafkaAction] = js.undefined
  
  /**
    * Write data to an Amazon Kinesis stream.
    */
  var kinesis: js.UndefOr[KinesisAction] = js.undefined
  
  /**
    * Invoke a Lambda function.
    */
  var lambda: js.UndefOr[LambdaAction] = js.undefined
  
  /**
    * Write data to an Amazon OpenSearch Service domain.
    */
  var openSearch: js.UndefOr[OpenSearchAction] = js.undefined
  
  /**
    * Publish to another MQTT topic.
    */
  var republish: js.UndefOr[RepublishAction] = js.undefined
  
  /**
    * Write to an Amazon S3 bucket.
    */
  var s3: js.UndefOr[S3Action] = js.undefined
  
  /**
    * Send a message to a Salesforce IoT Cloud Input Stream.
    */
  var salesforce: js.UndefOr[SalesforceAction] = js.undefined
  
  /**
    * Publish to an Amazon SNS topic.
    */
  var sns: js.UndefOr[SnsAction] = js.undefined
  
  /**
    * Publish to an Amazon SQS queue.
    */
  var sqs: js.UndefOr[SqsAction] = js.undefined
  
  /**
    * Starts execution of a Step Functions state machine.
    */
  var stepFunctions: js.UndefOr[StepFunctionsAction] = js.undefined
  
  /**
    * The Timestream rule action writes attributes (measures) from an MQTT message into an Amazon Timestream table. For more information, see the Timestream topic rule action documentation.
    */
  var timestream: js.UndefOr[TimestreamAction] = js.undefined
}
object Action {
  
  inline def apply(): Action = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Action]
  }
  
  extension [Self <: Action](x: Self) {
    
    inline def setCloudwatchAlarm(value: CloudwatchAlarmAction): Self = StObject.set(x, "cloudwatchAlarm", value.asInstanceOf[js.Any])
    
    inline def setCloudwatchAlarmUndefined: Self = StObject.set(x, "cloudwatchAlarm", js.undefined)
    
    inline def setCloudwatchLogs(value: CloudwatchLogsAction): Self = StObject.set(x, "cloudwatchLogs", value.asInstanceOf[js.Any])
    
    inline def setCloudwatchLogsUndefined: Self = StObject.set(x, "cloudwatchLogs", js.undefined)
    
    inline def setCloudwatchMetric(value: CloudwatchMetricAction): Self = StObject.set(x, "cloudwatchMetric", value.asInstanceOf[js.Any])
    
    inline def setCloudwatchMetricUndefined: Self = StObject.set(x, "cloudwatchMetric", js.undefined)
    
    inline def setDynamoDB(value: DynamoDBAction): Self = StObject.set(x, "dynamoDB", value.asInstanceOf[js.Any])
    
    inline def setDynamoDBUndefined: Self = StObject.set(x, "dynamoDB", js.undefined)
    
    inline def setDynamoDBv2(value: DynamoDBv2Action): Self = StObject.set(x, "dynamoDBv2", value.asInstanceOf[js.Any])
    
    inline def setDynamoDBv2Undefined: Self = StObject.set(x, "dynamoDBv2", js.undefined)
    
    inline def setElasticsearch(value: ElasticsearchAction): Self = StObject.set(x, "elasticsearch", value.asInstanceOf[js.Any])
    
    inline def setElasticsearchUndefined: Self = StObject.set(x, "elasticsearch", js.undefined)
    
    inline def setFirehose(value: FirehoseAction): Self = StObject.set(x, "firehose", value.asInstanceOf[js.Any])
    
    inline def setFirehoseUndefined: Self = StObject.set(x, "firehose", js.undefined)
    
    inline def setHttp(value: HttpAction): Self = StObject.set(x, "http", value.asInstanceOf[js.Any])
    
    inline def setHttpUndefined: Self = StObject.set(x, "http", js.undefined)
    
    inline def setIotAnalytics(value: IotAnalyticsAction): Self = StObject.set(x, "iotAnalytics", value.asInstanceOf[js.Any])
    
    inline def setIotAnalyticsUndefined: Self = StObject.set(x, "iotAnalytics", js.undefined)
    
    inline def setIotEvents(value: IotEventsAction): Self = StObject.set(x, "iotEvents", value.asInstanceOf[js.Any])
    
    inline def setIotEventsUndefined: Self = StObject.set(x, "iotEvents", js.undefined)
    
    inline def setIotSiteWise(value: IotSiteWiseAction): Self = StObject.set(x, "iotSiteWise", value.asInstanceOf[js.Any])
    
    inline def setIotSiteWiseUndefined: Self = StObject.set(x, "iotSiteWise", js.undefined)
    
    inline def setKafka(value: KafkaAction): Self = StObject.set(x, "kafka", value.asInstanceOf[js.Any])
    
    inline def setKafkaUndefined: Self = StObject.set(x, "kafka", js.undefined)
    
    inline def setKinesis(value: KinesisAction): Self = StObject.set(x, "kinesis", value.asInstanceOf[js.Any])
    
    inline def setKinesisUndefined: Self = StObject.set(x, "kinesis", js.undefined)
    
    inline def setLambda(value: LambdaAction): Self = StObject.set(x, "lambda", value.asInstanceOf[js.Any])
    
    inline def setLambdaUndefined: Self = StObject.set(x, "lambda", js.undefined)
    
    inline def setOpenSearch(value: OpenSearchAction): Self = StObject.set(x, "openSearch", value.asInstanceOf[js.Any])
    
    inline def setOpenSearchUndefined: Self = StObject.set(x, "openSearch", js.undefined)
    
    inline def setRepublish(value: RepublishAction): Self = StObject.set(x, "republish", value.asInstanceOf[js.Any])
    
    inline def setRepublishUndefined: Self = StObject.set(x, "republish", js.undefined)
    
    inline def setS3(value: S3Action): Self = StObject.set(x, "s3", value.asInstanceOf[js.Any])
    
    inline def setS3Undefined: Self = StObject.set(x, "s3", js.undefined)
    
    inline def setSalesforce(value: SalesforceAction): Self = StObject.set(x, "salesforce", value.asInstanceOf[js.Any])
    
    inline def setSalesforceUndefined: Self = StObject.set(x, "salesforce", js.undefined)
    
    inline def setSns(value: SnsAction): Self = StObject.set(x, "sns", value.asInstanceOf[js.Any])
    
    inline def setSnsUndefined: Self = StObject.set(x, "sns", js.undefined)
    
    inline def setSqs(value: SqsAction): Self = StObject.set(x, "sqs", value.asInstanceOf[js.Any])
    
    inline def setSqsUndefined: Self = StObject.set(x, "sqs", js.undefined)
    
    inline def setStepFunctions(value: StepFunctionsAction): Self = StObject.set(x, "stepFunctions", value.asInstanceOf[js.Any])
    
    inline def setStepFunctionsUndefined: Self = StObject.set(x, "stepFunctions", js.undefined)
    
    inline def setTimestream(value: TimestreamAction): Self = StObject.set(x, "timestream", value.asInstanceOf[js.Any])
    
    inline def setTimestreamUndefined: Self = StObject.set(x, "timestream", js.undefined)
  }
}
