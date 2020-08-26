package typings.activexLibreoffice.com_.sun.star.xml

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** store the type and value of an XML attribute inside a XNameContainer */
@js.native
trait AttributeData extends js.Object {
  /**
    * the namespace of this XML attribute.
    *
    * This string can be empty if you are not using namespaces.
    */
  var Namespace: String = js.native
  /**
    * the type of this XML attribute.
    *
    * For non validating parsers this must be CDATA.
    */
  var Type: String = js.native
  /** the string value of this XML attribute. */
  var Value: String = js.native
}

object AttributeData {
  @scala.inline
  def apply(Namespace: String, Type: String, Value: String): AttributeData = {
    val __obj = js.Dynamic.literal(Namespace = Namespace.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], Value = Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttributeData]
  }
  @scala.inline
  implicit class AttributeDataOps[Self <: AttributeData] (val x: Self) extends AnyVal {
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
    def setNamespace(value: String): Self = this.set("Namespace", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("Type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: String): Self = this.set("Value", value.asInstanceOf[js.Any])
  }
  
}

