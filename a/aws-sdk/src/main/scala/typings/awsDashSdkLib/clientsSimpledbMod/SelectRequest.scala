package typings
package awsDashSdkLib.clientsSimpledbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SelectRequest extends js.Object {
  /**
    * Determines whether or not strong consistency should be enforced when data is read from SimpleDB. If true, any data previously written to SimpleDB will be returned. Otherwise, results will be consistent eventually, and the client may not see data that was written immediately before your read.
    */
  var ConsistentRead: js.UndefOr[Boolean] = js.undefined
  /**
    * A string informing Amazon SimpleDB where to start the next list of ItemNames.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  /**
    * The expression used to query the domain.
    */
  var SelectExpression: String
}

object SelectRequest {
  @scala.inline
  def apply(
    SelectExpression: String,
    ConsistentRead: js.UndefOr[Boolean] = js.undefined,
    NextToken: String = null
  ): SelectRequest = {
    val __obj = js.Dynamic.literal(SelectExpression = SelectExpression)
    if (!js.isUndefined(ConsistentRead)) __obj.updateDynamic("ConsistentRead")(ConsistentRead)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[SelectRequest]
  }
}

