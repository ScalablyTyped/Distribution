package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_FromIterable
  extends org.scalablytyped.runtime.Instantiable0[adoneLib.adoneNs.collectionNs.PriorityQueue[js.Object]]
     with org.scalablytyped.runtime.Instantiable1[
      /* options */ adoneLib.adoneNs.collectionNs.INs.PriorityQueueNs.ConstructorOptions[js.Object], 
      adoneLib.adoneNs.collectionNs.PriorityQueue[js.Object]
    ] {
  /**
    * Creates a queue object from the given iterable
    */
  def from[T](iterable: nodeLib.Iterable[T]): adoneLib.adoneNs.collectionNs.PriorityQueue[T] = js.native
  def from[T](
    iterable: nodeLib.Iterable[T],
    options: adoneLib.adoneNs.collectionNs.INs.PriorityQueueNs.ConstructorOptions[T]
  ): adoneLib.adoneNs.collectionNs.PriorityQueue[T] = js.native
}

