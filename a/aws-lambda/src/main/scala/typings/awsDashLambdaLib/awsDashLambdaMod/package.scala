package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object awsDashLambdaMod {
  type ALBCallback = Callback[ALBResult]
  type ALBHandler = Handler[ALBEvent, ALBResult]
  type APIGatewayEvent = APIGatewayProxyEvent
  type APIGatewayProxyCallback = Callback[APIGatewayProxyResult]
  type APIGatewayProxyHandler = Handler[APIGatewayProxyEvent, APIGatewayProxyResult]
  type ArtifactLocation = S3ArtifactStore
  type AuthResponse = CustomAuthorizerResult
  type AuthResponseContext = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Callback[TResult] = js.Function2[
    /* error */ js.UndefOr[stdLib.Error | scala.Null | java.lang.String], 
    /* result */ js.UndefOr[TResult], 
    scala.Unit
  ]
  type CloudFormationCustomResourceHandler = Handler[CloudFormationCustomResourceEvent, scala.Unit]
  type CloudFrontHeaders = org.scalablytyped.runtime.StringDictionary[js.Array[awsDashLambdaLib.Anon_KeyValue]]
  type CloudFrontRequestCallback = Callback[CloudFrontRequestResult]
  type CloudFrontRequestHandler = Handler[CloudFrontRequestEvent, CloudFrontRequestResult]
  /* Rewritten from type alias, can be one of: 
    - `js.undefined`
    - scala.Nothing
    - scala.Null
    - CloudFrontResultResponse
    - CloudFrontRequest
  */
  type CloudFrontRequestResult = js.UndefOr[_CloudFrontRequestResult | scala.Null]
  type CloudFrontResponseCallback = Callback[CloudFrontResponseResult]
  type CloudFrontResponseHandler = Handler[CloudFrontResponseEvent, CloudFrontResponseResult]
  type CloudFrontResponseResult = js.UndefOr[scala.Null | CloudFrontResultResponse]
  type CloudWatchLogsHandler = Handler[CloudWatchLogsEvent, scala.Unit]
  type CodePipelineCloudWatchActionHandler = Handler[CodePipelineCloudWatchActionEvent, scala.Unit]
  type CodePipelineCloudWatchHandler = Handler[CodePipelineCloudWatchEvent, scala.Unit]
  type CodePipelineCloudWatchPipelineHandler = Handler[CodePipelineCloudWatchPipelineEvent, scala.Unit]
  type CodePipelineCloudWatchStageHandler = Handler[CodePipelineCloudWatchStageEvent, scala.Unit]
  type CodePipelineHandler = Handler[CodePipelineEvent, scala.Unit]
  type CognitoUserPoolEvent = CognitoUserPoolTriggerEvent
  type CognitoUserPoolTriggerHandler = Handler[CognitoUserPoolTriggerEvent, js.Any]
  type Condition = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type ConditionBlock = org.scalablytyped.runtime.StringDictionary[Condition | js.Array[Condition]]
  type CustomAuthorizerCallback = Callback[CustomAuthorizerResult]
  type CustomAuthorizerHandler = Handler[CustomAuthorizerEvent, CustomAuthorizerResult]
  type DynamoDBStreamHandler = Handler[DynamoDBStreamEvent, scala.Unit]
  type FirehoseTransformationCallback = Callback[FirehoseTransformationResult]
  type FirehoseTransformationHandler = Handler[FirehoseTransformationEvent, FirehoseTransformationResult]
  type Handler[TEvent, TResult] = js.Function3[
    /* event */ TEvent, 
    /* context */ Context, 
    /* callback */ Callback[TResult], 
    scala.Unit | js.Promise[TResult]
  ]
  type KinesisStreamHandler = Handler[KinesisStreamEvent, scala.Unit]
  type LexCallback = Callback[LexResult]
  type LexHandler = Handler[LexEvent, LexResult]
  type LexSlotDetails = org.scalablytyped.runtime.StringDictionary[awsDashLambdaLib.Anon_OriginalValue]
  type PrincipalValue = (org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]) | java.lang.String | js.Array[java.lang.String]
  type ProxyCallback = APIGatewayProxyCallback
  type ProxyHandler = APIGatewayProxyHandler
  type ProxyResult = APIGatewayProxyResult
  type S3CreateEvent = S3Event
  type S3Handler = Handler[S3Event, scala.Unit]
  type SNSHandler = Handler[SNSEvent, scala.Unit]
  type SNSMessageAttributes = org.scalablytyped.runtime.StringDictionary[SNSMessageAttribute]
  type SQSHandler = Handler[SQSEvent, scala.Unit]
  /* Rewritten from type alias, can be one of: 
    - awsDashLambdaLib.awsDashLambdaLibStrings.String
    - awsDashLambdaLib.awsDashLambdaLibStrings.Number
    - awsDashLambdaLib.awsDashLambdaLibStrings.Binary
    - java.lang.String
  */
  type SQSMessageAttributeDataType = _SQSMessageAttributeDataType | java.lang.String
  type SQSMessageAttributes = org.scalablytyped.runtime.StringDictionary[SQSMessageAttribute]
  type ScheduledHandler = Handler[ScheduledEvent, scala.Unit]
  type Statement = BaseStatement with StatementAction with (StatementResource | StatementPrincipal)
  type StatementPrincipal = MaybeStatementResource with (awsDashLambdaLib.Anon_Principal | awsDashLambdaLib.Anon_NotPrincipal)
  type StatementResource = MaybeStatementPrincipal with (awsDashLambdaLib.Anon_Resource | awsDashLambdaLib.Anon_NotResource)
}
