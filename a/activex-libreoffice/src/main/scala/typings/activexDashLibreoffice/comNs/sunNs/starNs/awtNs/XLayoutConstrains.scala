package typings.activexDashLibreoffice.comNs.sunNs.starNs.awtNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** specifies the layout constraints for a surrounding container. */
trait XLayoutConstrains extends XInterface {
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
    acquire: () => Unit,
    calcAdjustedSize: Size => Size,
    getMinimumSize: () => Size,
    getPreferredSize: () => Size,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XLayoutConstrains = {
    val __obj = js.Dynamic.literal(MinimumSize = MinimumSize, PreferredSize = PreferredSize, acquire = js.Any.fromFunction0(acquire), calcAdjustedSize = js.Any.fromFunction1(calcAdjustedSize), getMinimumSize = js.Any.fromFunction0(getMinimumSize), getPreferredSize = js.Any.fromFunction0(getPreferredSize), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XLayoutConstrains]
  }
}

