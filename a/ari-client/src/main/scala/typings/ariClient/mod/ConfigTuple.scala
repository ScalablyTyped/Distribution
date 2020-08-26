package typings.ariClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConfigTuple extends js.Object {
  /**
    * A configuration object attribute.
    */
  var attribute: String = js.native
  /**
    * The value for the attribute.
    */
  var value: String = js.native
}

object ConfigTuple {
  @scala.inline
  def apply(attribute: String, value: String): ConfigTuple = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConfigTuple]
  }
  @scala.inline
  implicit class ConfigTupleOps[Self <: ConfigTuple] (val x: Self) extends AnyVal {
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
    def setAttribute(value: String): Self = this.set("attribute", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
  
}

