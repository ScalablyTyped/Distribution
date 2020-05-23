package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CoAuthor extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val EmailAddress: String
  val ID: String
  val IsMe: Boolean
  val Locks: CoAuthLocks
  val Name: String
  val Parent: js.Any
  @JSName("Word.CoAuthor_typekey")
  var WordDotCoAuthor_typekey: CoAuthor
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
}

