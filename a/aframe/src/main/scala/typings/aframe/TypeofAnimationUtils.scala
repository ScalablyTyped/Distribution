package typings.aframe

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofAnimationUtils extends js.Object {
  def arraySlice(array: js.Any, from: Double, to: Double): js.Any
  def convertArray(array: js.Any, `type`: js.Any, forceClone: Boolean): js.Any
  def flattenJSON(jsonKeys: js.Array[String], times: js.Array[_], values: js.Array[_], valuePropertyName: String): Unit
  def getKeyFrameOrder(times: Double): js.Array[Double]
  def isTypedArray(`object`: js.Any): Boolean
  def sortedArray(values: js.Array[_], stride: Double, order: js.Array[Double]): js.Array[_]
}

object TypeofAnimationUtils {
  @scala.inline
  def apply(
    arraySlice: (js.Any, Double, Double) => js.Any,
    convertArray: (js.Any, js.Any, Boolean) => js.Any,
    flattenJSON: (js.Array[String], js.Array[_], js.Array[_], String) => Unit,
    getKeyFrameOrder: Double => js.Array[Double],
    isTypedArray: js.Any => Boolean,
    sortedArray: (js.Array[_], Double, js.Array[Double]) => js.Array[_]
  ): TypeofAnimationUtils = {
    val __obj = js.Dynamic.literal(arraySlice = js.Any.fromFunction3(arraySlice), convertArray = js.Any.fromFunction3(convertArray), flattenJSON = js.Any.fromFunction4(flattenJSON), getKeyFrameOrder = js.Any.fromFunction1(getKeyFrameOrder), isTypedArray = js.Any.fromFunction1(isTypedArray), sortedArray = js.Any.fromFunction3(sortedArray))
  
    __obj.asInstanceOf[TypeofAnimationUtils]
  }
}

