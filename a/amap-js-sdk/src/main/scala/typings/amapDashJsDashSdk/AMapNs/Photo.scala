package typings.amapDashJsDashSdk.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Photo extends js.Object {
  var title: String
  var url: String
}

object Photo {
  @scala.inline
  def apply(title: String, url: String): Photo = {
    val __obj = js.Dynamic.literal(title = title, url = url)
  
    __obj.asInstanceOf[Photo]
  }
}

