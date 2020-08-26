package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CoAuthor extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  val EmailAddress: String = js.native
  val ID: String = js.native
  val IsMe: Boolean = js.native
  val Locks: CoAuthLocks = js.native
  val Name: String = js.native
  val Parent: js.Any = js.native
  @JSName("Word.CoAuthor_typekey")
  var WordDotCoAuthor_typekey: CoAuthor = js.native
}

object CoAuthor {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    EmailAddress: String,
    ID: String,
    IsMe: Boolean,
    Locks: CoAuthLocks,
    Name: String,
    Parent: js.Any,
    WordDotCoAuthor_typekey: CoAuthor
  ): CoAuthor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], EmailAddress = EmailAddress.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], IsMe = IsMe.asInstanceOf[js.Any], Locks = Locks.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.CoAuthor_typekey")(WordDotCoAuthor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoAuthor]
  }
  @scala.inline
  implicit class CoAuthorOps[Self <: CoAuthor] (val x: Self) extends AnyVal {
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
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmailAddress(value: String): Self = this.set("EmailAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setID(value: String): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsMe(value: Boolean): Self = this.set("IsMe", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocks(value: CoAuthLocks): Self = this.set("Locks", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotCoAuthor_typekey(value: CoAuthor): Self = this.set("Word.CoAuthor_typekey", value.asInstanceOf[js.Any])
  }
  
}

