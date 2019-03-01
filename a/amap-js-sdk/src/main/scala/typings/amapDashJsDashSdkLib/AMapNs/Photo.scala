package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Photo extends js.Object {
  var title: java.lang.String
  var url: java.lang.String
}

object Photo {
  @scala.inline
  def apply(title: java.lang.String, url: java.lang.String): Photo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[Photo]
  }
}

