package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateFunctionRequest extends js.Object {
  /**
    * The code for the function.
    */
  var Code: FunctionCode
  /**
    * A dead letter queue configuration that specifies the queue or topic where Lambda sends asynchronous events when they fail processing. For more information, see Dead Letter Queues.
    */
  var DeadLetterConfig: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.DeadLetterConfig] = js.undefined
  /**
    * A description of the function.
    */
  var Description: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.Description] = js.undefined
  /**
    * Environment variables that are accessible from function code during execution.
    */
  var Environment: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.Environment] = js.undefined
  /**
    * The name of the Lambda function.  Name formats     Function name - my-function.    Function ARN - arn:aws:lambda:us-west-2:123456789012:function:my-function.    Partial ARN - 123456789012:function:my-function.   The length constraint applies only to the full ARN. If you specify only the function name, it is limited to 64 characters in length.
    */
  var FunctionName: typings.awsDashSdk.clientsLambdaMod.FunctionName
  /**
    * The name of the method within your code that Lambda calls to execute your function. The format includes the file name. It can also include namespaces and other qualifiers, depending on the runtime. For more information, see Programming Model.
    */
  var Handler: typings.awsDashSdk.clientsLambdaMod.Handler
  /**
    * The ARN of the AWS Key Management Service (AWS KMS) key that's used to encrypt your function's environment variables. If it's not provided, AWS Lambda uses a default service key.
    */
  var KMSKeyArn: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.KMSKeyArn] = js.undefined
  /**
    * A list of function layers to add to the function's execution environment. Specify each layer by its ARN, including the version.
    */
  var Layers: js.UndefOr[LayerList] = js.undefined
  /**
    * The amount of memory that your function has access to. Increasing the function's memory also increases its CPU allocation. The default value is 128 MB. The value must be a multiple of 64 MB.
    */
  var MemorySize: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.MemorySize] = js.undefined
  /**
    * Set to true to publish the first version of the function during creation.
    */
  var Publish: js.UndefOr[Boolean] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the function's execution role.
    */
  var Role: RoleArn
  /**
    * The identifier of the function's runtime.
    */
  var Runtime: typings.awsDashSdk.clientsLambdaMod.Runtime
  /**
    * A list of tags to apply to the function.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.Tags] = js.undefined
  /**
    * The amount of time that Lambda allows a function to run before stopping it. The default is 3 seconds. The maximum allowed value is 900 seconds.
    */
  var Timeout: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.Timeout] = js.undefined
  /**
    * Set Mode to Active to sample and trace a subset of incoming requests with AWS X-Ray.
    */
  var TracingConfig: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.TracingConfig] = js.undefined
  /**
    * For network connectivity to AWS resources in a VPC, specify a list of security groups and subnets in the VPC. When you connect a function to a VPC, it can only access resources and the internet through that VPC. For more information, see VPC Settings.
    */
  var VpcConfig: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.VpcConfig] = js.undefined
}

object CreateFunctionRequest {
  @scala.inline
  def apply(
    Code: FunctionCode,
    FunctionName: FunctionName,
    Handler: Handler,
    Role: RoleArn,
    Runtime: Runtime,
    DeadLetterConfig: DeadLetterConfig = null,
    Description: Description = null,
    Environment: Environment = null,
    KMSKeyArn: KMSKeyArn = null,
    Layers: LayerList = null,
    MemorySize: Int | Double = null,
    Publish: js.UndefOr[scala.Boolean] = js.undefined,
    Tags: Tags = null,
    Timeout: Int | Double = null,
    TracingConfig: TracingConfig = null,
    VpcConfig: VpcConfig = null
  ): CreateFunctionRequest = {
    val __obj = js.Dynamic.literal(Code = Code, FunctionName = FunctionName, Handler = Handler, Role = Role, Runtime = Runtime.asInstanceOf[js.Any])
    if (DeadLetterConfig != null) __obj.updateDynamic("DeadLetterConfig")(DeadLetterConfig)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Environment != null) __obj.updateDynamic("Environment")(Environment)
    if (KMSKeyArn != null) __obj.updateDynamic("KMSKeyArn")(KMSKeyArn)
    if (Layers != null) __obj.updateDynamic("Layers")(Layers)
    if (MemorySize != null) __obj.updateDynamic("MemorySize")(MemorySize.asInstanceOf[js.Any])
    if (!js.isUndefined(Publish)) __obj.updateDynamic("Publish")(Publish)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (Timeout != null) __obj.updateDynamic("Timeout")(Timeout.asInstanceOf[js.Any])
    if (TracingConfig != null) __obj.updateDynamic("TracingConfig")(TracingConfig)
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig)
    __obj.asInstanceOf[CreateFunctionRequest]
  }
}

