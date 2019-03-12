package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.renderingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Specialized interface for a 2D poly-polygon containing only straight line segments.
  * @since OOo 2.0
  */
trait XLinePolyPolygon2D extends XPolyPolygon2D {
  /** Get a single point from the poly-polygon */
  def getPoint(nPolygonIndex: scala.Double, nPointIndex: scala.Double): activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D
  /**
    * Query subset of this poly-polygon, starting at the given polygon and the given point within that polygon, and containing the specified number of
    * polygons and points in the last polygon.
    * @param nPolygonIndex The index number of the polygon to start with extracting points. Set to 0 to start with the first polygon.
    * @param nNumberOfPolygons The number of polygons, starting with nPolygonIndex, to extract points from. Set to -1 to extract all polygons, starting with n
    * @param nPointIndex The index of the point within the first polygon (that with the index number nPolygonIndex) to start extraction with. Set to 0 to star
    * @param nNumberOfPoints The number of points in the last polygon of the extraction sequence, to be extracted. Set to -1 to extract all points from the la
    */
  def getPoints(
    nPolygonIndex: scala.Double,
    nNumberOfPolygons: scala.Double,
    nPointIndex: scala.Double,
    nNumberOfPoints: scala.Double
  ): stdLib.SafeArray[
    stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D]
  ]
  /** Set a single point on the poly-polygon. The remaining points of the poly-polygon will not be changed by this method. */
  def setPoint(
    point: activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D,
    nPolygonIndex: scala.Double,
    nPointIndex: scala.Double
  ): scala.Unit
  /**
    * Set the specified sequence of points to the poly-polygon.
    *
    * This method can either set the whole poly-polygon to the new data, or insert the points at the given index
    * @param points the points.
    * @param nPolygonIndex The index of the polygon to start point insertion with. This index must be in the range [0,numPolygons], and the insertion will tak
    * @throws com::sun::star::lang::IndexOutOfBoundsException if one of the given values exceed the permissible range.
    */
  def setPoints(
    points: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D]
    ],
    nPolygonIndex: scala.Double
  ): scala.Unit
}

object XLinePolyPolygon2D {
  @scala.inline
  def apply(
    FillRule: FillRule,
    NumberOfPolygons: scala.Double,
    acquire: () => scala.Unit,
    addPolyPolygon: (activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D, XPolyPolygon2D) => scala.Unit,
    getFillRule: () => FillRule,
    getNumberOfPolygonPoints: scala.Double => scala.Double,
    getNumberOfPolygons: () => scala.Double,
    getPoint: (scala.Double, scala.Double) => activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D,
    getPoints: (scala.Double, scala.Double, scala.Double, scala.Double) => stdLib.SafeArray[
      stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D]
    ],
    isClosed: scala.Double => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    setClosed: (scala.Double, scala.Boolean) => scala.Unit,
    setFillRule: FillRule => scala.Unit,
    setPoint: (activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D, scala.Double, scala.Double) => scala.Unit,
    setPoints: (activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.geometryNs.RealPoint2D]
    ], scala.Double) => scala.Unit
  ): XLinePolyPolygon2D = {
    val __obj = js.Dynamic.literal(FillRule = FillRule, NumberOfPolygons = NumberOfPolygons, acquire = js.Any.fromFunction0(acquire), addPolyPolygon = js.Any.fromFunction2(addPolyPolygon), getFillRule = js.Any.fromFunction0(getFillRule), getNumberOfPolygonPoints = js.Any.fromFunction1(getNumberOfPolygonPoints), getNumberOfPolygons = js.Any.fromFunction0(getNumberOfPolygons), getPoint = js.Any.fromFunction2(getPoint), getPoints = js.Any.fromFunction4(getPoints), isClosed = js.Any.fromFunction1(isClosed), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setClosed = js.Any.fromFunction2(setClosed), setFillRule = js.Any.fromFunction1(setFillRule), setPoint = js.Any.fromFunction3(setPoint), setPoints = js.Any.fromFunction2(setPoints))
  
    __obj.asInstanceOf[XLinePolyPolygon2D]
  }
}

