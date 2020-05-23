package typings.activexLibreoffice.com_.sun.star.util

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a single field in a sort descriptor.
  * @deprecated Deprecated
  */
trait SortField extends js.Object {
  /** index of the field in the table; 0-based. */
  var Field: Double
  /** type of contents in the field. */
  var FieldType: SortFieldType
  /** `TRUE` if data are sorted in ascending order, `FALSE` if in descending order. */
  var SortAscending: Boolean
}

object SortField {
  @scala.inline
  def apply(Field: Double, FieldType: SortFieldType, SortAscending: Boolean): SortField = {
    val __obj = js.Dynamic.literal(Field = Field.asInstanceOf[js.Any], FieldType = FieldType.asInstanceOf[js.Any], SortAscending = SortAscending.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortField]
  }
}

