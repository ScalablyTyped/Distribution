package typings.activexDashExcel

import typings.activexDashExcel.ExcelNs.XmlMap
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
    val __obj = js.Dynamic.literal(Cancel = Cancel, Map = Map, Url = Url)
  
    __obj.asInstanceOf[Anon_CancelMapUrl]
  }
}

