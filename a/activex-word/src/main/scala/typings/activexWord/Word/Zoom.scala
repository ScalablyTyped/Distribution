package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Zoom extends js.Object {
  val Application: typings.activexWord.Word.Application = js.native
  val Creator: Double = js.native
  var PageColumns: Double = js.native
  var PageFit: WdPageFit = js.native
  var PageRows: Double = js.native
  val Parent: js.Any = js.native
  var Percentage: Double = js.native
  @JSName("Word.Zoom_typekey")
  var WordDotZoom_typekey: Zoom = js.native
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
  @scala.inline
  implicit class ZoomOps[Self <: Zoom] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setApplication(value: Application): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageColumns(value: Double): Self = this.set("PageColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageFit(value: WdPageFit): Self = this.set("PageFit", value.asInstanceOf[js.Any])
    @scala.inline
    def setPageRows(value: Double): Self = this.set("PageRows", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPercentage(value: Double): Self = this.set("Percentage", value.asInstanceOf[js.Any])
    @scala.inline
    def setWordDotZoom_typekey(value: Zoom): Self = this.set("Word.Zoom_typekey", value.asInstanceOf[js.Any])
  }
  
}

