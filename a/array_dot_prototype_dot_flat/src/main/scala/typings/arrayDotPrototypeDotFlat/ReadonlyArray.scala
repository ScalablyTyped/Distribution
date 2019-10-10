package typings.arrayDotPrototypeDotFlat

import typings.arrayDotPrototypeDotFlat.arrayDotPrototypeDotFlatNumbers.`0`
import typings.arrayDotPrototypeDotFlat.arrayDotPrototypeDotFlatNumbers.`1`
import typings.arrayDotPrototypeDotFlat.arrayDotPrototypeDotFlatNumbers.`2`
import typings.arrayDotPrototypeDotFlat.arrayDotPrototypeDotFlatNumbers.`3`
import typings.arrayDotPrototypeDotFlat.arrayDotPrototypeDotFlatNumbers.`4`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReadonlyArray[T] extends js.Object {
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth. If no depth is provided, flat method defaults to the depth of 1.
    *
    * @param depth The maximum recursion depth
    */
  def flat(): Array[_] = js.native
  def flat(depth: Double): Array[_] = js.native
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  def flat[U](`this`: ReadonlyArray[Array[U] | ReadonlyArray[U]]): Array[U] = js.native
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  @JSName("flat")
  def flat_0[U](`this`: ReadonlyArray[U], depth: `0`): Array[U] = js.native
  @JSName("flat")
  def flat_1[U](`this`: ReadonlyArray[Array[U] | ReadonlyArray[U]], depth: `1`): Array[U] = js.native
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  @JSName("flat")
  def flat_2[U](
    `this`: ReadonlyArray[
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
  @JSName("flat")
  def flat_3[U](
    `this`: ReadonlyArray[
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
  @JSName("flat")
  def flat_4[U](
    `this`: ReadonlyArray[
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

