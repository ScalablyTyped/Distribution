package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 地物对象的像素尺寸
  */
trait Size extends js.Object {
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
  def apply(getHeight: () => Double, getWidth: () => Double): Size = {
    val __obj = js.Dynamic.literal(getHeight = js.Any.fromFunction0(getHeight), getWidth = js.Any.fromFunction0(getWidth))
    __obj.asInstanceOf[Size]
  }
}

