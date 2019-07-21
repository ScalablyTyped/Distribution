package typings
package acmeDashClientLib.clientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Identifier extends js.Object {
  var `type`: java.lang.String
  var value: java.lang.String
}

object Identifier {
  @scala.inline
  def apply(`type`: java.lang.String, value: java.lang.String): Identifier = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Identifier]
  }
}

