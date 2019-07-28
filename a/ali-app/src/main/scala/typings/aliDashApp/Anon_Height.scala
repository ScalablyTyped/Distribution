package typings.aliDashApp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Height extends js.Object {
  	// 图片宽度（单位px）
  var height: Double
  	// 图片高度（单位px）
  var path: String
  var width: Double
}

object Anon_Height {
  @scala.inline
  def apply(height: Double, path: String, width: Double): Anon_Height = {
    val __obj = js.Dynamic.literal(height = height, path = path, width = width)
  
    __obj.asInstanceOf[Anon_Height]
  }
}

