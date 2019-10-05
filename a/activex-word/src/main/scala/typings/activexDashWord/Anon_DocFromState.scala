package typings.activexDashWord

import typings.activexDashWord.Word.Document
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DocFromState extends js.Object {
  val Doc: Document
  val FromState: Double
  val Handled: Boolean
  val ToState: Double
}

object Anon_DocFromState {
  @scala.inline
  def apply(Doc: Document, FromState: Double, Handled: Boolean, ToState: Double): Anon_DocFromState = {
    val __obj = js.Dynamic.literal(Doc = Doc, FromState = FromState, Handled = Handled, ToState = ToState)
  
    __obj.asInstanceOf[Anon_DocFromState]
  }
}

