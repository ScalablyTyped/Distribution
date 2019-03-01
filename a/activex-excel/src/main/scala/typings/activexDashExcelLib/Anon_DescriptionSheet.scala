package typings
package activexDashExcelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DescriptionSheet extends js.Object {
  val Description: java.lang.String
  val Sheet: java.lang.String
  val Success: scala.Boolean
}

object Anon_DescriptionSheet {
  @scala.inline
  def apply(Description: java.lang.String, Sheet: java.lang.String, Success: scala.Boolean): Anon_DescriptionSheet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Description")(Description)
    __obj.updateDynamic("Sheet")(Sheet)
    __obj.updateDynamic("Success")(Success)
    __obj.asInstanceOf[Anon_DescriptionSheet]
  }
}

