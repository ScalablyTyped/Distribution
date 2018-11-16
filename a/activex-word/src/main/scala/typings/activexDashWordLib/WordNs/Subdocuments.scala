package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.Subdocuments")
@js.native
class Subdocuments protected () extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  var Expanded: scala.Boolean = js.native
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
  def Delete(): scala.Unit = js.native
  def Item(Index: scala.Double): Subdocument = js.native
  def Merge(): scala.Unit = js.native
  def Merge(FirstSubdocument: js.Any): scala.Unit = js.native
  def Merge(FirstSubdocument: js.Any, LastSubdocument: js.Any): scala.Unit = js.native
  def Select(): scala.Unit = js.native
}

