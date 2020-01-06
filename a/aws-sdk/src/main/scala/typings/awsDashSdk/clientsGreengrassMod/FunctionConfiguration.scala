package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionConfiguration extends js.Object {
  /**
    * The expected encoding type of the input payload for the function. The default is ''json''.
    */
  var EncodingType: js.UndefOr[typings.awsDashSdk.clientsGreengrassMod.EncodingType] = js.native
  /**
    * The environment configuration of the function.
    */
  var Environment: js.UndefOr[FunctionConfigurationEnvironment] = js.native
  /**
    * The execution arguments.
    */
  var ExecArgs: js.UndefOr[__string] = js.native
  /**
    * The name of the function executable.
    */
  var Executable: js.UndefOr[__string] = js.native
  /**
    * The memory size, in KB, which the function requires. This setting is not applicable and should be cleared when you run the Lambda function without containerization.
    */
  var MemorySize: js.UndefOr[__integer] = js.native
  /**
    * True if the function is pinned. Pinned means the function is long-lived and starts when the core starts.
    */
  var Pinned: js.UndefOr[__boolean] = js.native
  /**
    * The allowed function execution time, after which Lambda should terminate the function. This timeout still applies to pinned Lambda functions for each request.
    */
  var Timeout: js.UndefOr[__integer] = js.native
}

object FunctionConfiguration {
  @scala.inline
  def apply(
    EncodingType: EncodingType = null,
    Environment: FunctionConfigurationEnvironment = null,
    ExecArgs: __string = null,
    Executable: __string = null,
    MemorySize: Int | Double = null,
    Pinned: js.UndefOr[Boolean] = js.undefined,
    Timeout: Int | Double = null
  ): FunctionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (EncodingType != null) __obj.updateDynamic("EncodingType")(EncodingType.asInstanceOf[js.Any])
    if (Environment != null) __obj.updateDynamic("Environment")(Environment.asInstanceOf[js.Any])
    if (ExecArgs != null) __obj.updateDynamic("ExecArgs")(ExecArgs.asInstanceOf[js.Any])
    if (Executable != null) __obj.updateDynamic("Executable")(Executable.asInstanceOf[js.Any])
    if (MemorySize != null) __obj.updateDynamic("MemorySize")(MemorySize.asInstanceOf[js.Any])
    if (!js.isUndefined(Pinned)) __obj.updateDynamic("Pinned")(Pinned.asInstanceOf[js.Any])
    if (Timeout != null) __obj.updateDynamic("Timeout")(Timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionConfiguration]
  }
}

