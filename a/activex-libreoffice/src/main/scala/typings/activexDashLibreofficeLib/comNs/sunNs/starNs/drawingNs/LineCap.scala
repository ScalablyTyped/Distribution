package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** The LineCap defines rendering of ends of thick lines */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
*/
trait LineCap extends js.Object

object LineCap {
  /** the line will end without any additional shape */
  @scala.inline
  def BUTT: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /**
    * the dash is a point
    *
    * the line will get a half circle as additional cap
    *
    * the lines join with an arc
    */
  @scala.inline
  def ROUND: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  /**
    * the line will get a half square as additional cap
    *
    * the line uses a square for the line end.
    */
  @scala.inline
  def SQUARE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

