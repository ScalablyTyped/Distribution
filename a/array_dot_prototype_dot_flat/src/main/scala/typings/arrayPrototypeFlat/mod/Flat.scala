package typings.arrayPrototypeFlat.mod

import typings.arrayPrototypeFlat.Array
import typings.arrayPrototypeFlat.ReadonlyArray
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

@js.native
trait Flat extends FlatImpl {
  @JSName("implementation")
  var implementation_Original: FlatImpl = js.native
  def getPolyfill(): FlatImpl = js.native
  def implementation(receiver: ReadonlyArray[_]): Array[_] = js.native
  def implementation(receiver: ReadonlyArray[_], depth: Double): Array[_] = js.native
  @JSName("implementation")
  def implementation_0[U](receiver: ReadonlyArray[U], depth: `0`): Array[U] = js.native
  @JSName("implementation")
  def implementation_1[U](receiver: ReadonlyArray[Array[U] | ReadonlyArray[U]], depth: `1`): Array[U] = js.native
  @JSName("implementation")
  def implementation_2[U](
    receiver: ReadonlyArray[
      (Array[Array[U] | ReadonlyArray[U]]) | (ReadonlyArray[Array[U] | ReadonlyArray[U]])
    ],
    depth: `2`
  ): Array[U] = js.native
  @JSName("implementation")
  def implementation_3[U](
    receiver: ReadonlyArray[
      (Array[(Array[Array[U] | ReadonlyArray[U]]) | ReadonlyArray[Array[U]]]) | (ReadonlyArray[
        (Array[Array[U] | ReadonlyArray[U]]) | (ReadonlyArray[Array[U] | ReadonlyArray[U]])
      ])
    ],
    depth: `3`
  ): Array[U] = js.native
  @JSName("implementation")
  def implementation_4[U](
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
  @JSName("implementation")
  def implementation_5[U](receiver: Array[Array[Array[Array[Array[Array[U]]]]]], depth: `5`): Array[U] = js.native
  @JSName("implementation")
  def implementation_6[U](receiver: Array[Array[Array[Array[Array[Array[Array[U]]]]]]], depth: `6`): Array[U] = js.native
  @JSName("implementation")
  def implementation_7[U](receiver: Array[Array[Array[Array[Array[Array[Array[Array[U]]]]]]]], depth: `7`): Array[U] = js.native
  @JSName("implementation")
  def implementation_U[U](receiver: ReadonlyArray[Array[U] | ReadonlyArray[U]]): Array[U] = js.native
  def shim(): FlatImpl = js.native
}

