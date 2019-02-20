package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait PolygonKind extends js.Object

/** This enumeration defines the type of polygon. */
@JSGlobal("com.sun.star.drawing.PolygonKind")
@js.native
object PolygonKind extends js.Object {
  /** This is the PolygonKind for a ClosedFreeHandShape. */
  @js.native
  sealed trait FREEFILL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolygonKind
  
  /** This is the PolygonKind for an OpenFreeHandShape. */
  @js.native
  sealed trait FREELINE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolygonKind
  
  /**
    * the {@link ConnectorShape} is drawn as a straight line
    *
    * This is the PolygonKind for a {@link LineShape} .
    */
  @js.native
  sealed trait LINE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolygonKind
  
  /** This is the PolygonKind for a {@link ClosedBezierShape} . */
  @js.native
  sealed trait PATHFILL
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolygonKind
  
  /** This is the PolygonKind for an {@link OpenBezierShape} . */
  @js.native
  sealed trait PATHLINE
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolygonKind
  
  /** This is the PolygonKind for a PolyLinePathShape. */
  @js.native
  sealed trait PATHPLIN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolygonKind
  
  /** This is the PolygonKind for a PolyPolygonPathShape. */
  @js.native
  sealed trait PATHPOLY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolygonKind
  
  /** This is the PolygonKind for a {@link PolyLineShape} . */
  @js.native
  sealed trait PLIN
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolygonKind
  
  /** This is the PolygonKind for a {@link PolyPolygonShape} . */
  @js.native
  sealed trait POLY
    extends activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolygonKind
  
  /* 6 */ val FREEFILL: FREEFILL with scala.Double = js.native
  /* 5 */ val FREELINE: FREELINE with scala.Double = js.native
  /* 0 */ val LINE: LINE with scala.Double = js.native
  /* 4 */ val PATHFILL: PATHFILL with scala.Double = js.native
  /* 3 */ val PATHLINE: PATHLINE with scala.Double = js.native
  /* 8 */ val PATHPLIN: PATHPLIN with scala.Double = js.native
  /* 7 */ val PATHPOLY: PATHPOLY with scala.Double = js.native
  /* 2 */ val PLIN: PLIN with scala.Double = js.native
  /* 1 */ val POLY: POLY with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    activexDashLibreofficeLib.comNs.sunNs.starNs.drawingNs.PolygonKind with scala.Double
  ] = js.native
}

