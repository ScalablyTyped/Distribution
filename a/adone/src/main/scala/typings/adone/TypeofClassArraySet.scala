package typings.adone

import org.scalablytyped.runtime.Instantiable0
import typings.adone.adoneNs.collectionNs.ArraySet
import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassArraySet
  extends Instantiable0[ArraySet[js.Object]] {
  /**
    * Creates an ArraySet from the given iterable object
    *
    * @param allowDuplicates Whether to allow duplicates in the set, false by default
    */
  def from[T](iterable: Iterable[T]): ArraySet[T] = js.native
  def from[T](iterable: Iterable[T], allowDuplicates: Boolean): ArraySet[T] = js.native
}

