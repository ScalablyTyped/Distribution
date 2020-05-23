package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Zoom extends js.Object {
  val Application: typings.activexWord.Word.Application
  val Creator: Double
  var PageColumns: Double
  var PageFit: WdPageFit
  var PageRows: Double
  val Parent: js.Any
  var Percentage: Double
  @JSName("Word.Zoom_typekey")
  var WordDotZoom_typekey: Zoom
}

object Zoom {
  @scala.inline
  def apply(
    Application: Application,
    Creator: Double,
    PageColumns: Double,
    PageFit: WdPageFit,
    PageRows: Double,
    Parent: js.Any,
    Percentage: Double,
    WordDotZoom_typekey: Zoom
  ): Zoom = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], PageColumns = PageColumns.asInstanceOf[js.Any], PageFit = PageFit.asInstanceOf[js.Any], PageRows = PageRows.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Percentage = Percentage.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.Zoom_typekey")(WordDotZoom_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Zoom]
  }
}

