package typings.adone

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.adone.adoneNs.collectionNs.INs.PriorityQueueNs.ConstructorOptions
import typings.adone.adoneNs.collectionNs.PriorityQueue
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassPriorityQueue
  extends Instantiable0[PriorityQueue[js.Object]]
     with Instantiable1[
      /* options */ ConstructorOptions[/* import warning: RewrittenClass.unapply cls $anonfun was tparam T */ js.Any], 
      PriorityQueue[js.Object]
    ] {
  /**
    * Creates a queue object from the given iterable
    */
  def from[T](iterable: Iterable[T]): PriorityQueue[T] = js.native
  def from[T](iterable: Iterable[T], options: ConstructorOptions[T]): PriorityQueue[T] = js.native
}

