package typings.acmeDashClient.clientMod

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
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Identifier]
  }
}

