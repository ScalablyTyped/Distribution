package typings.activexWord

import typings.activexWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFromState extends js.Object {
  val Doc: Document
  val FromState: Double
  val Handled: Boolean
  val ToState: Double
}

object AnonFromState {
  @scala.inline
  def apply(Doc: Document, FromState: Double, Handled: Boolean, ToState: Double): AnonFromState = {
    val __obj = js.Dynamic.literal(Doc = Doc.asInstanceOf[js.Any], FromState = FromState.asInstanceOf[js.Any], Handled = Handled.asInstanceOf[js.Any], ToState = ToState.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFromState]
  }
}

