package typings.activexWord.Word

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MailingLabel extends StObject {
  
  val Application: typings.activexWord.Word.Application = js.native
  
  def CreateNewDocument(
    Name: js.UndefOr[js.Any],
    Address: js.UndefOr[js.Any],
    AutoText: js.UndefOr[js.Any],
    ExtractAddress: js.UndefOr[js.Any],
    LaserTray: js.UndefOr[js.Any],
    PrintEPostageLabel: js.UndefOr[js.Any],
    Vertical: js.UndefOr[js.Any]
  ): Document = js.native
  
  def CreateNewDocument2000(): Document = js.native
  def CreateNewDocument2000(Name: js.Any): Document = js.native
  def CreateNewDocument2000(Name: js.Any, Address: js.Any): Document = js.native
  def CreateNewDocument2000(Name: js.Any, Address: js.Any, AutoText: js.Any): Document = js.native
  def CreateNewDocument2000(Name: js.Any, Address: js.Any, AutoText: js.Any, ExtractAddress: js.Any): Document = js.native
  def CreateNewDocument2000(Name: js.Any, Address: js.Any, AutoText: js.Any, ExtractAddress: js.Any, LaserTray: js.Any): Document = js.native
  def CreateNewDocument2000(Name: js.Any, Address: js.Any, AutoText: js.Any, ExtractAddress: Unit, LaserTray: js.Any): Document = js.native
  def CreateNewDocument2000(Name: js.Any, Address: js.Any, AutoText: Unit, ExtractAddress: js.Any): Document = js.native
  def CreateNewDocument2000(Name: js.Any, Address: js.Any, AutoText: Unit, ExtractAddress: js.Any, LaserTray: js.Any): Document = js.native
  def CreateNewDocument2000(Name: js.Any, Address: js.Any, AutoText: Unit, ExtractAddress: Unit, LaserTray: js.Any): Document = js.native
  def CreateNewDocument2000(Name: js.Any, Address: Unit, AutoText: js.Any): Document = js.native
  def CreateNewDocument2000(Name: js.Any, Address: Unit, AutoText: js.Any, ExtractAddress: js.Any): Document = js.native
  def CreateNewDocument2000(Name: js.Any, Address: Unit, AutoText: js.Any, ExtractAddress: js.Any, LaserTray: js.Any): Document = js.native
  def CreateNewDocument2000(Name: js.Any, Address: Unit, AutoText: js.Any, ExtractAddress: Unit, LaserTray: js.Any): Document = js.native
  def CreateNewDocument2000(Name: js.Any, Address: Unit, AutoText: Unit, ExtractAddress: js.Any): Document = js.native
  def CreateNewDocument2000(Name: js.Any, Address: Unit, AutoText: Unit, ExtractAddress: js.Any, LaserTray: js.Any): Document = js.native
  def CreateNewDocument2000(Name: js.Any, Address: Unit, AutoText: Unit, ExtractAddress: Unit, LaserTray: js.Any): Document = js.native
  def CreateNewDocument2000(Name: Unit, Address: js.Any): Document = js.native
  def CreateNewDocument2000(Name: Unit, Address: js.Any, AutoText: js.Any): Document = js.native
  def CreateNewDocument2000(Name: Unit, Address: js.Any, AutoText: js.Any, ExtractAddress: js.Any): Document = js.native
  def CreateNewDocument2000(Name: Unit, Address: js.Any, AutoText: js.Any, ExtractAddress: js.Any, LaserTray: js.Any): Document = js.native
  def CreateNewDocument2000(Name: Unit, Address: js.Any, AutoText: js.Any, ExtractAddress: Unit, LaserTray: js.Any): Document = js.native
  def CreateNewDocument2000(Name: Unit, Address: js.Any, AutoText: Unit, ExtractAddress: js.Any): Document = js.native
  def CreateNewDocument2000(Name: Unit, Address: js.Any, AutoText: Unit, ExtractAddress: js.Any, LaserTray: js.Any): Document = js.native
  def CreateNewDocument2000(Name: Unit, Address: js.Any, AutoText: Unit, ExtractAddress: Unit, LaserTray: js.Any): Document = js.native
  def CreateNewDocument2000(Name: Unit, Address: Unit, AutoText: js.Any): Document = js.native
  def CreateNewDocument2000(Name: Unit, Address: Unit, AutoText: js.Any, ExtractAddress: js.Any): Document = js.native
  def CreateNewDocument2000(Name: Unit, Address: Unit, AutoText: js.Any, ExtractAddress: js.Any, LaserTray: js.Any): Document = js.native
  def CreateNewDocument2000(Name: Unit, Address: Unit, AutoText: js.Any, ExtractAddress: Unit, LaserTray: js.Any): Document = js.native
  def CreateNewDocument2000(Name: Unit, Address: Unit, AutoText: Unit, ExtractAddress: js.Any): Document = js.native
  def CreateNewDocument2000(Name: Unit, Address: Unit, AutoText: Unit, ExtractAddress: js.Any, LaserTray: js.Any): Document = js.native
  def CreateNewDocument2000(Name: Unit, Address: Unit, AutoText: Unit, ExtractAddress: Unit, LaserTray: js.Any): Document = js.native
  
  def CreateNewDocumentByID(
    LabelID: js.UndefOr[js.Any],
    Address: js.UndefOr[js.Any],
    AutoText: js.UndefOr[js.Any],
    ExtractAddress: js.UndefOr[js.Any],
    LaserTray: js.UndefOr[js.Any],
    PrintEPostageLabel: js.UndefOr[js.Any],
    Vertical: js.UndefOr[js.Any]
  ): Document = js.native
  
  val Creator: Double = js.native
  
  val CustomLabels: typings.activexWord.Word.CustomLabels = js.native
  
  var DefaultLabelName: String = js.native
  
  var DefaultLaserTray: WdPaperTray = js.native
  
  var DefaultPrintBarCode: Boolean = js.native
  
  def LabelOptions(): Unit = js.native
  
  val Parent: js.Any = js.native
  
  def PrintOut(
    Name: js.UndefOr[js.Any],
    Address: js.UndefOr[js.Any],
    ExtractAddress: js.UndefOr[js.Any],
    LaserTray: js.UndefOr[js.Any],
    SingleLabel: js.UndefOr[js.Any],
    Row: js.UndefOr[js.Any],
    Column: js.UndefOr[js.Any],
    PrintEPostageLabel: js.UndefOr[js.Any],
    Vertical: js.UndefOr[js.Any]
  ): Unit = js.native
  
  def PrintOut2000(
    Name: js.UndefOr[js.Any],
    Address: js.UndefOr[js.Any],
    ExtractAddress: js.UndefOr[js.Any],
    LaserTray: js.UndefOr[js.Any],
    SingleLabel: js.UndefOr[js.Any],
    Row: js.UndefOr[js.Any],
    Column: js.UndefOr[js.Any]
  ): Unit = js.native
  
  def PrintOutByID(
    LabelID: js.UndefOr[js.Any],
    Address: js.UndefOr[js.Any],
    ExtractAddress: js.UndefOr[js.Any],
    LaserTray: js.UndefOr[js.Any],
    SingleLabel: js.UndefOr[js.Any],
    Row: js.UndefOr[js.Any],
    Column: js.UndefOr[js.Any],
    PrintEPostageLabel: js.UndefOr[js.Any],
    Vertical: js.UndefOr[js.Any]
  ): Unit = js.native
  
  var Vertical: Boolean = js.native
  
  @JSName("Word.MailingLabel_typekey")
  var WordDotMailingLabel_typekey: MailingLabel = js.native
}
