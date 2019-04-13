package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LambdaActivity extends js.Object {
  /**
    * The number of messages passed to the Lambda function for processing. The AWS Lambda function must be able to process all of these messages within five minutes, which is the maximum timeout duration for Lambda functions.
    */
  var batchSize: ActivityBatchSize
  /**
    * The name of the Lambda function that is run on the message.
    */
  var lambdaName: LambdaName
  /**
    * The name of the 'lambda' activity.
    */
  var name: ActivityName
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.undefined
}

object LambdaActivity {
  @scala.inline
  def apply(
    batchSize: ActivityBatchSize,
    lambdaName: LambdaName,
    name: ActivityName,
    next: ActivityName = null
  ): LambdaActivity = {
    val __obj = js.Dynamic.literal(batchSize = batchSize, lambdaName = lambdaName, name = name)
    if (next != null) __obj.updateDynamic("next")(next)
    __obj.asInstanceOf[LambdaActivity]
  }
}

