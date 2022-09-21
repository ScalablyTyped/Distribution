package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MailingLabel extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def CreateNewDocument(
    Name: js.UndefOr[Any],
    Address: js.UndefOr[Any],
    AutoText: js.UndefOr[Any],
    ExtractAddress: js.UndefOr[Any],
    LaserTray: js.UndefOr[Any],
    PrintEPostageLabel: js.UndefOr[Any],
    Vertical: js.UndefOr[Any]
  ): Document = js.native
  
  def CreateNewDocument2000(): Document = js.native
  def CreateNewDocument2000(Name: Any): Document = js.native
  def CreateNewDocument2000(Name: Any, Address: Any): Document = js.native
  def CreateNewDocument2000(Name: Any, Address: Any, AutoText: Any): Document = js.native
  def CreateNewDocument2000(Name: Any, Address: Any, AutoText: Any, ExtractAddress: Any): Document = js.native
  def CreateNewDocument2000(Name: Any, Address: Any, AutoText: Any, ExtractAddress: Any, LaserTray: Any): Document = js.native
  def CreateNewDocument2000(Name: Any, Address: Any, AutoText: Any, ExtractAddress: Unit, LaserTray: Any): Document = js.native
  def CreateNewDocument2000(Name: Any, Address: Any, AutoText: Unit, ExtractAddress: Any): Document = js.native
  def CreateNewDocument2000(Name: Any, Address: Any, AutoText: Unit, ExtractAddress: Any, LaserTray: Any): Document = js.native
  def CreateNewDocument2000(Name: Any, Address: Any, AutoText: Unit, ExtractAddress: Unit, LaserTray: Any): Document = js.native
  def CreateNewDocument2000(Name: Any, Address: Unit, AutoText: Any): Document = js.native
  def CreateNewDocument2000(Name: Any, Address: Unit, AutoText: Any, ExtractAddress: Any): Document = js.native
  def CreateNewDocument2000(Name: Any, Address: Unit, AutoText: Any, ExtractAddress: Any, LaserTray: Any): Document = js.native
  def CreateNewDocument2000(Name: Any, Address: Unit, AutoText: Any, ExtractAddress: Unit, LaserTray: Any): Document = js.native
  def CreateNewDocument2000(Name: Any, Address: Unit, AutoText: Unit, ExtractAddress: Any): Document = js.native
  def CreateNewDocument2000(Name: Any, Address: Unit, AutoText: Unit, ExtractAddress: Any, LaserTray: Any): Document = js.native
  def CreateNewDocument2000(Name: Any, Address: Unit, AutoText: Unit, ExtractAddress: Unit, LaserTray: Any): Document = js.native
  def CreateNewDocument2000(Name: Unit, Address: Any): Document = js.native
  def CreateNewDocument2000(Name: Unit, Address: Any, AutoText: Any): Document = js.native
  def CreateNewDocument2000(Name: Unit, Address: Any, AutoText: Any, ExtractAddress: Any): Document = js.native
  def CreateNewDocument2000(Name: Unit, Address: Any, AutoText: Any, ExtractAddress: Any, LaserTray: Any): Document = js.native
  def CreateNewDocument2000(Name: Unit, Address: Any, AutoText: Any, ExtractAddress: Unit, LaserTray: Any): Document = js.native
  def CreateNewDocument2000(Name: Unit, Address: Any, AutoText: Unit, ExtractAddress: Any): Document = js.native
  def CreateNewDocument2000(Name: Unit, Address: Any, AutoText: Unit, ExtractAddress: Any, LaserTray: Any): Document = js.native
  def CreateNewDocument2000(Name: Unit, Address: Any, AutoText: Unit, ExtractAddress: Unit, LaserTray: Any): Document = js.native
  def CreateNewDocument2000(Name: Unit, Address: Unit, AutoText: Any): Document = js.native
  def CreateNewDocument2000(Name: Unit, Address: Unit, AutoText: Any, ExtractAddress: Any): Document = js.native
  def CreateNewDocument2000(Name: Unit, Address: Unit, AutoText: Any, ExtractAddress: Any, LaserTray: Any): Document = js.native
  def CreateNewDocument2000(Name: Unit, Address: Unit, AutoText: Any, ExtractAddress: Unit, LaserTray: Any): Document = js.native
  def CreateNewDocument2000(Name: Unit, Address: Unit, AutoText: Unit, ExtractAddress: Any): Document = js.native
  def CreateNewDocument2000(Name: Unit, Address: Unit, AutoText: Unit, ExtractAddress: Any, LaserTray: Any): Document = js.native
  def CreateNewDocument2000(Name: Unit, Address: Unit, AutoText: Unit, ExtractAddress: Unit, LaserTray: Any): Document = js.native
  
  def CreateNewDocumentByID(
    LabelID: js.UndefOr[Any],
    Address: js.UndefOr[Any],
    AutoText: js.UndefOr[Any],
    ExtractAddress: js.UndefOr[Any],
    LaserTray: js.UndefOr[Any],
    PrintEPostageLabel: js.UndefOr[Any],
    Vertical: js.UndefOr[Any]
  ): Document = js.native
  
  val Creator: Double = js.native
  
  val CustomLabels: typings.activexWord.Word.CustomLabels = js.native
  
  var DefaultLabelName: String = js.native
  
  var DefaultLaserTray: WdPaperTray = js.native
  
  var DefaultPrintBarCode: Boolean = js.native
  
  def LabelOptions(): Unit = js.native
  
  val Parent: Any = js.native
  
  def PrintOut(
    Name: js.UndefOr[Any],
    Address: js.UndefOr[Any],
    ExtractAddress: js.UndefOr[Any],
    LaserTray: js.UndefOr[Any],
    SingleLabel: js.UndefOr[Any],
    Row: js.UndefOr[Any],
    Column: js.UndefOr[Any],
    PrintEPostageLabel: js.UndefOr[Any],
    Vertical: js.UndefOr[Any]
  ): Unit = js.native
  
  def PrintOut2000(
    Name: js.UndefOr[Any],
    Address: js.UndefOr[Any],
    ExtractAddress: js.UndefOr[Any],
    LaserTray: js.UndefOr[Any],
    SingleLabel: js.UndefOr[Any],
    Row: js.UndefOr[Any],
    Column: js.UndefOr[Any]
  ): Unit = js.native
  
  def PrintOutByID(
    LabelID: js.UndefOr[Any],
    Address: js.UndefOr[Any],
    ExtractAddress: js.UndefOr[Any],
    LaserTray: js.UndefOr[Any],
    SingleLabel: js.UndefOr[Any],
    Row: js.UndefOr[Any],
    Column: js.UndefOr[Any],
    PrintEPostageLabel: js.UndefOr[Any],
    Vertical: js.UndefOr[Any]
  ): Unit = js.native
  
  var Vertical: Boolean = js.native
  
  /* private */ @JSName("Word.MailingLabel_typekey")
  var WordDotMailingLabel_typekey: MailingLabel = js.native
}
