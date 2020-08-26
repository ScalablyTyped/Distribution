package typings.activexExcel.anon

import typings.activexExcel.Excel.Workbook
import typings.activexExcel.Excel.XlXmlExportResult
import typings.activexExcel.Excel.XmlMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Map extends js.Object {
  val Map: XmlMap = js.native
  val Result: XlXmlExportResult = js.native
  val Url: String = js.native
  val Wb: Workbook = js.native
}

object Map {
  @scala.inline
  def apply(Map: XmlMap, Result: XlXmlExportResult, Url: String, Wb: Workbook): Map = {
    val __obj = js.Dynamic.literal(Map = Map.asInstanceOf[js.Any], Result = Result.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any], Wb = Wb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Map]
  }
  @scala.inline
  implicit class MapOps[Self <: Map] (val x: Self) extends AnyVal {
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
    def setMap(value: XmlMap): Self = this.set("Map", value.asInstanceOf[js.Any])
    @scala.inline
    def setResult(value: XlXmlExportResult): Self = this.set("Result", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("Url", value.asInstanceOf[js.Any])
    @scala.inline
    def setWb(value: Workbook): Self = this.set("Wb", value.asInstanceOf[js.Any])
  }
  
}

