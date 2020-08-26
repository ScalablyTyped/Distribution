package typings.activexLibreoffice.com_.sun.star.document

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XCompatWriterDocProperties extends js.Object {
  var Category: String = js.native
  var Company: String = js.native
  var Manager: String = js.native
}

object XCompatWriterDocProperties {
  @scala.inline
  def apply(Category: String, Company: String, Manager: String): XCompatWriterDocProperties = {
    val __obj = js.Dynamic.literal(Category = Category.asInstanceOf[js.Any], Company = Company.asInstanceOf[js.Any], Manager = Manager.asInstanceOf[js.Any])
    __obj.asInstanceOf[XCompatWriterDocProperties]
  }
  @scala.inline
  implicit class XCompatWriterDocPropertiesOps[Self <: XCompatWriterDocProperties] (val x: Self) extends AnyVal {
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
    def setCategory(value: String): Self = this.set("Category", value.asInstanceOf[js.Any])
    @scala.inline
    def setCompany(value: String): Self = this.set("Company", value.asInstanceOf[js.Any])
    @scala.inline
    def setManager(value: String): Self = this.set("Manager", value.asInstanceOf[js.Any])
  }
  
}

