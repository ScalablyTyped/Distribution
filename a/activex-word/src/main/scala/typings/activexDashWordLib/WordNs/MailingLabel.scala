package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.MailingLabel")
@js.native
class MailingLabel protected () extends js.Object {
  val Application: activexDashWordLib.WordNs.Application = js.native
  val Creator: scala.Double = js.native
  val CustomLabels: activexDashWordLib.WordNs.CustomLabels = js.native
  var DefaultLabelName: java.lang.String = js.native
  var DefaultLaserTray: WdPaperTray = js.native
  var DefaultPrintBarCode: scala.Boolean = js.native
  val Parent: js.Any = js.native
  var Vertical: scala.Boolean = js.native
  var `Word.MailingLabel_typekey`: MailingLabel = js.native
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
  def CreateNewDocumentByID(
    LabelID: js.UndefOr[js.Any],
    Address: js.UndefOr[js.Any],
    AutoText: js.UndefOr[js.Any],
    ExtractAddress: js.UndefOr[js.Any],
    LaserTray: js.UndefOr[js.Any],
    PrintEPostageLabel: js.UndefOr[js.Any],
    Vertical: js.UndefOr[js.Any]
  ): Document = js.native
  def LabelOptions(): scala.Unit = js.native
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
  ): scala.Unit = js.native
  def PrintOut2000(
    Name: js.UndefOr[js.Any],
    Address: js.UndefOr[js.Any],
    ExtractAddress: js.UndefOr[js.Any],
    LaserTray: js.UndefOr[js.Any],
    SingleLabel: js.UndefOr[js.Any],
    Row: js.UndefOr[js.Any],
    Column: js.UndefOr[js.Any]
  ): scala.Unit = js.native
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
  ): scala.Unit = js.native
}

