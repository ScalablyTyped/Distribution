package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This is a specialized interface to a volatile bitmap (which can become invalid at any point in time). */
trait XVolatileBitmap extends XBitmap {
  /**
    * Query whether this volatile bitmap still has valid content.
    *
    * As the video RAM allocated to this bitmap can be reclaimed at any time, a return value of true here does not imply that the next draw operation with
    * this bitmap will succeed. Instead, the exception VolatileContentDestroyed might then be thrown, if lost bitmap data is accessed.
    */
  def isValid(): scala.Boolean
}

object XVolatileBitmap {
  @scala.inline
  def apply(
    Size: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerSize2D,
    acquire: () => scala.Unit,
    getScaledBitmap: (activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealSize2D, scala.Boolean) => XBitmap,
    getSize: () => activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerSize2D,
    hasAlpha: () => scala.Boolean,
    isValid: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XVolatileBitmap = {
    val __obj = js.Dynamic.literal(Size = Size, acquire = js.Any.fromFunction0(acquire), getScaledBitmap = js.Any.fromFunction2(getScaledBitmap), getSize = js.Any.fromFunction0(getSize), hasAlpha = js.Any.fromFunction0(hasAlpha), isValid = js.Any.fromFunction0(isValid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XVolatileBitmap]
  }
}

