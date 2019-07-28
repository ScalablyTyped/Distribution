package typings.activexDashWord.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Subdocuments")
@js.native
class Subdocuments protected () extends js.Object {
  val Application: typings.activexDashWord.WordNs.Application = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  var Expanded: Boolean = js.native
  val Parent: js.Any = js.native
  var `Word.Subdocuments_typekey`: Subdocuments = js.native
  def AddFromFile(
    Name: js.Any,
    ConfirmConversions: js.UndefOr[js.Any],
    ReadOnly: js.UndefOr[js.Any],
    PasswordDocument: js.UndefOr[js.Any],
    PasswordTemplate: js.UndefOr[js.Any],
    Revert: js.UndefOr[js.Any],
    WritePasswordDocument: js.UndefOr[js.Any],
    WritePasswordTemplate: js.UndefOr[js.Any]
  ): Subdocument = js.native
  def AddFromRange(Range: Range): Subdocument = js.native
  def Delete(): Unit = js.native
  def Item(Index: Double): Subdocument = js.native
  def Merge(): Unit = js.native
  def Merge(FirstSubdocument: js.Any): Unit = js.native
  def Merge(FirstSubdocument: js.Any, LastSubdocument: js.Any): Unit = js.native
  def Select(): Unit = js.native
}

