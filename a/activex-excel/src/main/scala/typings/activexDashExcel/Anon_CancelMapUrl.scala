package typings.activexDashExcel

import typings.activexDashExcel.Excel.XmlMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CancelMapUrl extends js.Object {
  var Cancel: Boolean
  val Map: XmlMap
  val Url: String
}

object Anon_CancelMapUrl {
  @scala.inline
  def apply(Cancel: Boolean, Map: XmlMap, Url: String): Anon_CancelMapUrl = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Map = Map.asInstanceOf[js.Any], Url = Url.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_CancelMapUrl]
  }
}

