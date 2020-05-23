package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedWorkspaceMember extends js.Object {
  val Application: js.Any
  val Creator: Double
  val DomainName: String
  val Email: String
  val Id: String
  val Name: String
  @JSName("Office.SharedWorkspaceMember_typekey")
  var OfficeDotSharedWorkspaceMember_typekey: SharedWorkspaceMember
  val Parent: js.Any
  def Delete(): Unit
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
}

