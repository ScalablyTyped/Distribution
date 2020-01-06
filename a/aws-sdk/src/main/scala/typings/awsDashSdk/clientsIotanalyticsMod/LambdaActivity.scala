package typings.awsDashSdk.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LambdaActivity extends js.Object {
  /**
    * The number of messages passed to the Lambda function for processing. The AWS Lambda function must be able to process all of these messages within five minutes, which is the maximum timeout duration for Lambda functions.
    */
  var batchSize: ActivityBatchSize = js.native
  /**
    * The name of the Lambda function that is run on the message.
    */
  var lambdaName: LambdaName = js.native
  /**
    * The name of the 'lambda' activity.
    */
  var name: ActivityName = js.native
  /**
    * The next activity in the pipeline.
    */
  var next: js.UndefOr[ActivityName] = js.native
}

object LambdaActivity {
  @scala.inline
  def apply(
    batchSize: ActivityBatchSize,
    lambdaName: LambdaName,
    name: ActivityName,
    next: ActivityName = null
  ): LambdaActivity = {
    val __obj = js.Dynamic.literal(batchSize = batchSize.asInstanceOf[js.Any], lambdaName = lambdaName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (next != null) __obj.updateDynamic("next")(next.asInstanceOf[js.Any])
    __obj.asInstanceOf[LambdaActivity]
  }
}

