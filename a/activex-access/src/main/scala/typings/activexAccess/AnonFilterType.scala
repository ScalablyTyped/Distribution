package typings.activexAccess

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFilterType extends js.Object {
  var Cancel: Double
  var FilterType: Double
}

object AnonFilterType {
  @scala.inline
  def apply(Cancel: Double, FilterType: Double): AnonFilterType = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], FilterType = FilterType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFilterType]
  }
}

