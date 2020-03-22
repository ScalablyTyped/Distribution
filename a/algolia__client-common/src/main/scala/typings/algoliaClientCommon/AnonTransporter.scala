package typings.algoliaClientCommon

import typings.algoliaTransporter.mod.Transporter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTransporter extends js.Object {
  val transporter: Transporter
}

object AnonTransporter {
  @scala.inline
  def apply(transporter: Transporter): AnonTransporter = {
    val __obj = js.Dynamic.literal(transporter = transporter.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTransporter]
  }
}

