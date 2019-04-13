package typings
package awsDashSdkLib.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionConfiguration extends js.Object {
  /**
    * The SHA256 hash of the function's deployment package.
    */
  var CodeSha256: js.UndefOr[String] = js.undefined
  /**
    * The size of the function's deployment package, in bytes.
    */
  var CodeSize: js.UndefOr[Long] = js.undefined
  /**
    * The function's dead letter queue.
    */
  var DeadLetterConfig: js.UndefOr[DeadLetterConfig] = js.undefined
  /**
    * The function's description.
    */
  var Description: js.UndefOr[Description] = js.undefined
  /**
    * The function's environment variables.
    */
  var Environment: js.UndefOr[EnvironmentResponse] = js.undefined
  /**
    * The function's Amazon Resource Name (ARN).
    */
  var FunctionArn: js.UndefOr[NameSpacedFunctionArn] = js.undefined
  /**
    * The name of the function.
    */
  var FunctionName: js.UndefOr[NamespacedFunctionName] = js.undefined
  /**
    * The function that Lambda calls to begin executing your function.
    */
  var Handler: js.UndefOr[Handler] = js.undefined
  /**
    * The KMS key that's used to encrypt the function's environment variables. This key is only returned if you've configured a customer-managed CMK.
    */
  var KMSKeyArn: js.UndefOr[KMSKeyArn] = js.undefined
  /**
    * The date and time that the function was last updated, in ISO-8601 format (YYYY-MM-DDThh:mm:ss.sTZD).
    */
  var LastModified: js.UndefOr[Timestamp] = js.undefined
  /**
    * The function's  layers.
    */
  var Layers: js.UndefOr[LayersReferenceList] = js.undefined
  /**
    * For Lambda@Edge functions, the ARN of the master function.
    */
  var MasterArn: js.UndefOr[FunctionArn] = js.undefined
  /**
    * The memory that's allocated to the function.
    */
  var MemorySize: js.UndefOr[MemorySize] = js.undefined
  /**
    * The latest updated revision of the function or alias.
    */
  var RevisionId: js.UndefOr[String] = js.undefined
  /**
    * The function's execution role.
    */
  var Role: js.UndefOr[RoleArn] = js.undefined
  /**
    * The runtime environment for the Lambda function.
    */
  var Runtime: js.UndefOr[Runtime] = js.undefined
  /**
    * The amount of time that Lambda allows a function to run before stopping it.
    */
  var Timeout: js.UndefOr[Timeout] = js.undefined
  /**
    * The function's AWS X-Ray tracing configuration.
    */
  var TracingConfig: js.UndefOr[TracingConfigResponse] = js.undefined
  /**
    * The version of the Lambda function.
    */
  var Version: js.UndefOr[Version] = js.undefined
  /**
    * The function's networking configuration.
    */
  var VpcConfig: js.UndefOr[VpcConfigResponse] = js.undefined
}

object FunctionConfiguration {
  @scala.inline
  def apply(
    CodeSha256: String = null,
    CodeSize: js.UndefOr[Long] = js.undefined,
    DeadLetterConfig: DeadLetterConfig = null,
    Description: Description = null,
    Environment: EnvironmentResponse = null,
    FunctionArn: NameSpacedFunctionArn = null,
    FunctionName: NamespacedFunctionName = null,
    Handler: Handler = null,
    KMSKeyArn: KMSKeyArn = null,
    LastModified: Timestamp = null,
    Layers: LayersReferenceList = null,
    MasterArn: FunctionArn = null,
    MemorySize: js.UndefOr[MemorySize] = js.undefined,
    RevisionId: String = null,
    Role: RoleArn = null,
    Runtime: Runtime = null,
    Timeout: js.UndefOr[Timeout] = js.undefined,
    TracingConfig: TracingConfigResponse = null,
    Version: Version = null,
    VpcConfig: VpcConfigResponse = null
  ): FunctionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (CodeSha256 != null) __obj.updateDynamic("CodeSha256")(CodeSha256)
    if (!js.isUndefined(CodeSize)) __obj.updateDynamic("CodeSize")(CodeSize)
    if (DeadLetterConfig != null) __obj.updateDynamic("DeadLetterConfig")(DeadLetterConfig)
    if (Description != null) __obj.updateDynamic("Description")(Description)
    if (Environment != null) __obj.updateDynamic("Environment")(Environment)
    if (FunctionArn != null) __obj.updateDynamic("FunctionArn")(FunctionArn)
    if (FunctionName != null) __obj.updateDynamic("FunctionName")(FunctionName)
    if (Handler != null) __obj.updateDynamic("Handler")(Handler)
    if (KMSKeyArn != null) __obj.updateDynamic("KMSKeyArn")(KMSKeyArn)
    if (LastModified != null) __obj.updateDynamic("LastModified")(LastModified)
    if (Layers != null) __obj.updateDynamic("Layers")(Layers)
    if (MasterArn != null) __obj.updateDynamic("MasterArn")(MasterArn)
    if (!js.isUndefined(MemorySize)) __obj.updateDynamic("MemorySize")(MemorySize)
    if (RevisionId != null) __obj.updateDynamic("RevisionId")(RevisionId)
    if (Role != null) __obj.updateDynamic("Role")(Role)
    if (Runtime != null) __obj.updateDynamic("Runtime")(Runtime.asInstanceOf[js.Any])
    if (!js.isUndefined(Timeout)) __obj.updateDynamic("Timeout")(Timeout)
    if (TracingConfig != null) __obj.updateDynamic("TracingConfig")(TracingConfig)
    if (Version != null) __obj.updateDynamic("Version")(Version)
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig)
    __obj.asInstanceOf[FunctionConfiguration]
  }
}

