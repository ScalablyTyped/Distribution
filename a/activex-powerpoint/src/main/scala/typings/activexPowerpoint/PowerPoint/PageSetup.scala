package typings.activexPowerpoint.PowerPoint

import typings.activexOffice.Office.MsoOrientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PageSetup extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  var FirstSlideNumber: Double
  var NotesOrientation: MsoOrientation
  val Parent: js.Any
  @JSName("PowerPoint.PageSetup_typekey")
  var PowerPointDotPageSetup_typekey: PageSetup
  var SlideHeight: Double
  var SlideOrientation: MsoOrientation
  var SlideSize: PpSlideSizeType
  var SlideWidth: Double
}

object PageSetup {
  @scala.inline
  def apply(
    Application: Application,
    FirstSlideNumber: Double,
    NotesOrientation: MsoOrientation,
    Parent: js.Any,
    PowerPointDotPageSetup_typekey: PageSetup,
    SlideHeight: Double,
    SlideOrientation: MsoOrientation,
    SlideSize: PpSlideSizeType,
    SlideWidth: Double
  ): PageSetup = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], FirstSlideNumber = FirstSlideNumber.asInstanceOf[js.Any], NotesOrientation = NotesOrientation.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], SlideHeight = SlideHeight.asInstanceOf[js.Any], SlideOrientation = SlideOrientation.asInstanceOf[js.Any], SlideSize = SlideSize.asInstanceOf[js.Any], SlideWidth = SlideWidth.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.PageSetup_typekey")(PowerPointDotPageSetup_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PageSetup]
  }
}

