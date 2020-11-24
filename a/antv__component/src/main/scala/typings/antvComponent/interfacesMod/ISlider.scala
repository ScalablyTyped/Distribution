package typings.antvComponent.interfacesMod

import typings.antvComponent.typesMod.Range
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISlider extends js.Object {
  
  /**
    * 获取滑动的范围
    * @return {Range} 滑动范围
    */
  def getRange(): Range = js.native
  
  /**
    * 获取当前值
    * @return {number|number[]} 当前值
    */
  def getValue(): Double | js.Array[Double] = js.native
  
  /**
    * 设置可滑动范围
    * @param {number} min 最小值
    * @param {number} max 最大值
    */
  def setRange(min: Double, max: Double): js.Any = js.native
  
  def setValue(value: js.Array[Double]): js.Any = js.native
  /**
    * 设置当前值，单值或者两个值
    * @param {number | number[]} value 值
    */
  def setValue(value: Double): js.Any = js.native
}
