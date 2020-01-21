package typings.angularCommon.mod

import typings.angularCore.mod.PipeTransform
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/common", "SlicePipe")
@js.native
class SlicePipe () extends PipeTransform {
  var supports: js.Any = js.native
  def transform(value: js.UndefOr[scala.Nothing], start: Double): js.UndefOr[scala.Nothing] = js.native
  def transform(value: js.UndefOr[scala.Nothing], start: Double, end: Double): js.UndefOr[scala.Nothing] = js.native
  def transform(value: String, start: Double): String = js.native
  def transform(value: String, start: Double, end: Double): String = js.native
  /* CompleteClass */
  override def transform(value: js.Any, args: js.Any*): js.Any = js.native
  def transform(value: Null, start: Double): Null = js.native
  def transform(value: Null, start: Double, end: Double): Null = js.native
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
  def transform[T](value: js.Array[T], start: Double): js.Array[T] = js.native
  def transform[T](value: js.Array[T], start: Double, end: Double): js.Array[T] = js.native
}

