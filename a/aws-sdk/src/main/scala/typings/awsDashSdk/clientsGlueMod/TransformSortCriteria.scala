package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransformSortCriteria extends js.Object {
  /**
    * The column to be used in the sorting criteria that are associated with the machine learning transform.
    */
  var Column: TransformSortColumnType
  /**
    * The sort direction to be used in the sorting criteria that are associated with the machine learning transform.
    */
  var SortDirection: SortDirectionType
}

object TransformSortCriteria {
  @scala.inline
  def apply(Column: TransformSortColumnType, SortDirection: SortDirectionType): TransformSortCriteria = {
    val __obj = js.Dynamic.literal(Column = Column.asInstanceOf[js.Any], SortDirection = SortDirection.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TransformSortCriteria]
  }
}

