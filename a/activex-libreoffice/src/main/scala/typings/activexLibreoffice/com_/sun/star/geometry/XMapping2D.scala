package typings.activexLibreoffice.com_.sun.star.geometry

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface defining an arbitrary bijective mapping from R^2 to R^2.
  *
  * This interface provides methods to define an arbitrary bijective mapping from R^2 to R^2, i.e. from the two-dimensional space of real numbers onto
  * itself, as is representable by the double floating point type. The mapping must be bijective, i.e. map a pair of real numbers to exactly one other
  * pair of real numbers an vice versa, to facilitate a working inverse. Bijectiveness also implies completeness, i.e. for every pair of real numbers
  * there must be another pair that is mapped upon them.
  * @since OOo 2.0
  */
trait XMapping2D extends XInterface {
  /** Forward 2D mapping function */
  def map(aPoint: RealPoint2D): RealPoint2D
  /**
    * Inverse 2D mapping function.
    *
    * The following invariant must hold: `map(mapInverse(p))=p` . This effectively rules out non-bijective mappings.
    */
  def mapInverse(aPoint: RealPoint2D): RealPoint2D
}

object XMapping2D {
  @scala.inline
  def apply(
    acquire: () => Unit,
    map: RealPoint2D => RealPoint2D,
    mapInverse: RealPoint2D => RealPoint2D,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XMapping2D = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), map = js.Any.fromFunction1(map), mapInverse = js.Any.fromFunction1(mapInverse), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XMapping2D]
  }
}

