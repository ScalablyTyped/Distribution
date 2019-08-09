package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TaskRunSortCriteria extends js.Object {
  /**
    * The column to be used to sort the list of task runs for the machine learning transform.
    */
  var Column: TaskRunSortColumnType
  /**
    * The sort direction to be used to sort the list of task runs for the machine learning transform.
    */
  var SortDirection: SortDirectionType
}

object TaskRunSortCriteria {
  @scala.inline
  def apply(Column: TaskRunSortColumnType, SortDirection: SortDirectionType): TaskRunSortCriteria = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], SortDirection = SortDirection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TaskRunSortCriteria]
  }
}

