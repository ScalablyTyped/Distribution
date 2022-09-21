package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subdocuments extends StObject {
  
  def AddFromFile(
    Name: Any,
    ConfirmConversions: js.UndefOr[Any],
    ReadOnly: js.UndefOr[Any],
    PasswordDocument: js.UndefOr[Any],
    PasswordTemplate: js.UndefOr[Any],
    Revert: js.UndefOr[Any],
    WritePasswordDocument: js.UndefOr[Any],
    WritePasswordTemplate: js.UndefOr[Any]
  ): Subdocument = js.native
  
  def AddFromRange(Range: Range): Subdocument = js.native
  
  val Application: typings.activexWord.Word.Application = js.native
  
  val Count: Double = js.native
  
  val Creator: Double = js.native
  
  def Delete(): Unit = js.native
  
  var Expanded: Boolean = js.native
  
  def Item(Index: Double): Subdocument = js.native
  
  def Merge(): Unit = js.native
  def Merge(FirstSubdocument: Any): Unit = js.native
  def Merge(FirstSubdocument: Any, LastSubdocument: Any): Unit = js.native
  def Merge(FirstSubdocument: Unit, LastSubdocument: Any): Unit = js.native
  
  val Parent: Any = js.native
  
  def Select(): Unit = js.native
  
  /* private */ @JSName("Word.Subdocuments_typekey")
  var WordDotSubdocuments_typekey: Subdocuments = js.native
}
