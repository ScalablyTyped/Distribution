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
    CodeSizeUnzipped: Int | Double = null,
    CodeSizeZipped: Int | Double = null,
    ConcurrentExecutions: Int | Double = null,
    TotalCodeSize: Int | Double = null,
    UnreservedConcurrentExecutions: Int | Double = null
  ): AccountLimit = {
    val __obj = js.Dynamic.literal()
    if (CodeSizeUnzipped != null) __obj.updateDynamic("CodeSizeUnzipped")(CodeSizeUnzipped.asInstanceOf[js.Any])
    if (CodeSizeZipped != null) __obj.updateDynamic("CodeSizeZipped")(CodeSizeZipped.asInstanceOf[js.Any])
    if (ConcurrentExecutions != null) __obj.updateDynamic("ConcurrentExecutions")(ConcurrentExecutions.asInstanceOf[js.Any])
    if (TotalCodeSize != null) __obj.updateDynamic("TotalCodeSize")(TotalCodeSize.asInstanceOf[js.Any])
    if (UnreservedConcurrentExecutions != null) __obj.updateDynamic("UnreservedConcurrentExecutions")(UnreservedConcurrentExecutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccountLimit]
  }
}

