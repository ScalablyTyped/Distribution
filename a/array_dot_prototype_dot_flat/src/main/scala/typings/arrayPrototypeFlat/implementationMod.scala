package typings.arrayPrototypeFlat

import typings.arrayPrototypeFlat.arrayPrototypeFlatNumbers.`0`
import typings.arrayPrototypeFlat.arrayPrototypeFlatNumbers.`1`
import typings.arrayPrototypeFlat.arrayPrototypeFlatNumbers.`2`
import typings.arrayPrototypeFlat.arrayPrototypeFlatNumbers.`3`
import typings.arrayPrototypeFlat.arrayPrototypeFlatNumbers.`4`
import typings.arrayPrototypeFlat.arrayPrototypeFlatNumbers.`5`
import typings.arrayPrototypeFlat.arrayPrototypeFlatNumbers.`6`
import typings.arrayPrototypeFlat.arrayPrototypeFlatNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("array.prototype.flat/implementation", JSImport.Namespace)
@js.native
object implementationMod extends js.Object {
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth. If no depth is provided, flat method defaults to the depth of 1.
    *
    * @param depth The maximum recursion depth
    */
  def apply(receiver: ReadonlyArray[_]): Array[_] = js.native
  def apply(receiver: ReadonlyArray[_], depth: Double): Array[_] = js.native
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  def apply[U](receiver: Array[Array[Array[Array[Array[Array[U]]]]]], depth: `5`): Array[U] = js.native
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  def apply[U](receiver: Array[Array[Array[Array[Array[Array[Array[U]]]]]]], depth: `6`): Array[U] = js.native
  def apply[U](receiver: Array[Array[Array[Array[Array[Array[Array[Array[U]]]]]]]], depth: `7`): Array[U] = js.native
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  def apply[U](receiver: ReadonlyArray[U], depth: `0`): Array[U] = js.native
  def apply[U](receiver: ReadonlyArray[Array[U] | ReadonlyArray[U]], depth: `1`): Array[U] = js.native
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  def apply[U](
    receiver: ReadonlyArray[
      (Array[Array[U] | ReadonlyArray[U]]) | (ReadonlyArray[Array[U] | ReadonlyArray[U]])
    ],
    depth: `2`
  ): Array[U] = js.native
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  def apply[U](
    receiver: ReadonlyArray[
      (Array[(Array[Array[U] | ReadonlyArray[U]]) | ReadonlyArray[Array[U]]]) | (ReadonlyArray[
        (Array[Array[U] | ReadonlyArray[U]]) | (ReadonlyArray[Array[U] | ReadonlyArray[U]])
      ])
    ],
    depth: `3`
  ): Array[U] = js.native
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  def apply[U](
    receiver: ReadonlyArray[
      (Array[
        (Array[(Array[Array[U] | ReadonlyArray[U]]) | ReadonlyArray[Array[U]]]) | (ReadonlyArray[Array[Array[U]] | ReadonlyArray[ReadonlyArray[U]]])
      ]) | (ReadonlyArray[
        (Array[(Array[Array[U] | ReadonlyArray[U]]) | ReadonlyArray[Array[U]]]) | (ReadonlyArray[
          (Array[Array[U] | ReadonlyArray[U]]) | (ReadonlyArray[Array[U] | ReadonlyArray[U]])
        ])
      ])
    ],
    depth: `4`
  ): Array[U] = js.native
}

