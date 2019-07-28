package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the layout constraints for a text field. */
trait XTextLayoutConstrains extends XInterface {
  /** returns the ideal number of columns and lines for displaying this text. */
  def getColumnsAndLines(nCols: js.Array[Double], nLines: js.Array[Double]): Unit
  /** returns the minimum size for a given number of columns and lines. */
  def getMinimumSize(nCols: Double, nLines: Double): Size
}

object XTextLayoutConstrains {
  @scala.inline
  def apply(
    acquire: () => Unit,
    getColumnsAndLines: (js.Array[Double], js.Array[Double]) => Unit,
    getMinimumSize: (Double, Double) => Size,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextLayoutConstrains = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), getColumnsAndLines = js.Any.fromFunction2(getColumnsAndLines), getMinimumSize = js.Any.fromFunction2(getMinimumSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTextLayoutConstrains]
  }
}

