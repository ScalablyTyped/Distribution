package typings.awsLambda

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type ALBCallback = typings.awsLambda.mod.Callback[typings.awsLambda.mod.ALBResult]
  type ALBHandler = typings.awsLambda.mod.Handler[typings.awsLambda.mod.ALBEvent, typings.awsLambda.mod.ALBResult]
  type APIGatewayEvent = typings.awsLambda.mod.APIGatewayProxyEvent
  type APIGatewayProxyCallback = typings.awsLambda.mod.Callback[typings.awsLambda.mod.APIGatewayProxyResult]
  type APIGatewayProxyHandler = typings.awsLambda.mod.Handler[
    typings.awsLambda.mod.APIGatewayProxyEvent, 
    typings.awsLambda.mod.APIGatewayProxyResult
  ]
  type ArtifactLocation = typings.awsLambda.mod.S3ArtifactStore
  type AuthResponse = typings.awsLambda.mod.CustomAuthorizerResult
  type AuthResponseContext = org.scalablytyped.runtime.StringDictionary[js.Any]
  type Callback[TResult] = js.Function2[
    /* error */ js.UndefOr[typings.std.Error | scala.Null | java.lang.String], 
    /* result */ js.UndefOr[TResult], 
    scala.Unit
  ]
  type CloudFormationCustomResourceHandler = typings.awsLambda.mod.Handler[typings.awsLambda.mod.CloudFormationCustomResourceEvent, scala.Unit]
  type CloudFrontHeaders = org.scalablytyped.runtime.StringDictionary[js.Array[typings.awsLambda.AnonKeyValue]]
  type CloudFrontRequestCallback = typings.awsLambda.mod.Callback[typings.awsLambda.mod.CloudFrontRequestResult]
  type CloudFrontRequestHandler = typings.awsLambda.mod.Handler[
    typings.awsLambda.mod.CloudFrontRequestEvent, 
    typings.awsLambda.mod.CloudFrontRequestResult
  ]
  /* Rewritten from type alias, can be one of: 
    - `js.undefined`
    - scala.Null
    - typings.awsLambda.mod.CloudFrontResultResponse
    - typings.awsLambda.mod.CloudFrontRequest
  */
  type CloudFrontRequestResult = js.UndefOr[typings.awsLambda.mod._CloudFrontRequestResult | scala.Null]
  type CloudFrontResponseCallback = typings.awsLambda.mod.Callback[typings.awsLambda.mod.CloudFrontResponseResult]
  type CloudFrontResponseHandler = typings.awsLambda.mod.Handler[
    typings.awsLambda.mod.CloudFrontResponseEvent, 
    typings.awsLambda.mod.CloudFrontResponseResult
  ]
  type CloudFrontResponseResult = js.UndefOr[scala.Null | typings.awsLambda.mod.CloudFrontResultResponse]
  type CloudWatchLogsHandler = typings.awsLambda.mod.Handler[typings.awsLambda.mod.CloudWatchLogsEvent, scala.Unit]
  type CodePipelineCloudWatchActionHandler = typings.awsLambda.mod.Handler[typings.awsLambda.mod.CodePipelineCloudWatchActionEvent, scala.Unit]
  type CodePipelineCloudWatchHandler = typings.awsLambda.mod.Handler[typings.awsLambda.mod.CodePipelineCloudWatchEvent, scala.Unit]
  type CodePipelineCloudWatchPipelineHandler = typings.awsLambda.mod.Handler[typings.awsLambda.mod.CodePipelineCloudWatchPipelineEvent, scala.Unit]
  type CodePipelineCloudWatchStageHandler = typings.awsLambda.mod.Handler[typings.awsLambda.mod.CodePipelineCloudWatchStageEvent, scala.Unit]
  type CodePipelineHandler = typings.awsLambda.mod.Handler[typings.awsLambda.mod.CodePipelineEvent, scala.Unit]
  type CognitoUserPoolEvent = typings.awsLambda.mod.CognitoUserPoolTriggerEvent
  type CognitoUserPoolTriggerHandler = typings.awsLambda.mod.Handler[typings.awsLambda.mod.CognitoUserPoolTriggerEvent, js.Any]
  type Condition = org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]
  type ConditionBlock = org.scalablytyped.runtime.StringDictionary[typings.awsLambda.mod.Condition | js.Array[typings.awsLambda.mod.Condition]]
  type CustomAuthorizerCallback = typings.awsLambda.mod.Callback[typings.awsLambda.mod.CustomAuthorizerResult]
  type CustomAuthorizerHandler = typings.awsLambda.mod.Handler[
    typings.awsLambda.mod.CustomAuthorizerEvent, 
    typings.awsLambda.mod.CustomAuthorizerResult
  ]
  type DynamoDBStreamHandler = typings.awsLambda.mod.Handler[typings.awsLambda.mod.DynamoDBStreamEvent, scala.Unit]
  type FirehoseTransformationCallback = typings.awsLambda.mod.Callback[typings.awsLambda.mod.FirehoseTransformationResult]
  type FirehoseTransformationHandler = typings.awsLambda.mod.Handler[
    typings.awsLambda.mod.FirehoseTransformationEvent, 
    typings.awsLambda.mod.FirehoseTransformationResult
  ]
  type Handler[TEvent, TResult] = js.Function3[
    /* event */ TEvent, 
    /* context */ typings.awsLambda.mod.Context, 
    /* callback */ typings.awsLambda.mod.Callback[TResult], 
    scala.Unit | js.Promise[TResult]
  ]
  type KinesisStreamHandler = typings.awsLambda.mod.Handler[typings.awsLambda.mod.KinesisStreamEvent, scala.Unit]
  type LexCallback = typings.awsLambda.mod.Callback[typings.awsLambda.mod.LexResult]
  type LexHandler = typings.awsLambda.mod.Handler[typings.awsLambda.mod.LexEvent, typings.awsLambda.mod.LexResult]
  type LexSlotDetails = org.scalablytyped.runtime.StringDictionary[typings.awsLambda.AnonOriginalValue]
  type PrincipalValue = (org.scalablytyped.runtime.StringDictionary[java.lang.String | js.Array[java.lang.String]]) | java.lang.String | js.Array[java.lang.String]
  type ProxyCallback = typings.awsLambda.mod.APIGatewayProxyCallback
  type ProxyHandler = typings.awsLambda.mod.APIGatewayProxyHandler
  type ProxyResult = typings.awsLambda.mod.APIGatewayProxyResult
  type S3BatchCallback = typings.awsLambda.mod.Callback[typings.awsLambda.mod.S3BatchResult]
  type S3BatchHandler = typings.awsLambda.mod.Handler[typings.awsLambda.mod.S3BatchEvent, typings.awsLambda.mod.S3BatchResult]
  type S3CreateEvent = typings.awsLambda.mod.S3Event
  type S3Handler = typings.awsLambda.mod.Handler[typings.awsLambda.mod.S3Event, scala.Unit]
  type SNSHandler = typings.awsLambda.mod.Handler[typings.awsLambda.mod.SNSEvent, scala.Unit]
  type SNSMessageAttributes = org.scalablytyped.runtime.StringDictionary[typings.awsLambda.mod.SNSMessageAttribute]
  type SQSHandler = typings.awsLambda.mod.Handler[typings.awsLambda.mod.SQSEvent, scala.Unit]
  /* Rewritten from type alias, can be one of: 
    - typings.awsLambda.awsLambdaStrings.String
    - typings.awsLambda.awsLambdaStrings.Number
    - typings.awsLambda.awsLambdaStrings.Binary
    - java.lang.String
  */
  type SQSMessageAttributeDataType = typings.awsLambda.mod._SQSMessageAttributeDataType | java.lang.String
  type SQSMessageAttributes = org.scalablytyped.runtime.StringDictionary[typings.awsLambda.mod.SQSMessageAttribute]
  type ScheduledHandler = typings.awsLambda.mod.Handler[typings.awsLambda.mod.ScheduledEvent, scala.Unit]
  type Statement = typings.awsLambda.mod.BaseStatement with typings.awsLambda.mod.StatementAction with (typings.awsLambda.mod.StatementResource | typings.awsLambda.mod.StatementPrincipal)
  type StatementPrincipal = typings.awsLambda.mod.MaybeStatementResource with (typings.awsLambda.AnonPrincipal | typings.awsLambda.AnonNotPrincipal)
  type StatementResource = typings.awsLambda.mod.MaybeStatementPrincipal with (typings.awsLambda.AnonResource | typings.awsLambda.AnonNotResource)
}
