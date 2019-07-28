package typings.activexDashExcel

import typings.activexDashExcel.ExcelNs.XmlMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelIsRefreshMap extends js.Object {
  var Cancel: Boolean
  val IsRefresh: Boolean
  val Map: XmlMap
  val Url: String
}

object Anon_CancelIsRefreshMap {
  @scala.inline
  def apply(Cancel: Boolean, IsRefresh: Boolean, Map: XmlMap, Url: String): Anon_CancelIsRefreshMap = {
    val __obj = js.Dynamic.literal(Cancel = Cancel, IsRefresh = IsRefresh, Map = Map, Url = Url)
  
    __obj.asInstanceOf[Anon_CancelIsRefreshMap]
  }
}

