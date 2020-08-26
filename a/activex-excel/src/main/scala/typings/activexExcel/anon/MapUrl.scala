package typings.activexExcel.anon

import typings.activexExcel.Excel.XmlMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MapUrl extends js.Object {
  var Cancel: Boolean = js.native
  val IsRefresh: Boolean = js.native
  val Map: XmlMap = js.native
  val Url: String = js.native
}

object MapUrl {
  @scala.inline
  def apply(Cancel: Boolean, IsRefresh: Boolean, Map: XmlMap, Url: String): MapUrl = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], IsRefresh = IsRefresh.asInstanceOf[js.Any], Map = Map.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapUrl]
  }
  @scala.inline
  implicit class MapUrlOps[Self <: MapUrl] (val x: Self) extends AnyVal {
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
    def setIsRefresh(value: Boolean): Self = this.set("IsRefresh", value.asInstanceOf[js.Any])
    @scala.inline
    def setMap(value: XmlMap): Self = this.set("Map", value.asInstanceOf[js.Any])
    @scala.inline
    def setUrl(value: String): Self = this.set("Url", value.asInstanceOf[js.Any])
  }
  
}

