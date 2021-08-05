package typings.arrayPrototypeFlat

import typings.arrayPrototypeFlat.arrayPrototypeFlatNumbers.`0`
import typings.arrayPrototypeFlat.arrayPrototypeFlatNumbers.`1`
import typings.arrayPrototypeFlat.arrayPrototypeFlatNumbers.`2`
import typings.arrayPrototypeFlat.arrayPrototypeFlatNumbers.`3`
import typings.arrayPrototypeFlat.arrayPrototypeFlatNumbers.`4`
import typings.arrayPrototypeFlat.arrayPrototypeFlatNumbers.`5`
import typings.arrayPrototypeFlat.arrayPrototypeFlatNumbers.`6`
import typings.arrayPrototypeFlat.arrayPrototypeFlatNumbers.`7`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object implementationMod {
  
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth. If no depth is provided, flat method defaults to the depth of 1.
    *
    * @param depth The maximum recursion depth
    */
  inline def apply(receiver: ReadonlyArray[js.Any]): Array[js.Any] = ^.asInstanceOf[js.Dynamic].apply(receiver.asInstanceOf[js.Any]).asInstanceOf[Array[js.Any]]
  inline def apply(receiver: ReadonlyArray[js.Any], depth: Double): Array[js.Any] = (^.asInstanceOf[js.Dynamic].apply(receiver.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Array[js.Any]]
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  inline def apply[U](receiver: Array[Array[Array[Array[Array[Array[U]]]]]], depth: `5`): Array[U] = (^.asInstanceOf[js.Dynamic].apply(receiver.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Array[U]]
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  inline def apply[U](receiver: Array[Array[Array[Array[Array[Array[Array[U]]]]]]], depth: `6`): Array[U] = (^.asInstanceOf[js.Dynamic].apply(receiver.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Array[U]]
  inline def apply[U](receiver: Array[Array[Array[Array[Array[Array[Array[Array[U]]]]]]]], depth: `7`): Array[U] = (^.asInstanceOf[js.Dynamic].apply(receiver.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Array[U]]
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  inline def apply[U](receiver: ReadonlyArray[U], depth: `0`): Array[U] = (^.asInstanceOf[js.Dynamic].apply(receiver.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Array[U]]
  inline def apply[U](receiver: ReadonlyArray[Array[U] | ReadonlyArray[U]], depth: `1`): Array[U] = (^.asInstanceOf[js.Dynamic].apply(receiver.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Array[U]]
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  inline def apply[U](
    receiver: ReadonlyArray[
      (Array[Array[U] | ReadonlyArray[U]]) | (ReadonlyArray[Array[U] | ReadonlyArray[U]])
    ],
    depth: `2`
  ): Array[U] = (^.asInstanceOf[js.Dynamic].apply(receiver.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Array[U]]
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  inline def apply[U](
    receiver: ReadonlyArray[
      (Array[(Array[Array[U] | ReadonlyArray[U]]) | ReadonlyArray[Array[U]]]) | (ReadonlyArray[
        (Array[Array[U] | ReadonlyArray[U]]) | (ReadonlyArray[Array[U] | ReadonlyArray[U]])
      ])
    ],
    depth: `3`
  ): Array[U] = (^.asInstanceOf[js.Dynamic].apply(receiver.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Array[U]]
  /**
    * Returns a new array with all sub-array elements concatenated into it recursively up to the
    * specified depth.
    *
    * @param depth The maximum recursion depth
    */
  inline def apply[U](
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
  ): Array[U] = (^.asInstanceOf[js.Dynamic].apply(receiver.asInstanceOf[js.Any], depth.asInstanceOf[js.Any])).asInstanceOf[Array[U]]
  
  @JSImport("array.prototype.flat/implementation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
}
