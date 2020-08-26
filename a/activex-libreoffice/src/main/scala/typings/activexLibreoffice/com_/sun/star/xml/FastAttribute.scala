package typings.activexLibreoffice.com_.sun.star.xml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A struct to keep information of an element's attribute. */
@js.native
trait FastAttribute extends js.Object {
  /** the token corresponding to the attribute */
  var Token: Double = js.native
  /** the attribute value */
  var Value: String = js.native
}

object FastAttribute {
  @scala.inline
  def apply(Token: Double, Value: String): FastAttribute = {
    val __obj = js.Dynamic.literal(Token = Token.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[FastAttribute]
  }
  @scala.inline
  implicit class FastAttributeOps[Self <: FastAttribute] (val x: Self) extends AnyVal {
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
    def setToken(value: Double): Self = this.set("Token", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

