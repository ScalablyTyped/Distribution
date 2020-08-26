package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SharedWorkspaceMember extends js.Object {
  val Application: js.Any = js.native
  val Creator: Double = js.native
  val DomainName: String = js.native
  val Email: String = js.native
  val Id: String = js.native
  val Name: String = js.native
  @JSName("Office.SharedWorkspaceMember_typekey")
  var OfficeDotSharedWorkspaceMember_typekey: SharedWorkspaceMember = js.native
  val Parent: js.Any = js.native
  def Delete(): Unit = js.native
}

object SharedWorkspaceMember {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Delete: () => Unit,
    DomainName: String,
    Email: String,
    Id: String,
    Name: String,
    OfficeDotSharedWorkspaceMember_typekey: SharedWorkspaceMember,
    Parent: js.Any
  ): SharedWorkspaceMember = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), DomainName = DomainName.asInstanceOf[js.Any], Email = Email.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SharedWorkspaceMember_typekey")(OfficeDotSharedWorkspaceMember_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SharedWorkspaceMember]
  }
  @scala.inline
  implicit class SharedWorkspaceMemberOps[Self <: SharedWorkspaceMember] (val x: Self) extends AnyVal {
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
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setDelete(value: () => Unit): Self = this.set("Delete", js.Any.fromFunction0(value))
    @scala.inline
    def setDomainName(value: String): Self = this.set("DomainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmail(value: String): Self = this.set("Email", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("Id", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfficeDotSharedWorkspaceMember_typekey(value: SharedWorkspaceMember): Self = this.set("Office.SharedWorkspaceMember_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
  }
  
}

