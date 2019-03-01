package typings
package aliDashAppLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  	// 图片宽度（单位px）
  var height: scala.Double
  	// 图片高度（单位px）
  var path: java.lang.String
  var width: scala.Double
}

object Anon_Height {
  @scala.inline
  def apply(height: scala.Double, path: java.lang.String, width: scala.Double): Anon_Height = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_Height]
  }
}

