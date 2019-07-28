package typings.activexDashLibreoffice.comNs.sunNs.starNs.drawingNs

import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`6`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`7`
import typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`8`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** This enumeration defines the type of polygon. */
/* Rewritten from type alias, can be one of: 
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`6`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`5`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`0`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`4`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`3`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`8`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`7`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`2`
  - typings.activexDashLibreoffice.activexDashLibreofficeNumbers.`1`
*/
trait PolygonKind extends js.Object

object PolygonKind {
  /** This is the PolygonKind for a ClosedFreeHandShape. */
  @scala.inline
  def FREEFILL: `6` = this.cast(6)
  /** This is the PolygonKind for an OpenFreeHandShape. */
  @scala.inline
  def FREELINE: `5` = this.cast(5)
  /**
    * the {@link ConnectorShape} is drawn as a straight line
    *
    * This is the PolygonKind for a {@link LineShape} .
    */
  @scala.inline
  def LINE: `0` = this.cast(0)
  /** This is the PolygonKind for a {@link ClosedBezierShape} . */
  @scala.inline
  def PATHFILL: `4` = this.cast(4)
  /** This is the PolygonKind for an {@link OpenBezierShape} . */
  @scala.inline
  def PATHLINE: `3` = this.cast(3)
  /** This is the PolygonKind for a PolyLinePathShape. */
  @scala.inline
  def PATHPLIN: `8` = this.cast(8)
  /** This is the PolygonKind for a PolyPolygonPathShape. */
  @scala.inline
  def PATHPOLY: `7` = this.cast(7)
  /** This is the PolygonKind for a {@link PolyLineShape} . */
  @scala.inline
  def PLIN: `2` = this.cast(2)
  /** This is the PolygonKind for a {@link PolyPolygonShape} . */
  @scala.inline
  def POLY: `1` = this.cast(1)
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

