package typings
package aframeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Array extends js.Object {
  def arraySlice(array: js.Any, from: scala.Double, to: scala.Double): js.Any
  def convertArray(array: js.Any, `type`: js.Any, forceClone: scala.Boolean): js.Any
  def flattenJSON(
    jsonKeys: js.Array[java.lang.String],
    times: js.Array[_],
    values: js.Array[_],
    valuePropertyName: java.lang.String
  ): scala.Unit
  def getKeyFrameOrder(times: scala.Double): js.Array[scala.Double]
  def isTypedArray(`object`: js.Any): scala.Boolean
  def sortedArray(values: js.Array[_], stride: scala.Double, order: js.Array[scala.Double]): js.Array[_]
}

object Anon_Array {
  @scala.inline
  def apply(
    arraySlice: js.Function3[js.Any, scala.Double, scala.Double, js.Any],
    convertArray: js.Function3[js.Any, js.Any, scala.Boolean, js.Any],
    flattenJSON: js.Function4[js.Array[java.lang.String], js.Array[_], js.Array[_], java.lang.String, scala.Unit],
    getKeyFrameOrder: js.Function1[scala.Double, js.Array[scala.Double]],
    isTypedArray: js.Function1[js.Any, scala.Boolean],
    sortedArray: js.Function3[js.Array[_], scala.Double, js.Array[scala.Double], js.Array[_]]
  ): Anon_Array = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("arraySlice")(arraySlice)
    __obj.updateDynamic("convertArray")(convertArray)
    __obj.updateDynamic("flattenJSON")(flattenJSON)
    __obj.updateDynamic("getKeyFrameOrder")(getKeyFrameOrder)
    __obj.updateDynamic("isTypedArray")(isTypedArray)
    __obj.updateDynamic("sortedArray")(sortedArray)
    __obj.asInstanceOf[Anon_Array]
  }
}

