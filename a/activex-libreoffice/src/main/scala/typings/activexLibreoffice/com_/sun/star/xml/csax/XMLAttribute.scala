package typings.activexLibreoffice.com_.sun.star.xml.csax

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** A struct to keep information of an element's attribute. */
@js.native
trait XMLAttribute extends js.Object {
  /** the attribute name */
  var sName: String = js.native
  /** the attribute value */
  var sValue: String = js.native
}

object XMLAttribute {
  @scala.inline
  def apply(sName: String, sValue: String): XMLAttribute = {
    val __obj = js.Dynamic.literal(sName = sName.asInstanceOf[js.Any], sValue = sValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[XMLAttribute]
  }
  @scala.inline
  implicit class XMLAttributeOps[Self <: XMLAttribute] (val x: Self) extends AnyVal {
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
    def setSName(value: String): Self = this.set("sName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSValue(value: String): Self = this.set("sValue", value.asInstanceOf[js.Any])
  }
  
}

