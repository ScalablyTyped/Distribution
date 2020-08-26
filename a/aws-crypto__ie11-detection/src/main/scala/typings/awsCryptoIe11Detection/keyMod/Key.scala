package typings.awsCryptoIe11Detection.keyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Key extends js.Object {
  val algorithm: String = js.native
  val extractable: Boolean = js.native
  val keyUsage: js.Array[String] = js.native
  val `type`: String = js.native
}

object Key {
  @scala.inline
  def apply(algorithm: String, extractable: Boolean, keyUsage: js.Array[String], `type`: String): Key = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], extractable = extractable.asInstanceOf[js.Any], keyUsage = keyUsage.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Key]
  }
  @scala.inline
  implicit class KeyOps[Self <: Key] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAlgorithm(value: String): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def setExtractable(value: Boolean): Self = this.set("extractable", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyUsageVarargs(value: String*): Self = this.set("keyUsage", js.Array(value :_*))
    @scala.inline
    def setKeyUsage(value: js.Array[String]): Self = this.set("keyUsage", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

