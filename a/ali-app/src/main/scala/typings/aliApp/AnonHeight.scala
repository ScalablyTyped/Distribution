package typings.aliApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHeight extends js.Object {
  	// 图片宽度（单位px）
  var height: Double
  	// 图片高度（单位px）
  var path: String
  var width: Double
}

object AnonHeight {
  @scala.inline
  def apply(height: Double, path: String, width: Double): AnonHeight = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHeight]
  }
}

