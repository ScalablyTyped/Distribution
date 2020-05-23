package typings.antd.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Arrows extends js.Object {
  var arrows: Boolean
  var dots: Boolean
  var draggable: Boolean
}

object Arrows {
  @scala.inline
  def apply(arrows: Boolean, dots: Boolean, draggable: Boolean): Arrows = {
    val __obj = js.Dynamic.literal(arrows = arrows.asInstanceOf[js.Any], dots = dots.asInstanceOf[js.Any], draggable = draggable.asInstanceOf[js.Any])
    __obj.asInstanceOf[Arrows]
  }
}

