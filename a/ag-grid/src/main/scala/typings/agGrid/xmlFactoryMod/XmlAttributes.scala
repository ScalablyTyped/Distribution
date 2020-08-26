package typings.agGrid.xmlFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XmlAttributes extends js.Object {
  var prefixedAttributes: js.UndefOr[js.Array[PrefixedXmlAttributes]] = js.native
  var rawMap: js.UndefOr[js.Any] = js.native
}

object XmlAttributes {
  @scala.inline
  def apply(): XmlAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[XmlAttributes]
  }
  @scala.inline
  implicit class XmlAttributesOps[Self <: XmlAttributes] (val x: Self) extends AnyVal {
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
    def setPrefixedAttributesVarargs(value: PrefixedXmlAttributes*): Self = this.set("prefixedAttributes", js.Array(value :_*))
    @scala.inline
    def setPrefixedAttributes(value: js.Array[PrefixedXmlAttributes]): Self = this.set("prefixedAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrefixedAttributes: Self = this.set("prefixedAttributes", js.undefined)
    @scala.inline
    def setRawMap(value: js.Any): Self = this.set("rawMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRawMap: Self = this.set("rawMap", js.undefined)
  }
  
}

