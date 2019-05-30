package typings
package atAngularCommonLib.atAngularCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "SlicePipe")
@js.native
class SlicePipe ()
  extends atAngularCoreLib.atAngularCoreMod.PipeTransform {
  var supports: js.Any = js.native
  def transform(value: js.UndefOr[scala.Nothing], start: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def transform(value: js.UndefOr[scala.Nothing], start: scala.Double, end: scala.Double): js.UndefOr[scala.Nothing] = js.native
  def transform(value: java.lang.String, start: scala.Double): java.lang.String = js.native
  def transform(value: java.lang.String, start: scala.Double, end: scala.Double): java.lang.String = js.native
  /* CompleteClass */
  override def transform(value: js.Any, args: js.Any*): js.Any = js.native
  def transform(value: scala.Null, start: scala.Double): scala.Null = js.native
  def transform(value: scala.Null, start: scala.Double, end: scala.Double): scala.Null = js.native
  /**
    * @param value a list or a string to be sliced.
    * @param start the starting index of the subset to return:
    *   - **a positive integer**: return the item at `start` index and all items after
    *     in the list or string expression.
    *   - **a negative integer**: return the item at `start` index from the end and all items after
    *     in the list or string expression.
    *   - **if positive and greater than the size of the expression**: return an empty list or
    * string.
    *   - **if negative and greater than the size of the expression**: return entire list or string.
    * @param end the ending index of the subset to return:
    *   - **omitted**: return all items until the end.
    *   - **if positive**: return all items before `end` index of the list or string.
    *   - **if negative**: return all items before `end` index from the end of the list or string.
    */
  def transform[T](value: js.Array[T], start: scala.Double): js.Array[T] = js.native
  def transform[T](value: js.Array[T], start: scala.Double, end: scala.Double): js.Array[T] = js.native
}

