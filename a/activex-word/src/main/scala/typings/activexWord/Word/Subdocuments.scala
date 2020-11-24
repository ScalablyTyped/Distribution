package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subdocuments extends js.Object {
  
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
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  var Expanded: Boolean = js.native
  
  def Item(Index: Double): Subdocument = js.native
  
  def Merge(): Unit = js.native
  def Merge(FirstSubdocument: js.UndefOr[scala.Nothing], LastSubdocument: js.Any): Unit = js.native
  def Merge(FirstSubdocument: js.Any): Unit = js.native
  def Merge(FirstSubdocument: js.Any, LastSubdocument: js.Any): Unit = js.native
  
  val Parent: js.Any = js.native
  
  def Select(): Unit = js.native
  
  @JSName("Word.Subdocuments_typekey")
  var WordDotSubdocuments_typekey: Subdocuments = js.native
}
