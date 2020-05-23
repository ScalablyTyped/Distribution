package typings.activexMshtml.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Description extends js.Object {
  val description: String
  val line: Double
  val url: String
}

object Description {
  @scala.inline
  def apply(description: String, line: Double, url: String): Description = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
}

