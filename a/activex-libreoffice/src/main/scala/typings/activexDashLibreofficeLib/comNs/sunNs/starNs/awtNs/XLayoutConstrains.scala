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

