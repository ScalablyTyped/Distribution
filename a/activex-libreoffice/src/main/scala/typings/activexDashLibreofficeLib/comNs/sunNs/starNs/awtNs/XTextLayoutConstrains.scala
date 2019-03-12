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
    acquire: () => scala.Unit,
    getColumnsAndLines: (js.Array[scala.Double], js.Array[scala.Double]) => scala.Unit,
    getMinimumSize: (scala.Double, scala.Double) => Size,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XTextLayoutConstrains = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getColumnsAndLines = js.Any.fromFunction2(getColumnsAndLines), getMinimumSize = js.Any.fromFunction2(getMinimumSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTextLayoutConstrains]
  }
}

