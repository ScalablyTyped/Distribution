package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Schedule extends js.Object {
  /**
    * The expression that defines when to trigger an update. For more information, see  Schedule Expressions for Rules in the Amazon CloudWatch Events User Guide.
    */
  var expression: js.UndefOr[ScheduleExpression] = js.undefined
}

object Schedule {
  @scala.inline
  def apply(expression: ScheduleExpression = null): Schedule = {
    val __obj = js.Dynamic.literal()
    if (expression != null) __obj.updateDynamic("expression")(expression)
    __obj.asInstanceOf[Schedule]
  }
}

