package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This enumeration defines the type of polygon. */
/* Rewritten from type alias, can be one of: 
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`8`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2`
  - activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1`
*/
trait PolygonKind extends js.Object

object PolygonKind {
  /** This is the PolygonKind for a ClosedFreeHandShape. */
  @scala.inline
  def FREEFILL: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`6` = this.cast(6)
  /** This is the PolygonKind for an OpenFreeHandShape. */
  @scala.inline
  def FREELINE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`5` = this.cast(5)
  /**
    * the {@link ConnectorShape} is drawn as a straight line
    *
    * This is the PolygonKind for a {@link LineShape} .
    */
  @scala.inline
  def LINE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`0` = this.cast(0)
  /** This is the PolygonKind for a {@link ClosedBezierShape} . */
  @scala.inline
  def PATHFILL: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`4` = this.cast(4)
  /** This is the PolygonKind for an {@link OpenBezierShape} . */
  @scala.inline
  def PATHLINE: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`3` = this.cast(3)
  /** This is the PolygonKind for a PolyLinePathShape. */
  @scala.inline
  def PATHPLIN: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`8` = this.cast(8)
  /** This is the PolygonKind for a PolyPolygonPathShape. */
  @scala.inline
  def PATHPOLY: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`7` = this.cast(7)
  /** This is the PolygonKind for a {@link PolyLineShape} . */
  @scala.inline
  def PLIN: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`2` = this.cast(2)
  /** This is the PolygonKind for a {@link PolyPolygonShape} . */
  @scala.inline
  def POLY: activexDashLibreofficeLib.activexDashLibreofficeLibNumbers.`1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

