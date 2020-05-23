package typings.activexExcel.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Sheet extends js.Object {
  val Description: String
  val Sheet: String
  val Success: Boolean
}

object Sheet {
  @scala.inline
  def apply(Description: String, Sheet: String, Success: Boolean): Sheet = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Sheet = Sheet.asInstanceOf[js.Any], Success = Success.asInstanceOf[js.Any])
    __obj.asInstanceOf[Sheet]
  }
}

