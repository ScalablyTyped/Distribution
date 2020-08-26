package typings.agGrid.xmlFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PrefixedXmlAttributes extends js.Object {
  var map: js.Any = js.native
  var prefix: String = js.native
}

object PrefixedXmlAttributes {
  @scala.inline
  def apply(map: js.Any, prefix: String): PrefixedXmlAttributes = {
    val __obj = js.Dynamic.literal(map = map.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
    __obj.asInstanceOf[PrefixedXmlAttributes]
  }
  @scala.inline
  implicit class PrefixedXmlAttributesOps[Self <: PrefixedXmlAttributes] (val x: Self) extends AnyVal {
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
    def setMap(value: js.Any): Self = this.set("map", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
  }
  
}

