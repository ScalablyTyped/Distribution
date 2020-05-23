package typings.amapJsApi.AMap

import typings.amapJsApi.anon.X
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Size extends js.Object {
  // internal
  def contains(size: X): Boolean
  /**
    * 获得高度
    */
  def getHeight(): Double
  /**
    * 获得宽度
    */
  def getWidth(): Double
}

object Size {
  @scala.inline
  def apply(contains: X => Boolean, getHeight: () => Double, getWidth: () => Double): Size = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction1(contains), getHeight = js.Any.fromFunction0(getHeight), getWidth = js.Any.fromFunction0(getWidth))
    __obj.asInstanceOf[Size]
  }
}

