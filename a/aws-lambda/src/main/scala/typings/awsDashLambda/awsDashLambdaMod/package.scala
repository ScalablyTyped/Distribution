package typings.awsDashLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object awsDashLambdaMod {
  import org.scalablytyped.runtime.StringDictionary
  import typings.awsDashLambda.Anon_KeyValue
  import typings.awsDashLambda.Anon_NotPrincipal
  import typings.awsDashLambda.Anon_NotResource
  import typings.awsDashLambda.Anon_OriginalValue
  import typings.awsDashLambda.Anon_Principal
  import typings.awsDashLambda.Anon_Resource
  import typings.std.Error

  type ALBCallback = Callback[ALBResult]
  type ALBHandler = Handler[ALBEvent, ALBResult]
  type APIGatewayEvent = APIGatewayProxyEvent
  type APIGatewayProxyCallback = Callback[APIGatewayProxyResult]
  type APIGatewayProxyHandler = Handler[APIGatewayProxyEvent, APIGatewayProxyResult]
  type ArtifactLocation = S3ArtifactStore
  type AuthResponse = CustomAuthorizerResult
  type AuthResponseContext = StringDictionary[js.Any]
  type Callback[TResult] = js.Function2[
    /* error */ js.UndefOr[Error | Null | String], 
    /* result */ js.UndefOr[TResult], 
    Unit
  ]
  type CloudFormationCustomResourceHandler = Handler[CloudFormationCustomResourceEvent, Unit]
  type CloudFrontHeaders = StringDictionary[js.Array[Anon_KeyValue]]
  type CloudFrontRequestCallback = Callback[CloudFrontRequestResult]
  type CloudFrontRequestHandler = Handler[CloudFrontRequestEvent, CloudFrontRequestResult]
  /* Rewritten from type alias, can be one of: 
    - `js.undefined`
    - scala.Nothing
    - scala.Null
    - typings.awsDashLambda.awsDashLambdaMod.CloudFrontResultResponse
    - typings.awsDashLambda.awsDashLambdaMod.CloudFrontRequest
  */
  type CloudFrontRequestResult = js.UndefOr[_CloudFrontRequestResult | Null]
  type CloudFrontResponseCallback = Callback[CloudFrontResponseResult]
  type CloudFrontResponseHandler = Handler[CloudFrontResponseEvent, CloudFrontResponseResult]
  type CloudFrontResponseResult = js.UndefOr[Null | CloudFrontResultResponse]
  type CloudWatchLogsHandler = Handler[CloudWatchLogsEvent, Unit]
  type CodePipelineCloudWatchActionHandler = Handler[CodePipelineCloudWatchActionEvent, Unit]
  type CodePipelineCloudWatchHandler = Handler[CodePipelineCloudWatchEvent, Unit]
  type CodePipelineCloudWatchPipelineHandler = Handler[CodePipelineCloudWatchPipelineEvent, Unit]
  type CodePipelineCloudWatchStageHandler = Handler[CodePipelineCloudWatchStageEvent, Unit]
  type CodePipelineHandler = Handler[CodePipelineEvent, Unit]
  type CognitoUserPoolEvent = CognitoUserPoolTriggerEvent
  type CognitoUserPoolTriggerHandler = Handler[CognitoUserPoolTriggerEvent, js.Any]
  type Condition = StringDictionary[String | js.Array[String]]
  type ConditionBlock = StringDictionary[Condition | js.Array[Condition]]
  type CustomAuthorizerCallback = Callback[CustomAuthorizerResult]
  type CustomAuthorizerHandler = Handler[CustomAuthorizerEvent, CustomAuthorizerResult]
  type DynamoDBStreamHandler = Handler[DynamoDBStreamEvent, Unit]
  type FirehoseTransformationCallback = Callback[FirehoseTransformationResult]
  type FirehoseTransformationHandler = Handler[FirehoseTransformationEvent, FirehoseTransformationResult]
  type Handler[TEvent, TResult] = js.Function3[
    /* event */ TEvent, 
    /* context */ Context, 
    /* callback */ Callback[TResult], 
    Unit | js.Promise[TResult]
  ]
  type KinesisStreamHandler = Handler[KinesisStreamEvent, Unit]
  type LexCallback = Callback[LexResult]
  type LexHandler = Handler[LexEvent, LexResult]
  type LexSlotDetails = StringDictionary[Anon_OriginalValue]
  type PrincipalValue = (StringDictionary[String | js.Array[String]]) | String | js.Array[String]
  type ProxyCallback = APIGatewayProxyCallback
  type ProxyHandler = APIGatewayProxyHandler
  type ProxyResult = APIGatewayProxyResult
  type S3BatchCallback = Callback[S3BatchResult]
  type S3BatchHandler = Handler[S3BatchEvent, S3BatchResult]
  type S3CreateEvent = S3Event
  type S3Handler = Handler[S3Event, Unit]
  type SNSHandler = Handler[SNSEvent, Unit]
  type SNSMessageAttributes = StringDictionary[SNSMessageAttribute]
  type SQSHandler = Handler[SQSEvent, Unit]
  /* Rewritten from type alias, can be one of: 
    - typings.awsDashLambda.awsDashLambdaStrings.String
    - typings.awsDashLambda.awsDashLambdaStrings.Number
    - typings.awsDashLambda.awsDashLambdaStrings.Binary
    - java.lang.String
  */
  type SQSMessageAttributeDataType = _SQSMessageAttributeDataType | String
  type SQSMessageAttributes = StringDictionary[SQSMessageAttribute]
  type ScheduledHandler = Handler[ScheduledEvent, Unit]
  type Statement = BaseStatement with StatementAction with (StatementResource | StatementPrincipal)
  type StatementPrincipal = MaybeStatementResource with (Anon_Principal | Anon_NotPrincipal)
  type StatementResource = MaybeStatementPrincipal with (Anon_Resource | Anon_NotResource)
}
