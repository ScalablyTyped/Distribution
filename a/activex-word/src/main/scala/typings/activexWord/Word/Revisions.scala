package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Revisions extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Count: Double
  val Creator: Double
  val Parent: js.Any
  @JSName("Word.Revisions_typekey")
  var WordDotRevisions_typekey: Revisions
  def AcceptAll(): Unit
  def Item(Index: Double): Revision
  def RejectAll(): Unit
}

object Revisions {
  @scala.inline
  def apply(
    AcceptAll: () => Unit,
    Application: Application,
    Count: Double,
    Creator: Double,
    Item: Double => Revision,
    Parent: js.Any,
    RejectAll: () => Unit,
    WordDotRevisions_typekey: Revisions
  ): Revisions = {
    val __obj = js.Dynamic.literal(AcceptAll = js.Any.fromFunction0(AcceptAll), Application = Application.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = js.Any.fromFunction1(Item), Parent = Parent.asInstanceOf[js.Any], RejectAll = js.Any.fromFunction0(RejectAll))
    __obj.updateDynamic("Word.Revisions_typekey")(WordDotRevisions_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Revisions]
  }
}

