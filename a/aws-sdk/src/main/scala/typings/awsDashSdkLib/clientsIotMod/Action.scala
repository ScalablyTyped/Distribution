package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Action extends js.Object {
  /**
    * Change the state of a CloudWatch alarm.
    */
  var cloudwatchAlarm: js.UndefOr[CloudwatchAlarmAction] = js.undefined
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
    * Write data to an Amazon Elasticsearch Service domain.
    */
  var elasticsearch: js.UndefOr[ElasticsearchAction] = js.undefined
  /**
    * Write to an Amazon Kinesis Firehose stream.
    */
  var firehose: js.UndefOr[FirehoseAction] = js.undefined
  /**
    * Sends message data to an AWS IoT Analytics channel.
    */
  var iotAnalytics: js.UndefOr[IotAnalyticsAction] = js.undefined
  /**
    * Sends an input to an AWS IoT Events detector.
    */
  var iotEvents: js.UndefOr[IotEventsAction] = js.undefined
  /**
    * Write data to an Amazon Kinesis stream.
    */
  var kinesis: js.UndefOr[KinesisAction] = js.undefined
  /**
    * Invoke a Lambda function.
    */
  var lambda: js.UndefOr[LambdaAction] = js.undefined
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
}

object Action {
  @scala.inline
  def apply(
    cloudwatchAlarm: CloudwatchAlarmAction = null,
    cloudwatchMetric: CloudwatchMetricAction = null,
    dynamoDB: DynamoDBAction = null,
    dynamoDBv2: DynamoDBv2Action = null,
    elasticsearch: ElasticsearchAction = null,
    firehose: FirehoseAction = null,
    iotAnalytics: IotAnalyticsAction = null,
    iotEvents: IotEventsAction = null,
    kinesis: KinesisAction = null,
    lambda: LambdaAction = null,
    republish: RepublishAction = null,
    s3: S3Action = null,
    salesforce: SalesforceAction = null,
    sns: SnsAction = null,
    sqs: SqsAction = null,
    stepFunctions: StepFunctionsAction = null
  ): Action = {
    val __obj = js.Dynamic.literal()
    if (cloudwatchAlarm != null) __obj.updateDynamic("cloudwatchAlarm")(cloudwatchAlarm)
    if (cloudwatchMetric != null) __obj.updateDynamic("cloudwatchMetric")(cloudwatchMetric)
    if (dynamoDB != null) __obj.updateDynamic("dynamoDB")(dynamoDB)
    if (dynamoDBv2 != null) __obj.updateDynamic("dynamoDBv2")(dynamoDBv2)
    if (elasticsearch != null) __obj.updateDynamic("elasticsearch")(elasticsearch)
    if (firehose != null) __obj.updateDynamic("firehose")(firehose)
    if (iotAnalytics != null) __obj.updateDynamic("iotAnalytics")(iotAnalytics)
    if (iotEvents != null) __obj.updateDynamic("iotEvents")(iotEvents)
    if (kinesis != null) __obj.updateDynamic("kinesis")(kinesis)
    if (lambda != null) __obj.updateDynamic("lambda")(lambda)
    if (republish != null) __obj.updateDynamic("republish")(republish)
    if (s3 != null) __obj.updateDynamic("s3")(s3)
    if (salesforce != null) __obj.updateDynamic("salesforce")(salesforce)
    if (sns != null) __obj.updateDynamic("sns")(sns)
    if (sqs != null) __obj.updateDynamic("sqs")(sqs)
    if (stepFunctions != null) __obj.updateDynamic("stepFunctions")(stepFunctions)
    __obj.asInstanceOf[Action]
  }
}

