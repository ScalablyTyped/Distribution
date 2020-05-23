package typings.activexWord.Word

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mailer extends js.Object {
  val Application: typings.activexWord.Word.Application
  var BCCRecipients: js.Any
  var CCRecipients: js.Any
  val Creator: Double
  var Enclosures: js.Any
  val Parent: js.Any
  val Received: Boolean
  var Recipients: js.Any
  val SendDateTime: VarDate
  val Sender: String
  var Subject: String
  @JSName("Word.Mailer_typekey")
  var WordDotMailer_typekey: Mailer
}

object Mailer {
  @scala.inline
  def apply(
    Application: Application,
    BCCRecipients: js.Any,
    CCRecipients: js.Any,
    Creator: Double,
    Enclosures: js.Any,
    Parent: js.Any,
    Received: Boolean,
    Recipients: js.Any,
    SendDateTime: VarDate,
    Sender: String,
    Subject: String,
    WordDotMailer_typekey: Mailer
  ): Mailer = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], BCCRecipients = BCCRecipients.asInstanceOf[js.Any], CCRecipients = CCRecipients.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Enclosures = Enclosures.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Received = Received.asInstanceOf[js.Any], Recipients = Recipients.asInstanceOf[js.Any], SendDateTime = SendDateTime.asInstanceOf[js.Any], Sender = Sender.asInstanceOf[js.Any], Subject = Subject.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Mailer_typekey")(WordDotMailer_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mailer]
  }
}

