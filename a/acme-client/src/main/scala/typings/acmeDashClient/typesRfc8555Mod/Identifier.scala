package typings.acmeDashClient.typesRfc8555Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identifier extends js.Object {
  var `type`: String
  var value: String
}

object Identifier {
  @scala.inline
  def apply(`type`: String, value: String): Identifier = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identifier]
  }
}

