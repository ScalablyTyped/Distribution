package typings.awsDashSdk.clientsGreengrassMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FunctionConfiguration extends js.Object {
  /**
    * The expected encoding type of the input payload for the function. The default is ''json''.
    */
  var EncodingType: js.UndefOr[typings.awsDashSdk.clientsGreengrassMod.EncodingType] = js.undefined
  /**
    * The environment configuration of the function.
    */
  var Environment: js.UndefOr[FunctionConfigurationEnvironment] = js.undefined
  /**
    * The execution arguments.
    */
  var ExecArgs: js.UndefOr[__string] = js.undefined
  /**
    * The name of the function executable.
    */
  var Executable: js.UndefOr[__string] = js.undefined
  /**
    * The memory size, in KB, which the function requires. This setting is not applicable and should be cleared when you run the Lambda function without containerization.
    */
  var MemorySize: js.UndefOr[__integer] = js.undefined
  /**
    * True if the function is pinned. Pinned means the function is long-lived and starts when the core starts.
    */
  var Pinned: js.UndefOr[__boolean] = js.undefined
  /**
    * The allowed function execution time, after which Lambda should terminate the function. This timeout still applies to pinned Lambda functions for each request.
    */
  var Timeout: js.UndefOr[__integer] = js.undefined
}

object FunctionConfiguration {
  @scala.inline
  def apply(
    EncodingType: EncodingType = null,
    Environment: FunctionConfigurationEnvironment = null,
    ExecArgs: __string = null,
    Executable: __string = null,
    MemorySize: js.UndefOr[__integer] = js.undefined,
    Pinned: js.UndefOr[__boolean] = js.undefined,
    Timeout: js.UndefOr[__integer] = js.undefined
  ): FunctionConfiguration = {
    val __obj = js.Dynamic.literal()
    if (EncodingType != null) __obj.updateDynamic("EncodingType")(EncodingType.asInstanceOf[js.Any])
    if (Environment != null) __obj.updateDynamic("Environment")(Environment)
    if (ExecArgs != null) __obj.updateDynamic("ExecArgs")(ExecArgs)
    if (Executable != null) __obj.updateDynamic("Executable")(Executable)
    if (!js.isUndefined(MemorySize)) __obj.updateDynamic("MemorySize")(MemorySize)
    if (!js.isUndefined(Pinned)) __obj.updateDynamic("Pinned")(Pinned)
    if (!js.isUndefined(Timeout)) __obj.updateDynamic("Timeout")(Timeout)
    __obj.asInstanceOf[FunctionConfiguration]
  }
}

