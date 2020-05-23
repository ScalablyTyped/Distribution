package typings.activexAccess.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FilterType extends js.Object {
  var Cancel: Double
  var FilterType: Double
}

object FilterType {
  @scala.inline
  def apply(Cancel: Double, FilterType: Double): FilterType = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], FilterType = FilterType.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterType]
  }
}

