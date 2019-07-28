package typings.alexaDashSdk

import typings.alexaDashSdk.alexaDashSdkMod.ListItemObjectStatus
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Href extends js.Object {
  var href: String
  var status: ListItemObjectStatus
}

object Anon_Href {
  @scala.inline
  def apply(href: String, status: ListItemObjectStatus): Anon_Href = {
    val __obj = js.Dynamic.literal(href = href, status = status)
  
    __obj.asInstanceOf[Anon_Href]
  }
}

