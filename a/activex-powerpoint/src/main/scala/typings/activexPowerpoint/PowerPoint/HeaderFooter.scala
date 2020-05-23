package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoTriState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HeaderFooter extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  var Format: PpDateTimeFormat
  val Parent: js.Any
  @JSName("PowerPoint.HeaderFooter_typekey")
  var PowerPointDotHeaderFooter_typekey: HeaderFooter
  var Text: String
  var UseFormat: MsoTriState
  var Visible: MsoTriState
}

object HeaderFooter {
  @scala.inline
  def apply(
    Application: Application,
    Format: PpDateTimeFormat,
    Parent: js.Any,
    PowerPointDotHeaderFooter_typekey: HeaderFooter,
    Text: String,
    UseFormat: MsoTriState,
    Visible: MsoTriState
  ): HeaderFooter = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any], UseFormat = UseFormat.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.HeaderFooter_typekey")(PowerPointDotHeaderFooter_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeaderFooter]
  }
}

