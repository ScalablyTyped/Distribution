package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs

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
trait XMapping2D
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
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
    acquire: js.Function0[scala.Unit],
    map: js.Function1[RealPoint2D, RealPoint2D],
    mapInverse: js.Function1[RealPoint2D, RealPoint2D],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XMapping2D = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("map")(map)
    __obj.updateDynamic("mapInverse")(mapInverse)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XMapping2D]
  }
}

