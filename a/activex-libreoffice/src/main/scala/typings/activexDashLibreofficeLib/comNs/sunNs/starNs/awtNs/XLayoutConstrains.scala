package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the layout constraints for a surrounding container. */
trait XLayoutConstrains
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the minimum size for this component. */
  val MinimumSize: Size
  /** returns the preferred size for this component. */
  val PreferredSize: Size
  /** calculates the adjusted size for a given maximum size. */
  def calcAdjustedSize(aNewSize: Size): Size
  /** returns the minimum size for this component. */
  def getMinimumSize(): Size
  /** returns the preferred size for this component. */
  def getPreferredSize(): Size
}

object XLayoutConstrains {
  @scala.inline
  def apply(
    MinimumSize: Size,
    PreferredSize: Size,
    acquire: js.Function0[scala.Unit],
    calcAdjustedSize: js.Function1[Size, Size],
    getMinimumSize: js.Function0[Size],
    getPreferredSize: js.Function0[Size],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XLayoutConstrains = {
    val __obj = js.Dynamic.literal(MinimumSize = MinimumSize, PreferredSize = PreferredSize, acquire = acquire, calcAdjustedSize = calcAdjustedSize, getMinimumSize = getMinimumSize, getPreferredSize = getPreferredSize, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XLayoutConstrains]
  }
}

