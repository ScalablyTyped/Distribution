package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the layout constraints for a text field. */
trait XTextLayoutConstrains
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the ideal number of columns and lines for displaying this text. */
  def getColumnsAndLines(nCols: js.Array[scala.Double], nLines: js.Array[scala.Double]): scala.Unit
  /** returns the minimum size for a given number of columns and lines. */
  def getMinimumSize(nCols: scala.Double, nLines: scala.Double): Size
}

object XTextLayoutConstrains {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getColumnsAndLines: js.Function2[js.Array[scala.Double], js.Array[scala.Double], scala.Unit],
    getMinimumSize: js.Function2[scala.Double, scala.Double, Size],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XTextLayoutConstrains = {
    val __obj = js.Dynamic.literal(acquire = acquire, getColumnsAndLines = getColumnsAndLines, getMinimumSize = getMinimumSize, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XTextLayoutConstrains]
  }
}

