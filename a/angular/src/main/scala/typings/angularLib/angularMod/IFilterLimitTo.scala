package typings
package angularLib.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFilterLimitTo extends js.Object {
  /**
    * Creates a new string containing only a specified number of elements. The elements are taken from either the beginning or the end of the source string or number, as specified by the value and sign (positive or negative) of limit. If a number is used as input, it is converted to a string.
    * @param input Source string or number to be limited.
    * @param limit The length of the returned string. If the limit number is positive, limit number of items from the beginning of the source string are copied. If the number is negative, limit number of items from the end of the source string are copied. The limit will be trimmed if it exceeds input.length. If limit is undefined, the input will be returned unchanged.
    * @param begin Index at which to begin limitation. As a negative index, begin indicates an offset from the end of input. Defaults to 0.
    * @return A new substring of length limit or less if input had less than limit elements.
    */
  def apply(input: java.lang.String, limit: java.lang.String): java.lang.String = js.native
  def apply(input: java.lang.String, limit: java.lang.String, begin: java.lang.String): java.lang.String = js.native
  def apply(input: java.lang.String, limit: java.lang.String, begin: scala.Double): java.lang.String = js.native
  def apply(input: java.lang.String, limit: scala.Double): java.lang.String = js.native
  def apply(input: java.lang.String, limit: scala.Double, begin: java.lang.String): java.lang.String = js.native
  def apply(input: java.lang.String, limit: scala.Double, begin: scala.Double): java.lang.String = js.native
  def apply(input: scala.Double, limit: java.lang.String): java.lang.String = js.native
  def apply(input: scala.Double, limit: java.lang.String, begin: java.lang.String): java.lang.String = js.native
  def apply(input: scala.Double, limit: java.lang.String, begin: scala.Double): java.lang.String = js.native
  def apply(input: scala.Double, limit: scala.Double): java.lang.String = js.native
  def apply(input: scala.Double, limit: scala.Double, begin: java.lang.String): java.lang.String = js.native
  def apply(input: scala.Double, limit: scala.Double, begin: scala.Double): java.lang.String = js.native
  /**
    * Creates a new array containing only a specified number of elements. The elements are taken from either the beginning or the end of the source array, string or number, as specified by the value and sign (positive or negative) of limit.
    * @param input Source array to be limited.
    * @param limit The length of the returned array. If the limit number is positive, limit number of items from the beginning of the source array/string are copied. If the number is negative, limit number of items from the end of the source array are copied. The limit will be trimmed if it exceeds array.length. If limit is undefined, the input will be returned unchanged.
    * @param begin Index at which to begin limitation. As a negative index, begin indicates an offset from the end of input. Defaults to 0.
    * @return A new sub-array of length limit or less if input array had less than limit elements.
    */
  def apply[T](input: js.Array[T], limit: java.lang.String): js.Array[T] = js.native
  def apply[T](input: js.Array[T], limit: java.lang.String, begin: java.lang.String): js.Array[T] = js.native
  def apply[T](input: js.Array[T], limit: java.lang.String, begin: scala.Double): js.Array[T] = js.native
  def apply[T](input: js.Array[T], limit: scala.Double): js.Array[T] = js.native
  def apply[T](input: js.Array[T], limit: scala.Double, begin: java.lang.String): js.Array[T] = js.native
  def apply[T](input: js.Array[T], limit: scala.Double, begin: scala.Double): js.Array[T] = js.native
}

