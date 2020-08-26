package typings.activexExcel.anon

import typings.activexExcel.Excel.Workbook
import typings.activexExcel.Excel.XmlMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Url extends js.Object {
  var Cancel: Boolean = js.native
  val Map: XmlMap = js.native
  val Url: String = js.native
  val Wb: Workbook = js.native
}

object Url {
  @scala.inline
  def apply(Cancel: Boolean, Map: XmlMap, Url: String, Wb: Workbook): Url = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Map = Map.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Url]
  }
  @scala.inline
  implicit class UrlOps[Self <: Url] (val x: Self) extends AnyVal {
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
    def setCancel(value: Boolean): Self = this.set("Cancel", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap(value: XmlMap): Self = this.set("Map", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("Url", value.asInstanceOf[js.Any])
    @scala.inline
    def setWb(value: Workbook): Self = this.set("Wb", value.asInstanceOf[js.Any])
  }
  
}

