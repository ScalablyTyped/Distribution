package typings.activexDashExcel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DescriptionSheet extends js.Object {
  val Description: String
  val Sheet: String
  val Success: Boolean
}

object Anon_DescriptionSheet {
  @scala.inline
  def apply(Description: String, Sheet: String, Success: Boolean): Anon_DescriptionSheet = {
    val __obj = js.Dynamic.literal(Description = Description.asInstanceOf[js.Any], Sheet = Sheet.asInstanceOf[js.Any], Success = Success.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DescriptionSheet]
  }
}

