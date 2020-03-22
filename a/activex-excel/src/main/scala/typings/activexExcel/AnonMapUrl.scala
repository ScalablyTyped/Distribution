package typings.activexExcel

import typings.activexExcel.Excel.XmlMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMapUrl extends js.Object {
  var Cancel: Boolean
  val IsRefresh: Boolean
  val Map: XmlMap
  val Url: String
}

object AnonMapUrl {
  @scala.inline
  def apply(Cancel: Boolean, IsRefresh: Boolean, Map: XmlMap, Url: String): AnonMapUrl = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], IsRefresh = IsRefresh.asInstanceOf[js.Any], Map = Map.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonMapUrl]
  }
}

