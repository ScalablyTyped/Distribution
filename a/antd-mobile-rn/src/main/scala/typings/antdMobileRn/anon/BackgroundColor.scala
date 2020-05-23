package typings.antdMobileRn.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackgroundColor extends js.Object {
  var backgroundColor: String
  var bottom: Double
  var left: Double
  var position: String
  var right: Double
  var top: Double
  var zIndex: Double
}

object BackgroundColor {
  @scala.inline
  def apply(
    backgroundColor: String,
    bottom: Double,
    left: Double,
    position: String,
    right: Double,
    top: Double,
    zIndex: Double
  ): BackgroundColor = {
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], zIndex = zIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackgroundColor]
  }
}

