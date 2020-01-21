package typings.activexExcel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescriptionSheet extends js.Object {
  val Description: String
  val Sheet: String
  val Success: Boolean
}

object AnonDescriptionSheet {
  @scala.inline
  def apply(Description: String, Sheet: String, Success: Boolean): AnonDescriptionSheet = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Sheet = Sheet.asInstanceOf[js.Any], Success = Success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDescriptionSheet]
  }
}

