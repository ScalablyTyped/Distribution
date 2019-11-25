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
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], extractable = extractable.asInstanceOf[js.Any], keyUsage = keyUsage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
}

