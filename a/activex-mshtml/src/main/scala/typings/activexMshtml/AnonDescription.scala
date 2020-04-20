package typings.activexMshtml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDescription extends js.Object {
  val description: String
  val line: Double
  val url: String
}

object AnonDescription {
  @scala.inline
  def apply(description: String, line: Double, url: String): AnonDescription = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDescription]
  }
}

