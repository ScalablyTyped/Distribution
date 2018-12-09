package typings
package awsDashLambdaLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object awsDashLambdaMod {
  type APIGatewayEvent = APIGatewayProxyEvent
  type APIGatewayProxyCallback = Callback[APIGatewayProxyResult]
  type APIGatewayProxyHandler = Handler[APIGatewayProxyEvent, APIGatewayProxyResult]
  type ArtifactLocation = S3ArtifactStore
  type AuthResponse = CustomAuthorizerResult
  type Callback[TResult] = js.Function2[
    /* error */ js.UndefOr[stdLib.Error | scala.Null | java.lang.String], 
    /* result */ js.UndefOr[TResult], 
    scala.Unit
  ]
  type CloudFormationCustomResourceEvent = CloudFormationCustomResourceCreateEvent | CloudFormationCustomResourceUpdateEvent | CloudFormationCustomResourceDeleteEvent
  type CloudFormationCustomResourceHandler = Handler[CloudFormationCustomResourceEvent, scala.Unit]
  type CloudFormationCustomResourceResponse = CloudFormationCustomResourceSuccessResponse | CloudFormationCustomResourceFailedResponse
  type CloudFrontOrigin = awsDashLambdaLib.Anon_Custom | awsDashLambdaLib.Anon_CustomS3
  type CloudFrontRequestCallback = Callback[CloudFrontRequestResult]
  type CloudFrontRequestHandler = Handler[CloudFrontRequestEvent, CloudFrontRequestResult]
  type CloudFrontRequestResult = js.UndefOr[scala.Null | CloudFrontResultResponse | CloudFrontRequest]
  type CloudFrontResponseCallback = Callback[CloudFrontResponseResult]
  type CloudFrontResponseHandler = Handler[CloudFrontResponseEvent, CloudFrontResponseResult]
  type CloudFrontResponseResult = js.UndefOr[scala.Null | CloudFrontResultResponse]
  type CloudWatchLogsHandler = Handler[CloudWatchLogsEvent, scala.Unit]
  type CodePipelineHandler = Handler[CodePipelineEvent, scala.Unit]
  type CognitoUserPoolEvent = CognitoUserPoolTriggerEvent
  type CognitoUserPoolTriggerHandler = Handler[CognitoUserPoolTriggerEvent, js.Any]
  type CustomAuthorizerCallback = Callback[CustomAuthorizerResult]
  type CustomAuthorizerHandler = Handler[CustomAuthorizerEvent, CustomAuthorizerResult]
  type DynamoDBStreamHandler = Handler[DynamoDBStreamEvent, scala.Unit]
  type FirehoseRecordTransformationStatus = awsDashLambdaLib.awsDashLambdaLibStrings.Ok | awsDashLambdaLib.awsDashLambdaLibStrings.Dropped | awsDashLambdaLib.awsDashLambdaLibStrings.ProcessingFailed
  type FirehoseTransformationCallback = Callback[FirehoseTransformationResult]
  type FirehoseTransformationHandler = Handler[FirehoseTransformationEvent, FirehoseTransformationResult]
  type Handler[TEvent, TResult] = js.Function3[
    /* event */ TEvent, 
    /* context */ Context, 
    /* callback */ Callback[TResult], 
    scala.Unit | js.Promise[TResult]
  ]
  type KinesisStreamHandler = Handler[KinesisStreamEvent, scala.Unit]
  type PrincipalValue = (ScalablyTyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]) | java.lang.String | js.Array[java.lang.String]
  type ProxyCallback = APIGatewayProxyCallback
  type ProxyHandler = APIGatewayProxyHandler
  type ProxyResult = APIGatewayProxyResult
  type S3CreateEvent = S3Event
  type S3Handler = Handler[S3Event, scala.Unit]
  type SNSHandler = Handler[SNSEvent, scala.Unit]
  type SQSHandler = Handler[SQSEvent, scala.Unit]
  type ScheduledHandler = Handler[ScheduledEvent, scala.Unit]
  type Statement = BaseStatement with StatementAction with (StatementResource | StatementPrincipal)
  type StatementAction = awsDashLambdaLib.Anon_Action | awsDashLambdaLib.Anon_NotAction
  type StatementPrincipal = MaybeStatementResource with (awsDashLambdaLib.Anon_Principal | awsDashLambdaLib.Anon_NotPrincipal)
  type StatementResource = MaybeStatementPrincipal with (awsDashLambdaLib.Anon_Resource | awsDashLambdaLib.Anon_NotResource)
}
