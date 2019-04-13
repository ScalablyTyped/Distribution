package typings
package awsDashSdkLib.clientsDynamodbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeTableOutput extends js.Object {
  /**
    * The properties of the table.
    */
  var Table: js.UndefOr[TableDescription] = js.undefined
}

object DescribeTableOutput {
  @scala.inline
  def apply(Table: TableDescription = null): DescribeTableOutput = {
    val __obj = js.Dynamic.literal()
    if (Table != null) __obj.updateDynamic("Table")(Table)
    __obj.asInstanceOf[DescribeTableOutput]
  }
}

