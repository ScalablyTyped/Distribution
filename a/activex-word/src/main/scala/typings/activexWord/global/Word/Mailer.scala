package typings.activexWord.global.Word

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Mailer")
@js.native
class Mailer protected ()
  extends typings.activexWord.Word.Mailer {
  /* CompleteClass */
  override val Application: typings.activexWord.Word.Application = js.native
  /* CompleteClass */
  override var BCCRecipients: js.Any = js.native
  /* CompleteClass */
  override var CCRecipients: js.Any = js.native
  /* CompleteClass */
  override val Creator: Double = js.native
  /* CompleteClass */
  override var Enclosures: js.Any = js.native
  /* CompleteClass */
  override val Parent: js.Any = js.native
  /* CompleteClass */
  override val Received: Boolean = js.native
  /* CompleteClass */
  override var Recipients: js.Any = js.native
  /* CompleteClass */
  override val SendDateTime: VarDate = js.native
  /* CompleteClass */
  override val Sender: String = js.native
  /* CompleteClass */
  override var Subject: String = js.native
  /* CompleteClass */
  @JSName("Word.Mailer_typekey")
  override var WordDotMailer_typekey: typings.activexWord.Word.Mailer = js.native
}

