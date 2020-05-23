package typings.activexOffice.anon

import typings.activexOffice.Office.CustomXMLPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Part extends js.Object {
  val Part: CustomXMLPart
}

object Part {
  @scala.inline
  def apply(Part: CustomXMLPart): Part = {
    val __obj = js.Dynamic.literal(Part = Part.asInstanceOf[js.Any])
    __obj.asInstanceOf[Part]
  }
}

