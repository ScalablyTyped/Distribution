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
    acquire: js.Function0[scala.Unit],
    getScaledBitmap: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealSize2D, 
      scala.Boolean, 
      XBitmap
    ],
    getSize: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.IntegerSize2D],
    hasAlpha: js.Function0[scala.Boolean],
    isValid: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XVolatileBitmap = {
    val __obj = js.Dynamic.literal(Size = Size, acquire = acquire, getScaledBitmap = getScaledBitmap, getSize = getSize, hasAlpha = hasAlpha, isValid = isValid, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XVolatileBitmap]
  }
}

