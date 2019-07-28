package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListImportsInput extends js.Object {
  /**
    * The name of the exported output value. AWS CloudFormation returns the stack names that are importing this value. 
    */
  var ExportName: typings.awsDashSdk.clientsCloudformationMod.ExportName
  /**
    * A string (provided by the ListImports response output) that identifies the next page of stacks that are importing the specified exported output value. 
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.NextToken] = js.undefined
}

object ListImportsInput {
  @scala.inline
  def apply(ExportName: ExportName, NextToken: NextToken = null): ListImportsInput = {
    val __obj = js.Dynamic.literal(ExportName = ExportName)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListImportsInput]
  }
}

