package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListModelPackagesOutput extends js.Object {
  /**
    * An array of ModelPackageSummary objects, each of which lists a model package.
    */
  var ModelPackageSummaryList: awsDashSdkLib.clientsSagemakerMod.ModelPackageSummaryList
  /**
    * If the response is truncated, Amazon SageMaker returns this token. To retrieve the next set of model packages, use it in the subsequent request.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListModelPackagesOutput {
  @scala.inline
  def apply(ModelPackageSummaryList: ModelPackageSummaryList, NextToken: NextToken = null): ListModelPackagesOutput = {
    val __obj = js.Dynamic.literal(ModelPackageSummaryList = ModelPackageSummaryList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListModelPackagesOutput]
  }
}

