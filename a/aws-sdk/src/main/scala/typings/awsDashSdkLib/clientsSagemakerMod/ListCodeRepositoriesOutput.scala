package typings
package awsDashSdkLib.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListCodeRepositoriesOutput extends js.Object {
  /**
    * Gets a list of summaries of the Git repositories. Each summary specifies the following values for the repository:    Name   Amazon Resource Name (ARN)   Creation time   Last modified time   Configuration information, including the URL location of the repository and the ARN of the AWS Secrets Manager secret that contains the credentials used to access the repository.  
    */
  var CodeRepositorySummaryList: awsDashSdkLib.clientsSagemakerMod.CodeRepositorySummaryList
  /**
    * If the result of a ListCodeRepositoriesOutput request was truncated, the response includes a NextToken. To get the next set of Git repositories, use the token in the next request.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListCodeRepositoriesOutput {
  @scala.inline
  def apply(CodeRepositorySummaryList: CodeRepositorySummaryList, NextToken: NextToken = null): ListCodeRepositoriesOutput = {
    val __obj = js.Dynamic.literal(CodeRepositorySummaryList = CodeRepositorySummaryList)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListCodeRepositoriesOutput]
  }
}

