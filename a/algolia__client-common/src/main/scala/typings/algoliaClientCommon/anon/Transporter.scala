package typings.algoliaClientCommon.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Transporter extends js.Object {
  val transporter: typings.algoliaTransporter.mod.Transporter
}

object Transporter {
  @scala.inline
  def apply(transporter: typings.algoliaTransporter.mod.Transporter): Transporter = {
    val __obj = js.Dynamic.literal(transporter = transporter.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transporter]
  }
}

