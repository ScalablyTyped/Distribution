package typings.atAwsDashCryptoIe11DashDetection.buildKeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Key extends js.Object {
  val algorithm: String
  val extractable: Boolean
  val keyUsage: js.Array[String]
  val `type`: String
}

object Key {
  @scala.inline
  def apply(algorithm: String, extractable: Boolean, keyUsage: js.Array[String], `type`: String): Key = {
    val __obj = js.Dynamic.literal(algorithm = algorithm, extractable = extractable, keyUsage = keyUsage)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[Key]
  }
}

