package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Conflict extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  val Index: Double
  val Parent: js.Any
  val Range: typings.activexWord.Word.Range
  val Type: WdRevisionType
  @JSName("Word.Conflict_typekey")
  var WordDotConflict_typekey: Conflict
  def Accept(): Unit
  def Reject(): Unit
}

object Conflict {
  @scala.inline
  def apply(
    Accept: () => Unit,
    Application: Application,
    Creator: Double,
    Index: Double,
    Parent: js.Any,
    Range: Range,
    Reject: () => Unit,
    Type: WdRevisionType,
    WordDotConflict_typekey: Conflict
  ): Conflict = {
    val __obj = js.Dynamic.literal(Accept = js.Any.fromFunction0(Accept), Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Index = Index.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Range = Range.asInstanceOf[js.Any], Reject = js.Any.fromFunction0(Reject), Type = Type.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Conflict_typekey")(WordDotConflict_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Conflict]
  }
}

