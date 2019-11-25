package typings.antd

import typings.antd.antdStrings.bottomCenter
import typings.antd.antdStrings.bottomLeft
import typings.antd.antdStrings.bottomRight
import typings.antd.antdStrings.topCenter
import typings.antd.antdStrings.topLeft
import typings.antd.antdStrings.topRight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BottomCenterBottomLeft extends js.Object {
  var mouseEnterDelay: Double
  var mouseLeaveDelay: Double
  var placement: bottomRight | topLeft | topCenter | topRight | bottomLeft | bottomCenter
}

object Anon_BottomCenterBottomLeft {
  @scala.inline
  def apply(
    mouseEnterDelay: Double,
    mouseLeaveDelay: Double,
    placement: bottomRight | topLeft | topCenter | topRight | bottomLeft | bottomCenter
  ): Anon_BottomCenterBottomLeft = {
    val __obj = js.Dynamic.literal(mouseEnterDelay = mouseEnterDelay.asInstanceOf[js.Any], mouseLeaveDelay = mouseLeaveDelay.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_BottomCenterBottomLeft]
  }
}

