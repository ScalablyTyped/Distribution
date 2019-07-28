package typings.awsDashSdk.clientsLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountLimit extends js.Object {
  /**
    * The maximum size of your function's code and layers when they're extracted.
    */
  var CodeSizeUnzipped: js.UndefOr[Long] = js.undefined
  /**
    * The maximum size of a deployment package when it's uploaded directly to AWS Lambda. Use Amazon S3 for larger files.
    */
  var CodeSizeZipped: js.UndefOr[Long] = js.undefined
  /**
    * The maximum number of simultaneous function executions.
    */
  var ConcurrentExecutions: js.UndefOr[Integer] = js.undefined
  /**
    * The amount of storage space that you can use for all deployment packages and layer archives.
    */
  var TotalCodeSize: js.UndefOr[Long] = js.undefined
  /**
    * The maximum number of simultaneous function executions, minus the capacity that's reserved for individual functions with PutFunctionConcurrency.
    */
  var UnreservedConcurrentExecutions: js.UndefOr[typings.awsDashSdk.clientsLambdaMod.UnreservedConcurrentExecutions] = js.undefined
}

object AccountLimit {
  @scala.inline
  def apply(
    CodeSizeUnzipped: js.UndefOr[Long] = js.undefined,
    CodeSizeZipped: js.UndefOr[Long] = js.undefined,
    ConcurrentExecutions: js.UndefOr[Integer] = js.undefined,
    TotalCodeSize: js.UndefOr[Long] = js.undefined,
    UnreservedConcurrentExecutions: js.UndefOr[UnreservedConcurrentExecutions] = js.undefined
  ): AccountLimit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(CodeSizeUnzipped)) __obj.updateDynamic("CodeSizeUnzipped")(CodeSizeUnzipped)
    if (!js.isUndefined(CodeSizeZipped)) __obj.updateDynamic("CodeSizeZipped")(CodeSizeZipped)
    if (!js.isUndefined(ConcurrentExecutions)) __obj.updateDynamic("ConcurrentExecutions")(ConcurrentExecutions)
    if (!js.isUndefined(TotalCodeSize)) __obj.updateDynamic("TotalCodeSize")(TotalCodeSize)
    if (!js.isUndefined(UnreservedConcurrentExecutions)) __obj.updateDynamic("UnreservedConcurrentExecutions")(UnreservedConcurrentExecutions)
    __obj.asInstanceOf[AccountLimit]
  }
}

