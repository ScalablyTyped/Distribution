package typings.activexOffice

import typings.activexOffice.Office.CustomXMLPart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPart extends js.Object {
  val Part: CustomXMLPart
}

object AnonPart {
  @scala.inline
  def apply(Part: CustomXMLPart): AnonPart = {
    val __obj = js.Dynamic.literal(Part = Part.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonPart]
  }
}

