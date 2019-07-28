package typings.activexDashLibreoffice.comNs.sunNs.starNs.ucbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** contains a sorting info. */
trait SortingInfo extends js.Object {
  /** contains a flag indicating the sort mode (ascending or descending). */
  var Ascending: Boolean
  /** specifies the name of a property to use for sorting ( e.g. "Title" ). */
  var PropertyName: String
}

object SortingInfo {
  @scala.inline
  def apply(Ascending: Boolean, PropertyName: String): SortingInfo = {
    val __obj = js.Dynamic.literal(Ascending = Ascending, PropertyName = PropertyName)
  
    __obj.asInstanceOf[SortingInfo]
  }
}

